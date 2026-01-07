package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CharacteristicValueSpecificationMVO;
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
 * FloatCharacteristicValueSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FloatCharacteristicValueSpecificationMVO extends CharacteristicValueSpecificationMVO {

  private @Nullable Float value;

  public FloatCharacteristicValueSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FloatCharacteristicValueSpecificationMVO(String atType) {
    super(atType);
  }

  public FloatCharacteristicValueSpecificationMVO value(@Nullable Float value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Float getValue() {
    return value;
  }

  public void setValue(@Nullable Float value) {
    this.value = value;
  }


  public FloatCharacteristicValueSpecificationMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public FloatCharacteristicValueSpecificationMVO regex(String regex) {
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
    FloatCharacteristicValueSpecificationMVO floatCharacteristicValueSpecificationMVO = (FloatCharacteristicValueSpecificationMVO) o;
    return Objects.equals(this.value, floatCharacteristicValueSpecificationMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatCharacteristicValueSpecificationMVO {\n");
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

