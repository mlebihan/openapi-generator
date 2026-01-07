package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
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
 * CharacteristicSpecificationRelationshipFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CharacteristicSpecificationRelationshipFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private String relationshipType;

  private String name;

  private @Nullable String characteristicSpecificationId;

  private @Nullable URI parentSpecificationHref;

  private @Nullable TimePeriod validFor;

  private String parentSpecificationId;

  public CharacteristicSpecificationRelationshipFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicSpecificationRelationshipFVO(String atType, String relationshipType, String name, String parentSpecificationId) {
    this.atType = atType;
    this.relationshipType = relationshipType;
    this.name = name;
    this.parentSpecificationId = parentSpecificationId;
  }

  public CharacteristicSpecificationRelationshipFVO atType(String atType) {
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

  public CharacteristicSpecificationRelationshipFVO atBaseType(@Nullable String atBaseType) {
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

  public CharacteristicSpecificationRelationshipFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public CharacteristicSpecificationRelationshipFVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   * @return relationshipType
   */
  @NotNull 
  @Schema(name = "relationshipType", description = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public CharacteristicSpecificationRelationshipFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the target characteristic within the specification
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Name of the target characteristic within the specification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacteristicSpecificationRelationshipFVO characteristicSpecificationId(@Nullable String characteristicSpecificationId) {
    this.characteristicSpecificationId = characteristicSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the characteristic within the specification
   * @return characteristicSpecificationId
   */
  
  @Schema(name = "characteristicSpecificationId", description = "Unique identifier of the characteristic within the specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristicSpecificationId")
  public @Nullable String getCharacteristicSpecificationId() {
    return characteristicSpecificationId;
  }

  public void setCharacteristicSpecificationId(@Nullable String characteristicSpecificationId) {
    this.characteristicSpecificationId = characteristicSpecificationId;
  }

  public CharacteristicSpecificationRelationshipFVO parentSpecificationHref(@Nullable URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
    return this;
  }

  /**
   * Hyperlink reference to the parent specification containing the target characteristic
   * @return parentSpecificationHref
   */
  @Valid 
  @Schema(name = "parentSpecificationHref", description = "Hyperlink reference to the parent specification containing the target characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentSpecificationHref")
  public @Nullable URI getParentSpecificationHref() {
    return parentSpecificationHref;
  }

  public void setParentSpecificationHref(@Nullable URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
  }

  public CharacteristicSpecificationRelationshipFVO validFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public @Nullable TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
  }

  public CharacteristicSpecificationRelationshipFVO parentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the parent specification containing the target characteristic
   * @return parentSpecificationId
   */
  @NotNull 
  @Schema(name = "parentSpecificationId", description = "Unique identifier of the parent specification containing the target characteristic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parentSpecificationId")
  public String getParentSpecificationId() {
    return parentSpecificationId;
  }

  public void setParentSpecificationId(String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicSpecificationRelationshipFVO characteristicSpecificationRelationshipFVO = (CharacteristicSpecificationRelationshipFVO) o;
    return Objects.equals(this.atType, characteristicSpecificationRelationshipFVO.atType) &&
        Objects.equals(this.atBaseType, characteristicSpecificationRelationshipFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicSpecificationRelationshipFVO.atSchemaLocation) &&
        Objects.equals(this.relationshipType, characteristicSpecificationRelationshipFVO.relationshipType) &&
        Objects.equals(this.name, characteristicSpecificationRelationshipFVO.name) &&
        Objects.equals(this.characteristicSpecificationId, characteristicSpecificationRelationshipFVO.characteristicSpecificationId) &&
        Objects.equals(this.parentSpecificationHref, characteristicSpecificationRelationshipFVO.parentSpecificationHref) &&
        Objects.equals(this.validFor, characteristicSpecificationRelationshipFVO.validFor) &&
        Objects.equals(this.parentSpecificationId, characteristicSpecificationRelationshipFVO.parentSpecificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, relationshipType, name, characteristicSpecificationId, parentSpecificationHref, validFor, parentSpecificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecificationRelationshipFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    characteristicSpecificationId: ").append(toIndentedString(characteristicSpecificationId)).append("\n");
    sb.append("    parentSpecificationHref: ").append(toIndentedString(parentSpecificationHref)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    parentSpecificationId: ").append(toIndentedString(parentSpecificationId)).append("\n");
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

