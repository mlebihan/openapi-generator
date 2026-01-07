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
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.FeatureRelationshipMVO;
import org.openapitools.model.PolicyRefMVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FeatureMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable Boolean isBundle;

  @Valid
  private List<FeatureRelationshipMVO> featureRelationship = new ArrayList<>();

  @Valid
  private List<CharacteristicMVO> featureCharacteristic = new ArrayList<>();

  @Valid
  private List<PolicyRefMVO> policyConstraint = new ArrayList<>();

  private @Nullable Boolean isEnabled;

  private @Nullable String id;

  private @Nullable String name;

  public FeatureMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureMVO(String atType) {
    this.atType = atType;
  }

  public FeatureMVO atType(String atType) {
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

  public FeatureMVO atBaseType(@Nullable String atBaseType) {
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

  public FeatureMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public FeatureMVO isBundle(@Nullable Boolean isBundle) {
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

  public FeatureMVO featureRelationship(List<FeatureRelationshipMVO> featureRelationship) {
    this.featureRelationship = featureRelationship;
    return this;
  }

  public FeatureMVO addFeatureRelationshipItem(FeatureRelationshipMVO featureRelationshipItem) {
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
  public List<FeatureRelationshipMVO> getFeatureRelationship() {
    return featureRelationship;
  }

  public void setFeatureRelationship(List<FeatureRelationshipMVO> featureRelationship) {
    this.featureRelationship = featureRelationship;
  }

  public FeatureMVO featureCharacteristic(List<CharacteristicMVO> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
    return this;
  }

  public FeatureMVO addFeatureCharacteristicItem(CharacteristicMVO featureCharacteristicItem) {
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
  public List<CharacteristicMVO> getFeatureCharacteristic() {
    return featureCharacteristic;
  }

  public void setFeatureCharacteristic(List<CharacteristicMVO> featureCharacteristic) {
    this.featureCharacteristic = featureCharacteristic;
  }

  public FeatureMVO policyConstraint(List<PolicyRefMVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
    return this;
  }

  public FeatureMVO addPolicyConstraintItem(PolicyRefMVO policyConstraintItem) {
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
  public List<PolicyRefMVO> getPolicyConstraint() {
    return policyConstraint;
  }

  public void setPolicyConstraint(List<PolicyRefMVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
  }

  public FeatureMVO isEnabled(@Nullable Boolean isEnabled) {
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

  public FeatureMVO id(@Nullable String id) {
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

  public FeatureMVO name(@Nullable String name) {
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
    FeatureMVO featureMVO = (FeatureMVO) o;
    return Objects.equals(this.atType, featureMVO.atType) &&
        Objects.equals(this.atBaseType, featureMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, featureMVO.atSchemaLocation) &&
        Objects.equals(this.isBundle, featureMVO.isBundle) &&
        Objects.equals(this.featureRelationship, featureMVO.featureRelationship) &&
        Objects.equals(this.featureCharacteristic, featureMVO.featureCharacteristic) &&
        Objects.equals(this.policyConstraint, featureMVO.policyConstraint) &&
        Objects.equals(this.isEnabled, featureMVO.isEnabled) &&
        Objects.equals(this.id, featureMVO.id) &&
        Objects.equals(this.name, featureMVO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, isBundle, featureRelationship, featureCharacteristic, policyConstraint, isEnabled, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureMVO {\n");
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

