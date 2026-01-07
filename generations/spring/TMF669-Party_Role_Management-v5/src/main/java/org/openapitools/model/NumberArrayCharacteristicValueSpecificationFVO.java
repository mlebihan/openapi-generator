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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * NumberArrayCharacteristicValueSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class NumberArrayCharacteristicValueSpecificationFVO extends CharacteristicValueSpecificationFVO {

  @Valid
  private List<BigDecimal> value = new ArrayList<>();

  public NumberArrayCharacteristicValueSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberArrayCharacteristicValueSpecificationFVO(String atType) {
    super(atType);
  }

  public NumberArrayCharacteristicValueSpecificationFVO value(List<BigDecimal> value) {
    this.value = value;
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO addValueItem(BigDecimal valueItem) {
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


  public NumberArrayCharacteristicValueSpecificationFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public NumberArrayCharacteristicValueSpecificationFVO regex(String regex) {
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
    NumberArrayCharacteristicValueSpecificationFVO numberArrayCharacteristicValueSpecificationFVO = (NumberArrayCharacteristicValueSpecificationFVO) o;
    return Objects.equals(this.value, numberArrayCharacteristicValueSpecificationFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberArrayCharacteristicValueSpecificationFVO {\n");
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

