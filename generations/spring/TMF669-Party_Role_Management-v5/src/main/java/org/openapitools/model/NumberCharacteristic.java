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
 * NumberCharacteristic
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class NumberCharacteristic extends Characteristic {

  private @Nullable BigDecimal value;

  public NumberCharacteristic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NumberCharacteristic(String atType) {
    super(atType);
  }

  public NumberCharacteristic value(@Nullable BigDecimal value) {
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


  public NumberCharacteristic atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NumberCharacteristic atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NumberCharacteristic atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NumberCharacteristic id(String id) {
    super.id(id);
    return this;
  }

  public NumberCharacteristic name(String name) {
    super.name(name);
    return this;
  }

  public NumberCharacteristic valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public NumberCharacteristic characteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public NumberCharacteristic addCharacteristicRelationshipItem(CharacteristicRelationship characteristicRelationshipItem) {
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
    NumberCharacteristic numberCharacteristic = (NumberCharacteristic) o;
    return Objects.equals(this.value, numberCharacteristic.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberCharacteristic {\n");
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

