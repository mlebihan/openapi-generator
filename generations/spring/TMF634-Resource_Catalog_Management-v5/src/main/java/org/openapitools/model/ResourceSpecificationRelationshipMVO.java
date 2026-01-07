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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSpecificationMVO;
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
 * ResourceSpecificationRelationshipMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceSpecificationRelationshipMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String relationshipType;

  private @Nullable String role;

  private @Nullable String id;

  private @Nullable URI href;

  private @Nullable String name;

  private @Nullable Integer defaultQuantity;

  private @Nullable Integer maximumQuantity;

  private @Nullable Integer minimumQuantity;

  @Valid
  private List<CharacteristicSpecificationMVO> characteristic = new ArrayList<>();

  private @Nullable TimePeriod validFor;

  public ResourceSpecificationRelationshipMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceSpecificationRelationshipMVO(String atType) {
    this.atType = atType;
  }

  public ResourceSpecificationRelationshipMVO atType(String atType) {
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

  public ResourceSpecificationRelationshipMVO atBaseType(@Nullable String atBaseType) {
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

  public ResourceSpecificationRelationshipMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ResourceSpecificationRelationshipMVO relationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as migration, substitution, dependency, exclusivity
   * @return relationshipType
   */
  
  @Schema(name = "relationshipType", description = "Type of relationship such as migration, substitution, dependency, exclusivity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public @Nullable String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public ResourceSpecificationRelationshipMVO role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this resource specification
   * @return role
   */
  
  @Schema(name = "role", description = "The association role for this resource specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable String getRole() {
    return role;
  }

  public void setRole(@Nullable String role) {
    this.role = role;
  }

  public ResourceSpecificationRelationshipMVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of target ResourceSpecification
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of target ResourceSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ResourceSpecificationRelationshipMVO href(@Nullable URI href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the target ResourceSpecification
   * @return href
   */
  @Valid 
  @Schema(name = "href", description = "Reference of the target ResourceSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable URI getHref() {
    return href;
  }

  public void setHref(@Nullable URI href) {
    this.href = href;
  }

  public ResourceSpecificationRelationshipMVO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name given to the target resource specification instance
   * @return name
   */
  
  @Schema(name = "name", description = "The name given to the target resource specification instance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ResourceSpecificationRelationshipMVO defaultQuantity(@Nullable Integer defaultQuantity) {
    this.defaultQuantity = defaultQuantity;
    return this;
  }

  /**
   * The default number of the related resource that should be instantiated, for example a rack would typically have 4 cards, although it could support more.
   * @return defaultQuantity
   */
  
  @Schema(name = "defaultQuantity", description = "The default number of the related resource that should be instantiated, for example a rack would typically have 4 cards, although it could support more.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultQuantity")
  public @Nullable Integer getDefaultQuantity() {
    return defaultQuantity;
  }

  public void setDefaultQuantity(@Nullable Integer defaultQuantity) {
    this.defaultQuantity = defaultQuantity;
  }

  public ResourceSpecificationRelationshipMVO maximumQuantity(@Nullable Integer maximumQuantity) {
    this.maximumQuantity = maximumQuantity;
    return this;
  }

  /**
   * The maximum number of the related resource that should be instantiated, for example a rack supports a maximum of 16 cards
   * @return maximumQuantity
   */
  
  @Schema(name = "maximumQuantity", description = "The maximum number of the related resource that should be instantiated, for example a rack supports a maximum of 16 cards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maximumQuantity")
  public @Nullable Integer getMaximumQuantity() {
    return maximumQuantity;
  }

  public void setMaximumQuantity(@Nullable Integer maximumQuantity) {
    this.maximumQuantity = maximumQuantity;
  }

  public ResourceSpecificationRelationshipMVO minimumQuantity(@Nullable Integer minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
    return this;
  }

  /**
   * The minimum number of the related resource that should be instantiated, for example a rack must have at least 1 card
   * @return minimumQuantity
   */
  
  @Schema(name = "minimumQuantity", description = "The minimum number of the related resource that should be instantiated, for example a rack must have at least 1 card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimumQuantity")
  public @Nullable Integer getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(@Nullable Integer minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  public ResourceSpecificationRelationshipMVO characteristic(List<CharacteristicSpecificationMVO> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public ResourceSpecificationRelationshipMVO addCharacteristicItem(CharacteristicSpecificationMVO characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * A characteristic that refines the relationship. For example, consider the relationship between a slot and a card. For a half-height card it is important to know the position at which the card is inserted, so a characteristic Position might be defined on the relationship to allow capturing of this in the inventory
   * @return characteristic
   */
  @Valid 
  @Schema(name = "characteristic", description = "A characteristic that refines the relationship. For example, consider the relationship between a slot and a card. For a half-height card it is important to know the position at which the card is inserted, so a characteristic Position might be defined on the relationship to allow capturing of this in the inventory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristic")
  public List<CharacteristicSpecificationMVO> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<CharacteristicSpecificationMVO> characteristic) {
    this.characteristic = characteristic;
  }

  public ResourceSpecificationRelationshipMVO validFor(@Nullable TimePeriod validFor) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceSpecificationRelationshipMVO resourceSpecificationRelationshipMVO = (ResourceSpecificationRelationshipMVO) o;
    return Objects.equals(this.atType, resourceSpecificationRelationshipMVO.atType) &&
        Objects.equals(this.atBaseType, resourceSpecificationRelationshipMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceSpecificationRelationshipMVO.atSchemaLocation) &&
        Objects.equals(this.relationshipType, resourceSpecificationRelationshipMVO.relationshipType) &&
        Objects.equals(this.role, resourceSpecificationRelationshipMVO.role) &&
        Objects.equals(this.id, resourceSpecificationRelationshipMVO.id) &&
        Objects.equals(this.href, resourceSpecificationRelationshipMVO.href) &&
        Objects.equals(this.name, resourceSpecificationRelationshipMVO.name) &&
        Objects.equals(this.defaultQuantity, resourceSpecificationRelationshipMVO.defaultQuantity) &&
        Objects.equals(this.maximumQuantity, resourceSpecificationRelationshipMVO.maximumQuantity) &&
        Objects.equals(this.minimumQuantity, resourceSpecificationRelationshipMVO.minimumQuantity) &&
        Objects.equals(this.characteristic, resourceSpecificationRelationshipMVO.characteristic) &&
        Objects.equals(this.validFor, resourceSpecificationRelationshipMVO.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, relationshipType, role, id, href, name, defaultQuantity, maximumQuantity, minimumQuantity, characteristic, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceSpecificationRelationshipMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultQuantity: ").append(toIndentedString(defaultQuantity)).append("\n");
    sb.append("    maximumQuantity: ").append(toIndentedString(maximumQuantity)).append("\n");
    sb.append("    minimumQuantity: ").append(toIndentedString(minimumQuantity)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

