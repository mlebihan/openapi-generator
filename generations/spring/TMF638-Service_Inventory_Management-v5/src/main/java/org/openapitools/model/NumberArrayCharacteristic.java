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
import org.openapitools.model.Characteristic;
import org.openapitools.model.CharacteristicRelationship;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NumberArrayCharacteristic
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class NumberArrayCharacteristic extends Characteristic {

  @Valid
  private List<BigDecimal> value = new ArrayList<>();

  public NumberArrayCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberArrayCharacteristic(String atType) {
    super(atType);
  }

  public NumberArrayCharacteristic value(List<BigDecimal> value) {
    this.value = value;
    return this;
  }

  public NumberArrayCharacteristic addValueItem(BigDecimal valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * A characteristic which value is an array of Number(s).
   * @return value
   */
  @Valid 
  @Schema(name = "value", description = "A characteristic which value is an array of Number(s).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public List<BigDecimal> getValue() {
    return value;
  }

  public void setValue(List<BigDecimal> value) {
    this.value = value;
  }


  public NumberArrayCharacteristic atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NumberArrayCharacteristic atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NumberArrayCharacteristic atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NumberArrayCharacteristic id(String id) {
    super.id(id);
    return this;
  }

  public NumberArrayCharacteristic name(String name) {
    super.name(name);
    return this;
  }

  public NumberArrayCharacteristic valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public NumberArrayCharacteristic characteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public NumberArrayCharacteristic addCharacteristicRelationshipItem(CharacteristicRelationship characteristicRelationshipItem) {
    super.addCharacteristicRelationshipItem(characteristicRelationshipItem);
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
    NumberArrayCharacteristic numberArrayCharacteristic = (NumberArrayCharacteristic) o;
    return Objects.equals(this.value, numberArrayCharacteristic.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberArrayCharacteristic {\n");
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

