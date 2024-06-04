package org.openapitools.codegen.languages.goclient;

import java.util.*;
import java.util.function.Supplier;

import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.*;


public class GoClientCodeForModel extends AbstractCodeSelector<CodegenModel, String> {
   public String constructExampleCode(GoClientCodegen parentGenerator, CodegenModel codegenModel, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap, int depth) {
      return findFirst(constructExampleCodeForModel(parentGenerator, codegenModel, modelMaps, processedModelMap, depth), false);
   }

   /**
    * Prepare a list of testers that evaluate the default value of a <b>model</b>, depending on its kind
    * @param codegenModel Model definition
    * @return Supplier of return default value, adatped to the type of the parameter
    */
   private List<Supplier<Optional<String>>> constructExampleCodeForModel(GoClientCodegen parentGenerator, CodegenModel codegenModel, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap, int depth) {
      List<Supplier<Optional<String>>> selections = new ArrayList<>();

      selections.add(() -> codeFragment(c1 -> processedModelMap.containsKey(codegenModel.name), null, codegenModel,
         () -> {
            ArrayList<Integer> depthList = processedModelMap.get(codegenModel.name);

            if (depthList.size() == 1) {
               if (depthList.get(0) != depth) {
                  depthList.add(depth);
                  processedModelMap.put(codegenModel.name, depthList);
               }
            }

            List<String> propertyExamples = new ArrayList<>();
            for (CodegenProperty codegenProperty : codegenModel.requiredVars) {
               propertyExamples.add(new GoClientCodeForProperty().constructExampleCode(parentGenerator, codegenProperty, modelMaps, processedModelMap, depth + 1));
            }

            return "*" + parentGenerator.goImportAlias + ".New" + parentGenerator.toModelName(codegenModel.name) + "(" + StringUtils.join(propertyExamples, ", ") + ")";
         },

         () -> {
            List<Integer> depthList = processedModelMap.get(codegenModel.name);

            if (depthList.size() == 2) {
               return "";
            }

            throw new RuntimeException("Invalid count when constructing example: " + depthList.size());
         }
      ));

      selections.add(() -> codeFragment(c1 -> codegenModel.isEnum,
         c2 -> codegenModel.isString, codegenModel,
         () -> {
            Map<String, Object> allowableValues = codegenModel.allowableValues;
            List<Object> values = (List<Object>) allowableValues.get("values");
            String example = String.valueOf(values.get(0));
            if (codegenModel.isString) {
               example = "\"" + example + "\"";
            }

            return example;
         },

         () -> {
            Map<String, Object> allowableValues = codegenModel.allowableValues;
            List<Object> values = (List<Object>) allowableValues.get("values");
            String example = String.valueOf(values.get(0));
            return parentGenerator.goImportAlias + "." + codegenModel.name + "(" + example + ")";
         }));

      selections.add(() -> codeFragment(c1 -> codegenModel.oneOf != null && !codegenModel.oneOf.isEmpty(), null, codegenModel,
         () -> {
            String subModel = (String) codegenModel.oneOf.toArray()[0];
            String oneOf;
            if (modelMaps.get(subModel) == null) {
               oneOf = "new(" + subModel + ")";// a primitive type
            } else {
               oneOf = StringUtils.removeStart(constructExampleCode(parentGenerator, modelMaps.get(subModel), modelMaps, processedModelMap, depth + 1), "*");
            }

            return parentGenerator.goImportAlias + "." + codegenModel.name + "{" + parentGenerator.typeToName(subModel) + ": " + oneOf + "}";
         },

         () -> {
            throw new RuntimeException("Invalid generation for codegenModel.oneOf != null && !codegenModel.oneOf.isEmpty()");
         }
      ));


      selections.add(() -> codeFragment(null, null, codegenModel,
         () -> {
            ArrayList<Integer> v = new ArrayList<>();
            v.add(depth);
            processedModelMap.put(codegenModel.name, v);

            List<String> propertyExamples = new ArrayList<>();
            for (CodegenProperty codegenProperty : codegenModel.requiredVars) {
               propertyExamples.add(new GoClientCodeForProperty().constructExampleCode(parentGenerator, codegenProperty, modelMaps, processedModelMap, depth + 1));
            }

            return "*" + parentGenerator.goImportAlias + ".New" + parentGenerator.toModelName(codegenModel.name) + "(" + StringUtils.join(propertyExamples, ", ") + ")";
         },

         () -> {
            throw new RuntimeException("Invalid generation for codegenModel default case");
         }
      ));


      return selections;
   }
}
