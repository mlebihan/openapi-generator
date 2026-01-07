package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * NumberArrayCharacteristicValueSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class NumberArrayCharacteristicValueSpecification extends CharacteristicValueSpecification {

  @Valid
  private List<BigDecimal> value = new ArrayList<>();

  public NumberArrayCharacteristicValueSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberArrayCharacteristicValueSpecification(String atType) {
    super(atType);
  }

  public NumberArrayCharacteristicValueSpecification value(List<BigDecimal> value) {
    this.value = value;
    return this;
  }

  public NumberArrayCharacteristicValueSpecification addValueItem(BigDecimal valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @Valid 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public List<BigDecimal> getValue() {
    return value;
  }

  public void setValue(List<BigDecimal> value) {
    this.value = value;
  }


  public NumberArrayCharacteristicValueSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public NumberArrayCharacteristicValueSpecification regex(String regex) {
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
    NumberArrayCharacteristicValueSpecification numberArrayCharacteristicValueSpecification = (NumberArrayCharacteristicValueSpecification) o;
    return Objects.equals(this.value, numberArrayCharacteristicValueSpecification.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberArrayCharacteristicValueSpecification {\n");
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

