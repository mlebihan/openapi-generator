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

package org.openapitools.codegen.typescript.typescriptnode;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.TestUtils;
import org.openapitools.codegen.languages.TypeScriptFetchClientCodegen;
import org.openapitools.codegen.languages.TypeScriptNodeClientCodegen;
import org.openapitools.codegen.typescript.TypeScriptGroups;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;

@Test(groups = {TypeScriptGroups.TYPESCRIPT, TypeScriptGroups.TYPESCRIPT_NODE})
@SuppressWarnings("static-method")
public class TypeScriptNodeModelTest {

    @Test(description = "convert a simple TypeScript Node model")
    public void simpleModelTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema())
                .addProperties("createdAt", new DateTimeSchema())
                .addProperties("birthDate", new DateSchema())
                .addProperties("active", new BooleanSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 5);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "number");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertEquals(property1.getDefaultValue(), null);
        Assert.assertEquals(property1.getBaseType(), "number");
        Assert.assertTrue(property1.getRequired());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "string");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertEquals(property2.getDefaultValue(), null);
        Assert.assertEquals(property2.getBaseType(), "string");
        Assert.assertTrue(property2.getRequired());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getComplexType(), null);
        Assert.assertEquals(property3.getDataType(), "Date");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertEquals(property3.getDefaultValue(), null);
        Assert.assertFalse(property3.getRequired());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "birthDate");
        Assert.assertEquals(property4.getComplexType(), null);
        Assert.assertEquals(property4.getDataType(), "string");
        Assert.assertEquals(property4.getName(), "birthDate");
        Assert.assertEquals(property4.getDefaultValue(), null);
        Assert.assertFalse(property4.getRequired());

        final CodegenProperty property5 = cm.vars.get(4);
        Assert.assertEquals(property5.getBaseName(), "active");
        Assert.assertEquals(property5.getComplexType(), null);
        Assert.assertEquals(property5.getDataType(), "boolean");
        Assert.assertEquals(property5.getName(), "active");
        Assert.assertEquals(property5.getDefaultValue(), null);
        Assert.assertFalse(property5.getRequired());
        Assert.assertFalse(property5.isContainer());
    }

    @Test(description = "convert and check default values for a simple TypeScript Angular model")
    public void simpleModelDefaultValuesTest() throws ParseException {
        IntegerSchema integerSchema = new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT);
        integerSchema.setDefault(1234);

        StringSchema stringSchema = new StringSchema();
        stringSchema.setDefault("Jack");

        OffsetDateTime testOffsetDateTime = OffsetDateTime.of(LocalDateTime.of(2020, 1, 1, 12, 0), ZoneOffset.UTC);
        DateTimeSchema dateTimeSchema = new DateTimeSchema();
        dateTimeSchema.setDefault(testOffsetDateTime);

        Date testDate = Date.from(testOffsetDateTime.toInstant());
        DateSchema dateSchema = new DateSchema();
        dateSchema.setDefault(testDate);

        BooleanSchema booleanSchema = new BooleanSchema();
        booleanSchema.setDefault(true);

        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", integerSchema)
                .addProperties("name", stringSchema)
                .addProperties("createdAt", dateTimeSchema)
                .addProperties("birthDate", dateSchema)
                .addProperties("active", booleanSchema)
                .addRequiredItem("id")
                .addRequiredItem("name");

        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 5);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDefaultValue(), "1234");

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDefaultValue(), "'Jack'");

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(OffsetDateTime.parse(property3.getDefaultValue()), testOffsetDateTime);

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "birthDate");
        Assert.assertEquals(new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH).parse(property4.getDefaultValue()), testDate);

        final CodegenProperty property5 = cm.vars.get(4);
        Assert.assertEquals(property5.getBaseName(), "active");
        Assert.assertEquals(property5.getDefaultValue(), "true");
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema().items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "number");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertEquals(property1.getDefaultValue(), null);
        Assert.assertEquals(property1.getBaseType(), "number");
        Assert.assertTrue(property1.getRequired());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "Array<string>");
        Assert.assertEquals(property2.getName(), "urls");
        Assert.assertEquals(property2.getBaseType(), "Array");
        Assert.assertFalse(property2.getRequired());
    }

    @Test(description = "convert a model with complex property")
    public void complexPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getDataType(), "Children");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "Children");
        Assert.assertFalse(property1.getRequired());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/definitions/Children")));
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getComplexType(), "Children");
        Assert.assertEquals(property1.getDataType(), "Array<Children>");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "Array");
        Assert.assertFalse(property1.getRequired());
    }

    @Test(description = "convert an array model")
    public void arrayModelTest() {
        final Schema schema = new ArraySchema()
                .items(new Schema().$ref("#/definitions/Children"))
                .description("an array model");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Children")).size(), 1);
    }

    @Test(description = "convert an array additional properties model")
    public void arrayModelAdditionalPropertiesArrayTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new ArraySchema().type("array").items(new Schema().type("string")));
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.additionalPropertiesType, "Array<string>");
    }

    @Test(description = "convert a string additional properties model")
    public void arrayModelAdditionalPropertiesStringTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().type("string"));
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.additionalPropertiesType, "string");
    }

    @Test(description = "convert a complex additional properties model")
    public void arrayModelAdditionalPropertiesComplexTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().type("object").$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.additionalPropertiesType, "Children");
    }

    @Test(description = "prepend imports with ./ by default")
    public void defaultFromModelTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/petstore.yaml");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        codegen.setOpenAPI(openAPI);
        final Schema categorySchema = openAPI.getComponents().getSchemas().get("ApiResponse");
        final CodegenModel cm = codegen.fromModel("ApiResponse", categorySchema);

        Assert.assertEquals(cm.name, "ApiResponse");
        Assert.assertEquals(cm.classFilename, "./apiResponse");
    }

    @Test(description = "use mapped imports for type")
    public void mappedFromModelTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/petstore.yaml");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        final String mappedName = "@namespace/dir/response";
        codegen.importMapping().put("ApiResponse", mappedName);
        codegen.setOpenAPI(openAPI);
        final Schema categorySchema = openAPI.getComponents().getSchemas().get("ApiResponse");
        final CodegenModel cm = codegen.fromModel("ApiResponse", categorySchema);

        Assert.assertEquals(cm.name, "ApiResponse");
        Assert.assertEquals(cm.classFilename, mappedName);
    }

    @Test(description = "should exclude TypeScript primitive types from parent property")
    public void modelShouldExcludePrimitiveTypesFromParentPropertyTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/model_with_additional_properties.yaml");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        codegen.setOpenAPI(openAPI);

        // Check that all models with primitive additionalProperties don't have parent property set
        for (String modelName : openAPI.getComponents().getSchemas().keySet()) {
            final Schema schema = openAPI.getComponents().getSchemas().get(modelName);
            final CodegenModel model = codegen.fromModel(modelName, schema);
            Assert.assertNull(model.parent, "Model " + modelName + " should not have a parent property");
        }
    }

    @Test(description = "should extend from parent")
    public void shouldExtendFromParentTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf.yaml");
        final DefaultCodegen codegen = new TypeScriptNodeClientCodegen();
        codegen.setOpenAPI(openAPI);

        // Check that Child model extends Person
        final Schema childSchema = openAPI.getComponents().getSchemas().get("Child");
        final CodegenModel childModel = codegen.fromModel("Child", childSchema);
        Assert.assertEquals(childModel.parent, "Person");

        // Check that Adult model extends Person
        final Schema adultSchema = openAPI.getComponents().getSchemas().get("Adult");
        final CodegenModel adultModel = codegen.fromModel("Adult", adultSchema);
        Assert.assertEquals(adultModel.parent, "Person");
    }
}
