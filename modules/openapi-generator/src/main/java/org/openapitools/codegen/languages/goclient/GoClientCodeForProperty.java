package org.openapitools.codegen.languages.goclient;

import java.util.*;
import java.util.function.Supplier;

import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.AbstractCodeSelector;


public class GoClientCodeForProperty extends AbstractCodeSelector<CodegenProperty, String> {
   public String constructExampleCode(GoClientCodegen parentGenerator, CodegenProperty codegenProperty, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap, int depth) {
      return findFirst(constructExampleCodeForProperty(parentGenerator, codegenProperty, modelMaps, processedModelMap, depth), false);
   }

   /**
    * Prepare a list of testers that evaluate the default value of a <b>property</b>, depending on its kind
    * @param codegenProperty Parameter definition
    * @return Supplier of return default value, adatped to the type of the parameter
    */
   private List<Supplier<Optional<String>>> constructExampleCodeForProperty(GoClientCodegen parentGenerator, CodegenProperty codegenProperty, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap, int depth) {
      List<Supplier<Optional<String>>> selections = new ArrayList<>();

      selections.add(() -> codeFragment(c1 -> codegenProperty.isArray, null, codegenProperty,
         () -> {
            String prefix = codegenProperty.dataType;
            String dataType = StringUtils.removeStart(codegenProperty.dataType, "[]");

            if (modelMaps.containsKey(dataType)) {
               prefix = "[]" + parentGenerator.goImportAlias + "." + dataType;
            }

            if (codegenProperty.items.isNullable) {
               // We can't easily generate a pointer inline, so just use nil in that case
               return prefix + "{nil}";
            }
            return prefix + "{" + constructExampleCode(parentGenerator, codegenProperty.items, modelMaps, processedModelMap, depth+1) + "}";
         },

         () -> { throw new RuntimeException("Invalid generation for property, isArray"); }));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isMap, null, codegenProperty,
         () -> {
            String prefix = codegenProperty.dataType;
            String dataType = StringUtils.removeStart(codegenProperty.dataType, "map[string][]");

            if (modelMaps.containsKey(dataType)) {
               prefix = "map[string][]" + parentGenerator.goImportAlias + "." + dataType;
            }

            if (codegenProperty.items == null) {
               return prefix + "{ ... }";
            }
            return prefix + "{\"key\": " + constructExampleCode(parentGenerator, codegenProperty.items, modelMaps, processedModelMap, depth+1) + "}";
         },

         () -> { throw new RuntimeException("Invalid generation for property, isMap"); }));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isPrimitiveType && codegenProperty.isString,
         c2 -> !StringUtils.isEmpty(codegenProperty.example) && !"null".equals(codegenProperty.example), codegenProperty,
         () -> "\"" + codegenProperty.example + "\"",
         () -> "\"" + codegenProperty.name + "_example\""));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isPrimitiveType && codegenProperty.isBoolean,
         c2 -> Boolean.parseBoolean(codegenProperty.example), codegenProperty,
         () -> "true",
         () -> "false"));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isPrimitiveType && codegenProperty.isUri, null, codegenProperty,
         () -> "\"https://example.com\"",
         () -> { throw new RuntimeException("Invalid generation for property of primitive type, isUri"); }));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isPrimitiveType && (codegenProperty.isDateTime || codegenProperty.isDate),
         c2 -> modelMaps.containsKey(datatype(codegenProperty, "[]").get()), codegenProperty,
         () -> {
            ArrayList<Integer> v = new ArrayList<>();
            v.add(1);
            processedModelMap.put("time.Time", v);
            return "time.Now()";
         },

         () -> { throw new RuntimeException("Invalid generation for property primitive type, isDateTime or isDate"); }));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isPrimitiveType,
         c2 -> !StringUtils.isEmpty(codegenProperty.example) && !"null".equals(codegenProperty.example), codegenProperty,
         () -> codegenProperty.dataType + "(" + codegenProperty.example + ")",
         () -> codegenProperty.dataType + "(123)"));


      // look up the model
      selections.add(() -> codeFragment(c1 -> modelMaps.containsKey(codegenProperty.dataType), null, codegenProperty,
         () -> new GoClientCodeForModel().constructExampleCode(parentGenerator, modelMaps.get(codegenProperty.dataType), modelMaps, processedModelMap, depth+1),
         () -> { throw new RuntimeException("Invalid generation for property whose datatype is in modelMaps"); }));

      selections.add(() -> codeFragment(c1 -> codegenProperty.isEmail,
         c2 -> !StringUtils.isEmpty(codegenProperty.example) && !"null".equals(codegenProperty.example), codegenProperty,
         () -> "\"" + codegenProperty.example + "\"",
         () -> "\"" + codegenProperty.name + "@example.com\""));

      selections.add(() -> codeFragment(c1 -> !codegenProperty.isPrimitiveType && (codegenProperty.isDateTime || codegenProperty.isDate),
         null, codegenProperty,
         () -> {
            ArrayList<Integer> v = new ArrayList<>();
            v.add(1);
            processedModelMap.put("time.Time", v);
            return "time.Now()";
         },

         () -> { throw new RuntimeException("Invalid generation for property of primitive type == false, isDateTime or isDate"); }));

      selections.add(() -> codeFragment(null, null, codegenProperty,
         () -> "TODO",
         () -> { throw new RuntimeException("Invalid generation for property, default case, when no conditions apply"); }));

      return selections;
   }

   /**
    * Extract a datatype from a property.
    * @param codegenProperty Property
    * @param fragmentToRemove Fragment to remove to extract its datatype
    * @return Datatype Supplier
    */
   private Supplier<String> datatype(CodegenProperty codegenProperty, String fragmentToRemove) {
      String dataType = StringUtils.removeStart(codegenProperty.dataType, fragmentToRemove);
      return () -> dataType;
   }
}
