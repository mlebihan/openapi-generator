package org.openapitools.codegen.languages.goclient;

import java.util.*;
import java.util.function.Supplier;

import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.AbstractCodeSelector;


public class GoClientCodeForParameter extends AbstractCodeSelector<CodegenParameter, String> {
   public String constructExampleCode(GoClientCodegen parentGenerator, CodegenParameter codegenParameter, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap) {
      return findFirst(candidatesExampleCodeForParameter(parentGenerator, codegenParameter, modelMaps, processedModelMap), false);
   }

   /**
    * Prepare a list of testers that evaluate the default value of a <b>parameter</b>, depending on its kind
    * @param codegenParameter Parameter definition
    * @return Supplier of return default value, adatped to the type of the parameter
    */
   private List<Supplier<Optional<String>>> candidatesExampleCodeForParameter(GoClientCodegen parentGenerator, CodegenParameter codegenParameter, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap) {
      List<Supplier<Optional<String>>> selections = new ArrayList<>();

      selections.add(() -> codeFragment(c1 -> codegenParameter.isArray,
         c2 -> modelMaps.containsKey(datatype(codegenParameter, "[]").get()), codegenParameter,
         () -> "[]" + parentGenerator.goImportAlias + "." + datatype(codegenParameter, "[]").get(),
         () -> codegenParameter.dataType + "{" + new GoClientCodeForProperty().constructExampleCode(parentGenerator, codegenParameter.items, modelMaps, processedModelMap, 0) + "}"));

      selections.add(() -> codeFragment(c1 -> codegenParameter.isMap,
         c2 -> modelMaps.containsKey(datatype(codegenParameter, "[]").get()), codegenParameter,
         () -> "map[string][]" + parentGenerator.goImportAlias + "." + datatype(codegenParameter, "map[string][]").get(),

         () -> {
                  if (codegenParameter.items == null) {
                        return codegenParameter.dataType + "{ ... }";
                  }

                  return codegenParameter.dataType + "{\"key\": " + new GoClientCodeForProperty().constructExampleCode(parentGenerator, codegenParameter.items, modelMaps, processedModelMap, 0) + "}";
                }
         ));

      selections.add(() -> codeFragment(c1 -> codegenParameter.isPrimitiveType && codegenParameter.isString,
         c2 -> !StringUtils.isEmpty(codegenParameter.example) && !"null".equals(codegenParameter.example), codegenParameter,
         () -> "\"" + codegenParameter.example + "\"",
         () -> "\"" + codegenParameter.paramName + "_example\""));

      selections.add(() -> codeFragment(c1 -> codegenParameter.isPrimitiveType && codegenParameter.isBoolean,
         c2 -> Boolean.parseBoolean(codegenParameter.example), codegenParameter,
         () -> "true",
         () -> "false"));

      selections.add(() -> codeFragment(c1 -> codegenParameter.isPrimitiveType && codegenParameter.isUri, null, codegenParameter,
         () -> "\"https://example.com\"",
         () -> { throw new RuntimeException("Invalid generation for primitive type, isUri"); }));

      selections.add(() -> codeFragment(c1 -> codegenParameter.isPrimitiveType && (codegenParameter.isDateTime || codegenParameter.isDate),
         c2 -> modelMaps.containsKey(datatype(codegenParameter, "[]").get()), codegenParameter,
         () -> {
            ArrayList<Integer> v = new ArrayList<>();
            v.add(1);
            processedModelMap.put("time.Time", v);
            return "time.Now()";
         },

         () -> { throw new RuntimeException("Invalid generation for primitive type, isDateTime or isDate"); }));

      selections.add(() -> codeFragment(c1 -> codegenParameter.isPrimitiveType && codegenParameter.isFile, null, codegenParameter,
         () -> "os.NewFile(1234, \"some_file\")",
         () -> { throw new RuntimeException("Invalid generation for primitive type, isFile"); }));

      // Default to numeric in other cases of primitive
      selections.add(() -> codeFragment(c1 -> codegenParameter.isPrimitiveType,
         c2 -> !StringUtils.isEmpty(codegenParameter.example) && !"null".equals(codegenParameter.example), codegenParameter,
         () -> codegenParameter.dataType + "(" + codegenParameter.example + ")",
         () -> codegenParameter.dataType + "(987)"));

      selections.add(() -> codeFragment(c1 -> !codegenParameter.isPrimitiveType && modelMaps.containsKey(codegenParameter.dataType), null, codegenParameter,
         () ->  new GoClientCodeForModel().constructExampleCode(parentGenerator, modelMaps.get(codegenParameter.dataType), modelMaps, processedModelMap, 0),
         () -> { throw new RuntimeException("Invalid generation for primitive type == false, modelMaps.containsKey(codegenParameter.dataType)"); }));

      selections.add(() -> codeFragment(c1 -> !codegenParameter.isPrimitiveType && codegenParameter.isEmail,
         c2 -> !StringUtils.isEmpty(codegenParameter.example) && !"null".equals(codegenParameter.example), codegenParameter,
         () -> "\"" + codegenParameter.example + "\"",
         () -> "\"" + codegenParameter.paramName + "@example.com\""));

      selections.add(() -> codeFragment(c1 -> !codegenParameter.isPrimitiveType && (codegenParameter.isDateTime || codegenParameter.isDate),
         c2 -> modelMaps.containsKey(datatype(codegenParameter, "[]").get()), codegenParameter,
         () -> {
            ArrayList<Integer> v = new ArrayList<>();
            v.add(1);
            processedModelMap.put("time.Time", v);
            return "time.Now()";
         },

         () -> { throw new RuntimeException("Invalid generation for primitive type == false, isDateTime or isDate"); }));

      selections.add(() -> codeFragment(null, null, codegenParameter,
         () -> "TODO",
         () -> { throw new RuntimeException("Invalid generation for default case, when no conditions apply"); }));

      return selections;
   }

   /**
    * Extract a datatype from a parameter.
    * @param codegenParameter Parameter
    * @param fragmentToRemove Fragment to remove to extract its datatype
    * @return Datatype Supplier
    */
   private Supplier<String> datatype(CodegenParameter codegenParameter, String fragmentToRemove) {
      String dataType = StringUtils.removeStart(codegenParameter.dataType, fragmentToRemove);
      return () -> dataType;
   }
}
