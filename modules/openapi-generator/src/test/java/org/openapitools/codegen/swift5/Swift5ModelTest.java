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

package org.openapitools.codegen.swift5;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.TestUtils;
import org.openapitools.codegen.languages.Swift5ClientCodegen;
import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("static-method")
public class Swift5ModelTest {

    @Test(description = "convert a simple java model", enabled = true)
    public void simpleModelTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperty("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperty("name", new StringSchema())
                .addProperty("createdAt", new DateTimeSchema())
                .addProperty("binary", new BinarySchema())
                .addProperty("byte", new ByteArraySchema())
                .addProperty("uuid", new UUIDSchema())
                .addProperty("dateOfBirth", new DateSchema())
                .addRequiredItem("id")
                .addRequiredItem("name")
                .discriminator(new Discriminator().propertyName("test"));
        final DefaultCodegen codegen = new Swift5ClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 7);
        Assert.assertEquals(cm.getDiscriminatorName(), "test");

        final CodegenProperty property1 = cm.vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getDataType(), "Int64");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "Int64");
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
        Assert.assertEquals(property3.getDataType(), "Date");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "Date");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());

        final CodegenProperty property4 = cm.vars.get(3);
        Assert.assertEquals(property4.getBaseName(), "binary");
        Assert.assertEquals(property4.getDataType(), "URL");
        Assert.assertEquals(property4.getName(), "binary");
        Assert.assertNull(property4.getDefaultValue());
        Assert.assertEquals(property4.getBaseType(), "URL");
        Assert.assertFalse(property4.getRequired());
        Assert.assertFalse(property4.isContainer());

        final CodegenProperty property5 = cm.vars.get(4);
        Assert.assertEquals(property5.getBaseName(), "byte");
        Assert.assertEquals(property5.getDataType(), "Data");
        Assert.assertEquals(property5.getName(), "byte");
        Assert.assertNull(property5.getDefaultValue());
        Assert.assertEquals(property5.getBaseType(), "Data");
        Assert.assertFalse(property5.getRequired());
        Assert.assertFalse(property5.isContainer());

        final CodegenProperty property6 = cm.vars.get(5);
        Assert.assertEquals(property6.getBaseName(), "uuid");
        Assert.assertEquals(property6.getDataType(), "UUID");
        Assert.assertEquals(property6.getName(), "uuid");
        Assert.assertNull(property6.getDefaultValue());
        Assert.assertEquals(property6.getBaseType(), "UUID");
        Assert.assertFalse(property6.getRequired());
        Assert.assertFalse(property6.isContainer());

        final CodegenProperty property7 = cm.vars.get(6);
        Assert.assertEquals(property7.getBaseName(), "dateOfBirth");
        Assert.assertEquals(property7.getDataType(), "Date");
        Assert.assertEquals(property7.getName(), "dateOfBirth");
        Assert.assertNull(property7.getDefaultValue());
        Assert.assertEquals(property7.getBaseType(), "Date");
        Assert.assertFalse(property7.getRequired());
        Assert.assertFalse(property7.isContainer());
    }

    @Test(description = "convert a simple java model", enabled = true)
    public void useCustomDateTimeTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperty("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperty("name", new StringSchema())
                .addProperty("createdAt", new DateTimeSchema())
                .addProperty("binary", new BinarySchema())
                .addProperty("byte", new ByteArraySchema())
                .addProperty("uuid", new UUIDSchema())
                .addProperty("dateOfBirth", new DateSchema())
                .addRequiredItem("id")
                .addRequiredItem("name")
                .discriminator(new Discriminator().propertyName("test"));
        final DefaultCodegen codegen = new Swift5ClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        codegen.additionalProperties().put(Swift5ClientCodegen.USE_CUSTOM_DATE_WITHOUT_TIME, true);
        codegen.processOpts();

        final CodegenModel cm = codegen.fromModel("sample", schema);
        final CodegenProperty property7 = cm.vars.get(6);

        final CodegenProperty property3 = cm.vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getDataType(), "Date");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "Date");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());

        Assert.assertEquals(property7.getBaseName(), "dateOfBirth");
        Assert.assertEquals(property7.getDataType(), "OpenAPIDateWithoutTime");
        Assert.assertEquals(property7.getName(), "dateOfBirth");
        Assert.assertNull(property7.getDefaultValue());
        Assert.assertEquals(property7.getBaseType(), "OpenAPIDateWithoutTime");
        Assert.assertFalse(property7.getRequired());
        Assert.assertFalse(property7.isContainer());
    }

}
