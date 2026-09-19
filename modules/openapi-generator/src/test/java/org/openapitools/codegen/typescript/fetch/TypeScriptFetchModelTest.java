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

package org.openapitools.codegen.typescript.fetch;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.TestUtils;
import org.openapitools.codegen.languages.TypeScriptFetchClientCodegen;
import org.openapitools.codegen.typescript.TypeScriptGroups;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.*;

/*
import static io.swagger.codegen.CodegenConstants.IS_ENUM_EXT_NAME;
import static io.swagger.codegen.languages.helpers.ExtensionHelper.getBooleanValue;
import static io.swagger.codegen.utils.ModelUtils.updateCodegenPropertyEnum;
*/

@Test(groups = {TypeScriptGroups.TYPESCRIPT, TypeScriptGroups.TYPESCRIPT_FETCH})
@SuppressWarnings("static-method")
public class TypeScriptFetchModelTest {

    @Test(description = "convert a simple TypeScript Fetch model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperty("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperty("name", new StringSchema())
                .addProperty("createdAt", new DateTimeSchema())
                .addProperty("birthDate", new DateSchema())
                .addProperty("active", new BooleanSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");

        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.processOpts();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 5);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "number");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertEquals(property1.getDefaultValue(), "undefined");
        Assert.assertEquals(property1.getBaseType(), "number");
        Assert.assertTrue(property1.getRequired());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "string");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertEquals(property2.getDefaultValue(), "undefined");
        Assert.assertEquals(property2.getBaseType(), "string");
        Assert.assertTrue(property2.getRequired());
        Assert.assertFalse(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getComplexType(), null);
        Assert.assertEquals(property3.getDataType(), "Date");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertEquals(property3.getDefaultValue(), "undefined");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "birthDate");
        Assert.assertEquals(property4.getComplexType(), null);
        Assert.assertEquals(property4.getDataType(), "Date");
        Assert.assertEquals(property4.getName(), "birthDate");
        Assert.assertEquals(property4.getDefaultValue(), "undefined");
        Assert.assertFalse(property4.getRequired());
        Assert.assertFalse(property4.isContainer());

        final CodegenProperty property5 = cm.vars.get(4);
        Assert.assertEquals(property5.getBaseName(), "active");
        Assert.assertEquals(property5.getComplexType(), null);
        Assert.assertEquals(property5.getDataType(), "boolean");
        Assert.assertEquals(property5.getName(), "active");
        Assert.assertEquals(property5.getDefaultValue(), "undefined");
        Assert.assertFalse(property5.getRequired());
        Assert.assertFalse(property5.isContainer());
    }

    @Test(description = "convert a simple TypeScript Angular model; overwrite date/DateTime type mapping")
    public void simpleModelWithStringDateTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperty("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperty("name", new StringSchema())
                .addProperty("createdAt", new DateTimeSchema())
                .addProperty("birthDate", new DateSchema())
                .addProperty("active", new BooleanSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");

        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        codegen.typeMapping().put("date", "string");
        codegen.typeMapping().put("DateTime", "string");
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 5);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "number");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertEquals(property1.getDefaultValue(), "undefined");
        Assert.assertEquals(property1.getBaseType(), "number");
        Assert.assertTrue(property1.getRequired());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getDataType(), "string");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertEquals(property2.getDefaultValue(), "undefined");
        Assert.assertEquals(property2.getBaseType(), "string");
        Assert.assertTrue(property2.getRequired());
        Assert.assertFalse(property2.isContainer());

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getComplexType(), null);
        Assert.assertEquals(property3.getDataType(), "string");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertEquals(property3.getDefaultValue(), "undefined");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "birthDate");
        Assert.assertEquals(property4.getComplexType(), null);
        Assert.assertEquals(property4.getDataType(), "string");
        Assert.assertEquals(property4.getName(), "birthDate");
        Assert.assertEquals(property4.getDefaultValue(), "undefined");
        Assert.assertFalse(property4.getRequired());
        Assert.assertFalse(property4.isContainer());

        final CodegenProperty property5 = cm.vars.get(4);
        Assert.assertEquals(property5.getBaseName(), "active");
        Assert.assertEquals(property5.getComplexType(), null);
        Assert.assertEquals(property5.getDataType(), "boolean");
        Assert.assertEquals(property5.getName(), "active");
        Assert.assertEquals(property5.getDefaultValue(), "undefined");
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
                .addProperty("id", integerSchema)
                .addProperty("name", stringSchema)
                .addProperty("createdAt", dateTimeSchema)
                .addProperty("birthDate", dateSchema)
                .addProperty("active", booleanSchema)
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
        final Schema model = new Schema()
                .description("a sample model")
                .addProperty("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperty("urls", new ArraySchema().items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "number");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertEquals(property1.getDefaultValue(), "undefined");
        Assert.assertEquals(property1.getBaseType(), "number");
        Assert.assertTrue(property1.getRequired());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = cm.vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "urls");
        Assert.assertEquals(property2.getDataType(), "Array<string>");
        Assert.assertEquals(property2.getName(), "urls");
        Assert.assertEquals(property2.getBaseType(), "Array");
        Assert.assertFalse(property2.getRequired());
    }

    @Test(description = "convert a model with complex property")
    public void complexPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperty("children", new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "children");
        Assert.assertEquals(property1.getDataType(), "Children");
        Assert.assertEquals(property1.getName(), "children");
        Assert.assertEquals(property1.getDefaultValue(), "undefined");
        Assert.assertEquals(property1.getBaseType(), "Children");
        Assert.assertFalse(property1.getRequired());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperty("children", new ArraySchema()
                        .items(new Schema().$ref("#/definitions/Children")));
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

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
        final Schema model = new ArraySchema()
                .items(new Schema().$ref("#/definitions/Children"))
                .description("an array model");
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema model = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Children")).size(), 1);
    }

    @Test(description = "test enum array model")
    public void enumArrayModelTest() {
        // TODO: update yaml file.
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.processOpts();
        codegen.setOpenAPI(openAPI);
        final Schema schema = openAPI.getComponents().getSchemas().get("EnumArrays");

        Schema property = (Schema) schema.getProperties().get("array_enum");
        CodegenProperty prope = codegen.fromProperty("array_enum", property);
        codegen.updateCodegenPropertyEnum(prope);
        Assert.assertEquals(prope.getDatatypeWithEnum(), "Array<ArrayEnumEnum>");
        Assert.assertEquals(prope.getEnumName(), "ArrayEnumEnum");
        Assert.assertTrue(prope.getIsEnum());
        Assert.assertEquals(prope.getAllowableValues().get("values"), Arrays.asList("fish", "crab"));

        HashMap<String, Object> fish = new HashMap<String, Object>();
        fish.put("name", "Fish");
        fish.put("value", "'fish'");
        fish.put("isString", false);
        HashMap<String, Object> crab = new HashMap<String, Object>();
        crab.put("name", "Crab");
        crab.put("value", "'crab'");
        crab.put("isString", false);
        Assert.assertEquals(prope.getAllowableValues().get("enumVars"), Arrays.asList(fish, crab));

        // assert inner items
        Assert.assertEquals(prope.getDatatypeWithEnum(), "Array<ArrayEnumEnum>");
        Assert.assertEquals(prope.getEnumName(), "ArrayEnumEnum");
        Assert.assertTrue(prope.getItems().getIsEnum());
        Assert.assertEquals(prope.getItems().getAllowableValues().get("values"), Arrays.asList("fish", "crab"));
        Assert.assertEquals(prope.getItems().getAllowableValues().get("enumVars"), Arrays.asList(fish, crab));

        //IMPORTANT: these are not final enum values, which may be further updated
        //by postProcessModels

    }

    @Test(description = "test enum model for values (numeric, string, etc)")
    public void enumModelValueTest() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/2_0/petstore-with-fake-endpoints-models-for-testing.yaml");
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.processOpts();
        codegen.setOpenAPI(openAPI);
        final Schema schema = openAPI.getComponents().getSchemas().get("Enum_Test");

        Schema property = (Schema) schema.getProperties().get("enum_integer");
        CodegenProperty prope = codegen.fromProperty("enum_integer", property);
        codegen.updateCodegenPropertyEnum(prope);
        Assert.assertEquals(prope.getDatatypeWithEnum(), "EnumIntegerEnum");
        Assert.assertEquals(prope.getEnumName(), "EnumIntegerEnum");
        Assert.assertTrue(prope.getIsEnum());
        Assert.assertFalse(prope.isContainer());
        Assert.assertNull(prope.getItems());
        Assert.assertEquals(prope.getAllowableValues().get("values"), Arrays.asList(1, -1));

        HashMap<String, Object> one = new HashMap<String, Object>();
        one.put("name", "NUMBER_1");
        one.put("value", "1");
        one.put("isString", false);
        HashMap<String, Object> minusOne = new HashMap<String, Object>();
        minusOne.put("name", "NUMBER_MINUS_1");
        minusOne.put("value", "-1");
        minusOne.put("isString", false);
        Assert.assertEquals(prope.getAllowableValues().get("enumVars"), Arrays.asList(one, minusOne));

        //IMPORTANT: these are not final enum values, which may be further updated
        //by postProcessModels

    }

    @Test(description = "Add null safe additional property indexer when enabled")
    public void testNullSafeAdditionalProps() {
        final Schema model = new Schema()
                .additionalProperties(new StringSchema());
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.additionalProperties().put("nullSafeAdditionalProps", true);
        codegen.processOpts();

        Assert.assertEquals(codegen.getTypeDeclaration(model), "{ [key: string]: string | undefined; }");
    }

    @Test(description = "Don't add null safe additional property indexer by default")
    public void testWithoutNullSafeAdditionalProps() {
        final Schema model = new Schema()
                .additionalProperties(new StringSchema());
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.processOpts();

        Assert.assertEquals(codegen.getTypeDeclaration(model), "{ [key: string]: string; }");
    }

    @Test(description = "Don't generate new schemas for readonly references")
    public void testNestedReadonlySchemas() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf-readonly.yaml");
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.processOpts();
        codegen.setOpenAPI(openAPI);
        final Map<String, Schema> schemaBefore = openAPI.getComponents().getSchemas();
        Assert.assertEquals(schemaBefore.keySet(), Sets.newHashSet("club", "owner"));
    }

    @Test(description = "Don't generate new schemas for nullable references")
    public void testNestedNullableSchemas() {
        final OpenAPI openAPI = TestUtils.parseFlattenSpec("src/test/resources/3_0/allOf-nullable.yaml");
        final DefaultCodegen codegen = new TypeScriptFetchClientCodegen();
        codegen.processOpts();
        codegen.setOpenAPI(openAPI);
        final Map<String, Schema> schemaBefore = openAPI.getComponents().getSchemas();
        Assert.assertEquals(schemaBefore.keySet(), Sets.newHashSet("club", "owner"));
    }

}
