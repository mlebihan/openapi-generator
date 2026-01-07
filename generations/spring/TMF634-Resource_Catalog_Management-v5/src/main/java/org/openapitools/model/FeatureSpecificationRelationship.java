package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * FeatureSpecificationRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FeatureSpecificationRelationship {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  /**
   * This is the type of the feature specification relationship.
   */
  public enum RelationshipTypeEnum {
    EXCLUDED("excluded"),
    
    INCLUDES("includes"),
    
    MAY_INCLUDE("may include"),
    
    REQUIRES("requires");

    private final String value;

    RelationshipTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RelationshipTypeEnum fromValue(String value) {
      for (RelationshipTypeEnum b : RelationshipTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable RelationshipTypeEnum relationshipType;

  private @Nullable String featureId;

  private @Nullable String parentSpecificationId;

  private @Nullable URI parentSpecificationHref;

  private @Nullable String name;

  private @Nullable TimePeriod validFor;

  public FeatureSpecificationRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureSpecificationRelationship(String atType) {
    this.atType = atType;
  }

  public FeatureSpecificationRelationship atType(String atType) {
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

  public FeatureSpecificationRelationship atBaseType(@Nullable String atBaseType) {
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

  public FeatureSpecificationRelationship atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public FeatureSpecificationRelationship relationshipType(@Nullable RelationshipTypeEnum relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * This is the type of the feature specification relationship.
   * @return relationshipType
   */
  
  @Schema(name = "relationshipType", description = "This is the type of the feature specification relationship.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public @Nullable RelationshipTypeEnum getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(@Nullable RelationshipTypeEnum relationshipType) {
    this.relationshipType = relationshipType;
  }

  public FeatureSpecificationRelationship featureId(@Nullable String featureId) {
    this.featureId = featureId;
    return this;
  }

  /**
   * Unique identifier of the target feature specification.
   * @return featureId
   */
  
  @Schema(name = "featureId", description = "Unique identifier of the target feature specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureId")
  public @Nullable String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(@Nullable String featureId) {
    this.featureId = featureId;
  }

  public FeatureSpecificationRelationship parentSpecificationId(@Nullable String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
    return this;
  }

  /**
   * Unique identifier of the parent specification containing the target feature
   * @return parentSpecificationId
   */
  
  @Schema(name = "parentSpecificationId", description = "Unique identifier of the parent specification containing the target feature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentSpecificationId")
  public @Nullable String getParentSpecificationId() {
    return parentSpecificationId;
  }

  public void setParentSpecificationId(@Nullable String parentSpecificationId) {
    this.parentSpecificationId = parentSpecificationId;
  }

  public FeatureSpecificationRelationship parentSpecificationHref(@Nullable URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
    return this;
  }

  /**
   * Hyperlink reference to the parent specification containing the target feature
   * @return parentSpecificationHref
   */
  @Valid 
  @Schema(name = "parentSpecificationHref", description = "Hyperlink reference to the parent specification containing the target feature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentSpecificationHref")
  public @Nullable URI getParentSpecificationHref() {
    return parentSpecificationHref;
  }

  public void setParentSpecificationHref(@Nullable URI parentSpecificationHref) {
    this.parentSpecificationHref = parentSpecificationHref;
  }

  public FeatureSpecificationRelationship name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name of the target feature specification.
   * @return name
   */
  
  @Schema(name = "name", description = "This is the name of the target feature specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public FeatureSpecificationRelationship validFor(@Nullable TimePeriod validFor) {
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
    FeatureSpecificationRelationship featureSpecificationRelationship = (FeatureSpecificationRelationship) o;
    return Objects.equals(this.atType, featureSpecificationRelationship.atType) &&
        Objects.equals(this.atBaseType, featureSpecificationRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, featureSpecificationRelationship.atSchemaLocation) &&
        Objects.equals(this.relationshipType, featureSpecificationRelationship.relationshipType) &&
        Objects.equals(this.featureId, featureSpecificationRelationship.featureId) &&
        Objects.equals(this.parentSpecificationId, featureSpecificationRelationship.parentSpecificationId) &&
        Objects.equals(this.parentSpecificationHref, featureSpecificationRelationship.parentSpecificationHref) &&
        Objects.equals(this.name, featureSpecificationRelationship.name) &&
        Objects.equals(this.validFor, featureSpecificationRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, relationshipType, featureId, parentSpecificationId, parentSpecificationHref, name, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationRelationship {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    featureId: ").append(toIndentedString(featureId)).append("\n");
    sb.append("    parentSpecificationId: ").append(toIndentedString(parentSpecificationId)).append("\n");
    sb.append("    parentSpecificationHref: ").append(toIndentedString(parentSpecificationHref)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

