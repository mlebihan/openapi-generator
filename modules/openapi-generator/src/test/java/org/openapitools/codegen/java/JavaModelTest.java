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

package org.openapitools.codegen.java;

import com.google.common.collect.Sets;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.*;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.QueryParameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.parser.util.SchemaTypeUtil;
import org.openapitools.codegen.*;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.JavaClientCodegen;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures.AnnotationLibrary;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class JavaModelTest {

    @Test(description = "convert a simple java model")
    public void simpleModelTest() {
        final Schema model = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema()
                        .example("Tony"))
                .addProperties("createdAt", new DateTimeSchema())
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 3);

        final List<CodegenProperty> vars = cm.vars;

        final CodegenProperty property1 = vars.get(0);
        Assert.assertEquals(property1.getBaseName(), "id");
        Assert.assertEquals(property1.getNameInPascalCase(), "Id");
        Assert.assertEquals(property1.getNameInCamelCase(), "id");
        Assert.assertEquals(property1.getNameInSnakeCase(), "ID");
        Assert.assertEquals(property1.getGetter(), "getId");
        Assert.assertEquals(property1.getSetter(), "setId");
        Assert.assertEquals(property1.getDataType(), "Long");
        Assert.assertEquals(property1.getName(), "id");
        Assert.assertNull(property1.getDefaultValue());
        Assert.assertEquals(property1.getBaseType(), "Long");
        Assert.assertTrue(property1.getRequired());
        Assert.assertFalse(property1.isContainer());

        final CodegenProperty property2 = vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getNameInPascalCase(), "Name");
        Assert.assertEquals(property2.getNameInCamelCase(), "name");
        Assert.assertEquals(property2.getNameInSnakeCase(), "NAME");
        Assert.assertEquals(property2.getGetter(), "getName");
        Assert.assertEquals(property2.getSetter(), "setName");
        Assert.assertEquals(property2.getDataType(), "String");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "String");
        Assert.assertEquals(property2.getExample(), "Tony");
        Assert.assertTrue(property2.getRequired());
        Assert.assertFalse(property2.isContainer());

        final CodegenProperty property3 = vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getNameInPascalCase(), "CreatedAt");
        Assert.assertEquals(property3.getNameInCamelCase(), "createdAt");
        Assert.assertEquals(property3.getNameInSnakeCase(), "CREATED_AT");
        Assert.assertEquals(property3.getGetter(), "getCreatedAt");
        Assert.assertEquals(property3.getSetter(), "setCreatedAt");
        Assert.assertEquals(property3.getDataType(), "Date");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "Date");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());
    }

    @Test(description = "convert a model with list property")
    public void listPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property = cm.vars.get(1);
        Assert.assertEquals(property.getBaseName(), "urls");
        Assert.assertEquals(property.getGetter(), "getUrls");
        Assert.assertEquals(property.getSetter(), "setUrls");
        Assert.assertEquals(property.getDataType(), "List<String>");
        Assert.assertEquals(property.getName(), "urls");
        Assert.assertEquals(property.getDefaultValue(), "new ArrayList<>()");
        Assert.assertEquals(property.getBaseType(), "List");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with set property")
    public void setPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("urls", new ArraySchema()
                        .items(new StringSchema())
                        .uniqueItems(true))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 2);

        final CodegenProperty property = cm.vars.get(1);
        Assert.assertEquals(property.getBaseName(), "urls");
        Assert.assertEquals(property.getGetter(), "getUrls");
        Assert.assertEquals(property.getSetter(), "setUrls");
        Assert.assertEquals(property.getDataType(), "Set<String>");
        Assert.assertEquals(property.getName(), "urls");
        Assert.assertEquals(property.getDefaultValue(), "new LinkedHashSet<>()");
        Assert.assertEquals(property.getBaseType(), "Set");
        Assert.assertEquals(property.getContainerType(), "set");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with a map property")
    public void mapPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new StringSchema()))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "translations");
        Assert.assertEquals(property.getGetter(), "getTranslations");
        Assert.assertEquals(property.getSetter(), "setTranslations");
        Assert.assertEquals(property.getDataType(), "Map<String, String>");
        Assert.assertEquals(property.getName(), "translations");
        Assert.assertEquals(property.getDefaultValue(), "new HashMap<>()");
        Assert.assertEquals(property.getBaseType(), "Map");
        Assert.assertEquals(property.getContainerType(), "map");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with a map with complex list property")
    public void mapWithListPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("translations", new MapSchema()
                        .additionalProperties(new ArraySchema().items(new Schema().$ref("Pet"))))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "translations");
        Assert.assertEquals(property.getGetter(), "getTranslations");
        Assert.assertEquals(property.getSetter(), "setTranslations");
        Assert.assertEquals(property.getDataType(), "Map<String, List<Pet>>");
        Assert.assertEquals(property.getName(), "translations");
        Assert.assertEquals(property.getDefaultValue(), "new HashMap<>()");
        Assert.assertEquals(property.getBaseType(), "Map");
        Assert.assertEquals(property.getContainerType(), "map");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with a 2D list property")
    public void list2DPropertyTest() {
        final Schema model = new Schema()
                .name("sample")
                .addProperties("list2D", new ArraySchema().items(
                        new ArraySchema().items(new Schema().$ref("Pet"))));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", model);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", model);

        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "list2D");
        Assert.assertEquals(property.getGetter(), "getList2D");
        Assert.assertEquals(property.getSetter(), "setList2D");
        Assert.assertEquals(property.getDataType(), "List<List<Pet>>");
        Assert.assertEquals(property.getName(), "list2D");
        Assert.assertEquals(property.getDefaultValue(), "new ArrayList<>()");
        Assert.assertEquals(property.getBaseType(), "List");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with restricted characters")
    public void restrictedCharactersPropertiesTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("@Some:restricted%characters#to!handle+", new BooleanSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "@Some:restricted%characters#to!handle+");
        Assert.assertEquals(property.getGetter(), "getAtSomeRestrictedPercentCharactersHashToExclamationHandlePlus");
        Assert.assertEquals(property.getSetter(), "setAtSomeRestrictedPercentCharactersHashToExclamationHandlePlus");
        Assert.assertEquals(property.getDataType(), "Boolean");
        Assert.assertEquals(property.getName(), "atSomeRestrictedPercentCharactersHashToExclamationHandlePlus");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "Boolean");
        Assert.assertFalse(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a model with complex properties")
    public void complexPropertiesTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new Schema().$ref("#/components/schemas/Children"));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "children");
        Assert.assertEquals(property.getGetter(), "getChildren");
        Assert.assertEquals(property.getSetter(), "setChildren");
        Assert.assertEquals(property.getDataType(), "Children");
        Assert.assertEquals(property.getName(), "children");
        // "null" as default value for model
        Assert.assertEquals(property.getDefaultValue(), "null");
        Assert.assertEquals(property.getBaseType(), "Children");
        Assert.assertFalse(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a model with complex list property")
    public void complexListPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "children");
        Assert.assertEquals(property.getComplexType(), "Children");
        Assert.assertEquals(property.getGetter(), "getChildren");
        Assert.assertEquals(property.getSetter(), "setChildren");
        Assert.assertEquals(property.getDataType(), "List<Children>");
        Assert.assertEquals(property.getName(), "children");
        Assert.assertEquals(property.getDefaultValue(), "new ArrayList<>()");
        Assert.assertEquals(property.getBaseType(), "List");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
    }

    @Test(description = "convert a model with complex map property")
    public void complexMapPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new MapSchema()
                        .additionalProperties(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("Map", "Children")).size(), 2);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "children");
        Assert.assertEquals(property.getComplexType(), "Children");
        Assert.assertEquals(property.getGetter(), "getChildren");
        Assert.assertEquals(property.getSetter(), "setChildren");
        Assert.assertEquals(property.getDataType(), "Map<String, Children>");
        Assert.assertEquals(property.getName(), "children");
        Assert.assertEquals(property.getDefaultValue(), "new HashMap<>()");
        Assert.assertEquals(property.getBaseType(), "Map");
        Assert.assertEquals(property.getContainerType(), "map");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
        Assert.assertTrue(property.getIsMap());
    }

    @Test(description = "convert a model with complex array property")
    public void complexArrayPropertyTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", new ArraySchema()
                        .items(new Schema().$ref("#/components/schemas/Children")));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("List", "Children")).size(), 2);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "children");
        Assert.assertEquals(property.getComplexType(), "Children");
        Assert.assertEquals(property.getGetter(), "getChildren");
        Assert.assertEquals(property.getSetter(), "setChildren");
        Assert.assertEquals(property.getDataType(), "List<Children>");
        Assert.assertEquals(property.getName(), "children");
        Assert.assertEquals(property.getDefaultValue(), "new ArrayList<>()");
        Assert.assertEquals(property.getBaseType(), "List");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
        Assert.assertTrue(property.getIsArray());
    }

    @Test(description = "convert a model with complex set property")
    public void complexSetPropertyTest() {
        Schema set = new ArraySchema().items(new Schema().$ref("#/components/schemas/Children"));
        set.setUniqueItems(true); // set
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("children", set);
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertTrue(cm.imports.contains("Set"));

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "children");
        Assert.assertEquals(property.getComplexType(), "Children");
        Assert.assertEquals(property.getGetter(), "getChildren");
        Assert.assertEquals(property.getSetter(), "setChildren");
        Assert.assertEquals(property.getDataType(), "Set<Children>");
        Assert.assertEquals(property.getName(), "children");
        Assert.assertEquals(property.getDefaultValue(), "new LinkedHashSet<>()");
        Assert.assertEquals(property.getBaseType(), "Set");
        Assert.assertEquals(property.getContainerType(), "set");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());
        Assert.assertTrue(property.getUniqueItemsBoolean());
    }

    @Test(description = "convert a model with an array property with item name")
    public void arrayModelWithItemNameTest() {
        final Schema propertySchema = new ArraySchema()
                .items(new Schema().$ref("#/components/schemas/Child"))
                .description("an array property");
        propertySchema.addExtension("x-item-name", "child");
        final Schema schema = new Schema()
                .type("object")
                .description("a sample model")
                .addProperties("children", propertySchema);


        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.vars.size(), 1);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("List", "Child")).size(), 2);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "children");
        Assert.assertEquals(property.getComplexType(), "Child");
        Assert.assertEquals(property.getGetter(), "getChildren");
        Assert.assertEquals(property.getSetter(), "setChildren");
        Assert.assertEquals(property.getDataType(), "List<Child>");
        Assert.assertEquals(property.getName(), "children");
        Assert.assertEquals(property.getDefaultValue(), "new ArrayList<>()");
        Assert.assertEquals(property.getBaseType(), "List");
        Assert.assertEquals(property.getContainerType(), "array");
        Assert.assertFalse(property.getRequired());
        Assert.assertTrue(property.isContainer());

        final CodegenProperty itemsProperty = property.getItems();
        Assert.assertEquals(itemsProperty.getBaseName(), "child");
        Assert.assertEquals(itemsProperty.getName(), "child");
    }

    @Test(description = "convert an array model")
    public void arrayModelTest() {
        final Schema schema = new ArraySchema()
                .items(new Schema().name("elobjeto").$ref("#/components/schemas/Children"))
                .name("arraySchema")
                .description("an array model");
        final JavaClientCodegen codegen = new JavaClientCodegen();
        codegen.setAnnotationLibrary(AnnotationLibrary.SWAGGER1);
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "ArrayList<Children>");
        Assert.assertEquals(cm.imports.size(), 4);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("ApiModel", "List", "ArrayList", "Children")).size(), 4);
    }

    @Test(description = "convert a set model")
    public void setModelTest() {
        final Schema schema = new ArraySchema()
                .items(new Schema().name("elobjeto").$ref("#/components/schemas/Children"))
                .uniqueItems(true)
                .name("arraySchema")
                .description("an array model");
        final JavaClientCodegen codegen = new JavaClientCodegen();
        codegen.setAnnotationLibrary(AnnotationLibrary.SWAGGER1);
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "an array model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "LinkedHashSet<Children>");
        Assert.assertEquals(cm.imports.size(), 4);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("ApiModel", "Set", "LinkedHashSet", "Children")).size(), 4);
    }

    @Test(description = "convert a map model")
    public void mapModelTest() {
        final Schema schema = new Schema()
                .description("a map model")
                .additionalProperties(new Schema().$ref("#/components/schemas/Children"));
        final JavaClientCodegen codegen = new JavaClientCodegen();
        codegen.setAnnotationLibrary(AnnotationLibrary.SWAGGER1);
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a map model");
        Assert.assertEquals(cm.vars.size(), 0);
        Assert.assertEquals(cm.parent, "HashMap<String, Children>");
        Assert.assertEquals(cm.imports.size(), 4);
        Assert.assertEquals(Sets.intersection(cm.imports, Sets.newHashSet("ApiModel", "Map", "HashMap", "Children")).size(), 4);
    }

    @Test(description = "convert a model with upper-case property names")
    public void upperCaseNamesTest() {
        final Schema schema = new Schema()
                .description("a model with upper-case property names")
                .addProperties("NAME", new StringSchema())
                .addRequiredItem("NAME");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "NAME");
        Assert.assertEquals(property.getGetter(), "getNAME");
        Assert.assertEquals(property.getSetter(), "setNAME");
        Assert.assertEquals(property.getDataType(), "String");
        Assert.assertEquals(property.getName(), "NAME");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "String");
        Assert.assertTrue(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a model with upper-case property names and Numbers")
    public void upperCaseNamesNumbersTest() {
        final Schema schema = new Schema()
                .description("a model with upper-case property names and numbers")
                .addProperties("NAME1", new StringSchema())
                .addRequiredItem("NAME1");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "NAME1");
        Assert.assertEquals(property.getGetter(), "getNAME1");
        Assert.assertEquals(property.getSetter(), "setNAME1");
        Assert.assertEquals(property.getDataType(), "String");
        Assert.assertEquals(property.getName(), "NAME1");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "String");
        Assert.assertTrue(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a model with a 2nd char upper-case property names")
    public void secondCharUpperCaseNamesTest() {
        final Schema schema = new Schema()
                .description("a model with a 2nd char upper-case property names")
                .addProperties("pId", new StringSchema())
                .addRequiredItem("pId");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "pId");
        Assert.assertEquals(property.getGetter(), "getpId");
        Assert.assertEquals(property.getSetter(), "setpId");
        Assert.assertEquals(property.getDataType(), "String");
        Assert.assertEquals(property.getName(), "pId");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "String");
        Assert.assertTrue(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a model starting with two upper-case letter property names")
    public void firstTwoUpperCaseLetterNamesTest() {
        final Schema schema = new Schema()
                .description("a model with a property name starting with two upper-case letters")
                .addProperties("ATTName", new StringSchema())
                .addRequiredItem("ATTName");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "ATTName");
        Assert.assertEquals(property.getGetter(), "getAtTName");
        Assert.assertEquals(property.getSetter(), "setAtTName");
        Assert.assertEquals(property.getDataType(), "String");
        Assert.assertEquals(property.getName(), "atTName");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "String");
        Assert.assertTrue(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a model with an all upper-case letter and one non letter property names")
    public void allUpperCaseOneNonLetterNamesTest() {
        final Schema schema = new Schema()
                .description("a model with a property name starting with two upper-case letters")
                .addProperties("ATT_NAME", new StringSchema())
                .addRequiredItem("ATT_NAME");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "ATT_NAME");
        Assert.assertEquals(property.getGetter(), "getATTNAME");
        Assert.assertEquals(property.getSetter(), "setATTNAME");
        Assert.assertEquals(property.getDataType(), "String");
        Assert.assertEquals(property.getName(), "ATT_NAME");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "String");
        Assert.assertTrue(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert hyphens per issue 503")
    public void hyphensTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("created-at", new DateTimeSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "created-at");
        Assert.assertEquals(property.getGetter(), "getCreatedAt");
        Assert.assertEquals(property.getSetter(), "setCreatedAt");
        Assert.assertEquals(property.getName(), "createdAt");
    }

    @Test(description = "convert query[password] to queryPassword")
    public void squareBracketsTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("query[password]", new StringSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "query[password]");
        Assert.assertEquals(property.getGetter(), "getQueryPassword");
        Assert.assertEquals(property.getSetter(), "setQueryPassword");
        Assert.assertEquals(property.getName(), "queryPassword");
    }

    @Test(description = "properly escape names per 567")
    public void escapeNamesTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties("created-at", new DateTimeSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("with.dots", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("with.dots", schema);

        Assert.assertEquals(cm.classname, "WithDots");
    }

    @Test(description = "convert a model with binary data")
    public void binaryDataTest() {
        final Schema schema = new Schema()
                .description("model with binary")
                .addProperties("inputBinaryData", new ByteArraySchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "inputBinaryData");
        Assert.assertEquals(property.getGetter(), "getInputBinaryData");
        Assert.assertEquals(property.getSetter(), "setInputBinaryData");
        Assert.assertEquals(property.getDataType(), "byte[]");
        Assert.assertEquals(property.getName(), "inputBinaryData");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "byte[]");
        Assert.assertFalse(property.getRequired());
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "translate an invalid param name")
    public void invalidParamNameTest() {
        final Schema schema = new Schema()
                .description("a model with a 2nd char upper-case property names")
                .addProperties("_", new StringSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.vars.size(), 1);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), "_");
        Assert.assertEquals(property.getGetter(), "getU");
        Assert.assertEquals(property.getSetter(), "setU");
        Assert.assertEquals(property.getDataType(), "String");
        Assert.assertEquals(property.getName(), "u");
        Assert.assertNull(property.getDefaultValue());
        Assert.assertEquals(property.getBaseType(), "String");
        Assert.assertFalse(property.isContainer());
    }

    @Test(description = "convert a parameter")
    public void convertParameterTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Parameter parameter = new QueryParameter()
                .description("this is a description")
                .name("limit")
                .required(true);
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenParameter cm = codegen.fromParameter(parameter, null);

        Assert.assertNull(cm.allowableValues);
        Assert.assertEquals(cm.description, "this is a description");
    }

    @Test(description = "types used by inner properties should be imported")
    public void mapWithAnListOfBigDecimalTest() {
        Schema decimal = new StringSchema();
        decimal.setFormat("number");

        Schema schema1 = new Schema()
                .description("model with Map<String, List<BigDecimal>>")
                .addProperties("map", new MapSchema()
                        .additionalProperties(new ArraySchema().items(decimal)));
        OpenAPI openAPI1 = TestUtils.createOpenAPIWithOneSchema("sample", schema1);
        JavaClientCodegen codegen1 = new JavaClientCodegen();
        codegen1.setOpenAPI(openAPI1);
        final CodegenModel cm1 = codegen1.fromModel("sample", schema1);
        Assert.assertEquals(cm1.vars.get(0).getDataType(), "Map<String, List<BigDecimal>>");
        Assert.assertTrue(cm1.imports.contains("BigDecimal"));

        Schema schema2 = new Schema()
                .description("model with Map<String, Map<String, List<BigDecimal>>>")
                .addProperties("map", new MapSchema()
                        .additionalProperties(new MapSchema()
                                .additionalProperties(new ArraySchema().items(decimal))));
        OpenAPI openAPI2 = TestUtils.createOpenAPIWithOneSchema("sample", schema2);
        JavaClientCodegen codegen2 = new JavaClientCodegen();
        codegen2.setOpenAPI(openAPI2);
        final CodegenModel cm2 = codegen2.fromModel("sample", schema2);
        Assert.assertEquals(cm2.vars.get(0).getDataType(), "Map<String, Map<String, List<BigDecimal>>>");
        Assert.assertTrue(cm2.imports.contains("BigDecimal"));
    }

    @DataProvider(name = "modelNames")
    public static Object[][] primeNumbers() {
        return new Object[][]{
                {"sample", "Sample"},
                {"sample_name", "SampleName"},
                {"sample__name", "SampleName"},
                {"/sample", "Sample"},
                {"\\sample", "Sample"},
                {"sample.name", "SampleName"},
                {"_sample", "Sample"},
                {"Sample", "Sample"},
        };
    }

    @Test(dataProvider = "modelNames", description = "avoid inner class")
    public void modelNameTest(String name, String expectedName) {
        final Schema schema = new Schema();
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema(name, schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel(name, schema);

        Assert.assertEquals(cm.name, name);
        Assert.assertEquals(cm.classname, expectedName);
    }

    @DataProvider(name = "classProperties")
    public static Object[][] classProperties() {
        return new Object[][]{
                {"class", "getPropertyClass", "setPropertyClass", "propertyClass"},
                {"_class", "getPropertyClass", "setPropertyClass", "propertyClass"},
                {"__class", "getPropertyClass", "setPropertyClass", "propertyClass"}
        };
    }

    @Test(dataProvider = "classProperties", description = "handle 'class' properties")
    public void classPropertyTest(String baseName, String getter, String setter, String name) {
        final Schema schema = new Schema()
                .description("a sample model")
                .addProperties(baseName, new StringSchema());
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        final CodegenProperty property = cm.vars.get(0);
        Assert.assertEquals(property.getBaseName(), baseName);
        Assert.assertEquals(property.getGetter(), getter);
        Assert.assertEquals(property.getSetter(), setter);
        Assert.assertEquals(property.getName(), name);
    }


    @Test(description = "test models with xml")
    public void modelWithXmlTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .xml(new XML()
                        .prefix("my")
                        .namespace("xmlNamespace")
                        .name("customXmlName"))
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("name", new StringSchema()
                        .example("Tony")
                        .xml(new XML()
                                .attribute(true)
                                .prefix("my")
                                .name("myName")))
                .addProperties("createdAt", new DateTimeSchema()
                        .xml(new XML()
                                .prefix("my")
                                .namespace("myNamespace")
                                .name("myCreatedAt")))
                .addRequiredItem("id")
                .addRequiredItem("name");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.xmlPrefix, "my");
        Assert.assertEquals(cm.xmlName, "customXmlName");
        Assert.assertEquals(cm.xmlNamespace, "xmlNamespace");
        Assert.assertEquals(cm.vars.size(), 3);

        final List<CodegenProperty> vars = cm.vars;

        final CodegenProperty property2 = vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "name");
        Assert.assertEquals(property2.getGetter(), "getName");
        Assert.assertEquals(property2.getSetter(), "setName");
        Assert.assertEquals(property2.getDataType(), "String");
        Assert.assertEquals(property2.getName(), "name");
        Assert.assertNull(property2.getDefaultValue());
        Assert.assertEquals(property2.getBaseType(), "String");
        Assert.assertEquals(property2.getExample(), "Tony");
        Assert.assertTrue(property2.getRequired());
        Assert.assertFalse(property2.isContainer());
        Assert.assertTrue(property2.isXmlAttribute());
        Assert.assertEquals(property2.getXmlName(), "myName");
        Assert.assertNull(property2.getXmlNamespace());

        final CodegenProperty property3 = vars.get(2);
        Assert.assertEquals(property3.getBaseName(), "createdAt");
        Assert.assertEquals(property3.getGetter(), "getCreatedAt");
        Assert.assertEquals(property3.getSetter(), "setCreatedAt");
        Assert.assertEquals(property3.getDataType(), "Date");
        Assert.assertEquals(property3.getName(), "createdAt");
        Assert.assertNull(property3.getDefaultValue());
        Assert.assertEquals(property3.getBaseType(), "Date");
        Assert.assertFalse(property3.getRequired());
        Assert.assertFalse(property3.isContainer());
        Assert.assertFalse(property3.isXmlAttribute());
        Assert.assertEquals(property3.getXmlName(), "myCreatedAt");
        Assert.assertEquals(property3.getXmlNamespace(), "myNamespace");
        Assert.assertEquals(property3.getXmlPrefix(), "my");
    }

    @Test(description = "test models with wrapped xml")
    public void modelWithWrappedXmlTest() {
        final Schema schema = new Schema()
                .description("a sample model")
                .xml(new XML()
                        .prefix("my")
                        .namespace("xmlNamespace")
                        .name("customXmlName"))
                .addProperties("id", new IntegerSchema().format(SchemaTypeUtil.INTEGER64_FORMAT))
                .addProperties("array", new ArraySchema()
                        .items(new StringSchema()
                                .xml(new XML()
                                        .name("i")))
                        .xml(new XML()
                                .prefix("my")
                                .wrapped(true)
                                .namespace("myNamespace")
                                .name("xmlArray")))
                .addRequiredItem("id");
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("sample", schema);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("sample", schema);

        Assert.assertEquals(cm.name, "sample");
        Assert.assertEquals(cm.classname, "Sample");
        Assert.assertEquals(cm.description, "a sample model");
        Assert.assertEquals(cm.xmlPrefix, "my");
        Assert.assertEquals(cm.xmlName, "customXmlName");
        Assert.assertEquals(cm.xmlNamespace, "xmlNamespace");
        Assert.assertEquals(cm.vars.size(), 2);

        final List<CodegenProperty> vars = cm.vars;

        final CodegenProperty property2 = vars.get(1);
        Assert.assertEquals(property2.getBaseName(), "array");
        Assert.assertEquals(property2.getGetter(), "getArray");
        Assert.assertEquals(property2.getSetter(), "setArray");
        Assert.assertEquals(property2.getDataType(), "List<String>");
        Assert.assertEquals(property2.getName(), "array");
        Assert.assertEquals(property2.getDefaultValue(), "new ArrayList<>()");
        Assert.assertEquals(property2.getBaseType(), "List");
        Assert.assertTrue(property2.isContainer());
        Assert.assertTrue(property2.isXmlWrapped());
        Assert.assertEquals(property2.getXmlName(), "xmlArray");
        Assert.assertNotNull(property2.getXmlNamespace());
        Assert.assertNotNull(property2.getItems());
        CodegenProperty items = property2.getItems();
        Assert.assertEquals(items.getXmlName(), "i");
        Assert.assertEquals(items.getBaseName(), "array");
    }

    @Test(description = "convert a boolean parameter")
    public void booleanPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final BooleanSchema property = new BooleanSchema();
        final JavaClientCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        codegen.setBooleanGetterPrefix("is");
        final CodegenProperty cp = codegen.fromProperty("property", property);

        Assert.assertEquals(cp.getBaseName(), "property");
        Assert.assertEquals(cp.getDataType(), "Boolean");
        Assert.assertEquals(cp.getName(), "property");
        Assert.assertEquals(cp.getBaseType(), "Boolean");
        Assert.assertFalse(cp.isContainer());
        Assert.assertTrue(cp.getIsBoolean());
        Assert.assertEquals(cp.getGetter(), "isProperty");
    }

    @Test(description = "convert an integer property")
    public void integerPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final IntegerSchema property = new IntegerSchema();
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenProperty cp = codegen.fromProperty("property", property);

        Assert.assertEquals(cp.getBaseName(), "property");
        Assert.assertEquals(cp.getDataType(), "Integer");
        Assert.assertEquals(cp.getName(), "property");
        Assert.assertEquals(cp.getBaseType(), "Integer");
        Assert.assertFalse(cp.isContainer());
        Assert.assertTrue(cp.getIsInteger());
        Assert.assertFalse(cp.getIsLong());
        Assert.assertEquals(cp.getGetter(), "getProperty");
    }

    @Test(description = "convert a long property")
    public void longPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final IntegerSchema property = new IntegerSchema().format("int64");
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenProperty cp = codegen.fromProperty("property", property);

        Assert.assertEquals(cp.getBaseName(), "property");
        Assert.assertEquals(cp.getNameInPascalCase(), "Property");
        Assert.assertEquals(cp.getNameInCamelCase(), "property");
        Assert.assertEquals(cp.getNameInSnakeCase(), "PROPERTY");
        Assert.assertEquals(cp.getDataType(), "Long");
        Assert.assertEquals(cp.getName(), "property");
        Assert.assertEquals(cp.getBaseType(), "Long");
        Assert.assertFalse(cp.isContainer());
        Assert.assertTrue(cp.getIsLong());
        Assert.assertFalse(cp.getIsInteger());
        Assert.assertEquals(cp.getGetter(), "getProperty");
    }

    @Test(description = "convert an integer property in a referenced schema")
    public void integerPropertyInReferencedSchemaTest() {
        final IntegerSchema longProperty = new IntegerSchema().format("int32");
        final Schema testSchema = new ObjectSchema()
                .addProperties("Integer1", new Schema<>().$ref("#/components/schemas/IntegerProperty"))
                .addProperties("Integer2", new IntegerSchema().format("int32"));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("IntegerProperty", longProperty);
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", testSchema);

        Assert.assertEquals(cm.vars.size(), 2);

        CodegenProperty cp1 = cm.vars.get(0);
        Assert.assertEquals(cp1.getBaseName(), "Integer1");
        Assert.assertEquals(cp1.getNameInPascalCase(), "Integer1");
        Assert.assertEquals(cp1.getNameInCamelCase(), "integer1");
        Assert.assertEquals(cp1.getNameInSnakeCase(), "INTEGER1");
        Assert.assertEquals(cp1.getDataType(), "Integer");
        Assert.assertEquals(cp1.getName(), "integer1");
        Assert.assertEquals(cp1.getBaseType(), "Integer");
        Assert.assertEquals(cp1.getGetter(), "getInteger1");

        CodegenProperty cp2 = cm.vars.get(1);
        Assert.assertEquals(cp2.getBaseName(), "Integer2");
        Assert.assertEquals(cp2.getNameInPascalCase(), "Integer2");
        Assert.assertEquals(cp2.getNameInCamelCase(), "integer2");
        Assert.assertEquals(cp2.getNameInSnakeCase(), "INTEGER2");
        Assert.assertEquals(cp2.getDataType(), "Integer");
        Assert.assertEquals(cp2.getName(), "integer2");
        Assert.assertEquals(cp2.getBaseType(), "Integer");
        Assert.assertEquals(cp2.getGetter(), "getInteger2");
    }

    @Test(description = "convert a long property in a referenced schema")
    public void longPropertyInReferencedSchemaTest() {
        final IntegerSchema longProperty = new IntegerSchema().format("int64");
        final Schema TestSchema = new ObjectSchema()
                .addProperties("Long1", new Schema<>().$ref("#/components/schemas/LongProperty"))
                .addProperties("Long2", new IntegerSchema().format("int64"));
        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("LongProperty", longProperty);
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", TestSchema);

        Assert.assertEquals(cm.vars.size(), 2);

        CodegenProperty cp1 = cm.vars.get(0);
        Assert.assertEquals(cp1.getBaseName(), "Long1");
        Assert.assertEquals(cp1.getDataType(), "Long");
        Assert.assertEquals(cp1.getName(), "long1");
        Assert.assertEquals(cp1.getBaseType(), "Long");
        Assert.assertEquals(cp1.getGetter(), "getLong1");

        CodegenProperty cp2 = cm.vars.get(1);
        Assert.assertEquals(cp2.getBaseName(), "Long2");
        Assert.assertEquals(cp2.getDataType(), "Long");
        Assert.assertEquals(cp2.getName(), "long2");
        Assert.assertEquals(cp2.getBaseType(), "Long");
        Assert.assertEquals(cp2.getGetter(), "getLong2");
    }

    @Test(description = "convert string property")
    public void stringPropertyTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema property = new StringSchema().maxLength(10).minLength(3).pattern("^[A-Z]+$");
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenProperty cp = codegen.fromProperty("somePropertyWithMinMaxAndPattern", property);

        Assert.assertEquals(cp.getBaseName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInPascalCase(), "SomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInCamelCase(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInSnakeCase(), "SOME_PROPERTY_WITH_MIN_MAX_AND_PATTERN");
        Assert.assertEquals(cp.getDataType(), "String");
        Assert.assertEquals(cp.getName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getBaseType(), "String");
        Assert.assertFalse(cp.isContainer());
        Assert.assertFalse(cp.getIsLong());
        Assert.assertFalse(cp.getIsInteger());
        Assert.assertTrue(cp.getIsString());
        Assert.assertEquals(cp.getGetter(), "getSomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getMinLength(), Integer.valueOf(3));
        Assert.assertEquals(cp.getMaxLength(), Integer.valueOf(10));
        Assert.assertEquals(cp.getPattern(), "^[A-Z]+$");
    }

    @Test(description = "convert string property with password format")
    public void stringPropertyPasswordFormatTest() {
        OpenAPI openAPI = TestUtils.createOpenAPI();
        final Schema property = new StringSchema().format("password");
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);

        final CodegenProperty cp = codegen.fromProperty("somePropertyWithPasswordFormat", property);
        Assert.assertEquals(cp.isPassword(), true);
    }

    @Test(description = "convert string property in an object")
    public void stringPropertyInObjectTest() {
        final Schema property = new StringSchema().maxLength(10).minLength(3).pattern("^[A-Z]+$");
        final Schema myObject = new ObjectSchema().addProperties("somePropertyWithMinMaxAndPattern", property);

        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("myObject", myObject);
        codegen.setOpenAPI(openAPI);
        CodegenModel cm = codegen.fromModel("myObject", myObject);

        Assert.assertEquals(cm.getVars().size(), 1);
        CodegenProperty cp = cm.getVars().get(0);
        Assert.assertEquals(cp.getBaseName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInPascalCase(), "SomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInCamelCase(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInSnakeCase(), "SOME_PROPERTY_WITH_MIN_MAX_AND_PATTERN");
        Assert.assertEquals(cp.getDataType(), "String");
        Assert.assertEquals(cp.getName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getBaseType(), "String");
        Assert.assertFalse(cp.isContainer());
        Assert.assertFalse(cp.getIsLong());
        Assert.assertFalse(cp.getIsInteger());
        Assert.assertTrue(cp.getIsString());
        Assert.assertEquals(cp.getGetter(), "getSomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getMinLength(), Integer.valueOf(3));
        Assert.assertEquals(cp.getMaxLength(), Integer.valueOf(10));
        Assert.assertEquals(cp.getPattern(), "^[A-Z]+$");
    }

    @Test(description = "convert referenced string property in an object")
    public void stringPropertyReferencedInObjectTest() {
        final Schema property = new StringSchema().maxLength(10).minLength(3).pattern("^[A-Z]+$");
        final Schema myObject = new ObjectSchema().addProperties("somePropertyWithMinMaxAndPattern", new ObjectSchema().$ref("refObj"));

        final DefaultCodegen codegen = new JavaClientCodegen();
        OpenAPI openAPI = TestUtils.createOpenAPI();
        openAPI.setComponents(new Components()
                .addSchemas("myObject", myObject)
                .addSchemas("refObj", property)
        );
        codegen.setOpenAPI(openAPI);
        CodegenModel cm = codegen.fromModel("myObject", myObject);

        Assert.assertEquals(cm.getVars().size(), 1);
        CodegenProperty cp = cm.getVars().get(0);
        Assert.assertEquals(cp.getBaseName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInPascalCase(), "SomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInCamelCase(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getNameInSnakeCase(), "SOME_PROPERTY_WITH_MIN_MAX_AND_PATTERN");
        Assert.assertEquals(cp.getDataType(), "String");
        Assert.assertEquals(cp.getName(), "somePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getBaseType(), "String");
        Assert.assertFalse(cp.isContainer());
        Assert.assertFalse(cp.getIsLong());
        Assert.assertFalse(cp.getIsInteger());
        Assert.assertTrue(cp.getIsString());
        Assert.assertEquals(cp.getGetter(), "getSomePropertyWithMinMaxAndPattern");
        Assert.assertEquals(cp.getMinLength(), Integer.valueOf(3));
        Assert.assertEquals(cp.getMaxLength(), Integer.valueOf(10));
        Assert.assertEquals(cp.getPattern(), "^[A-Z]+$");
    }

    @Test(description = "convert an array schema")
    public void arraySchemaTest() {
        final Schema testSchema = new ObjectSchema()
                .addProperties("pets", new ArraySchema()
                        .items(new Schema<>().$ref("#/components/schemas/Pet")));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", testSchema);

        Assert.assertEquals(cm.vars.size(), 1);
        CodegenProperty cp1 = cm.vars.get(0);
        Assert.assertEquals(cp1.getBaseName(), "pets");
        Assert.assertEquals(cp1.getDataType(), "List<Pet>");
        Assert.assertEquals(cp1.getName(), "pets");
        Assert.assertEquals(cp1.getBaseType(), "List");
        Assert.assertTrue(cp1.isContainer());
        Assert.assertTrue(cp1.getIsArray());
        Assert.assertFalse(cp1.getIsMap());
        Assert.assertEquals(cp1.getGetter(), "getPets");
        Assert.assertEquals(cp1.getItems().getBaseType(), "Pet");

        Assert.assertTrue(cm.imports.contains("List"));
        Assert.assertTrue(cm.imports.contains("Pet"));
    }

    @Test(description = "convert an array schema in a RequestBody")
    public void arraySchemaTestInRequestBody() {
        final Schema testSchema = new ArraySchema()
                .items(new Schema<>().$ref("#/components/schemas/Pet"));
        Operation operation = new Operation()
                .requestBody(new RequestBody()
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema))))
                .responses(
                        new ApiResponses().addApiResponse("204", new ApiResponse()
                                .description("Ok response")));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.bodyParams.size(), 1);
        CodegenParameter cp1 = co.bodyParams.get(0);
        Assert.assertEquals(cp1.baseType, "Pet");
        Assert.assertEquals(cp1.dataType, "List<Pet>");
        Assert.assertTrue(cp1.isContainer);
        Assert.assertTrue(cp1.isArray);
        Assert.assertFalse(cp1.isMap);
        Assert.assertEquals(cp1.items.getBaseType(), "Pet");
        Assert.assertEquals(cp1.items.getComplexType(), "Pet");
        Assert.assertEquals(cp1.items.getDataType(), "Pet");

        Assert.assertEquals(co.responses.size(), 1);

        Assert.assertTrue(co.imports.contains("List"));
        Assert.assertTrue(co.imports.contains("Pet"));
    }

    @Test(description = "convert an array schema in an ApiResponse")
    public void arraySchemaTestInOperationResponse() {
        final Schema testSchema = new ArraySchema()
                .items(new Schema<>().$ref("#/components/schemas/Pet"));
        Operation operation = new Operation().responses(
                new ApiResponses().addApiResponse("200", new ApiResponse()
                        .description("Ok response")
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema)))));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.responses.size(), 1);
        CodegenResponse cr = co.responses.get(0);
        Assert.assertEquals(cr.baseType, "Pet");
        Assert.assertEquals(cr.dataType, "List<Pet>");
        Assert.assertEquals(cr.containerType, "array");

        Assert.assertTrue(co.imports.contains("Pet"));
    }

    @Test(description = "convert an array of array schema")
    public void arrayOfArraySchemaTest() {
        final Schema testSchema = new ObjectSchema()
                .addProperties("pets", new ArraySchema()
                        .items(new ArraySchema()
                                .items(new Schema<>().$ref("#/components/schemas/Pet"))));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenModel cm = codegen.fromModel("test", testSchema);

        Assert.assertEquals(cm.vars.size(), 1);
        CodegenProperty cp1 = cm.vars.get(0);
        Assert.assertEquals(cp1.getBaseName(), "pets");
        Assert.assertEquals(cp1.getDataType(), "List<List<Pet>>");
        Assert.assertEquals(cp1.getName(), "pets");
        Assert.assertEquals(cp1.getBaseType(), "List");
        Assert.assertEquals(cp1.getGetter(), "getPets");

        Assert.assertTrue(cm.imports.contains("List"));
        Assert.assertTrue(cm.imports.contains("Pet"));
    }

    @Test(description = "convert an array of array schema in a RequestBody")
    public void arrayOfArraySchemaTestInRequestBody() {
        final Schema testSchema = new ArraySchema()
                .items(new ArraySchema()
                        .items(new Schema<>().$ref("#/components/schemas/Pet")));
        Operation operation = new Operation()
                .requestBody(new RequestBody()
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema))))
                .responses(
                        new ApiResponses().addApiResponse("204", new ApiResponse()
                                .description("Ok response")));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.bodyParams.size(), 1);
        CodegenParameter cp1 = co.bodyParams.get(0);
        Assert.assertEquals(cp1.baseType, "List");
        Assert.assertEquals(cp1.dataType, "List<List<Pet>>");
        Assert.assertTrue(cp1.isContainer);
        Assert.assertTrue(cp1.isArray);
        Assert.assertFalse(cp1.isMap);
        Assert.assertEquals(cp1.items.getBaseType(), "List");
        Assert.assertEquals(cp1.items.getComplexType(), "Pet");
        Assert.assertEquals(cp1.items.getDataType(), "List<Pet>");
        Assert.assertEquals(cp1.items.getItems().getBaseType(), "Pet");
        Assert.assertEquals(cp1.items.getItems().getComplexType(), "Pet");
        Assert.assertEquals(cp1.items.getItems().getDataType(), "Pet");

        Assert.assertEquals(co.responses.size(), 1);

        Assert.assertTrue(co.imports.contains("Pet"));
        Assert.assertTrue(co.imports.contains("List"));
    }

    @Test(description = "convert an array schema in an ApiResponse")
    public void arrayOfArraySchemaTestInOperationResponse() {
        final Schema testSchema = new ArraySchema()
                .items(new ArraySchema()
                        .items(new Schema<>().$ref("#/components/schemas/Pet")));
        Operation operation = new Operation().responses(
                new ApiResponses().addApiResponse("200", new ApiResponse()
                        .description("Ok response")
                        .content(new Content().addMediaType("application/json",
                                new MediaType().schema(testSchema)))));
        OpenAPI openAPI = TestUtils.createOpenAPIWithOneSchema("Pet", new ObjectSchema().addProperties("name", new StringSchema()));
        final DefaultCodegen codegen = new JavaClientCodegen();
        codegen.setOpenAPI(openAPI);
        final CodegenOperation co = codegen.fromOperation("testSchema", "GET", operation, null);

        Assert.assertEquals(co.responses.size(), 1);
        CodegenResponse cr = co.responses.get(0);
        Assert.assertEquals(cr.baseType, "Pet");
        Assert.assertEquals(cr.dataType, "List<List<Pet>>");
        Assert.assertEquals(cr.containerType, "array");

        Assert.assertTrue(co.imports.contains("Pet"));
    }

    @Test
    public void generateModel() throws Exception {
        String inputSpec = "src/test/resources/3_0/petstore.json";

        final File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();

        Assert.assertTrue(new File(inputSpec).exists());

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("java")
                .setLibrary("jersey2")
                //.addAdditionalProperty("withXml", true)
                .addAdditionalProperty(CodegenConstants.SERIALIZABLE_MODEL, true)
                .setInputSpec(inputSpec)
                .setOutputDir(output.getAbsolutePath());

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        new DefaultGenerator().opts(clientOptInput).generate();

        File orderFile = new File(output, "src/main/java/org/openapitools/client/model/Order.java");
        Assert.assertTrue(orderFile.exists());
    }

    @Test
    public void generateEmpty() throws Exception {
        String inputSpec = "src/test/resources/3_0/ping.yaml";

        final File output = Files.createTempDirectory("test").toFile();
        output.deleteOnExit();
        Assert.assertTrue(new File(inputSpec).exists());

        JavaClientCodegen config = new org.openapitools.codegen.languages.JavaClientCodegen();
        config.setHideGenerationTimestamp(true);
        config.setOutputDir(output.getAbsolutePath());

        final OpenAPI openAPI = TestUtils.parseFlattenSpec(inputSpec);

        final ClientOptInput opts = new ClientOptInput();
        opts.config(config);
        opts.openAPI(openAPI);
        new DefaultGenerator().opts(opts).generate();

        File orderFile = new File(output, "src/main/java/org/openapitools/client/api/DefaultApi.java");
        Assert.assertTrue(orderFile.exists());
    }
}
