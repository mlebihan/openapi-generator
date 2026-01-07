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
import org.openapitools.model.CharacteristicFVO;
import org.openapitools.model.CharacteristicRelationshipFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ObjectArrayCharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ObjectArrayCharacteristicFVO extends CharacteristicFVO {

  @Valid
  private List<Object> value = new ArrayList<>();

  public ObjectArrayCharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ObjectArrayCharacteristicFVO(List<Object> value, String atType, String name) {
    super(atType, name);
    this.value = value;
  }

  public ObjectArrayCharacteristicFVO value(List<Object> value) {
    this.value = value;
    return this;
  }

  public ObjectArrayCharacteristicFVO addValueItem(Object valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Collection of characteristic values
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "Collection of characteristic values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public List<Object> getValue() {
    return value;
  }

  public void setValue(List<Object> value) {
    this.value = value;
  }


  public ObjectArrayCharacteristicFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ObjectArrayCharacteristicFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ObjectArrayCharacteristicFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ObjectArrayCharacteristicFVO id(String id) {
    super.id(id);
    return this;
  }

  public ObjectArrayCharacteristicFVO name(String name) {
    super.name(name);
    return this;
  }

  public ObjectArrayCharacteristicFVO valueType(String valueType) {
    super.valueType(valueType);
    return this;
  }

  public ObjectArrayCharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    super.characteristicRelationship(characteristicRelationship);
    return this;
  }

  public ObjectArrayCharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
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
    ObjectArrayCharacteristicFVO objectArrayCharacteristicFVO = (ObjectArrayCharacteristicFVO) o;
    return Objects.equals(this.value, objectArrayCharacteristicFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectArrayCharacteristicFVO {\n");
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

