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

package org.openapitools.codegen.csharpnetcore;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.*;
import org.openapitools.codegen.languages.AbstractCSharpCodegen;
import org.openapitools.codegen.languages.AspNetServerCodegen;
import org.openapitools.codegen.languages.CSharpClientCodegen;
import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("static-method")
public class CSharpModelTest {

    @Test
    public void assertOuterEnumIsString() {
        // this issue has not been found yet in version 2
        // Assert.assertEquals(outerEnumVarsIsString(new AspNetServerCodegen(), 2, false), true);
        // Assert.assertEquals(outerEnumVarsIsString(new AspNetServerCodegen(), 2, true), true);
        Assert.assertEquals(outerEnumVarsIsString(new AspNetServerCodegen(), 3, false), true);
        Assert.assertEquals(outerEnumVarsIsString(new AspNetServerCodegen(), 3, true), true);

        CSharpClientCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        // this issue has not been found yet in version 2
        // Assert.assertEquals(outerEnumVarsIsString(new CSharpClientCodegen(), 2, false), true);
        // Assert.assertEquals(outerEnumVarsIsString(new CSharpClientCodegen(), 2, true), true);
        Assert.assertEquals(outerEnumVarsIsString(codegen, 3, false), true);
        Assert.assertEquals(outerEnumVarsIsString(codegen, 3, true), true);
    }

    public boolean outerEnumVarsIsString(final AbstractCSharpCodegen codegen, final int openApiVersion, final Boolean nullableReferenceTypes) {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/" + openApiVersion + "_0/petstore-with-fake-endpoints-models-for-testing-with-http-signature.yaml");
        codegen.setNullableReferenceTypes(nullableReferenceTypes);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        Schema schema = openAPI.getComponents().getSchemas().get("Enum_Test");
        final CodegenModel generated = codegen.fromModel("OuterEnum", schema);

        CodegenProperty cp0 = generated.getVars().get(0);
        return cp0.getIsString();
    }

    @Test(description = "convert a model with array property to default List<T>")
    public void arrayPropertyTest() {
        final Schema schema = getArrayTestSchema();

        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel generated = codegen.fromModel("sample", schema);

        Assert.assertEquals(generated.name, "sample");
        Assert.assertEquals(generated.classname, "Sample");
        Assert.assertEquals(generated.description, "a sample model");
        Assert.assertEquals(generated.vars.size(), 2);

        final CodegenProperty property = generated.vars.get(1);
        Assert.assertEquals(property.getBaseName(), "examples");
        Assert.assertEquals(property.getGetter(), "getExamples");
        Assert.assertEquals(property.getSetter(), "setExamples");
        Assert.assertEquals(property.getDataType(), "List<string>");
        Assert.assertEquals(property.getName(), "Examples");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "List");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with array property to Collection<T>")
    public void arrayPropertyCollectionOptionTest() {
        final Schema schema = getArrayTestSchema();

        final CSharpClientCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");

        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        codegen.setUseCollection(true);
        final CodegenModel generated = codegen.fromModel("sample", schema);

        Assert.assertEquals(generated.name, "sample");
        Assert.assertEquals(generated.vars.size(), 2);

        final CodegenProperty property = generated.vars.get(1);
        Assert.assertEquals(property.getBaseName(), "examples");
        Assert.assertEquals(property.getName(), "Examples");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getDataType(), "Collection<string>");
        Assert.assertEquals(property.getBaseType(), "Collection");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with array property to Collection<T>")
    public void arrayPropertyICollectionOptionTest() {
        final Schema schema = getArrayTestSchema();

        final CSharpClientCodegen codegen = new CSharpClientCodegen();

        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        codegen.setUseCollection(true);
        codegen.setReturnICollection(true);

        final CodegenModel generated = codegen.fromModel("sample", schema);

        Assert.assertEquals(generated.name, "sample");
        Assert.assertEquals(generated.vars.size(), 2);

        final CodegenProperty property = generated.vars.get(1);
        Assert.assertEquals(property.getBaseName(), "examples");
        Assert.assertEquals(property.getName(), "Examples");
        Assert.assertEquals(property.getDataType(), "Collection<string>",
                "returnICollection option should not modify property datatype");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "Collection",
                "returnICollection option should not modify property baseType");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    private Schema getArrayTestSchema() {
        return new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("examples", new ArraySchema().items(new StringSchema()))
                .addRequiredItem("id");
    }

    @Test(description = "convert a simple model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema())
                .addProperties("createdAt", new DateTimeSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "long");
        Assert.assertEquals(property1.getName(), "Id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "long");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "string");
        Assert.assertEquals(property2.getName(), "Name");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "string");
        Assert.assertTrue(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getDataType(), "DateTime");
        Assert.assertEquals(property3.getName(), "CreatedAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "DateTime");
        Assert.assertFalse(property3.getRequired());
    }

    @Test(description = "convert a model with a non-nullable property")
    public void nonNullablePropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT).nullable(false))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addProperties("name", new StringSchema().nullable(true))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "long");
        Assert.assertEquals(property1.getName(), "Id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "long");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "List<string>");
        Assert.assertEquals(property2.getName(), "Urls");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "List");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "name");
        Assert.assertEquals(property3.getDataType(), "string");
        Assert.assertEquals(property3.getName(), "Name");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "string");
        Assert.assertFalse(property3.getRequired());
        Assert.assertTrue(property3.getIsPrimitiveType());
    }

    @Test(description = "convert a model with a nullable property")
    public void nullablePropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT).nullable(true))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addProperties("name", new StringSchema().nullable(true))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "long?");
        Assert.assertEquals(property1.getName(), "Id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "long?");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "List<string>");
        Assert.assertEquals(property2.getName(), "Urls");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "List");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "name");
        Assert.assertEquals(property3.getDataType(), "string");
        Assert.assertEquals(property3.getName(), "Name");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "string");
        Assert.assertFalse(property3.getRequired());
        Assert.assertTrue(property3.getIsPrimitiveType());
    }

    @Test(description = "convert a model with a nullable property without nullable annotation")
    public void nullablePropertyWithoutNullableReferenceTypesTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT).nullable(true))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()).nullable(true))
                .addProperties("name", new StringSchema().nullable(true))
                .addProperties("subObject", new Schema().addProperties("name", new StringSchema()).nullable(true))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new AspNetServerCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 4);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "long?");
        Assert.assertEquals(property1.getName(), "Id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "long?");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "List<string>");
        Assert.assertEquals(property2.getName(), "Urls");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "List");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "name");
        Assert.assertEquals(property3.getDataType(), "string");
        Assert.assertEquals(property3.getName(), "Name");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "string");
        Assert.assertFalse(property3.getRequired());
        Assert.assertTrue(property3.getIsPrimitiveType());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "subObject");
        Assert.assertEquals(property4.getDataType(), "Object");
        Assert.assertEquals(property4.getName(), "SubObject");
        Assert.assertNull(property4.getDefaultValue());
        Assert.assertEquals(property4.getBaseType(), "Object");
        Assert.assertFalse(property4.getRequired());
        Assert.assertTrue(property4.getIsPrimitiveType());
    }

    @Test(description = "convert a model with a nullable property using nullable annotation")
    public void nullablePropertyWithNullableReferenceTypesTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT)
                        .nullable(true))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema())
                        .nullable(true))
                .addProperties("name", new StringSchema().nullable(true))
                .addProperties("subObject", new Schema().addProperties("name", new StringSchema())
                        .nullable(true))
                .addProperties("deepNullableAliasArray", new ArraySchema()
                        .items(new ArraySchema()
                                .items(new StringSchema()
                                        .nullable(true))
                                .nullable(true))
                        .nullable(true))
                .addProperties("deepAliasArray", new ArraySchema()
                        .items(new ArraySchema()
                                .items(new StringSchema())))
                .addProperties("deepIntermediateNullableAliasArray", new ArraySchema()
                        .items(new ArraySchema()
                                .items(new StringSchema())
                                .nullable(true)))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new AspNetServerCodegen();
        codegen.processOpts();
        codegen.additionalProperties().put(CodegenConstants.NULLABLE_REFERENCE_TYPES, true);
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 7);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "long?");
        Assert.assertEquals(property1.getName(), "Id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "long?");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "List<string>");
        Assert.assertEquals(property2.getName(), "Urls");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "List?");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "name");
        Assert.assertEquals(property3.getDataType(), "string?");
        Assert.assertEquals(property3.getName(), "Name");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "string?");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.getIsPrimitiveType());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "subObject");
        Assert.assertEquals(property4.getDataType(), "Object?");
        Assert.assertEquals(property4.getName(), "SubObject");
        Assert.assertNull(property4.getDefaultValue());
        Assert.assertEquals(property4.getBaseType(), "Object?");
        Assert.assertFalse(property4.getRequired());
        Assert.assertFalse(property4.getIsPrimitiveType());

        final CodegenProperty property5 = cm.vars.get(4);
        Assert.assertEquals(property5.getBaseName(), "deepNullableAliasArray");
        Assert.assertEquals(property5.getDataType(), "List<List<string?>>");
        Assert.assertEquals(property5.getName(), "DeepNullableAliasArray");
        Assert.assertNull(property5.getDefaultValue());
        Assert.assertEquals(property5.getBaseType(), "List?");
        Assert.assertEquals(property5.getContainerType(), "array");
        Assert.assertFalse(property5.getRequired());
        Assert.assertFalse(property5.getIsPrimitiveType());
        Assert.assertTrue(property5.isContainer());

        final CodegenProperty property6 = cm.vars.get(5);
        Assert.assertEquals(property6.getBaseName(), "deepAliasArray");
        Assert.assertEquals(property6.getDataType(), "List<List<string>>");
        Assert.assertEquals(property6.getName(), "DeepAliasArray");
        Assert.assertEquals(property6.getBaseType(), "List");
        Assert.assertEquals(property6.getContainerType(), "array");
        Assert.assertTrue(property6.isContainer());

        final CodegenProperty property7 = cm.vars.get(6);
        Assert.assertEquals(property7.getBaseName(), "deepIntermediateNullableAliasArray");
        Assert.assertEquals(property7.getDataType(), "List<List<string>>");
        Assert.assertEquals(property7.getName(), "DeepIntermediateNullableAliasArray");
        Assert.assertEquals(property7.getBaseType(), "List");
        Assert.assertEquals(property7.getContainerType(), "array");
        Assert.assertTrue(property7.isContainer());
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "long");
        Assert.assertEquals(property1.getName(), "Id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "long");
        Assert.assertTrue(property1.getRequired());
        Assert.assertTrue(property1.getIsPrimitiveType());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "List<string>");
        Assert.assertEquals(property2.getName(), "Urls");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "List");
        Assert.assertEquals(property2.getContainerType(), "array");
        Assert.assertFalse(property2.getRequired());
        Assert.assertTrue(property2.getIsPrimitiveType());
        Assert.assertTrue(property2.isContainer());
    }

    @Test(description = "convert a model with a map property")
    public void mapPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "translations");
        Assert.assertEquals(property1.getDataType(), "Dictionary<string, string>");
        Assert.assertEquals(property1.getName(), "Translations");
        Assert.assertEquals(property1.getBaseType(), "Dictionary");
        Assert.assertEquals(property1.getContainerType(), "map");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
        Assert.assertTrue(property1.getIsPrimitiveType());
    }

    @Test(description = "convert a model with complex property")
    public void complexPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new Schema().$ref("#/components/schemas/Children"));
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getDataType(), "Children");
        Assert.assertEquals(property1.getName(), "Children");
        Assert.assertEquals(property1.getBaseType(), "Children");
        Assert.assertFalse(property1.getRequired());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getComplexType(), "Children");
        Assert.assertEquals(property1.getDataType(), "List<Children>");
        Assert.assertEquals(property1.getName(), "Children");
        Assert.assertEquals(property1.getBaseType(), "List");
        Assert.assertEquals(property1.getContainerType(), "array");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert a model with complex map property")
    public void complexMapPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new MapSchema()
                        .additionalProperties(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Children")).size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getComplexType(), "Children");
        Assert.assertEquals(property1.getDataType(), "Dictionary<string, Children>");
        Assert.assertEquals(property1.getName(), "Children");
        Assert.assertEquals(property1.getBaseType(), "Dictionary");
        Assert.assertEquals(property1.getContainerType(), "map");
        Assert.assertFalse(property1.getRequired());
        Assert.assertTrue(property1.isContainer());
    }

    @Test(description = "convert an array model")
    public void arrayModelTest() {
        final Schema schema = new ArraySchema()
                .items(new Schema().$ref("#/components/schemas/Children"))
                .description("an array model");
        final DefaultCodegen codegen = new CSharpClientCodegen();
        codegen.setLibrary("restsharp");
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
        // TODO: additional properties should be of type Dictionary<string, List<Children>>
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Children")).size(), 1);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().$ref("#/components/schemas/Children"));
        final DefaultCodegen codegen = new CSharpClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.processOpts();
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
        // TODO: additional properties should be of type Dictionary<string, Children>
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Children")).size(), 1);
    }
}
