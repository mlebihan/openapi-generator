package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AssociationSpecificationRefFVO;
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
 * A migration, substitution, dependency or exclusivity relationship between/among entity specifications.
 */

@Schema(name = "EntitySpecificationRelationship_FVO", description = "A migration, substitution, dependency or exclusivity relationship between/among entity specifications.")
@JsonTypeName("EntitySpecificationRelationship_FVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class EntitySpecificationRelationshipFVO {

  private @Nullable String href;

  private @Nullable String name;

  private String role;

  private TimePeriod validFor;

  private AssociationSpecificationRefFVO associationSpec;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private String relationshipType;

  public EntitySpecificationRelationshipFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntitySpecificationRelationshipFVO(String role, TimePeriod validFor, AssociationSpecificationRefFVO associationSpec, String relationshipType) {
    this.role = role;
    this.validFor = validFor;
    this.associationSpec = associationSpec;
    this.relationshipType = relationshipType;
  }

  public EntitySpecificationRelationshipFVO href(@Nullable String href) {
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

  public EntitySpecificationRelationshipFVO name(@Nullable String name) {
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

  public EntitySpecificationRelationshipFVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The association role for this entity specification
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "The association role for this entity specification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public EntitySpecificationRelationshipFVO validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @NotNull @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public EntitySpecificationRelationshipFVO associationSpec(AssociationSpecificationRefFVO associationSpec) {
    this.associationSpec = associationSpec;
    return this;
  }

  /**
   * Get associationSpec
   * @return associationSpec
   */
  @NotNull @Valid 
  @Schema(name = "associationSpec", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("associationSpec")
  public AssociationSpecificationRefFVO getAssociationSpec() {
    return associationSpec;
  }

  public void setAssociationSpec(AssociationSpecificationRefFVO associationSpec) {
    this.associationSpec = associationSpec;
  }

  public EntitySpecificationRelationshipFVO atBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * Get atBaseType
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public @Nullable String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public EntitySpecificationRelationshipFVO atSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * Get atSchemaLocation
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public EntitySpecificationRelationshipFVO relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of relationship such as migration, substitution, dependency, exclusivity
   * @return relationshipType
   */
  @NotNull 
  @Schema(name = "relationshipType", description = "Type of relationship such as migration, substitution, dependency, exclusivity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitySpecificationRelationshipFVO entitySpecificationRelationshipFVO = (EntitySpecificationRelationshipFVO) o;
    return Objects.equals(this.href, entitySpecificationRelationshipFVO.href) &&
        Objects.equals(this.name, entitySpecificationRelationshipFVO.name) &&
        Objects.equals(this.role, entitySpecificationRelationshipFVO.role) &&
        Objects.equals(this.validFor, entitySpecificationRelationshipFVO.validFor) &&
        Objects.equals(this.associationSpec, entitySpecificationRelationshipFVO.associationSpec) &&
        Objects.equals(this.atBaseType, entitySpecificationRelationshipFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, entitySpecificationRelationshipFVO.atSchemaLocation) &&
        Objects.equals(this.relationshipType, entitySpecificationRelationshipFVO.relationshipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, name, role, validFor, associationSpec, atBaseType, atSchemaLocation, relationshipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitySpecificationRelationshipFVO {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    associationSpec: ").append(toIndentedString(associationSpec)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

