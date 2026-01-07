package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * CharacteristicSpecificationRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CharacteristicSpecificationRelationship {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String relationshipType;

  private @Nullable String name;

  private @Nullable String characteristicSpecificationId;

  private @Nullable URI parentSpecificationHref;

  private @Nullable TimePeriod validFor;

  private @Nullable String parentSpecificationId;

  public CharacteristicSpecificationRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicSpecificationRelationship(String atType) {
    this.atType = atType;
  }

  public CharacteristicSpecificationRelationship atType(String atType) {
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

  public CharacteristicSpecificationRelationship atBaseType(@Nullable String atBaseType) {
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

  public CharacteristicSpecificationRelationship atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public CharacteristicSpecificationRelationship relationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as aggregation, migration, substitution, dependency, exclusivity
   * @return relationshipType
   */
  
  @Schema(name = "relationshipType", description = "Type of relationship such as aggregation, migration, substitution, dependency, exclusivity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public @Nullable String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public CharacteristicSpecificationRelationship name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the target characteristic within the specification
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the target characteristic within the specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CharacteristicSpecificationRelationship characteristicSpecificationId(@Nullable String characteristicSpecificationId) {
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

  public CharacteristicSpecificationRelationship parentSpecificationHref(@Nullable URI parentSpecificationHref) {
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

  public CharacteristicSpecificationRelationship validFor(@Nullable TimePeriod validFor) {
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

  public CharacteristicSpecificationRelationship parentSpecificationId(@Nullable String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the parent specification containing the target characteristic
   * @return parentSpecificationId
   */
  
  @Schema(name = "parentSpecificationId", description = "Unique identifier of the parent specification containing the target characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentSpecificationId")
  public @Nullable String getParentSpecificationId() {
    return parentSpecificationId;
  }

  public void setParentSpecificationId(@Nullable String parentSpecificationId) {
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
    CharacteristicSpecificationRelationship characteristicSpecificationRelationship = (CharacteristicSpecificationRelationship) o;
    return Objects.equals(this.atType, characteristicSpecificationRelationship.atType) &&
        Objects.equals(this.atBaseType, characteristicSpecificationRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicSpecificationRelationship.atSchemaLocation) &&
        Objects.equals(this.relationshipType, characteristicSpecificationRelationship.relationshipType) &&
        Objects.equals(this.name, characteristicSpecificationRelationship.name) &&
        Objects.equals(this.characteristicSpecificationId, characteristicSpecificationRelationship.characteristicSpecificationId) &&
        Objects.equals(this.parentSpecificationHref, characteristicSpecificationRelationship.parentSpecificationHref) &&
        Objects.equals(this.validFor, characteristicSpecificationRelationship.validFor) &&
        Objects.equals(this.parentSpecificationId, characteristicSpecificationRelationship.parentSpecificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, relationshipType, name, characteristicSpecificationId, parentSpecificationHref, validFor, parentSpecificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecificationRelationship {\n");
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

