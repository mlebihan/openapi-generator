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

package org.openapitools.codegen.objc;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.ObjcClientCodegen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

@SuppressWarnings("static-method")
public class ObjcModelTest {

    @Test(description = "convert a model with an advanced map property")
    public void advancedMapPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new MapSchema().additionalProperties(new StringSchema())))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "translations");
        Assert.assertEquals(property1.getDataType(), "NSDictionary<NSString*, NSDictionary<NSString*, NSString*>*>*");
        Assert.assertEquals(property1.getName(), "translations");
        Assert.assertEquals(property1.getBaseType(), "NSDictionary");
        Assert.assertEquals(property1.getContainerType(), "map");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert a simple java model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema())
                .addProperties("createdAt", new DateTimeSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "NSNumber*");
        Assert.assertEquals(property1.getName(), "_id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "NSNumber");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "NSString*");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "NSString");
        Assert.assertTrue(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertFalse(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getDataType(), "NSDate*");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "NSDate");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema())
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "NSNumber*");
        Assert.assertEquals(property1.getName(), "_id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "NSNumber");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "NSArray<NSString*>*");
        Assert.assertEquals(property2.getName(), "urls");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "NSArray");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());
    }

    @Test(description = "convert a model with a map property")
    public void mapPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "translations");
        Assert.assertEquals(property1.getDataType(), "NSDictionary<NSString*, NSString*>*");
        Assert.assertEquals(property1.getName(), "translations");
        Assert.assertEquals(property1.getBaseType(), "NSDictionary");
        Assert.assertEquals(property1.getContainerType(), "map");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
        Assert.assertTrue(property1.getIsPrimitiveType());
    }


    @Test(description = "convert a model with complex property")
    public void complexPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("children", new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getDataType(), "OAIChildren*");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "OAIChildren");
        Assert.assertFalse(property1.getRequired());
        Assert.assertFalse(property1.isContainer());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/definitions/Children")));
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getComplexType(), "OAIChildren");
        Assert.assertEquals(property1.getDataType(), "NSArray<OAIChildren>*");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "NSArray");
        Assert.assertEquals(property1.getContainerType(), "array");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert a model with complex map property")
    public void complexMapPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("children", new MapSchema()
                        .additionalProperties(new Schema().$ref("#/definitions/Children")));
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("OAIChildren")).size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getComplexType(), "OAIChildren");
        Assert.assertEquals(property1.getDataType(), "NSDictionary<OAIChildren>*");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "NSDictionary");
        Assert.assertEquals(property1.getContainerType(), "map");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert an array model")
    public void arrayModelTest() {
        final Schema model = new ArraySchema()
                .items(new Schema().$ref("#/definitions/Children"))
                .description("an array model");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "OAISample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "NSMutableArray");
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("OAIChildren")).size(), 1);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema model = new Schema()
                .description("a map model for testing ObjC generator")
                .additionalProperties(new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new ObjcClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("map_model", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("map_model", model);

        Assert.assertEquals(cm.name, "map_model");
        Assert.assertEquals(cm.classname, "OAIMapModel");
        Assert.assertEquals(cm.description, "a map model for testing ObjC generator");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "NSMutableDictionary");
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("OAIChildren")).size(), 1);
    }

    @Test(description = "test uuid")
    public void uuidAndPasswordDataModelTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        codegen.setOpenAPI(openAPI);
        final Schema definition = openAPI.getComponents().getSchemas().get("format_test");

        Schema property = ((Map<String, Schema>) definition.getProperties()).get("uuid");
        CodegenProperty prope = codegen.fromProperty("uuid", property);
        Assert.assertEquals(prope.getBaseType(), "NSString");

        prope = codegen.fromProperty("password", property);
        Assert.assertEquals(prope.getBaseType(), "NSString");
    }

    @Test(description = "test mixedProperties")
    public void mixedPropertiesDataModelTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        codegen.setOpenAPI(openAPI);
        final Schema definition = openAPI.getComponents().getSchemas().get("MixedPropertiesAndAdditionalPropertiesClass");

        Schema property = ((Map<String, Schema>) definition.getProperties()).get("map");
        CodegenProperty prope = codegen.fromProperty("map", property);
        Assert.assertEquals(prope.getBaseType(), "NSDictionary");
    }

    @Test(description = "test isArray")
    public void isArrayModelTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        final Schema definition = openAPI.getComponents().getSchemas().get("AnimalFarm");
        codegen.setOpenAPI(openAPI);
        final CodegenModel codegenModel = codegen.fromModel("AnimalFarm", definition);

        Assert.assertEquals(codegenModel.isArray, true);
        Assert.assertEquals(codegenModel.arrayModelType, "OAIAnimal");
    }


    @Test(description = "test binary data")
    public void binaryDataModelTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/binaryDataTest.json");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        final String path = "/tests/binaryResponse";
        final Operation p = openAPI.getPaths().get(path).getPost();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation op = codegen.fromOperation(path, "post", p, null);

        Assert.assertTrue(op.bodyParam.isBinary);
        Assert.assertTrue(op.responses.get(0).isBinary);
        Assert.assertEquals(op.returnType, "NSURL*");
        Assert.assertEquals(op.bodyParam.dataType, "NSURL*");
    }

    @Test(description = "create proper imports per #316")
    public void issue316Test() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/postBodyTest.json");
        final DefaultCodegen codegen = new ObjcClientCodegen();
        codegen.setOpenAPI(openAPI);

        final Map<String, PathItem> animalPaths = openAPI.getPaths();

        final PathItem animalOps = animalPaths.get("/animals");
        Assert.assertNotNull(animalOps.getPost());

        final CodegenOperation animalCo = codegen.fromOperation("/animals", "POST", animalOps.getPost(), null);
        Assert.assertEquals(animalCo.imports.size(), 1);
        Assert.assertTrue(animalCo.imports.contains("OAIAnimal"));

        final Map<String, PathItem> insectPaths = openAPI.getPaths();
        final PathItem insectOps = insectPaths.get("/insects");
        Assert.assertNotNull(insectOps.getPost());

        final CodegenOperation insectCo = codegen.fromOperation("/insects", "POST", insectOps.getPost(), null);
        Assert.assertEquals(insectCo.imports.size(), 1);
        Assert.assertTrue(insectCo.imports.contains("OAIInsect"));
    }
}
