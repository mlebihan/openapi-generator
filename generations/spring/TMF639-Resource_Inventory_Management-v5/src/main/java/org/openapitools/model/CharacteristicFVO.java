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
 * CharacteristicFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CharacteristicFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  private String name;

  private @Nullable String valueType;

  @Valid
  private List<CharacteristicRelationshipFVO> characteristicRelationship = new ArrayList<>();

  public CharacteristicFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicFVO(String atType, String name) {
    this.atType = atType;
    this.name = name;
  }

  public CharacteristicFVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public CharacteristicFVO atBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public @Nullable String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public CharacteristicFVO atSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public CharacteristicFVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the characteristic
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public CharacteristicFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Name of the characteristic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacteristicFVO valueType(@Nullable String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * Data type of the value of the characteristic
   * @return valueType
   */
  
  @Schema(name = "valueType", description = "Data type of the value of the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueType")
  public @Nullable String getValueType() {
    return valueType;
  }

  public void setValueType(@Nullable String valueType) {
    this.valueType = valueType;
  }

  public CharacteristicFVO characteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    this.characteristicRelationship = characteristicRelationship;
    return this;
  }

  public CharacteristicFVO addCharacteristicRelationshipItem(CharacteristicRelationshipFVO characteristicRelationshipItem) {
    if (this.characteristicRelationship == null) {
      this.characteristicRelationship = new ArrayList<>();
    }
    this.characteristicRelationship.add(characteristicRelationshipItem);
    return this;
  }

  /**
   * Collection of characteristic relationships
   * @return characteristicRelationship
   */
  @Valid 
  @Schema(name = "characteristicRelationship", description = "Collection of characteristic relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristicRelationship")
  public List<CharacteristicRelationshipFVO> getCharacteristicRelationship() {
    return characteristicRelationship;
  }

  public void setCharacteristicRelationship(List<CharacteristicRelationshipFVO> characteristicRelationship) {
    this.characteristicRelationship = characteristicRelationship;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicFVO characteristicFVO = (CharacteristicFVO) o;
    return Objects.equals(this.atType, characteristicFVO.atType) &&
        Objects.equals(this.atBaseType, characteristicFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicFVO.atSchemaLocation) &&
        Objects.equals(this.id, characteristicFVO.id) &&
        Objects.equals(this.name, characteristicFVO.name) &&
        Objects.equals(this.valueType, characteristicFVO.valueType) &&
        Objects.equals(this.characteristicRelationship, characteristicFVO.characteristicRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, name, valueType, characteristicRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    characteristicRelationship: ").append(toIndentedString(characteristicRelationship)).append("\n");
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

