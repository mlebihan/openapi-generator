package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.CharacteristicValueSpecification;
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
 * FloatCharacteristicValueSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FloatCharacteristicValueSpecification extends CharacteristicValueSpecification {

  private @Nullable Float value;

  public FloatCharacteristicValueSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FloatCharacteristicValueSpecification(String atType) {
    super(atType);
  }

  public FloatCharacteristicValueSpecification value(@Nullable Float value) {
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


  public FloatCharacteristicValueSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public FloatCharacteristicValueSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public FloatCharacteristicValueSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public FloatCharacteristicValueSpecification valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public FloatCharacteristicValueSpecification isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public FloatCharacteristicValueSpecification unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public FloatCharacteristicValueSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public FloatCharacteristicValueSpecification valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public FloatCharacteristicValueSpecification valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public FloatCharacteristicValueSpecification rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public FloatCharacteristicValueSpecification regex(String regex) {
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
    FloatCharacteristicValueSpecification floatCharacteristicValueSpecification = (FloatCharacteristicValueSpecification) o;
    return Objects.equals(this.value, floatCharacteristicValueSpecification.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatCharacteristicValueSpecification {\n");
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

