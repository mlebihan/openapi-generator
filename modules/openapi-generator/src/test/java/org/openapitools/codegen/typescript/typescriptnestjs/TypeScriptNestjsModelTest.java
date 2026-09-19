/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen.typescript.typescriptnestjs;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.TestUtils;
import org.openapitools.codegen.languages.TypeScriptNestjsClientCodegen;
import org.openapitools.codegen.typescript.TypeScriptGroups;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {TypeScriptGroups.TYPESCRIPT, TypeScriptGroups.TYPESCRIPT_NESTJS})
@SuppressWarnings("static-method")
public class TypeScriptNestjsModelTest {

    @Test(description = "convert a simple TypeScript Nestjs model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperty("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperty("name", new StringSchema())
                .addProperties("createdAt", new DateTimeSchema())
                .addProperties("birthDate", new DateSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 4);

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
        Assert.assertEquals(property3.getBaseType(), "string");
        Assert.assertEquals(property3.getDefaultValue(), "undefined");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "birthDate");
        Assert.assertEquals(property4.getComplexType(), null);
        Assert.assertEquals(property4.getDataType(), "string");
        Assert.assertEquals(property4.getName(), "birthDate");
        Assert.assertEquals(property4.getBaseType(), "string");
        Assert.assertEquals(property4.getDefaultValue(), "undefined");
        Assert.assertFalse(property4.getRequired());
        Assert.assertFalse(property4.isContainer());
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema().items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
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
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new Schema().$ref("#/definitions/Children"));
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
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
        Assert.assertEquals(property1.getDefaultValue(), "undefined");
        Assert.assertEquals(property1.getBaseType(), "Children");
        Assert.assertFalse(property1.getRequired());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/definitions/Children")));
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
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
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
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
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.imports.size(), 1);
        Assert.assertEquals(cm.additionalPropertiesType, "Children");
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Children")).size(), 1);
    }

    @Test(description = "convert a model with a name starting with decimal")
    public void beginDecimalNameTest() {
        final Schema schema = new Schema()
                .description("a model with a name starting with decimal")
                .addProperties("1list", new StringSchema())
                .addRequiredItem("1list");
        final DefaultCodegen codegen = new TypeScriptNestjsClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "1list");
        Assert.assertEquals(property.getDataType(), "string");
        Assert.assertEquals(property.getName(), "_1list");
        Assert.assertEquals(property.getDefaultValue(), "undefined");
        Assert.assertEquals(property.getBaseType(), "string");
        Assert.assertTrue(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

}
