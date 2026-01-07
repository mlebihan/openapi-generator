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
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.CharacteristicRelationshipMVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FloatArrayCharacteristicMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FloatArrayCharacteristicMVO extends CharacteristicMVO {

  @Valid
  private List<Float> value = new ArrayList<>();

  public FloatArrayCharacteristicMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FloatArrayCharacteristicMVO(List<Float> value, String atType) {
    super(atType);
    this.value = value;
  }

  public FloatArrayCharacteristicMVO value(List<Float> value) {
    this.value = value;
    return this;
  }

  public FloatArrayCharacteristicMVO addValueItem(Float valueItem) {
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
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public List<Float> getValue() {
    return value;
  }

  public void setValue(List<Float> value) {
    this.value = value;
  }


  public FloatArrayCharacteristicMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public FloatArrayCharacteristicMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public FloatArrayCharacteristicMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public FloatArrayCharacteristicMVO id(String id) {
    super.id(id);
    return this;
  }

  public FloatArrayCharacteristicMVO name(String name) {
    super.name(name);
    return this;
  }

  public FloatArrayCharacteristicMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public FloatArrayCharacteristicMVO characteristicRelationship(List<CharacteristicRelationshipMVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public FloatArrayCharacteristicMVO addCharacteristicRelationshipItem(CharacteristicRelationshipMVO characteristicRelationshipItem) {
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
    FloatArrayCharacteristicMVO floatArrayCharacteristicMVO = (FloatArrayCharacteristicMVO) o;
    return Objects.equals(this.value, floatArrayCharacteristicMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloatArrayCharacteristicMVO {\n");
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

