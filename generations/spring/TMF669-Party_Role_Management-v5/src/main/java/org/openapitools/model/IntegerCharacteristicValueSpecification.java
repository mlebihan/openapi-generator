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
 * IntegerCharacteristicValueSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class IntegerCharacteristicValueSpecification extends CharacteristicValueSpecification {

  private @Nullable Integer value;

  public IntegerCharacteristicValueSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntegerCharacteristicValueSpecification(String atType) {
    super(atType);
  }

  public IntegerCharacteristicValueSpecification value(@Nullable Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Integer getValue() {
    return value;
  }

  public void setValue(@Nullable Integer value) {
    this.value = value;
  }


  public IntegerCharacteristicValueSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public IntegerCharacteristicValueSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public IntegerCharacteristicValueSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public IntegerCharacteristicValueSpecification valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public IntegerCharacteristicValueSpecification isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public IntegerCharacteristicValueSpecification unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public IntegerCharacteristicValueSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public IntegerCharacteristicValueSpecification valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public IntegerCharacteristicValueSpecification valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public IntegerCharacteristicValueSpecification rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public IntegerCharacteristicValueSpecification regex(String regex) {
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
    IntegerCharacteristicValueSpecification integerCharacteristicValueSpecification = (IntegerCharacteristicValueSpecification) o;
    return Objects.equals(this.value, integerCharacteristicValueSpecification.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerCharacteristicValueSpecification {\n");
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

