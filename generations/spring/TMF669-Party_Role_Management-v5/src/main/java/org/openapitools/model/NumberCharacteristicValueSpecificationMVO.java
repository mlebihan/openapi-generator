package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
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
 * NumberCharacteristicValueSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class NumberCharacteristicValueSpecificationMVO extends CharacteristicValueSpecificationMVO {

  private @Nullable BigDecimal value;

  public NumberCharacteristicValueSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberCharacteristicValueSpecificationMVO(String atType) {
    super(atType);
  }

  public NumberCharacteristicValueSpecificationMVO value(@Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  @Valid 
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable BigDecimal getValue() {
    return value;
  }

  public void setValue(@Nullable BigDecimal value) {
    this.value = value;
  }


  public NumberCharacteristicValueSpecificationMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public NumberCharacteristicValueSpecificationMVO regex(String regex) {
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
    NumberCharacteristicValueSpecificationMVO numberCharacteristicValueSpecificationMVO = (NumberCharacteristicValueSpecificationMVO) o;
    return Objects.equals(this.value, numberCharacteristicValueSpecificationMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberCharacteristicValueSpecificationMVO {\n");
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

