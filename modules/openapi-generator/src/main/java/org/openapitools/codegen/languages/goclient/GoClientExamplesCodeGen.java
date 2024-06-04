package org.openapitools.codegen.languages.goclient;

import java.util.*;

import org.openapitools.codegen.*;

/**
 * Go client example code generator
 */
public class GoClientExamplesCodeGen {
   /** The parent generator that is using us */
   private final GoClientCodegen parentGenerator;

   private final GoClientCodeForParameter codeSelector = new GoClientCodeForParameter();

   /**
    * Construct a go client examples generator based on Go Client Generator
    * @param parentGenerator Parent Generator
    */
   public GoClientExamplesCodeGen(GoClientCodegen parentGenerator) {
      this.parentGenerator = parentGenerator;
   }

   String constructExampleCode(CodegenParameter codegenParameter, HashMap<String, CodegenModel> modelMaps, HashMap<String, ArrayList<Integer>> processedModelMap) {
      return this.codeSelector.constructExampleCode(this.parentGenerator, codegenParameter, modelMaps, processedModelMap);
   }
}
