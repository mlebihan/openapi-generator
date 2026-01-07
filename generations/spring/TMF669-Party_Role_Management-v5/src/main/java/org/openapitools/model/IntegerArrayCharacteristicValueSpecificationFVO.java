package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * IntegerArrayCharacteristicValueSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class IntegerArrayCharacteristicValueSpecificationFVO extends CharacteristicValueSpecificationFVO {

  @Valid
  private List<Integer> value = new ArrayList<>();

  public IntegerArrayCharacteristicValueSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntegerArrayCharacteristicValueSpecificationFVO(String atType) {
    super(atType);
  }

  public IntegerArrayCharacteristicValueSpecificationFVO value(List<Integer> value) {
    this.value = value;
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO addValueItem(Integer valueItem) {
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
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public List<Integer> getValue() {
    return value;
  }

  public void setValue(List<Integer> value) {
    this.value = value;
  }


  public IntegerArrayCharacteristicValueSpecificationFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public IntegerArrayCharacteristicValueSpecificationFVO regex(String regex) {
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
    IntegerArrayCharacteristicValueSpecificationFVO integerArrayCharacteristicValueSpecificationFVO = (IntegerArrayCharacteristicValueSpecificationFVO) o;
    return Objects.equals(this.value, integerArrayCharacteristicValueSpecificationFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerArrayCharacteristicValueSpecificationFVO {\n");
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

