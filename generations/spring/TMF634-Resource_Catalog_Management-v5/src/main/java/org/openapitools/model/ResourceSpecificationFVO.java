package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValueFVO;
import org.openapitools.model.CharacteristicSpecificationFVO;
import org.openapitools.model.ExternalIdentifierFVO;
import org.openapitools.model.FeatureSpecificationFVO;
import org.openapitools.model.IntentSpecificationRefFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.openapitools.model.ResourceSpecificationRelationshipFVO;
import org.openapitools.model.TargetResourceSchemaFVO;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceSpecificationFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  private @Nullable String description;

  private @Nullable String version;

  private @Nullable TimePeriod validFor;

  private @Nullable Boolean isBundle;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  private @Nullable String lifecycleStatus;

  private String name;

  private @Nullable String category;

  private @Nullable TargetResourceSchemaFVO targetResourceSchema;

  @Valid
  private List<FeatureSpecificationFVO> featureSpecification = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentRefOrValueFVO> attachment = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty = new ArrayList<>();

  @Valid
  private List<CharacteristicSpecificationFVO> resourceSpecCharacteristic = new ArrayList<>();

  @Valid
  private List<ResourceSpecificationRelationshipFVO> resourceSpecRelationship = new ArrayList<>();

  private @Nullable IntentSpecificationRefFVO intentSpecification;

  @Valid
  private List<ExternalIdentifierFVO> externalIdentifier = new ArrayList<>();

  public ResourceSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceSpecificationFVO(String atType, String name) {
    this.atType = atType;
    this.name = name;
  }

  public ResourceSpecificationFVO atType(String atType) {
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

  public ResourceSpecificationFVO atBaseType(@Nullable String atBaseType) {
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

  public ResourceSpecificationFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ResourceSpecificationFVO id(@Nullable String id) {
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

  public ResourceSpecificationFVO description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this REST resource
   * @return description
   */
  
  @Schema(name = "description", description = "Description of this REST resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ResourceSpecificationFVO version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Resource Specification version
   * @return version
   */
  
  @Schema(name = "version", description = "Resource Specification version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public ResourceSpecificationFVO validFor(@Nullable TimePeriod validFor) {
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

  public ResourceSpecificationFVO isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * A flag indicates that if this resource specification is a bundled specification (true) or single (false).
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "A flag indicates that if this resource specification is a bundled specification (true) or single (false).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public @Nullable Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ResourceSpecificationFVO lastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update of this REST resource
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the last update of this REST resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public @Nullable OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ResourceSpecificationFVO lifecycleStatus(@Nullable String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status of the resource specification
   * @return lifecycleStatus
   */
  
  @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status of the resource specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleStatus")
  public @Nullable String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(@Nullable String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ResourceSpecificationFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to this REST resource
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Name given to this REST resource", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceSpecificationFVO category(@Nullable String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the target resource like NetworkConnectivity, PhysicalLinks, Generic, L2Network and so on.
   * @return category
   */
  
  @Schema(name = "category", description = "Category of the target resource like NetworkConnectivity, PhysicalLinks, Generic, L2Network and so on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable String getCategory() {
    return category;
  }

  public void setCategory(@Nullable String category) {
    this.category = category;
  }

  public ResourceSpecificationFVO targetResourceSchema(@Nullable TargetResourceSchemaFVO targetResourceSchema) {
    this.targetResourceSchema = targetResourceSchema;
    return this;
  }

  /**
   * Get targetResourceSchema
   * @return targetResourceSchema
   */
  @Valid 
  @Schema(name = "targetResourceSchema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetResourceSchema")
  public @Nullable TargetResourceSchemaFVO getTargetResourceSchema() {
    return targetResourceSchema;
  }

  public void setTargetResourceSchema(@Nullable TargetResourceSchemaFVO targetResourceSchema) {
    this.targetResourceSchema = targetResourceSchema;
  }

  public ResourceSpecificationFVO featureSpecification(List<FeatureSpecificationFVO> featureSpecification) {
    this.featureSpecification = featureSpecification;
    return this;
  }

  public ResourceSpecificationFVO addFeatureSpecificationItem(FeatureSpecificationFVO featureSpecificationItem) {
    if (this.featureSpecification == null) {
      this.featureSpecification = new ArrayList<>();
    }
    this.featureSpecification.add(featureSpecificationItem);
    return this;
  }

  /**
   * A list of Features for this specification.
   * @return featureSpecification
   */
  @Valid 
  @Schema(name = "featureSpecification", description = "A list of Features for this specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureSpecification")
  public List<FeatureSpecificationFVO> getFeatureSpecification() {
    return featureSpecification;
  }

  public void setFeatureSpecification(List<FeatureSpecificationFVO> featureSpecification) {
    this.featureSpecification = featureSpecification;
  }

  public ResourceSpecificationFVO attachment(List<@Valid AttachmentRefOrValueFVO> attachment) {
    this.attachment = attachment;
    return this;
  }

  public ResourceSpecificationFVO addAttachmentItem(AttachmentRefOrValueFVO attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Complements the description of an element (for instance a resource) through video, pictures ...
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", description = "Complements the description of an element (for instance a resource) through video, pictures ...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValueFVO> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValueFVO> attachment) {
    this.attachment = attachment;
  }

  public ResourceSpecificationFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ResourceSpecificationFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A related party defines party or party role linked to a specific entity.
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "A related party defines party or party role linked to a specific entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefFVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ResourceSpecificationFVO resourceSpecCharacteristic(List<CharacteristicSpecificationFVO> resourceSpecCharacteristic) {
    this.resourceSpecCharacteristic = resourceSpecCharacteristic;
    return this;
  }

  public ResourceSpecificationFVO addResourceSpecCharacteristicItem(CharacteristicSpecificationFVO resourceSpecCharacteristicItem) {
    if (this.resourceSpecCharacteristic == null) {
      this.resourceSpecCharacteristic = new ArrayList<>();
    }
    this.resourceSpecCharacteristic.add(resourceSpecCharacteristicItem);
    return this;
  }

  /**
   * A characteristic quality or distinctive feature of a ResourceSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
   * @return resourceSpecCharacteristic
   */
  @Valid 
  @Schema(name = "resourceSpecCharacteristic", description = "A characteristic quality or distinctive feature of a ResourceSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceSpecCharacteristic")
  public List<CharacteristicSpecificationFVO> getResourceSpecCharacteristic() {
    return resourceSpecCharacteristic;
  }

  public void setResourceSpecCharacteristic(List<CharacteristicSpecificationFVO> resourceSpecCharacteristic) {
    this.resourceSpecCharacteristic = resourceSpecCharacteristic;
  }

  public ResourceSpecificationFVO resourceSpecRelationship(List<ResourceSpecificationRelationshipFVO> resourceSpecRelationship) {
    this.resourceSpecRelationship = resourceSpecRelationship;
    return this;
  }

  public ResourceSpecificationFVO addResourceSpecRelationshipItem(ResourceSpecificationRelationshipFVO resourceSpecRelationshipItem) {
    if (this.resourceSpecRelationship == null) {
      this.resourceSpecRelationship = new ArrayList<>();
    }
    this.resourceSpecRelationship.add(resourceSpecRelationshipItem);
    return this;
  }

  /**
   * A migration, substitution, dependency or exclusivity relationship between/among resource specifications.
   * @return resourceSpecRelationship
   */
  @Valid 
  @Schema(name = "resourceSpecRelationship", description = "A migration, substitution, dependency or exclusivity relationship between/among resource specifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceSpecRelationship")
  public List<ResourceSpecificationRelationshipFVO> getResourceSpecRelationship() {
    return resourceSpecRelationship;
  }

  public void setResourceSpecRelationship(List<ResourceSpecificationRelationshipFVO> resourceSpecRelationship) {
    this.resourceSpecRelationship = resourceSpecRelationship;
  }

  public ResourceSpecificationFVO intentSpecification(@Nullable IntentSpecificationRefFVO intentSpecification) {
    this.intentSpecification = intentSpecification;
    return this;
  }

  /**
   * Get intentSpecification
   * @return intentSpecification
   */
  @Valid 
  @Schema(name = "intentSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intentSpecification")
  public @Nullable IntentSpecificationRefFVO getIntentSpecification() {
    return intentSpecification;
  }

  public void setIntentSpecification(@Nullable IntentSpecificationRefFVO intentSpecification) {
    this.intentSpecification = intentSpecification;
  }

  public ResourceSpecificationFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ResourceSpecificationFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
    if (this.externalIdentifier == null) {
      this.externalIdentifier = new ArrayList<>();
    }
    this.externalIdentifier.add(externalIdentifierItem);
    return this;
  }

  /**
   * Get externalIdentifier
   * @return externalIdentifier
   */
  @Valid 
  @Schema(name = "externalIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifier")
  public List<ExternalIdentifierFVO> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceSpecificationFVO resourceSpecificationFVO = (ResourceSpecificationFVO) o;
    return Objects.equals(this.atType, resourceSpecificationFVO.atType) &&
        Objects.equals(this.atBaseType, resourceSpecificationFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceSpecificationFVO.atSchemaLocation) &&
        Objects.equals(this.id, resourceSpecificationFVO.id) &&
        Objects.equals(this.description, resourceSpecificationFVO.description) &&
        Objects.equals(this.version, resourceSpecificationFVO.version) &&
        Objects.equals(this.validFor, resourceSpecificationFVO.validFor) &&
        Objects.equals(this.isBundle, resourceSpecificationFVO.isBundle) &&
        Objects.equals(this.lastUpdate, resourceSpecificationFVO.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, resourceSpecificationFVO.lifecycleStatus) &&
        Objects.equals(this.name, resourceSpecificationFVO.name) &&
        Objects.equals(this.category, resourceSpecificationFVO.category) &&
        Objects.equals(this.targetResourceSchema, resourceSpecificationFVO.targetResourceSchema) &&
        Objects.equals(this.featureSpecification, resourceSpecificationFVO.featureSpecification) &&
        Objects.equals(this.attachment, resourceSpecificationFVO.attachment) &&
        Objects.equals(this.relatedParty, resourceSpecificationFVO.relatedParty) &&
        Objects.equals(this.resourceSpecCharacteristic, resourceSpecificationFVO.resourceSpecCharacteristic) &&
        Objects.equals(this.resourceSpecRelationship, resourceSpecificationFVO.resourceSpecRelationship) &&
        Objects.equals(this.intentSpecification, resourceSpecificationFVO.intentSpecification) &&
        Objects.equals(this.externalIdentifier, resourceSpecificationFVO.externalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, description, version, validFor, isBundle, lastUpdate, lifecycleStatus, name, category, targetResourceSchema, featureSpecification, attachment, relatedParty, resourceSpecCharacteristic, resourceSpecRelationship, intentSpecification, externalIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceSpecificationFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    targetResourceSchema: ").append(toIndentedString(targetResourceSchema)).append("\n");
    sb.append("    featureSpecification: ").append(toIndentedString(featureSpecification)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    resourceSpecCharacteristic: ").append(toIndentedString(resourceSpecCharacteristic)).append("\n");
    sb.append("    resourceSpecRelationship: ").append(toIndentedString(resourceSpecRelationship)).append("\n");
    sb.append("    intentSpecification: ").append(toIndentedString(intentSpecification)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
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

