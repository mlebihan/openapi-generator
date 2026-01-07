package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.FeatureRelationship;
import org.openapitools.model.PolicyRef;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Feature
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Feature {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable Boolean isBundle;

  @Valid
  private List<FeatureRelationship> featureRelationship = new ArrayList<>();

  @Valid
  private List<Characteristic> featureCharacteristic = new ArrayList<>();

  @Valid
  private List<PolicyRef> policyConstraint = new ArrayList<>();

  private @Nullable Boolean isEnabled;

  private @Nullable String id;

  private @Nullable String name;

  public Feature() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Feature(String atType) {
    this.atType = atType;
  }

  public Feature atType(String atType) {
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

  public Feature atBaseType(@Nullable String atBaseType) {
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

  public Feature atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public Feature isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * True if this is a feature group. Default is false.
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "True if this is a feature group. Default is false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public @Nullable Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public Feature featureRelationship(List<FeatureRelationship> featureRelationship) {
    this.featureRelationship = featureRelationship;
    return this;
  }

  public Feature addFeatureRelationshipItem(FeatureRelationship featureRelationshipItem) {
    if (this.featureRelationship == null) {
      this.featureRelationship = new ArrayList<>();
    }
    this.featureRelationship.add(featureRelationshipItem);
    return this;
  }

  /**
   * Collection of feature relationships
   * @return featureRelationship
   */
  @Valid 
  @Schema(name = "featureRelationship", description = "Collection of feature relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureRelationship")
  public List<FeatureRelationship> getFeatureRelationship() {
    return featureRelationship;
  }

  public void setFeatureRelationship(List<FeatureRelationship> featureRelationship) {
    this.featureRelationship = featureRelationship;
  }

  public Feature featureCharacteristic(List<Characteristic> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
    return this;
  }

  public Feature addFeatureCharacteristicItem(Characteristic featureCharacteristicItem) {
    if (this.featureCharacteristic == null) {
      this.featureCharacteristic = new ArrayList<>();
    }
    this.featureCharacteristic.add(featureCharacteristicItem);
    return this;
  }

  /**
   * This is a list of Characteristics for a particular feature.
   * @return featureCharacteristic
   */
  @Valid 
  @Schema(name = "featureCharacteristic", description = "This is a list of Characteristics for a particular feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureCharacteristic")
  public List<Characteristic> getFeatureCharacteristic() {
    return featureCharacteristic;
  }

  public void setFeatureCharacteristic(List<Characteristic> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
  }

  public Feature policyConstraint(List<PolicyRef> policyConstraint) {
    this.policyConstraint = policyConstraint;
    return this;
  }

  public Feature addPolicyConstraintItem(PolicyRef policyConstraintItem) {
    if (this.policyConstraint == null) {
      this.policyConstraint = new ArrayList<>();
    }
    this.policyConstraint.add(policyConstraintItem);
    return this;
  }

  /**
   * Reference to manage a list of feature specification policy constraints
   * @return policyConstraint
   */
  @Valid 
  @Schema(name = "policyConstraint", description = "Reference to manage a list of feature specification policy constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyConstraint")
  public List<PolicyRef> getPolicyConstraint() {
    return policyConstraint;
  }

  public void setPolicyConstraint(List<PolicyRef> policyConstraint) {
    this.policyConstraint = policyConstraint;
  }

  public Feature isEnabled(@Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * True if this feature is enabled. Default is true.
   * @return isEnabled
   */
  
  @Schema(name = "isEnabled", description = "True if this feature is enabled. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEnabled")
  public @Nullable Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(@Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public Feature id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Feature name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name for the feature.
   * @return name
   */
  
  @Schema(name = "name", description = "This is the name for the feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.atType, feature.atType) &&
        Objects.equals(this.atBaseType, feature.atBaseType) &&
        Objects.equals(this.atSchemaLocation, feature.atSchemaLocation) &&
        Objects.equals(this.isBundle, feature.isBundle) &&
        Objects.equals(this.featureRelationship, feature.featureRelationship) &&
        Objects.equals(this.featureCharacteristic, feature.featureCharacteristic) &&
        Objects.equals(this.policyConstraint, feature.policyConstraint) &&
        Objects.equals(this.isEnabled, feature.isEnabled) &&
        Objects.equals(this.id, feature.id) &&
        Objects.equals(this.name, feature.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, isBundle, featureRelationship, featureCharacteristic, policyConstraint, isEnabled, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    featureRelationship: ").append(toIndentedString(featureRelationship)).append("\n");
    sb.append("    featureCharacteristic: ").append(toIndentedString(featureCharacteristic)).append("\n");
    sb.append("    policyConstraint: ").append(toIndentedString(policyConstraint)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

