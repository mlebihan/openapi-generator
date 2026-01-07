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
 * BooleanArrayCharacteristicMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class BooleanArrayCharacteristicMVO extends CharacteristicMVO {

  @Valid
  private List<Boolean> value = new ArrayList<>();

  public BooleanArrayCharacteristicMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BooleanArrayCharacteristicMVO(List<Boolean> value, String atType) {
    super(atType);
    this.value = value;
  }

  public BooleanArrayCharacteristicMVO value(List<Boolean> value) {
    this.value = value;
    return this;
  }

  public BooleanArrayCharacteristicMVO addValueItem(Boolean valueItem) {
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
  public List<Boolean> getValue() {
    return value;
  }

  public void setValue(List<Boolean> value) {
    this.value = value;
  }


  public BooleanArrayCharacteristicMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BooleanArrayCharacteristicMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BooleanArrayCharacteristicMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BooleanArrayCharacteristicMVO id(String id) {
    super.id(id);
    return this;
  }

  public BooleanArrayCharacteristicMVO name(String name) {
    super.name(name);
    return this;
  }

  public BooleanArrayCharacteristicMVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public BooleanArrayCharacteristicMVO characteristicRelationship(List<CharacteristicRelationshipMVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public BooleanArrayCharacteristicMVO addCharacteristicRelationshipItem(CharacteristicRelationshipMVO characteristicRelationshipItem) {
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
    BooleanArrayCharacteristicMVO booleanArrayCharacteristicMVO = (BooleanArrayCharacteristicMVO) o;
    return Objects.equals(this.value, booleanArrayCharacteristicMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooleanArrayCharacteristicMVO {\n");
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

