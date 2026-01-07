package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CharacteristicValueSpecificationFVO;
import org.openapitools.model.TimePeriod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StringCharacteristicValueSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class StringCharacteristicValueSpecificationFVO extends CharacteristicValueSpecificationFVO {

  private @Nullable String value;

  public StringCharacteristicValueSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StringCharacteristicValueSpecificationFVO(String atType) {
    super(atType);
  }

  public StringCharacteristicValueSpecificationFVO value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }


  public StringCharacteristicValueSpecificationFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public StringCharacteristicValueSpecificationFVO regex(String regex) {
    super.regex(regex);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringCharacteristicValueSpecificationFVO stringCharacteristicValueSpecificationFVO = (StringCharacteristicValueSpecificationFVO) o;
    return Objects.equals(this.value, stringCharacteristicValueSpecificationFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringCharacteristicValueSpecificationFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

