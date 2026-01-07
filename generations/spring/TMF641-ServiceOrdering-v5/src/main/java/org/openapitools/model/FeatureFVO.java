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
import org.openapitools.model.FeatureRelationshipFVO;
import org.openapitools.model.PolicyRefFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FeatureFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable Boolean isBundle;

  @Valid
  private List<FeatureRelationshipFVO> featureRelationship = new ArrayList<>();

  @Valid
  private List<CharacteristicFVO> featureCharacteristic = new ArrayList<>();

  @Valid
  private List<PolicyRefFVO> policyConstraint = new ArrayList<>();

  private @Nullable Boolean isEnabled;

  private @Nullable String id;

  private String name;

  public FeatureFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureFVO(String atType, String name) {
    this.atType = atType;
    this.name = name;
  }

  public FeatureFVO atType(String atType) {
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

  public FeatureFVO atBaseType(@Nullable String atBaseType) {
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

  public FeatureFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public FeatureFVO isBundle(@Nullable Boolean isBundle) {
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

  public FeatureFVO featureRelationship(List<FeatureRelationshipFVO> featureRelationship) {
    this.featureRelationship = featureRelationship;
    return this;
  }

  public FeatureFVO addFeatureRelationshipItem(FeatureRelationshipFVO featureRelationshipItem) {
    if (this.featureRelationship == null) {
      this.featureRelationship = new ArrayList<>();
    }
    this.featureRelationship.add(featureRelationshipItem);
    return this;
  }

  /**
   * Get featureRelationship
   * @return featureRelationship
   */
  @Valid 
  @Schema(name = "featureRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureRelationship")
  public List<FeatureRelationshipFVO> getFeatureRelationship() {
    return featureRelationship;
  }

  public void setFeatureRelationship(List<FeatureRelationshipFVO> featureRelationship) {
    this.featureRelationship = featureRelationship;
  }

  public FeatureFVO featureCharacteristic(List<CharacteristicFVO> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
    return this;
  }

  public FeatureFVO addFeatureCharacteristicItem(CharacteristicFVO featureCharacteristicItem) {
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
  public List<CharacteristicFVO> getFeatureCharacteristic() {
    return featureCharacteristic;
  }

  public void setFeatureCharacteristic(List<CharacteristicFVO> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
  }

  public FeatureFVO policyConstraint(List<PolicyRefFVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
    return this;
  }

  public FeatureFVO addPolicyConstraintItem(PolicyRefFVO policyConstraintItem) {
    if (this.policyConstraint == null) {
      this.policyConstraint = new ArrayList<>();
    }
    this.policyConstraint.add(policyConstraintItem);
    return this;
  }

  /**
   * Reference to mangage a list of feature specification policy constraints
   * @return policyConstraint
   */
  @Valid 
  @Schema(name = "policyConstraint", description = "Reference to mangage a list of feature specification policy constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyConstraint")
  public List<PolicyRefFVO> getPolicyConstraint() {
    return policyConstraint;
  }

  public void setPolicyConstraint(List<PolicyRefFVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
  }

  public FeatureFVO isEnabled(@Nullable Boolean isEnabled) {
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

  public FeatureFVO id(@Nullable String id) {
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

  public FeatureFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * This is the name for the feature.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "This is the name for the feature.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
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
    FeatureFVO featureFVO = (FeatureFVO) o;
    return Objects.equals(this.atType, featureFVO.atType) &&
        Objects.equals(this.atBaseType, featureFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, featureFVO.atSchemaLocation) &&
        Objects.equals(this.isBundle, featureFVO.isBundle) &&
        Objects.equals(this.featureRelationship, featureFVO.featureRelationship) &&
        Objects.equals(this.featureCharacteristic, featureFVO.featureCharacteristic) &&
        Objects.equals(this.policyConstraint, featureFVO.policyConstraint) &&
        Objects.equals(this.isEnabled, featureFVO.isEnabled) &&
        Objects.equals(this.id, featureFVO.id) &&
        Objects.equals(this.name, featureFVO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, isBundle, featureRelationship, featureCharacteristic, policyConstraint, isEnabled, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFVO {\n");
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

