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

package org.openapitools.codegen;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

import org.openapitools.codegen.analysis.PropertyDataType;

public class CodegenProperty implements Cloneable, IJsonSchemaValidationProperties {
    /** Property data type */
    PropertyDataType type = new PropertyDataType();

    /**
     * The value of the 'type' attribute in the OpenAPI schema.
     * The per-language codegen logic may change to a language-specific type.
     */
    @Getter
    private String openApiType;

    @Getter @Setter
    private String getter;
    @Getter @Setter
    private String setter;

    @Getter @Setter
    private String datatypeWithEnum;
    @Getter @Setter
    private String dataFormat;
    @Getter @Setter
    private String min; // TODO: is this really used?
    @Getter @Setter
    private String max; // TODO: is this really used?
    @Getter @Setter
    private String defaultValue;
    @Getter @Setter
    private String defaultValueWithParam;
    @Getter @Setter
    private String containerType;
    @Getter @Setter
    private String containerTypeMapped; // language-specified container type (e.g. `dict` in python for map)

    /**
     * The value of the 'title' attribute in the OpenAPI schema.
     */
    @Getter @Setter
    private String title;

    /**
     * maxLength validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.1
     */
    private Integer maxLength;
    /**
     * minLength validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.2
     */
    private Integer minLength;
    /**
     * pattern validation for strings, see http://json-schema.org/latest/json-schema-validation.html#rfc.section.5.2.3
     */
    private String pattern;
    /**
     * A free-form property to include an example of an instance for this schema.
     */
    @Getter @Setter
    private String example;

    @Getter @Setter
    private String jsonSchema;
    /**
     * The value of the 'minimum' attribute in the OpenAPI schema.
     * The value of "minimum" MUST be a number, representing an inclusive lower limit for a numeric instance.
     */
    private String minimum;
    /**
     * The value of the 'maximum' attribute in the OpenAPI schema.
     * The value of "maximum" MUST be a number, representing an inclusive upper limit for a numeric instance.
     */
    private String maximum;
    /**
     * The value of the 'multipleOf' attribute in the OpenAPI schema.
     * The value of "multipleOf" MUST be a number, strictly greater than 0.
     */
    private Number multipleOf;
    /**
     * The value of the 'exclusiveMinimum' attribute in the OpenAPI schema.
     * The value of "exclusiveMinimum" MUST be number, representing an exclusive lower limit for a numeric instance.
     */
    private boolean exclusiveMinimum;
    /**
     * The value of the 'exclusiveMaximum' attribute in the OpenAPI schema.
     * The value of "exclusiveMaximum" MUST be number, representing an exclusive upper limit for a numeric instance.
     */
    private boolean exclusiveMaximum;
    @Setter private boolean required;
    private boolean deprecated;
    private boolean isModel;
    /**
     * True if this property is an array of items or a map container.
     * See:
     * - ModelUtils.isArraySchema()
     * - ModelUtils.isMapSchema()
     */
    private boolean isContainer;
    private boolean isUnboundedInteger;
    /**
     * datatype is the generic inner parameter of a std::optional for C++, or Optional (Java)
     */
    private boolean isOptional;
    private boolean isEnum; // true if the enum is defined inline
    private boolean isInnerEnum; // Enums declared inline will be located inside the generic model, changing how the enum is referenced in some cases.
    private boolean isEnumRef; // true if it's a reference to an enum
    private boolean isReadOnly;
    private boolean isWriteOnly;
    private boolean isNullable;
    private boolean isSelfReference;
    private boolean isCircularReference;
    private boolean isDiscriminator;
    private boolean isNew; // true when this property overrides an inherited property
    private Boolean isOverridden; // true if the property is a parent property (not defined in child/current schema)
    @Getter @Setter
    private List<String> _enum;
    @Getter @Setter
    private Map<String, Object> allowableValues;
    // If 'additionalProperties' is not set, items is null.
    // If 'additionalProperties' is set to a type or refers to a type, 'items' provides the type information for
    // the undeclared properties.
    private CodegenProperty items;
    private CodegenProperty additionalProperties;
    private List<CodegenProperty> vars = new ArrayList<CodegenProperty>(); // all properties (without parent's properties)
    private List<CodegenProperty> requiredVars = new ArrayList<>();
    private CodegenProperty mostInnerItems;
    @Getter @Setter
    private Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    private boolean hasValidation; // true if pattern, maximum, etc are set (only used in the mustache template)
    private boolean isInherited;
    private String discriminatorValue;

    @Getter @Setter
    private String nameInLowerCase; // property name in lower case
    @Getter @Setter
    private String nameInCamelCase; // property name in camel case (e.g.  modifiedDate)
    @Getter @Setter
    private String nameInPascalCase; // property name in pascal case (e.g. ModifiedDate)
    @Getter
    private String nameInSnakeCase; // property name in upper snake case
    // enum name based on the property name, usually use as a prefix (e.g. VAR_NAME) for enum name (e.g. VAR_NAME_VALUE1)
    @Getter @Setter
    private String enumName;
    private Integer maxItems;
    private Integer minItems;

    private Integer maxProperties;
    private Integer minProperties;
    private boolean uniqueItems;
    private Boolean uniqueItemsBoolean;

    // XML
    private boolean isXmlAttribute = false;
    @Getter @Setter
    private String xmlPrefix;
    @Getter @Setter
    private String xmlName;
    @Getter @Setter
    private String xmlNamespace;
    private boolean isXmlWrapped = false;
    private boolean additionalPropertiesIsAnyType;
    private boolean hasVars;
    private boolean hasRequired;
    private boolean hasDiscriminatorWithNonEmptyMapping;
    private CodegenComposedSchemas composedSchemas = null;
    private boolean hasMultipleTypes = false;
    /**
     * true if the property's baseName != name, e.g. baseName = '_prop.value', name = 'propValue' after sanitization
     */
    private boolean hasSanitizedName = false;
    private Map<String, CodegenProperty> requiredVarsMap;
    private String ref;
    private boolean schemaIsFromAdditionalProperties;
    private boolean isBooleanSchemaTrue;
    private boolean isBooleanSchemaFalse;
    private String format;
    private LinkedHashMap<String, List<String>> dependentRequired;
    private CodegenProperty contains;

    public String getBaseName() {
        return this.type.getBaseName();
    }

    public void setBaseName(String baseName) {
        this.type.setBaseName(baseName);
    }

    @Override
    public CodegenProperty getContains() {
        return contains;
    }

    @Override
    public void setContains(CodegenProperty contains) {
        this.contains = contains;
    }

    @Override
    public LinkedHashMap<String, List<String>> getDependentRequired() {
        return dependentRequired;
    }

    @Override
    public void setDependentRequired(LinkedHashMap<String, List<String>> dependentRequired) {
        this.dependentRequired = dependentRequired;
    }

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public boolean getIsBooleanSchemaTrue() {
        return isBooleanSchemaTrue;
    }

    @Override
    public void setIsBooleanSchemaTrue(boolean isBooleanSchemaTrue) {
        this.isBooleanSchemaTrue = true;
    }

    @Override
    public boolean getIsBooleanSchemaFalse() {
        return isBooleanSchemaFalse;
    }

    @Override
    public void setIsBooleanSchemaFalse(boolean isBooleanSchemaFalse) {
        this.isBooleanSchemaFalse = isBooleanSchemaFalse;
    }

    public boolean isCircularReference() {
        return this.isCircularReference;
    }

    public void isCircularReference(boolean isCircularReference) {
        this.isCircularReference = isCircularReference;
    }

    @Override
    public String getComplexType() {
        return this.type.getComplexType();
    }

    public void setComplexType(String complexType) {
        this.type.setComplexType(complexType);
    }

    public boolean isContainer() {
        return this.isContainer;
    }

    public void isContainer(boolean isContainer) {
        this.isContainer = isContainer;
    }

    public boolean isDeprecated() {
        return this.deprecated;
    }

    public void isDeprecated(boolean isDeprecated) {
        this.deprecated = isDeprecated;
    }

    public String getDescription() {
        return this.type.getDescription();
    }

    public void setDescription(String description) {
        this.type.setDescription(description);
    }

    public String getDiscriminatorValue() {
        return this.discriminatorValue;
    }

    public void setDiscriminatorValue(String discriminatorValue) {
        this.discriminatorValue = discriminatorValue;
    }

    public boolean getIsDiscriminator() {
        return this.isDiscriminator;
    }

    public void setIsDiscriminator(boolean isDiscriminator) {
        this.isDiscriminator = isDiscriminator;
    }

    public boolean isEmail() {
        return this.type.isEmail();
    }

    public void isEmail(boolean isEmail) {
        this.type.isEmail(isEmail);
    }

    public boolean isEnumRef() {
        return this.isEnumRef;
    }

    public void isEnumRef(boolean isEnumRef) {
        this.isEnumRef = isEnumRef;
    }

    public boolean isInherited() {
        return this.isInherited;
    }

    public void isInherited(boolean isInherited) {
        this.isInherited = isInherited;
    }

    public boolean isInnerEnum() {
        return this.isInnerEnum;
    }

    public void isInnerEnum(boolean isInnerEnum) {
        this.isInnerEnum = isInnerEnum;
    }

    public CodegenProperty getMostInnerItems() {
        return mostInnerItems;
    }

    public void setMostInnerItems(CodegenProperty mostInnerItems) {
        this.mostInnerItems = mostInnerItems;
    }

    public String getName() {
        return this.type.getName();
    }

    public void setName(String name) {
        this.type.setName(name);
    }

    public String getNameInSnakeCase() {
        return this.nameInSnakeCase;
    }

    public void setNameInSnakeCase(String nameInSnakeCase) {
        this.nameInSnakeCase = nameInSnakeCase;
    }

    public boolean isNumeric() {
        return this.type.isNumeric();
    }

    public void isNumeric(boolean isNumeric) {
        this.type.isNumeric(isNumeric);
    }

    public Boolean isOverridden() {
        return this.isOverridden;
    }

    public void isOverridden(Boolean isOverridden) {
        this.isOverridden = isOverridden;
    }

    public boolean isPassword() {
        return this.type.isPassword();
    }

    public void isPassword(boolean isPassword) {
        this.type.isPassword(isPassword);
    }

    public boolean isReadOnly() {
        return this.isReadOnly;
    }

    public void isReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public boolean isSelfReference() {
        return this.isSelfReference;
    }

    public void isSelfReference(boolean isSelfReference) {
        this.isSelfReference = isSelfReference;
    }

    public boolean isXmlAttribute() {
        return this.isXmlAttribute;
    }

    public void isXmlAttribute(boolean isXmlAttribute) {
        this.isXmlAttribute = isXmlAttribute;
    }

    public boolean isXmlWrapped() {
        return this.isXmlWrapped;
    }

    public void isXmlWrapped(boolean isXmlWrapped) {
        this.isXmlWrapped = isXmlWrapped;
    }

    public boolean isWriteOnly() {
        return this.isWriteOnly;
    }

    public void isWriteOnly(boolean isWriteOnly) {
        this.isWriteOnly = isWriteOnly;
    }

    /**
     * @return dataType
     * @deprecated since version 3.0.0, use {@link #getDataType()} instead.<br>
     * May be removed with the next major release (4.0)
     */
    @Deprecated
    public String getDatatype() {
        return getDataType();
    }

    @Override
    public String getDataType() {
        return this.type.getDataType();
    }

    /**
     * @deprecated use {@link #setDataType(String)} instead.
     */
    @Deprecated
    public void setDatatype(String datatype) {
        this.type.setDataType(datatype);
    }

    @Override
    public void setDataType(String dataType) {
        this.type.setDataType(dataType);
    }

    @Override
    public String getBaseType() {
        return this.type.getBaseType();
    }

    public void setBaseType(String baseType) {
        this.type.setBaseType(baseType);
    }

    @Override
    public boolean getSchemaIsFromAdditionalProperties() {
        return schemaIsFromAdditionalProperties;
    }

    @Override
    public void setSchemaIsFromAdditionalProperties(boolean schemaIsFromAdditionalProperties) {
        this.schemaIsFromAdditionalProperties = schemaIsFromAdditionalProperties;
    }

    @Override
    public Integer getMaxLength() {
        return maxLength;
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Integer getMinLength() {
        return minLength;
    }

    @Override
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String getMinimum() {
        return minimum;
    }

    @Override
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @Override
    public boolean getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    @Override
    public String getMaximum() {
        return maximum;
    }

    @Override
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    @Override
    public boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    @Override
    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    public boolean getIExclusiveMaximum() {
        return exclusiveMaximum;
    }

    @Override
    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    public boolean isFile() {
        return this.type.isFile();
    }

    public void isFile(boolean isFile) {
        this.type.isFile(isFile);
    }

    public void isNew(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public boolean isNullable() {
        return this.isNullable;
    }

    public void isNullable(boolean isNullable) {
        this.isNullable = isNullable;
    }

    public boolean isUri() {
        return this.type.isUri();
    }

    public void isUri(boolean isUri) {
        this.type.isUri(isUri);
    }

    public boolean getRequired() {
        return required;
    }

    public String getOpenApiType() {
        return this.openApiType;
    }

    public void setOpenApiType(String openApiType) {
        this.openApiType = openApiType;
    }

    public boolean requiredAndNotNullable() {
        return getRequired() && !isNullable;
    }

    public boolean notRequiredOrIsNullable() {
        return !getRequired() || isNullable;
    }

    /**
     * An alias for vendor extensions, e.g. one can use {{exts.x-something}} for cleaner template
     *
     * @return vendor extensions
     */
    public Map<String, Object> getExts() {
        return vendorExtensions;
    }

    @Override
    public CodegenProperty getItems() {
        return items;
    }

    @Override
    public void setItems(CodegenProperty items) {
        this.items = items;
    }

    @Override
    public CodegenProperty getAdditionalProperties() {
        return additionalProperties;
    }

    @Override
    public void setAdditionalProperties(CodegenProperty additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public boolean getIsModel() {
        return isModel;
    }

    @Override
    public void setIsModel(boolean isModel) {
        this.isModel = isModel;
    }

    @Override
    public boolean getIsDate() {
        return this.type.isDate();
    }

    @Override
    public void setIsDate(boolean isDate) {
        this.type.isDate(isDate);
    }

    @Override
    public boolean getIsDateTime() {
        return this.type.isDateTime();
    }

    @Override
    public void setIsDateTime(boolean isDateTime) {
        this.type.isDateTime(isDateTime);
    }

    @Override
    public boolean getIsMap() {
        return this.type.isMap();
    }

    @Override
    public void setIsMap(boolean isMap) {
        this.type.isMap(isMap);
    }

    @Override
    public boolean getIsOptional() {
        return isOptional;
    }

    @Override
    public void setIsOptional(boolean isOptional) {
        this.isOptional = isOptional;
    }

    @Override
    public boolean getIsArray() {
        return this.type.isArray();
    }

    @Override
    public void setIsArray(boolean isArray) {
        this.type.isArray(isArray);
    }

    @Override
    public boolean getIsShort() {
        return this.type.isShort();
    }

    @Override
    public void setIsShort(boolean isShort) {
        this.type.isShort(isShort);
    }

    @Override
    public boolean getIsBoolean() {
        return this.type.isBoolean();
    }

    @Override
    public void setIsBoolean(boolean isBoolean) {
        this.type.isBoolean(isBoolean);
    }

    @Override
    public boolean getIsUnboundedInteger() {
        return isUnboundedInteger;
    }

    @Override
    public void setIsUnboundedInteger(boolean isUnboundedInteger) {
        this.isUnboundedInteger = isUnboundedInteger;
    }

    @Override
    public boolean getIsPrimitiveType() {
        return this.type.isPrimitiveType();
    }

    @Override
    public void setIsPrimitiveType(boolean isPrimitiveType) {
        this.type.isPrimitiveType(isPrimitiveType);
    }

    @Override
    public Integer getMaxItems() {
        return maxItems;
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    @Override
    public Integer getMinItems() {
        return minItems;
    }

    @Override
    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    @Override
    public void setComposedSchemas(CodegenComposedSchemas composedSchemas) {
        this.composedSchemas = composedSchemas;
    }

    @Override
    public CodegenComposedSchemas getComposedSchemas() {
        return composedSchemas;
    }

    @Override
    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String getRef() {
        return ref;
    }

    public String getUnescapedDescription() {
        return this.type.getUnescapedDescription();
    }

    public void setUnescapedDescription(String unescapedDescription) {
        this.type.setUnescapedDescription(unescapedDescription);
    }

    @Override
    public CodegenProperty clone() {
        try {
            CodegenProperty cp = (CodegenProperty) super.clone();
            if (this._enum != null) {
                cp._enum = new ArrayList<String>(this._enum);
            }
            if (this.allowableValues != null) {
                cp.allowableValues = new HashMap<String, Object>(this.allowableValues);
            }
            if (this.items != null) {
                cp.items = this.items;
            }
            if (this.additionalProperties != null) {
                cp.additionalProperties = this.additionalProperties;
            }
            if (this.vars != null) {
                cp.vars = this.vars;
            }
            if (this.requiredVars != null) {
                cp.requiredVars = this.requiredVars;
            }
            if (this.mostInnerItems != null) {
                cp.mostInnerItems = this.mostInnerItems;
            }
            if (this.vendorExtensions != null) {
                cp.vendorExtensions = new HashMap<String, Object>(this.vendorExtensions);
            }
            if (this.composedSchemas != null) {
                cp.composedSchemas = this.composedSchemas;
            }
            if (this.requiredVarsMap != null) {
                cp.setRequiredVarsMap(this.requiredVarsMap);
            }
            if (this.ref != null) {
                cp.setRef(this.ref);
            }
            if (this.format != null) {
                cp.setFormat(this.format);
            }
            if (this.dependentRequired != null) {
                cp.setDependentRequired(this.dependentRequired);
            }
            if (this.contains != null) {
                cp.setContains(this.contains);
            }

            return cp;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public boolean getUniqueItems() {
        return uniqueItems;
    }

    @Override
    public void setUniqueItems(boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @Override
    public Boolean getUniqueItemsBoolean() {
        return uniqueItemsBoolean;
    }

    @Override
    public void setUniqueItemsBoolean(Boolean uniqueItemsBoolean) {
        this.uniqueItemsBoolean = uniqueItemsBoolean;
    }

    @Override
    public Integer getMinProperties() {
        return minProperties;
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public Integer getMaxProperties() {
        return maxProperties;
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        this.maxProperties = maxProperties;
    }

    @Override
    public Number getMultipleOf() {
        return multipleOf;
    }

    @Override
    public void setMultipleOf(Number multipleOf) {
        this.multipleOf = multipleOf;
    }

    @Override
    public List<CodegenProperty> getVars() {
        return vars;
    }

    @Override
    public void setVars(List<CodegenProperty> vars) {
        this.vars = vars;
    }

    @Override
    public List<CodegenProperty> getRequiredVars() {
        return requiredVars;
    }

    @Override
    public void setRequiredVars(List<CodegenProperty> requiredVars) {
        this.requiredVars = requiredVars;
    }

    @Override
    public boolean getIsNull() {
        return this.type.isNull();
    }

    @Override
    public void setIsNull(boolean isNull) {
        this.type.isNull(isNull);
    }

    @Override
    public boolean getIsVoid() {
        return this.type.isVoid();
    }

    @Override
    public void setIsVoid(boolean isVoid) {
        this.type.isVoid(isVoid);
    }

    @Override
    public boolean getHasValidation() {
        return hasValidation;
    }

    @Override
    public void setHasValidation(boolean hasValidation) {
        this.hasValidation = hasValidation;
    }

    @Override
    public boolean getAdditionalPropertiesIsAnyType() {
        return additionalPropertiesIsAnyType;
    }

    @Override
    public void setAdditionalPropertiesIsAnyType(boolean additionalPropertiesIsAnyType) {
        this.additionalPropertiesIsAnyType = additionalPropertiesIsAnyType;
    }

    @Override
    public boolean getHasVars() {
        return this.hasVars;
    }

    @Override
    public void setHasVars(boolean hasVars) {
        this.hasVars = hasVars;
    }

    @Override
    public boolean getHasRequired() {
        return this.hasRequired;
    }

    @Override
    public void setHasRequired(boolean hasRequired) {
        this.hasRequired = hasRequired;
    }

    @Override
    public boolean getHasDiscriminatorWithNonEmptyMapping() {
        return hasDiscriminatorWithNonEmptyMapping;
    }

    @Override
    public void setHasDiscriminatorWithNonEmptyMapping(boolean hasDiscriminatorWithNonEmptyMapping) {
        this.hasDiscriminatorWithNonEmptyMapping = hasDiscriminatorWithNonEmptyMapping;
    }

    public boolean getHasItems() {
        return this.items != null;
    }

    @Override
    public boolean getIsString() {
        return this.type.isString();
    }

    @Override
    public void setIsString(boolean isString) {
        this.type.isString(isString);
    }

    @Override
    public boolean getIsNumber() {
        return this.type.isNumber();
    }

    @Override
    public void setIsNumber(boolean isNumber) {
        this.type.isNumber(isNumber);
    }

    @Override
    public boolean getIsAnyType() {
        return this.type.isAnyType();
    }

    @Override
    public void setIsAnyType(boolean isAnyType) {
        this.type.isAnyType(isAnyType);
    }

    @Override
    public boolean getIsFreeFormObject() {
        return this.type.isFreeFormObject();
    }

    @Override
    public void setIsFreeFormObject(boolean isFreeFormObject) {
        this.type.isFreeFormObject(isFreeFormObject);
    }

    @Override
    public boolean getHasMultipleTypes() {
        return hasMultipleTypes;
    }

    @Override
    public void setHasMultipleTypes(boolean hasMultipleTypes) {
        this.hasMultipleTypes = hasMultipleTypes;
    }

    public boolean getHasSanitizedName() {
        return hasSanitizedName;
    }

    public void setHasSanitizedName(boolean hasSanitizedName) {
        this.hasSanitizedName = hasSanitizedName;
    }

    @Override
    public boolean getIsUuid() {
        return this.type.isUuid();
    }

    @Override
    public void setIsUuid(boolean isUuid) {
        this.type.isUuid(isUuid);
    }

    @Override
    public Map<String, CodegenProperty> getRequiredVarsMap() {
        return requiredVarsMap;
    }

    @Override
    public void setRequiredVarsMap(Map<String, CodegenProperty> requiredVarsMap) {
        this.requiredVarsMap = requiredVarsMap;
    }

    @Override
    public boolean getIsFloat() {
        return this.type.isFloat();
    }

    @Override
    public void setIsFloat(boolean isFloat) {
        this.type.isFloat(isFloat);
    }

    @Override
    public boolean getIsDouble() {
        return this.type.isDouble();
    }

    @Override
    public void setIsDouble(boolean isDouble) {
        this.type.isDouble(isDouble);
    }

    @Override
    public boolean getIsInteger() {
        return this.type.isInteger();
    }

    @Override
    public void setIsInteger(boolean isInteger) {
        this.type.isInteger(isInteger);
    }

    @Override
    public boolean getIsLong() {
        return this.type.isLong();
    }

    @Override
    public void setIsLong(boolean isLong) {
        this.type.isLong(isLong);
    }

    @Override
    public boolean getIsBinary() {
        return this.type.isBinary();
    }

    @Override
    public void setIsBinary(boolean isBinary) {
        this.type.isBinary(isBinary);
    }

    @Override
    public boolean getIsByteArray() {
        return this.type.isByteArray();
    }

    @Override
    public void setIsByteArray(boolean isByteArray) {
        this.type.isByteArray(isByteArray);
    }

    @Override
    public boolean getIsDecimal() {
        return this.type.isDecimal();
    }

    @Override
    public void setIsDecimal(boolean isDecimal) {
        this.type.isDecimal(isDecimal);
    }

    /**
     * Return true if it's an enum (inline or ref)
     *
     * @return true if it's an enum (inline or ref)
     */
    public boolean getIsEnumOrRef() {
        return isEnum || isEnumRef;
    }

    @Override
    public boolean getIsEnum() {
        return isEnum;
    }

    @Override
    public void setIsEnum(boolean isEnum) {
        this.isEnum = isEnum;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenProperty{");
        sb.append("openApiType='").append(openApiType).append('\'');
        sb.append(this.type.toString());
        sb.append(", getter='").append(getter).append('\'');
        sb.append(", setter='").append(setter).append('\'');
        sb.append(", datatypeWithEnum='").append(datatypeWithEnum).append('\'');
        sb.append(", dataFormat='").append(dataFormat).append('\'');
        sb.append(", min='").append(min).append('\'');
        sb.append(", max='").append(max).append('\'');
        sb.append(", defaultValue='").append(defaultValue).append('\'');
        sb.append(", defaultValueWithParam='").append(defaultValueWithParam).append('\'');
        sb.append(", containerType='").append(containerType).append('\'');
        sb.append(", containerTypeMapped='").append(containerTypeMapped).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", maxLength=").append(maxLength);
        sb.append(", minLength=").append(minLength);
        sb.append(", pattern='").append(pattern).append('\'');
        sb.append(", example='").append(example).append('\'');
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", minimum='").append(minimum).append('\'');
        sb.append(", maximum='").append(maximum).append('\'');
        sb.append(", exclusiveMinimum=").append(exclusiveMinimum);
        sb.append(", exclusiveMaximum=").append(exclusiveMaximum);
        sb.append(", required=").append(required);
        sb.append(", deprecated=").append(deprecated);
        sb.append(", isModel=").append(isModel);
        sb.append(", isContainer=").append(isContainer);
        sb.append(", isUnboundedInteger=").append(isUnboundedInteger);
        sb.append(", isOptional=").append(isOptional);
        sb.append(", isEnum=").append(isEnum);
        sb.append(", isInnerEnum=").append(isInnerEnum);
        sb.append(", isEnumRef=").append(isEnumRef);
        sb.append(", isReadOnly=").append(isReadOnly);
        sb.append(", isWriteOnly=").append(isWriteOnly);
        sb.append(", isNullable=").append(isNullable);
        sb.append(", isSelfReference=").append(isSelfReference);
        sb.append(", isCircularReference=").append(isCircularReference);
        sb.append(", isDiscriminator=").append(isDiscriminator);
        sb.append(", isNew=").append(isNew);
        sb.append(", isOverridden=").append(isOverridden);
        sb.append(", _enum=").append(_enum);
        sb.append(", allowableValues=").append(allowableValues);
        sb.append(", items=").append(items);
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append(", vars=").append(vars);
        sb.append(", requiredVars=").append(requiredVars);
        sb.append(", mostInnerItems=").append(mostInnerItems);
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", hasValidation=").append(hasValidation);
        sb.append(", isInherited=").append(isInherited);
        sb.append(", discriminatorValue='").append(discriminatorValue).append('\'');
        sb.append(", nameInCamelCase='").append(nameInCamelCase).append('\'');
        sb.append(", nameInPascalCase='").append(nameInPascalCase).append('\'');
        sb.append(", nameInSnakeCase='").append(nameInSnakeCase).append('\'');
        sb.append(", enumName='").append(enumName).append('\'');
        sb.append(", maxItems=").append(maxItems);
        sb.append(", minItems=").append(minItems);
        sb.append(", maxProperties=").append(maxProperties);
        sb.append(", minProperties=").append(minProperties);
        sb.append(", uniqueItems=").append(uniqueItems);
        sb.append(", uniqueItemsBoolean=").append(uniqueItemsBoolean);
        sb.append(", multipleOf=").append(multipleOf);
        sb.append(", isXmlAttribute=").append(isXmlAttribute);
        sb.append(", xmlPrefix='").append(xmlPrefix).append('\'');
        sb.append(", xmlName='").append(xmlName).append('\'');
        sb.append(", xmlNamespace='").append(xmlNamespace).append('\'');
        sb.append(", isXmlWrapped=").append(isXmlWrapped);
        sb.append(", getAdditionalPropertiesIsAnyType=").append(getAdditionalPropertiesIsAnyType());
        sb.append(", getHasVars=").append(getHasVars());
        sb.append(", getHasRequired=").append(getHasRequired());
        sb.append(", getHasDiscriminatorWithNonEmptyMapping=").append(hasDiscriminatorWithNonEmptyMapping);
        sb.append(", composedSchemas=").append(composedSchemas);
        sb.append(", hasMultipleTypes=").append(hasMultipleTypes);
        sb.append(", hasSanitizedName=").append(hasSanitizedName);
        sb.append(", requiredVarsMap=").append(requiredVarsMap);
        sb.append(", ref=").append(ref);
        sb.append(", schemaIsFromAdditionalProperties=").append(schemaIsFromAdditionalProperties);
        sb.append(", isBooleanSchemaTrue=").append(isBooleanSchemaTrue);
        sb.append(", isBooleanSchemaFalse=").append(isBooleanSchemaFalse);
        sb.append(", format=").append(format);
        sb.append(", dependentRequired=").append(dependentRequired);
        sb.append(", contains=").append(contains);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodegenProperty that = (CodegenProperty) o;
        return exclusiveMinimum == that.exclusiveMinimum &&
                exclusiveMaximum == that.exclusiveMaximum &&
                Objects.equals(this.type, that.type) &&
                required == that.required &&
                deprecated == that.deprecated &&
                isModel == that.isModel &&
                isContainer == that.isContainer &&
                isUnboundedInteger == that.isUnboundedInteger &&
                isOptional == that.isOptional &&
                isEnum == that.isEnum &&
                isInnerEnum == that.isInnerEnum &&
                isEnumRef == that.isEnumRef &&
                isReadOnly == that.isReadOnly &&
                isWriteOnly == that.isWriteOnly &&
                isNullable == that.isNullable &&
                isSelfReference == that.isSelfReference &&
                isCircularReference == that.isCircularReference &&
                isDiscriminator == that.isDiscriminator &&
                isNew == that.isNew &&
                isOverridden == that.isOverridden &&
                hasValidation == that.hasValidation &&
                isInherited == that.isInherited &&
                isXmlAttribute == that.isXmlAttribute &&
                isXmlWrapped == that.isXmlWrapped &&
                hasMultipleTypes == that.getHasMultipleTypes() &&
                hasSanitizedName == that.getHasSanitizedName() &&
                hasDiscriminatorWithNonEmptyMapping == that.hasDiscriminatorWithNonEmptyMapping &&
                isBooleanSchemaTrue == that.getIsBooleanSchemaTrue() &&
                isBooleanSchemaFalse == that.getIsBooleanSchemaFalse() &&
                getSchemaIsFromAdditionalProperties() == that.getSchemaIsFromAdditionalProperties() &&
                getAdditionalPropertiesIsAnyType() == that.getAdditionalPropertiesIsAnyType() &&
                getHasVars() == that.getHasVars() &&
                getHasRequired() == that.getHasRequired() &&
                Objects.equals(contains, that.getContains()) &&
                Objects.equals(dependentRequired, that.getDependentRequired()) &&
                Objects.equals(format, that.getFormat()) &&
                Objects.equals(uniqueItemsBoolean, that.getUniqueItemsBoolean()) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(requiredVarsMap, that.getRequiredVarsMap()) &&
                Objects.equals(composedSchemas, that.composedSchemas) &&
                Objects.equals(openApiType, that.openApiType) &&
                Objects.equals(getter, that.getter) &&
                Objects.equals(setter, that.setter) &&
                Objects.equals(datatypeWithEnum, that.datatypeWithEnum) &&
                Objects.equals(dataFormat, that.dataFormat) &&
                Objects.equals(min, that.min) &&
                Objects.equals(max, that.max) &&
                Objects.equals(defaultValue, that.defaultValue) &&
                Objects.equals(defaultValueWithParam, that.defaultValueWithParam) &&
                Objects.equals(containerType, that.containerType) &&
                Objects.equals(containerTypeMapped, that.containerTypeMapped) &&
                Objects.equals(title, that.title) &&
                Objects.equals(maxLength, that.maxLength) &&
                Objects.equals(minLength, that.minLength) &&
                Objects.equals(pattern, that.pattern) &&
                Objects.equals(example, that.example) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(minimum, that.minimum) &&
                Objects.equals(maximum, that.maximum) &&
                Objects.equals(_enum, that._enum) &&
                Objects.equals(allowableValues, that.allowableValues) &&
                Objects.equals(items, that.items) &&
                Objects.equals(additionalProperties, that.additionalProperties) &&
                Objects.equals(vars, that.vars) &&
                Objects.equals(requiredVars, that.requiredVars) &&
                Objects.equals(mostInnerItems, that.mostInnerItems) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(discriminatorValue, that.discriminatorValue) &&
                Objects.equals(nameInCamelCase, that.nameInCamelCase) &&
                Objects.equals(nameInPascalCase, that.nameInPascalCase) &&
                Objects.equals(nameInSnakeCase, that.nameInSnakeCase) &&
                Objects.equals(enumName, that.enumName) &&
                Objects.equals(maxItems, that.maxItems) &&
                Objects.equals(minItems, that.minItems) &&
                Objects.equals(xmlPrefix, that.xmlPrefix) &&
                Objects.equals(xmlName, that.xmlName) &&
                Objects.equals(xmlNamespace, that.xmlNamespace) &&
                Objects.equals(multipleOf, that.multipleOf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(openApiType, this.type.hashCode(), getter, setter,
                datatypeWithEnum, dataFormat, min, max, defaultValue,
                defaultValueWithParam, containerType, containerTypeMapped, title,
                maxLength, minLength, pattern, example, jsonSchema, minimum, maximum,
                exclusiveMinimum, exclusiveMaximum, required, deprecated,
                isModel, isContainer,
                isOptional, isEnum, isInnerEnum, isEnumRef, isReadOnly, isWriteOnly, isNullable,
                isUnboundedInteger, isSelfReference, isCircularReference, isDiscriminator, isNew, isOverridden, _enum,
                allowableValues, items, mostInnerItems, additionalProperties, vars, requiredVars,
                vendorExtensions, hasValidation, isInherited, discriminatorValue, nameInPascalCase, nameInCamelCase,
                nameInSnakeCase, enumName, maxItems, minItems, isXmlAttribute, xmlPrefix, xmlName,
                xmlNamespace, isXmlWrapped, additionalPropertiesIsAnyType, hasVars, hasRequired,
                hasDiscriminatorWithNonEmptyMapping, composedSchemas, hasMultipleTypes, hasSanitizedName, requiredVarsMap,
                ref, uniqueItemsBoolean, schemaIsFromAdditionalProperties, isBooleanSchemaTrue, isBooleanSchemaFalse,
                format, dependentRequired, contains);
    }
}
