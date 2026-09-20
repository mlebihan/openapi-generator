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
package org.openapitools.codegen.analysis;

import java.util.Objects;

/**
 * A Property Data Type
 */
public class PropertyDataType {
   private String baseName;
   private String complexType;
   /**
    * The language-specific data type for this property. For example, the OpenAPI type 'integer'
    * may be represented as 'int', 'int32', 'Integer', etc, depending on the programming language.
    */
   private String dataType;
   /**
    * The name of this property in the OpenAPI schema.
    */
   private String name;
   private String baseType;
   /**
    * The value of the 'description' attribute in the OpenAPI schema.
    */
   private String description;
   /**
    * The 'description' string without escape characters needed by some programming languages/targets
    */
   private String unescapedDescription;
   private boolean isPrimitiveType;
   private boolean isString;
   private boolean isNumeric;
   private boolean isInteger;
   private boolean isShort;
   private boolean isLong;
   private boolean isNumber;
   private boolean isFloat;
   private boolean isDouble;
   private boolean isDecimal;
   private boolean isByteArray;
   private boolean isBinary;
   private boolean isFile;
   private boolean isBoolean;
   private boolean isDate; // full-date notation as defined by RFC 3339, section 5.6, for example, 2017-07-21
   private boolean isDateTime; // the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
   private boolean isUuid;
   private boolean isUri;
   private boolean isEmail;
   private boolean isPassword;
   private boolean isNull;
   private boolean isVoid = false;
   /**
    * The type is a free-form object, i.e. it is a map of string to values with no declared properties.
    * A OAS free-form schema may include the 'additionalProperties' attribute, which puts a constraint
    * on the type of the undeclared properties.
    */
   private boolean isFreeFormObject;
   /**
    * The 'type' in the OAS schema is unspecified (i.e. not set). The value can be number, integer, string, object or array.
    * If the nullable attribute is set to true, the 'null' value is valid.
    */
   private boolean isAnyType;
   private boolean isArray;
   private boolean isMap;

   public PropertyDataType() {
   }

   /**
    * Copy constructor
    * @param candidate Candidate
    */
   public PropertyDataType(PropertyDataType candidate) {
      Objects.requireNonNull(candidate, "Can't copy data type information from a null object.");

      this.baseName = candidate.baseName;
      this.complexType = candidate.complexType;
      this.dataType = candidate.dataType;
      this.name = candidate.name;
      this.baseType = candidate.baseType;
      this.description = candidate.description;
      this.unescapedDescription = candidate.unescapedDescription;

      this.isEmail = candidate.isEmail;
      this.isNumeric = candidate.isNumeric;
      this.isPassword = candidate.isPassword;
      this.isNull = candidate.isNull;
      this.isVoid = candidate.isVoid;
      this.isFreeFormObject = candidate.isFreeFormObject;
      this.isAnyType = candidate.isAnyType;
      this.isArray = candidate.isArray;
      this.isMap = candidate.isMap;
      this.isPrimitiveType = candidate.isPrimitiveType;
      this.isString = candidate.isString;
      this.isInteger = candidate.isInteger;
      this.isShort = candidate.isShort;
      this.isLong = candidate.isLong;
      this.isNumber = candidate.isNumber;
      this.isFloat = candidate.isFloat;
      this.isDouble = candidate.isDouble;
      this.isDecimal = candidate.isDecimal;
      this.isByteArray = candidate.isByteArray;
      this.isBinary = candidate.isBinary;
      this.isFile = candidate.isFile;
      this.isBoolean = candidate.isBoolean;
      this.isDate = candidate.isDate;
      this.isDateTime = candidate.isDateTime;
      this.isUuid = candidate.isUuid;
      this.isUri = candidate.isUri;
   }

   public String getBaseName() {
      return baseName;
   }

   public void setBaseName(String baseName) {
      this.baseName = baseName;
   }

   public String getComplexType() {
      return complexType;
   }

   public void setComplexType(String complexType) {
      this.complexType = complexType;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isEmail() {
      return this.isEmail;
   }

   public void isEmail(boolean isEmail) {
      this.isEmail = isEmail;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getBaseType() {
      return baseType;
   }

   public void setBaseType(String baseType) {
      this.baseType = baseType;
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

   public String getDataType() {
      return dataType;
   }

   /**
    * @deprecated use {@link #setDataType(String)} instead.
    */
   @Deprecated
   public void setDatatype(String datatype) {
      this.dataType = datatype;
   }

   public void setDataType(String dataType) {
      this.dataType = dataType;
   }

   public boolean isFile() {
      return this.isFile;
   }

   public void isFile(boolean isFile) {
      this.isFile = isFile;
   }

   public boolean isNumeric() {
      return this.isNumeric;
   }

   public void isNumeric(boolean isNumeric) {
      this.isNumeric = isNumeric;
   }

   public boolean isPassword() {
      return this.isPassword;
   }

   public void isPassword(boolean isPassword) {
      this.isPassword = isPassword;
   }

   public boolean isUri() {
      return this.isUri;
   }

   public void isUri(boolean isUri) {
      this.isUri = isUri;
   }

   public boolean isDate() {
      return isDate;
   }

   public void isDate(boolean isDate) {
      this.isDate = isDate;
   }

   public boolean isDateTime() {
      return isDateTime;
   }

   public void isDateTime(boolean isDateTime) {
      this.isDateTime = isDateTime;
   }

   public boolean isMap() {
      return isMap;
   }

   public void isMap(boolean isMap) {
      this.isMap = isMap;
   }

   public boolean isArray() {
      return isArray;
   }

   public void isArray(boolean isArray) {
      this.isArray = isArray;
   }

   public boolean isShort() {
      return isShort;
   }

   public void isShort(boolean isShort) {
      this.isShort = isShort;
   }

   public boolean isBoolean() {
      return isBoolean;
   }

   public void isBoolean(boolean isBoolean) {
      this.isBoolean = isBoolean;
   }

   public boolean isPrimitiveType() {
      return isPrimitiveType;
   }

   public void isPrimitiveType(boolean isPrimitiveType) {
      this.isPrimitiveType = isPrimitiveType;
   }

   @Override
   public PropertyDataType clone() {
      try {
         return new PropertyDataType(this);
      } catch (RuntimeException e) {
         throw new IllegalStateException(e);
      }
   }

   public boolean isNull() {
      return isNull;
   }

   public void isNull(boolean isNull) {
      this.isNull = isNull;
   }

   public boolean isVoid() {
      return isVoid;
   }

   public void isVoid(boolean isVoid) {
      this.isVoid = isVoid;
   }

   public boolean isString() {
      return isString;
   }

   public void isString(boolean isString) {
      this.isString = isString;
   }

   public boolean isNumber() {
      return isNumber;
   }

   public void isNumber(boolean isNumber) {
      this.isNumber = isNumber;
   }

   public boolean isAnyType() {
      return isAnyType;
   }

   public void isAnyType(boolean isAnyType) {
      this.isAnyType = isAnyType;
   }

   public boolean isFreeFormObject() {
      return isFreeFormObject;
   }

   public void isFreeFormObject(boolean isFreeFormObject) {
      this.isFreeFormObject = isFreeFormObject;
   }

   public boolean isUuid() {
      return isUuid;
   }

   public void isUuid(boolean isUuid) {
      this.isUuid = isUuid;
   }

   public boolean isFloat() {
      return isFloat;
   }

   public void isFloat(boolean isFloat) {
      this.isFloat = isFloat;
   }

   public boolean isDouble() {
      return isDouble;
   }

   public void isDouble(boolean isDouble) {
      this.isDouble = isDouble;
   }

   public boolean isInteger() {
      return isInteger;
   }

   public void isInteger(boolean isInteger) {
      this.isInteger = isInteger;
   }

   public boolean isLong() {
      return isLong;
   }

   public void isLong(boolean isLong) {
      this.isLong = isLong;
   }

   public boolean isBinary() {
      return isBinary;
   }

   public void isBinary(boolean isBinary) {
      this.isBinary = isBinary;
   }

   public boolean isByteArray() {
      return isByteArray;
   }

   public void isByteArray(boolean isByteArray) {
      this.isByteArray = isByteArray;
   }

   public boolean isDecimal() {
      return isDecimal;
   }

   public void isDecimal(boolean isDecimal) {
      this.isDecimal = isDecimal;
   }

   public String getUnescapedDescription() {
      return this.unescapedDescription;
   }

   public void setUnescapedDescription(String unescapedDescription) {
      this.unescapedDescription = unescapedDescription;
   }


   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append(", baseName='").append(baseName).append('\'');
      sb.append(", complexType='").append(complexType).append('\'');
      sb.append(", description='").append(description).append('\'');
      sb.append(", dataType='").append(dataType).append('\'');
      sb.append(", name='").append(name).append('\'');
      sb.append(", baseType='").append(baseType).append('\'');
      sb.append(", unescapedDescription='").append(unescapedDescription).append('\'');
      sb.append(", isPrimitiveType=").append(isPrimitiveType);
      sb.append(", isString=").append(isString);
      sb.append(", isNumeric=").append(isNumeric);
      sb.append(", isInteger=").append(isInteger);
      sb.append(", isShort=").append(isShort);
      sb.append(", isLong=").append(isLong);
      sb.append(", isNumber=").append(isNumber);
      sb.append(", isFloat=").append(isFloat);
      sb.append(", isDouble=").append(isDouble);
      sb.append(", isDecimal=").append(isDecimal);
      sb.append(", isByteArray=").append(isByteArray);
      sb.append(", isBinary=").append(isBinary);
      sb.append(", isFile=").append(isFile);
      sb.append(", isBoolean=").append(isBoolean);
      sb.append(", isDate=").append(isDate);
      sb.append(", isDateTime=").append(isDateTime);
      sb.append(", isUuid=").append(isUuid);
      sb.append(", isUri=").append(isUri);
      sb.append(", isEmail=").append(isEmail);
      sb.append(", isPassword=").append(isPassword);
      sb.append(", isFreeFormObject=").append(isFreeFormObject);
      sb.append(", isArray=").append(isArray);
      sb.append(", isMap=").append(isMap);
      sb.append(", isNull=").append(isNull);
      sb.append(", isVoid=").append(isVoid);
      return sb.toString();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      PropertyDataType that = (PropertyDataType) o;
      return
         isPrimitiveType == that.isPrimitiveType &&
         isString == that.isString &&
         isNumeric == that.isNumeric &&
         isInteger == that.isInteger &&
         isShort == that.isShort &&
         isLong == that.isLong &&
         isNumber == that.isNumber &&
         isFloat == that.isFloat &&
         isDouble == that.isDouble &&
         isDecimal == that.isDecimal &&
         isByteArray == that.isByteArray &&
         isBinary == that.isBinary &&
         isFile == that.isFile &&
         isBoolean == that.isBoolean &&
         isDate == that.isDate &&
         isDateTime == that.isDateTime &&
         isUuid == that.isUuid &&
         isUri == that.isUri &&
         isEmail == that.isEmail &&
         isPassword == that.isPassword &&
         isFreeFormObject == that.isFreeFormObject &&
         isArray == that.isArray &&
         isMap == that.isMap &&
         isAnyType == that.isAnyType &&
         isNull == that.isNull &&
         isVoid == that.isVoid &&
         Objects.equals(baseName, that.baseName) &&
         Objects.equals(complexType, that.complexType) &&
         Objects.equals(description, that.description) &&
         Objects.equals(dataType, that.dataType) &&
         Objects.equals(name, that.name) &&
         Objects.equals(baseType, that.baseType) &&
         Objects.equals(unescapedDescription, that.unescapedDescription);
   }

   @Override
   public int hashCode() {
      return Objects.hash(baseName, complexType, description,
         dataType, name, baseType, unescapedDescription,
         isPrimitiveType, isString, isNumeric,
         isInteger, isLong, isNumber, isFloat, isDouble, isDecimal, isByteArray, isBinary, isFile,
         isBoolean, isDate, isDateTime, isUuid, isUri, isEmail, isPassword, isFreeFormObject,
         isArray, isMap, isAnyType, isShort,
         isNull, isVoid);
   }
}
