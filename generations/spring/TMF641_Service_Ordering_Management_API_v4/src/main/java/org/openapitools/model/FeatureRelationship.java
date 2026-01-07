package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Configuration feature
 */

@Schema(name = "FeatureRelationship", description = "Configuration feature")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FeatureRelationship {

  private @Nullable String id;

  private String name;

  private String relationshipType;

  private @Nullable TimePeriod validFor;

  public FeatureRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureRelationship(String name, String relationshipType) {
    this.name = name;
    this.relationshipType = relationshipType;
  }

  public FeatureRelationship id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the target feature.
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of the target feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public FeatureRelationship name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name of the target feature.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "This is the name of the target feature.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureRelationship relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * This is the type of the feature relationship.
   * @return relationshipType
   */
  @NotNull 
  @Schema(name = "relationshipType", description = "This is the type of the feature relationship.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relationshipType")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public FeatureRelationship validFor(@Nullable TimePeriod validFor) {
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
    FeatureRelationship featureRelationship = (FeatureRelationship) o;
    return Objects.equals(this.id, featureRelationship.id) &&
        Objects.equals(this.name, featureRelationship.name) &&
        Objects.equals(this.relationshipType, featureRelationship.relationshipType) &&
        Objects.equals(this.validFor, featureRelationship.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, relationshipType, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureRelationship {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

