/*
 * Copyright 2021 OpenAPI-Generator Contributors (https://openapi-generator.tech)
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

package org.openapitools.codegen.dart.dio;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.*;
import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.DartDioClientCodegen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("static-method")
public class DartDioModelTest {

    @Test(description = "convert a simple model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema())
                .addProperties("name", new StringSchema())
                .addProperties("createdAt", new DateTimeSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new DartDioClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);
        // {{imports}} is not used in template
        //Assert.assertEquals(cm.imports.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "int");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "int");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "String");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "String");
        Assert.assertTrue(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertFalse(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getComplexType(), "DateTime");
        Assert.assertEquals(property3.getDataType(), "DateTime");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "DateTime");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());
    }

    @Test(description = "convert a simple dart-dit model with datelibrary")
    public void simpleModelWithTimeMachineTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema())
                .addProperties("name", new StringSchema())
                .addProperties("createdAt", new DateTimeSchema())
                .addProperties("birthDate", new DateSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");

        final DartDioClientCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(DartDioClientCodegen.DATE_LIBRARY, DartDioClientCodegen.DATE_LIBRARY_TIME_MACHINE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 4);
        // {{imports}} is not used in template
        //Assert.assertEquals(cm.imports.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "int");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "int");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "String");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "String");
        Assert.assertTrue(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertFalse(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getComplexType(), "OffsetDateTime");
        Assert.assertEquals(property3.getDataType(), "OffsetDateTime");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "OffsetDateTime");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "birthDate");
        Assert.assertEquals(property4.getComplexType(), "OffsetDate");
        Assert.assertEquals(property4.getDataType(), "OffsetDate");
        Assert.assertEquals(property4.getName(), "birthDate");
        Assert.assertNull(property4.getDefaultValue());
        Assert.assertEquals(property4.getBaseType(), "OffsetDate");
        Assert.assertFalse(property4.getRequired());
        Assert.assertFalse(property4.isContainer());
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema())
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addRequiredItem("id");

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "int");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "int");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "BuiltList<String>");
        Assert.assertEquals(property2.getName(), "urls");
        Assert.assertEquals(property2.getBaseType(), "BuiltList");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());
    }

    @Test(description = "convert a model with set property")
    public void setPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema())
                .addProperties("urls", new ArraySchema().items(new StringSchema()).uniqueItems(true))
                .addRequiredItem("id");

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "int");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "int");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "BuiltSet<String>");
        Assert.assertEquals(property2.getName(), "urls");
        Assert.assertEquals(property2.getBaseType(), "BuiltSet");
        Assert.assertEquals(property2.getContainerType(), "set");
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

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "translations");
        Assert.assertEquals(property1.getDataType(), "BuiltMap<String, String>");
        Assert.assertEquals(property1.getName(), "translations");
        Assert.assertEquals(property1.getBaseType(), "BuiltMap");
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

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

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
        Assert.assertFalse(property1.isContainer());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListProperty() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/definitions/Children")));

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getDataType(), "BuiltList<Children>");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "BuiltList");
        Assert.assertEquals(property1.getContainerType(), "array");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert a model with complex map property")
    public void complexMapSchema() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("children", new MapSchema()
                        .additionalProperties(new Schema().$ref("#/definitions/Children")));

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();

        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));

        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getComplexType(), "Children");
        Assert.assertEquals(property1.getDataType(), "BuiltMap<String, Children>");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getBaseType(), "BuiltMap");
        Assert.assertEquals(property1.getContainerType(), "map");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert an array model")
    public void arrayModelTest() {
        final Schema model = new ArraySchema()
                .items(new Schema().$ref("#/definitions/Children"))
                .description("an array model");
        final DefaultCodegen codegen = new DartDioClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(model.getDescription(), "an array model");

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertTrue(cm.isArray);
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema model = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new DartDioClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
    }

    @DataProvider(name = "modelNames")
    public static Object[][] modelNames() {
        return new Object[][]{
                {"EnumClass", "TestModelEnumClass"},
                {"JsonObject", "TestModelJsonObject"},
        };
    }

    @Test(dataProvider = "modelNames", description = "correctly prefix reserved model names")
    public void modelNameTest(String name, String expectedName) {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema model = new Schema();

        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();
        codegen.typeMapping().put("EnumClass", "TestModelEnumClass");
        codegen.typeMapping().put("JsonObject", "TestModelJsonObject");
        codegen.setOpenAPI(openAPI);

        final CodegenModel cm = codegen.fromModel(name, model);

        Assert.assertEquals(cm.name, name);
        Assert.assertEquals(cm.classname, expectedName);
    }

    @DataProvider(name = "modelNamesTimemachine")
    public static Object[][] modelNamesTimemachine() {
        return new Object[][]{
                {"EnumClass", "TestModelEnumClass"},
                {"JsonObject", "TestModelJsonObject"},
                {"OffsetDate", "TestModelOffsetDate"},
        };
    }

    @Test(dataProvider = "modelNamesTimemachine", description = "correctly prefix reserved model names")
    public void modelNameTestTimemachine(String name, String expectedName) {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema model = new Schema();
        final DartDioClientCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(DartDioClientCodegen.DATE_LIBRARY, DartDioClientCodegen.DATE_LIBRARY_TIME_MACHINE);
        codegen.processOpts();
        codegen.typeMapping().put("EnumClass", "TestModelEnumClass");
        codegen.typeMapping().put("JsonObject", "TestModelJsonObject");
        codegen.typeMapping().put("OffsetDate", "TestModelOffsetDate");
        codegen.setOpenAPI(openAPI);

        final CodegenModel cm = codegen.fromModel(name, model);

        Assert.assertEquals(cm.name, name);
        Assert.assertEquals(cm.classname, expectedName);
    }

    @Test(description = "correctly generate collection default values")
    public void collectionDefaultValues() {
        final ArraySchema array = new ArraySchema();
        array.setDefault("[]");
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("arrayNoDefault", new ArraySchema())
                .addProperties("arrayEmptyDefault", array)
                .addProperties("mapNoDefault", new MapSchema());
        final DefaultCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.setOpenAPI(TestUtils.createOpenAPIWithOneSchema("sample", model));
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        final CodegenProperty arrayNoDefault = cm.vars.get(0);
        Assert.assertEquals(arrayNoDefault.getName(), "arrayNoDefault");
        Assert.assertNull(arrayNoDefault.getDefaultValue());

        final CodegenProperty arrayEmptyDefault = cm.vars.get(1);
        Assert.assertEquals(arrayEmptyDefault.getName(), "arrayEmptyDefault");
        Assert.assertEquals(arrayEmptyDefault.getDefaultValue(), "ListBuilder()");

        final CodegenProperty mapNoDefault = cm.vars.get(2);
        Assert.assertEquals(mapNoDefault.getName(), "mapNoDefault");
        Assert.assertNull(mapNoDefault.getDefaultValue());
    }

    @Test(description = "correctly generate date/datetime default values, currently null")
    public void dateDefaultValues() {
        final DateSchema date = new DateSchema();
        date.setDefault("2021-01-01");
        final DateTimeSchema dateTime = new DateTimeSchema();
        dateTime.setDefault("2021-01-01T14:00:00Z");
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("date", date)
                .addProperties("dateTime", dateTime)
                .addProperties("mapNoDefault", new MapSchema());
        final DefaultCodegen codegen = new DartDioClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        final CodegenProperty dateDefault = cm.vars.get(0);
        Assert.assertEquals(dateDefault.getName(), "date");
        Assert.assertNull(dateDefault.getDefaultValue());

        final CodegenProperty dateTimeDefault = cm.vars.get(1);
        Assert.assertEquals(dateTimeDefault.getName(), "dateTime");
        Assert.assertNull(dateTimeDefault.getDefaultValue());
    }

    @Test(description = "array items can be nullable")
    public void arrayItemsCanBeNullable() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/array-nullable-items.yaml");
        final DartDioClientCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();
        codegen.setOpenAPI(openAPI);
        final ArraySchema schema = (ArraySchema) openAPI.getComponents().getSchemas().get("ArrayWithNullableItemsModel")
                .getProperties()
                .get("foo");

        Assert.assertEquals(codegen.getTypeDeclaration(schema), "BuiltList<String?>");
    }

    @Test(description = "nested array items can be nullable")
    public void nestedArrayItemsCanBeNullable() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/nested-array-nullable-items.yaml");
        final DartDioClientCodegen codegen = new DartDioClientCodegen();
        codegen.additionalProperties().put(CodegenConstants.SERIALIZATION_LIBRARY, DartDioClientCodegen.SERIALIZATION_LIBRARY_BUILT_VALUE);
        codegen.processOpts();
        codegen.setOpenAPI(openAPI);
        final ArraySchema schema = (ArraySchema) openAPI.getComponents().getSchemas().get("NestedArrayWithNullableItemsModel")
                .getProperties()
                .get("foo");

        Assert.assertEquals(codegen.getTypeDeclaration(schema), "BuiltList<BuiltList<String?>>");
    }
}
