/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.go;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import org.openapitools.codegen.*;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.GoClientCodegen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GoClientCodegenTest {

    @Test
    public void testInitialConfigValues() {
        final GoClientCodegen codegen = new GoClientCodegen();
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.TRUE);
        Assert.assertTrue(codegen.isHideGenerationTimestamp());
        Assert.assertNull(codegen.additionalProperties().get(GoClientCodegen.MODEL_FILE_FOLDER));
    }

    @Test
    public void testSettersForConfigValues() {
        final GoClientCodegen codegen = new GoClientCodegen();
        codegen.setHideGenerationTimestamp(false);
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.FALSE);
        Assert.assertFalse(codegen.isHideGenerationTimestamp());
    }

    @Test
    public void testAdditionalPropertiesPutForConfigValues() {
        final GoClientCodegen codegen = new GoClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.HIDE_GENERATION_TIMESTAMP, false);
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.FALSE);
        Assert.assertFalse(codegen.isHideGenerationTimestamp());
    }

    @Test(description = "test example value for body parameter")
    public void bodyParameterTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        final GoClientCodegen codegen = new GoClientCodegen();
        codegen.setOpenAPI(openAPI);
        final String path = "/fake";
        final Operation p = openAPI.getPaths().get(path).getGet();
        final CodegenOperation op = codegen.fromOperation(path, "post", p, null);
        Assert.assertEquals(op.formParams.size(), 2);
        CodegenParameter bp = op.formParams.get(0);
        Assert.assertFalse(bp.isPrimitiveType);
    }

    @Test(description = "test to ensure the parameter names are unique")
    public void ensureParameterNameUniqueTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/conflictingParameter.yaml");
        final GoClientCodegen codegen = new GoClientCodegen();
        codegen.setOpenAPI(openAPI);
        final String path = "/pet/{id}";
        final Operation p = openAPI.getPaths().get(path).getPost();
        final CodegenOperation op = codegen.fromOperation(path, "post", p, null);
        Assert.assertEquals(op.allParams.size(), 9);
        CodegenParameter cp = op.allParams.get(0);
        Assert.assertEquals(cp.paramName, "id");
        CodegenParameter cp2 = op.allParams.get(1);
        Assert.assertEquals(cp2.paramName, "id2");
        CodegenParameter cp3 = op.allParams.get(2);
        Assert.assertEquals(cp3.paramName, "id3");
        CodegenParameter cp4 = op.allParams.get(3);
        Assert.assertEquals(cp4.paramName, "id4");
        CodegenParameter cp5 = op.allParams.get(4);
        Assert.assertEquals(cp5.paramName, "id5");
    }

    @Test
    public void testFilenames() {
        final GoClientCodegen codegen = new GoClientCodegen();

        // Model names are generated from schema / definition names
        Assert.assertEquals(codegen.toModelFilename("Animal"), "model_animal");
        Assert.assertEquals(codegen.toModelFilename("AnimalTest"), "model_animal_test_");
        Assert.assertEquals(codegen.toModelFilename("AnimalFarm"), "model_animal_farm");
        Assert.assertEquals(codegen.toModelFilename("AnimalFarmTest"), "model_animal_farm_test_");

        // API names are generated from tag names
        Assert.assertEquals(codegen.toApiFilename("Animal"), "api_animal");
        Assert.assertEquals(codegen.toApiFilename("Animal Test"), "api_animal_test_");
        Assert.assertEquals(codegen.toApiFilename("Animal Farm"), "api_animal_farm");
        Assert.assertEquals(codegen.toApiFilename("Animal Farm Test"), "api_animal_farm_test_");
    }

    @Test
    public void testPrimitiveTypeInOneOf() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/oneOf_primitive.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        System.out.println(files);
        files.forEach(File::deleteOnExit);

        Path modelFile = Paths.get(output + "/model_example.go");
        TestUtils.assertFileContains(modelFile, "Child *Child");
        TestUtils.assertFileContains(modelFile, "Int32 *int32");
        TestUtils.assertFileContains(modelFile, "dst.Int32");
        TestUtils.assertFileNotContains(modelFile, "int32 *int32");
        TestUtils.assertFileNotContains(modelFile, "dst.int32");
    }

    @Test
    public void testNullableComposition() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/allOf_nullable.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileContains(Paths.get(output + "/model_example.go"), "Child NullableChild");
    }

    @Test
    public void testMultipleRequiredPropertiesHasSameOneOfObject() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/petstore-multiple-required-properties-has-same-oneOf-object.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        System.out.println(files);
        files.forEach(File::deleteOnExit);

        Path docFile = Paths.get(output + "/docs/PetAPI.md");
        TestUtils.assertFileContains(docFile, "openapiclient.pet{Cat: openapiclient.NewCat(\"Attr_example\")}, openapiclient.pet{Cat: openapiclient.NewCat(\"Attr_example\")}, openapiclient.pet{Cat: openapiclient.NewCat(\"Attr_example\")}");
    }

    @Test
    public void testStructPrefix() throws IOException {
        Map<String, Object> properties = new HashMap<>();
        properties.put(GoClientCodegen.STRUCT_PREFIX, true);

        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setAdditionalProperties(properties)
                .setInputSpec("src/test/resources/3_0/petstore.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileContains(Paths.get(output + "/api_pet.go"), "type PetAPIAddPetRequest struct");
    }

    @Test
    public void testAdditionalPropertiesModelFileFolder() {
        final GoClientCodegen codegen = new GoClientCodegen();
        codegen.additionalProperties().put(GoClientCodegen.MODEL_FILE_FOLDER, "model_dir");
        codegen.processOpts();

        Assert.assertEquals(codegen.modelFileFolder(), "generated-code/go/model_dir/".replace("/", File.separator));
    }
    
    @Test
    public void verifyTestFile() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/petstore.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/test/api_pet_test.go"));
        TestUtils.assertFileContains(Paths.get(output + "/test/api_pet_test.go"),
                "func Test_openapi_PetAPIService(t *testing.T) {");
    }

    @Test
    public void verifyTestImport() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setGitUserId("OpenAPITools")
                .setGitRepoId("openapi-generator")
                .setInputSpec("src/test/resources/3_0/petstore.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/test/api_pet_test.go"));
        TestUtils.assertFileContains(Paths.get(output + "/test/api_pet_test.go"),
                "openapiclient \"github.com/OpenAPITools/openapi-generator\"");
    }

    @Test
    public void verifyFormatErrorMessageInUse() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/go/petstore-with-problem-details.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/api_pet.go"));
        TestUtils.assertFileContains(Paths.get(output + "/api_pet.go"),
                "newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)");
    }

    @Test
    public void verifyApiTestWithNullResponse() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setGitUserId("OpenAPITools")
                .setGitRepoId("openapi-generator")
                .setInputSpec("src/test/resources/3_0/go/petstore-with-no-response-body.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/test/api_pet_test.go"));
        TestUtils.assertFileNotContains(Paths.get(output + "/test/api_pet_test.go"),
                "require.NotNil(t, resp)");
        TestUtils.assertFileNotContains(Paths.get(output + "/test/api_pet_test.go"),
                "resp, httpRes, err := apiClient.PetAPI.PetDelete(context.Background()).Execute()");
        TestUtils.assertFileContains(Paths.get(output + "/test/api_pet_test.go"),
                "httpRes, err := apiClient.PetAPI.PetDelete(context.Background()).Execute()");
    }

    @Test
    public void verifyApiWithAllOfMultipleRefAndDiscriminator() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setGitUserId("OpenAPITools")
                .setGitRepoId("openapi-generator")
                .setInputSpec("src/test/resources/3_0/go/allof_multiple_ref_and_discriminator.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/model_final_item.go"));
        TestUtils.assertFileContains(Paths.get(output + "/model_final_item.go"),
                "BaseItem");
    }

    @Test
    public void testVendorExtensionGenerateUnmarshalJson() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setGitUserId("OpenAPITools")
                .setGitRepoId("openapi-generator")
                .setInputSpec("src/test/resources/3_0/go/allof_with_unmarshal_json.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/model_base_item.go"));
        TestUtils.assertFileContains(Paths.get(output + "/model_base_item.go"),
                "func (o *BaseItem) UnmarshalJSON(data []byte) (err error) {");
    }

    @Test
    public void testVendorExtensionSkipGenerateUnmarshalJson() throws IOException {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setGitUserId("OpenAPITools")
                .setGitRepoId("openapi-generator")
                .setInputSpec("src/test/resources/3_0/go/allof_skip_unmarshal_json.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        files.forEach(File::deleteOnExit);

        TestUtils.assertFileExists(Paths.get(output + "/model_base_item.go"));
        TestUtils.assertFileNotContains(Paths.get(output + "/model_base_item.go"),
                "func (o *BaseItem) UnmarshalJSON(data []byte) (err error) {");
    }

    @Test
    public void testAdditionalPropertiesWithGoMod() throws Exception {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/petstore_oas3_test.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        System.out.println(files);
        files.forEach(File::deleteOnExit);

        Path goModFile = Paths.get(output + "/go.mod");
        TestUtils.assertFileExists(goModFile);
        Path goSumFile = Paths.get(output + "/go.sum");
        TestUtils.assertFileExists(goSumFile);
    }

    @Test
    public void testAdditionalPropertiesWithoutGoMod() throws Exception {
        File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("go")
                .setInputSpec("src/test/resources/3_0/petstore_oas3_test.yaml")
                .setOutputDir(output.getAbsolutePath().replace("\\", "/"))
                .addAdditionalProperty(GoClientCodegen.WITH_GO_MOD, false);

        DefaultGenerator generator = new DefaultGenerator();
        List<File> files = generator.opts(configurator.toClientOptInput()).generate();
        System.out.println(files);
        files.forEach(File::deleteOnExit);

        Path goModFile = Paths.get(output + "/go.mod");
        TestUtils.assertFileNotExists(goModFile);
        Path goSumFile = Paths.get(output + "/go.sum");
        TestUtils.assertFileNotExists(goSumFile);
    }

    /**
     * Tests that a request with a binary body is well handled.
     * @throws IOException if the temp directory creation fails
     */
    @Test(description = "Handling binary body (application/octet-stream content)")
    public void testPureBinaryBody() throws IOException {
        final String OPENAPI_YAML_OBJECT = "src/test/resources/3_0/issue_19762-application_octet-stream-object.yaml";
        final String OPENAPI_YAML_ARRAY_STRING_BYTE = "src/test/resources/3_0/issue_19762-application_octet-stream-array_string_byte.yaml";

        /* What line to refuse, in which file, depending on the generator being processed */
        class GeneratorTest {
            public final String caseName;
            public final String openApiYaml;
            public final String generatorName;
            public final String targetFile;
            public final String lineExpected;

            public GeneratorTest(String caseName, String generatorName, String openApiYaml, String targetFile, String lineExpected) {
                this.caseName = caseName;
                this.openApiYaml = openApiYaml;
                this.generatorName = generatorName;
                this.targetFile = targetFile;
                this.lineExpected = lineExpected;
            }
        }

        List<GeneratorTest> generatorTests = List.of(
           new GeneratorTest("Go handling an object", "go", OPENAPI_YAML_OBJECT, "/api_default.go",
              "func (r ApiTest1PostRequest) Body(body interface{}) ApiTest1PostRequest {"),

           new GeneratorTest("Go handling an array of bytes", "go", OPENAPI_YAML_ARRAY_STRING_BYTE, "/api_default.go",
              "func (r ApiTest1PostRequest) Body(body []byte) ApiTest1PostRequest {")
        );

        for(GeneratorTest candidate : generatorTests) {
            File output = Files.createTempDirectory("test").toFile();
            output.deleteOnExit();

            final CodegenConfigurator configurator = new CodegenConfigurator()
               .setGeneratorName(candidate.generatorName)
               .setGitUserId("OpenAPITools")
               .setGitRepoId("openapi-generator")
               .setInputSpec(candidate.openApiYaml)
               .setOutputDir(output.getAbsolutePath().replace("\\", "/"));

            DefaultGenerator generator = new DefaultGenerator();
            List<File> files = generator.opts(configurator.toClientOptInput()).generate();
            files.forEach(File::deleteOnExit);

            Path defaultApiFile = Paths.get(output + candidate.targetFile);
            TestUtils.assertFileExists(defaultApiFile);

            try {
                TestUtils.assertFileContains(defaultApiFile, candidate.lineExpected);
            }
            catch(AssertionError e) {
                String message = String.format("%s (%s generator): for an application/octet-stream requestBody (type: ...), %s doesn't have the expected prototype for Body(): %s",
                   candidate.caseName, candidate.generatorName, candidate.targetFile, candidate.lineExpected);

                throw new AssertionError(message, e);
            }
        }
    }
}
