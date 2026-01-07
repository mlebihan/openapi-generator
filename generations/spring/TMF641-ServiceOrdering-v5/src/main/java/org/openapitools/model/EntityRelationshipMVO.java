package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.EntityRef;
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
 * A uni-directionmal relationship from this entity to a target entity instance
 */

@Schema(name = "EntityRelationship_MVO", description = "A uni-directionmal relationship from this entity to a target entity instance")
@JsonTypeName("EntityRelationship_MVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class EntityRelationshipMVO {

  private @Nullable String href;

  private @Nullable String name;

  private @Nullable String role;

  private @Nullable TimePeriod validFor;

  private @Nullable EntityRef associationSpec;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String relationshipType;

  private @Nullable String id;

  private @Nullable String atReferredType;

  private @Nullable String atType;

  public EntityRelationshipMVO href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
   */
  
  @Schema(name = "href", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public EntityRelationshipMVO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public EntityRelationshipMVO role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this entity
   * @return role
   */
  
  @Schema(name = "role", description = "The association role for this entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable String getRole() {
    return role;
  }

  public void setRole(@Nullable String role) {
    this.role = role;
  }

  public EntityRelationshipMVO validFor(@Nullable TimePeriod validFor) {
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

  public EntityRelationshipMVO associationSpec(@Nullable EntityRef associationSpec) {
    this.associationSpec = associationSpec;
    return this;
  }

  /**
   * Get associationSpec
   * @return associationSpec
   */
  @Valid 
  @Schema(name = "associationSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associationSpec")
  public @Nullable EntityRef getAssociationSpec() {
    return associationSpec;
  }

  public void setAssociationSpec(@Nullable EntityRef associationSpec) {
    this.associationSpec = associationSpec;
  }

  public EntityRelationshipMVO atBaseType(@Nullable String atBaseType) {
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

  public EntityRelationshipMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public EntityRelationshipMVO relationshipType(@Nullable String relationshipType) {
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

  public EntityRelationshipMVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public EntityRelationshipMVO atReferredType(@Nullable String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * Get atReferredType
   * @return atReferredType
   */
  
  @Schema(name = "@referredType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public @Nullable String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(@Nullable String atReferredType) {
    this.atReferredType = atReferredType;
  }

  public EntityRelationshipMVO atType(@Nullable String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Get atType
   * @return atType
   */
  
  @Schema(name = "@type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public @Nullable String getAtType() {
    return atType;
  }

  public void setAtType(@Nullable String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRelationshipMVO entityRelationshipMVO = (EntityRelationshipMVO) o;
    return Objects.equals(this.href, entityRelationshipMVO.href) &&
        Objects.equals(this.name, entityRelationshipMVO.name) &&
        Objects.equals(this.role, entityRelationshipMVO.role) &&
        Objects.equals(this.validFor, entityRelationshipMVO.validFor) &&
        Objects.equals(this.associationSpec, entityRelationshipMVO.associationSpec) &&
        Objects.equals(this.atBaseType, entityRelationshipMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, entityRelationshipMVO.atSchemaLocation) &&
        Objects.equals(this.relationshipType, entityRelationshipMVO.relationshipType) &&
        Objects.equals(this.id, entityRelationshipMVO.id) &&
        Objects.equals(this.atReferredType, entityRelationshipMVO.atReferredType) &&
        Objects.equals(this.atType, entityRelationshipMVO.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, name, role, validFor, associationSpec, atBaseType, atSchemaLocation, relationshipType, id, atReferredType, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRelationshipMVO {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    associationSpec: ").append(toIndentedString(associationSpec)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

