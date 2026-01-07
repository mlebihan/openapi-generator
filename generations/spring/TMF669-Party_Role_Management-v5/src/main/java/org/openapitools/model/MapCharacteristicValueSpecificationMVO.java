package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
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
 * MapCharacteristicValueSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class MapCharacteristicValueSpecificationMVO extends CharacteristicValueSpecificationMVO {

  @Valid
  private Map<String, Object> value = new HashMap<>();

  public MapCharacteristicValueSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MapCharacteristicValueSpecificationMVO(String atType) {
    super(atType);
  }

  public MapCharacteristicValueSpecificationMVO value(Map<String, Object> value) {
    this.value = value;
    return this;
  }

  public MapCharacteristicValueSpecificationMVO putValueItem(String key, Object valueItem) {
    if (this.value == null) {
      this.value = new HashMap<>();
    }
    this.value.put(key, valueItem);
    return this;
  }

  /**
   * Value of the characteristic
   * @return value
   */
  
  @Schema(name = "value", description = "Value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Map<String, Object> getValue() {
    return value;
  }

  public void setValue(Map<String, Object> value) {
    this.value = value;
  }


  public MapCharacteristicValueSpecificationMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO isDefault(Boolean isDefault) {
    super.isDefault(isDefault);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO unitOfMeasure(String unitOfMeasure) {
    super.unitOfMeasure(unitOfMeasure);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO valueFrom(Integer valueFrom) {
    super.valueFrom(valueFrom);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO valueTo(Integer valueTo) {
    super.valueTo(valueTo);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO rangeInterval(String rangeInterval) {
    super.rangeInterval(rangeInterval);
    return this;
  }

  public MapCharacteristicValueSpecificationMVO regex(String regex) {
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
    MapCharacteristicValueSpecificationMVO mapCharacteristicValueSpecificationMVO = (MapCharacteristicValueSpecificationMVO) o;
    return Objects.equals(this.value, mapCharacteristicValueSpecificationMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapCharacteristicValueSpecificationMVO {\n");
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

