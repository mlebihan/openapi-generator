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
 * ObjectCharacteristicValueSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ObjectCharacteristicValueSpecification extends CharacteristicValueSpecification {

  private @Nullable Object value;

  public ObjectCharacteristicValueSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObjectCharacteristicValueSpecification(String atType) {
    super(atType);
  }

  public ObjectCharacteristicValueSpecification value(@Nullable Object value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Object getValue() {
    return value;
  }

  public void setValue(@Nullable Object value) {
    this.value = value;
  }


  public ObjectCharacteristicValueSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ObjectCharacteristicValueSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ObjectCharacteristicValueSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ObjectCharacteristicValueSpecification valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public ObjectCharacteristicValueSpecification isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public ObjectCharacteristicValueSpecification unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public ObjectCharacteristicValueSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ObjectCharacteristicValueSpecification valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public ObjectCharacteristicValueSpecification valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public ObjectCharacteristicValueSpecification rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public ObjectCharacteristicValueSpecification regex(String regex) {
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
    ObjectCharacteristicValueSpecification objectCharacteristicValueSpecification = (ObjectCharacteristicValueSpecification) o;
    return Objects.equals(this.value, objectCharacteristicValueSpecification.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectCharacteristicValueSpecification {\n");
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

