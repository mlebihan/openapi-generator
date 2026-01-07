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
import org.openapitools.model.CharacteristicSpecificationMVO;
import org.openapitools.model.FeatureSpecificationRelationshipMVO;
import org.openapitools.model.PolicyRefMVO;
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
 * FeatureSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FeatureSpecificationMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String version;

  private @Nullable String id;

  private @Nullable Boolean isBundle;

  private @Nullable TimePeriod validFor;

  @Valid
  private List<FeatureSpecificationRelationshipMVO> featureSpecRelationship = new ArrayList<>();

  @Valid
  private List<PolicyRefMVO> policyConstraint = new ArrayList<>();

  private @Nullable Boolean isEnabled;

  @Valid
  private List<CharacteristicSpecificationMVO> featureSpecCharacteristic = new ArrayList<>();

  private String name;

  public FeatureSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureSpecificationMVO(String atType, String name) {
    this.atType = atType;
    this.name = name;
  }

  public FeatureSpecificationMVO atType(String atType) {
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

  public FeatureSpecificationMVO atBaseType(@Nullable String atBaseType) {
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

  public FeatureSpecificationMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public FeatureSpecificationMVO version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the feature specification
   * @return version
   */
  
  @Schema(name = "version", description = "Version of the feature specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public FeatureSpecificationMVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * feature identifier
   * @return id
   */
  
  @Schema(name = "id", description = "feature identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public FeatureSpecificationMVO isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * A flag indicating if this is a feature group (true) or not (false)
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "A flag indicating if this is a feature group (true) or not (false)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public @Nullable Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public FeatureSpecificationMVO validFor(@Nullable TimePeriod validFor) {
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

  public FeatureSpecificationMVO featureSpecRelationship(List<FeatureSpecificationRelationshipMVO> featureSpecRelationship) {
    this.featureSpecRelationship = featureSpecRelationship;
    return this;
  }

  public FeatureSpecificationMVO addFeatureSpecRelationshipItem(FeatureSpecificationRelationshipMVO featureSpecRelationshipItem) {
    if (this.featureSpecRelationship == null) {
      this.featureSpecRelationship = new ArrayList<>();
    }
    this.featureSpecRelationship.add(featureSpecRelationshipItem);
    return this;
  }

  /**
   * A dependency, exclusivity or aggratation relationship between/among feature specifications.
   * @return featureSpecRelationship
   */
  @Valid 
  @Schema(name = "featureSpecRelationship", description = "A dependency, exclusivity or aggratation relationship between/among feature specifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureSpecRelationship")
  public List<FeatureSpecificationRelationshipMVO> getFeatureSpecRelationship() {
    return featureSpecRelationship;
  }

  public void setFeatureSpecRelationship(List<FeatureSpecificationRelationshipMVO> featureSpecRelationship) {
    this.featureSpecRelationship = featureSpecRelationship;
  }

  public FeatureSpecificationMVO policyConstraint(List<PolicyRefMVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
    return this;
  }

  public FeatureSpecificationMVO addPolicyConstraintItem(PolicyRefMVO policyConstraintItem) {
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
  public List<PolicyRefMVO> getPolicyConstraint() {
    return policyConstraint;
  }

  public void setPolicyConstraint(List<PolicyRefMVO> policyConstraint) {
    this.policyConstraint = policyConstraint;
  }

  public FeatureSpecificationMVO isEnabled(@Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * A flag indicating if the feature is enabled (true) or not (false)
   * @return isEnabled
   */
  
  @Schema(name = "isEnabled", description = "A flag indicating if the feature is enabled (true) or not (false)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isEnabled")
  public @Nullable Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(@Nullable Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public FeatureSpecificationMVO featureSpecCharacteristic(List<CharacteristicSpecificationMVO> featureSpecCharacteristic) {
    this.featureSpecCharacteristic = featureSpecCharacteristic;
    return this;
  }

  public FeatureSpecificationMVO addFeatureSpecCharacteristicItem(CharacteristicSpecificationMVO featureSpecCharacteristicItem) {
    if (this.featureSpecCharacteristic == null) {
      this.featureSpecCharacteristic = new ArrayList<>();
    }
    this.featureSpecCharacteristic.add(featureSpecCharacteristicItem);
    return this;
  }

  /**
   * This is a list of characteristics for a particular feature
   * @return featureSpecCharacteristic
   */
  @Valid 
  @Schema(name = "featureSpecCharacteristic", description = "This is a list of characteristics for a particular feature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureSpecCharacteristic")
  public List<CharacteristicSpecificationMVO> getFeatureSpecCharacteristic() {
    return featureSpecCharacteristic;
  }

  public void setFeatureSpecCharacteristic(List<CharacteristicSpecificationMVO> featureSpecCharacteristic) {
    this.featureSpecCharacteristic = featureSpecCharacteristic;
  }

  public FeatureSpecificationMVO name(String name) {
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
    FeatureSpecificationMVO featureSpecificationMVO = (FeatureSpecificationMVO) o;
    return Objects.equals(this.atType, featureSpecificationMVO.atType) &&
        Objects.equals(this.atBaseType, featureSpecificationMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, featureSpecificationMVO.atSchemaLocation) &&
        Objects.equals(this.version, featureSpecificationMVO.version) &&
        Objects.equals(this.id, featureSpecificationMVO.id) &&
        Objects.equals(this.isBundle, featureSpecificationMVO.isBundle) &&
        Objects.equals(this.validFor, featureSpecificationMVO.validFor) &&
        Objects.equals(this.featureSpecRelationship, featureSpecificationMVO.featureSpecRelationship) &&
        Objects.equals(this.policyConstraint, featureSpecificationMVO.policyConstraint) &&
        Objects.equals(this.isEnabled, featureSpecificationMVO.isEnabled) &&
        Objects.equals(this.featureSpecCharacteristic, featureSpecificationMVO.featureSpecCharacteristic) &&
        Objects.equals(this.name, featureSpecificationMVO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, version, id, isBundle, validFor, featureSpecRelationship, policyConstraint, isEnabled, featureSpecCharacteristic, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSpecificationMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    featureSpecRelationship: ").append(toIndentedString(featureSpecRelationship)).append("\n");
    sb.append("    policyConstraint: ").append(toIndentedString(policyConstraint)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    featureSpecCharacteristic: ").append(toIndentedString(featureSpecCharacteristic)).append("\n");
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

