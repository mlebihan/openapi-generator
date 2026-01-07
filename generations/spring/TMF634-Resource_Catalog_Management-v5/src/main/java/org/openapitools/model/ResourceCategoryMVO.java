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
import org.openapitools.model.ExternalIdentifierMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
import org.openapitools.model.ResourceCandidateRefMVO;
import org.openapitools.model.ResourceCategoryRefMVO;
import org.openapitools.model.ResourceSpecificationRefMVO;
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
 * ResourceCategoryMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCategoryMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String description;

  private @Nullable String name;

  private @Nullable String version;

  private @Nullable TimePeriod validFor;

  private @Nullable String lifecycleStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  private @Nullable String parentId;

  private @Nullable Boolean isRoot;

  @Valid
  private List<ResourceCategoryRefMVO> category = new ArrayList<>();

  @Valid
  private List<ResourceSpecificationRefMVO> resourceSpecification = new ArrayList<>();

  @Valid
  private List<ResourceCandidateRefMVO> resourceCandidate = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierMVO> externalIdentifier = new ArrayList<>();

  public ResourceCategoryMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCategoryMVO(String atType) {
    this.atType = atType;
  }

  public ResourceCategoryMVO atType(String atType) {
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

  public ResourceCategoryMVO atBaseType(@Nullable String atBaseType) {
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

  public ResourceCategoryMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ResourceCategoryMVO description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the category
   * @return description
   */
  
  @Schema(name = "description", description = "Description of the category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ResourceCategoryMVO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Category
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the Category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ResourceCategoryMVO version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * Category version
   * @return version
   */
  
  @Schema(name = "version", description = "Category version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public ResourceCategoryMVO validFor(@Nullable TimePeriod validFor) {
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

  public ResourceCategoryMVO lifecycleStatus(@Nullable String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
   */
  
  @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleStatus")
  public @Nullable String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(@Nullable String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ResourceCategoryMVO lastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the last update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public @Nullable OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ResourceCategoryMVO parentId(@Nullable String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Unique identifier of the parent category
   * @return parentId
   */
  
  @Schema(name = "parentId", description = "Unique identifier of the parent category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentId")
  public @Nullable String getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable String parentId) {
    this.parentId = parentId;
  }

  public ResourceCategoryMVO isRoot(@Nullable Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  /**
   * If true, this Boolean indicates that the category is a root of categories
   * @return isRoot
   */
  
  @Schema(name = "isRoot", description = "If true, this Boolean indicates that the category is a root of categories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRoot")
  public @Nullable Boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(@Nullable Boolean isRoot) {
    this.isRoot = isRoot;
  }

  public ResourceCategoryMVO category(List<ResourceCategoryRefMVO> category) {
    this.category = category;
    return this;
  }

  public ResourceCategoryMVO addCategoryItem(ResourceCategoryRefMVO categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.
   * @return category
   */
  @Valid 
  @Schema(name = "category", description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other (sub-)categories and/or product offerings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public List<ResourceCategoryRefMVO> getCategory() {
    return category;
  }

  public void setCategory(List<ResourceCategoryRefMVO> category) {
    this.category = category;
  }

  public ResourceCategoryMVO resourceSpecification(List<ResourceSpecificationRefMVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  public ResourceCategoryMVO addResourceSpecificationItem(ResourceSpecificationRefMVO resourceSpecificationItem) {
    if (this.resourceSpecification == null) {
      this.resourceSpecification = new ArrayList<>();
    }
    this.resourceSpecification.add(resourceSpecificationItem);
    return this;
  }

  /**
   * List of resource specifications accessible via this category
   * @return resourceSpecification
   */
  @Valid 
  @Schema(name = "resourceSpecification", description = "List of resource specifications accessible via this category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceSpecification")
  public List<ResourceSpecificationRefMVO> getResourceSpecification() {
    return resourceSpecification;
  }

  public void setResourceSpecification(List<ResourceSpecificationRefMVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  public ResourceCategoryMVO resourceCandidate(List<ResourceCandidateRefMVO> resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  public ResourceCategoryMVO addResourceCandidateItem(ResourceCandidateRefMVO resourceCandidateItem) {
    if (this.resourceCandidate == null) {
      this.resourceCandidate = new ArrayList<>();
    }
    this.resourceCandidate.add(resourceCandidateItem);
    return this;
  }

  /**
   * List of resource candidates accessible via this category
   * @return resourceCandidate
   */
  @Valid 
  @Schema(name = "resourceCandidate", description = "List of resource candidates accessible via this category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceCandidate")
  public List<ResourceCandidateRefMVO> getResourceCandidate() {
    return resourceCandidate;
  }

  public void setResourceCandidate(List<ResourceCandidateRefMVO> resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  public ResourceCategoryMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ResourceCategoryMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties involved in this category
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "List of parties involved in this category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefMVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ResourceCategoryMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ResourceCategoryMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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
  public List<ExternalIdentifierMVO> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
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
    ResourceCategoryMVO resourceCategoryMVO = (ResourceCategoryMVO) o;
    return Objects.equals(this.atType, resourceCategoryMVO.atType) &&
        Objects.equals(this.atBaseType, resourceCategoryMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceCategoryMVO.atSchemaLocation) &&
        Objects.equals(this.description, resourceCategoryMVO.description) &&
        Objects.equals(this.name, resourceCategoryMVO.name) &&
        Objects.equals(this.version, resourceCategoryMVO.version) &&
        Objects.equals(this.validFor, resourceCategoryMVO.validFor) &&
        Objects.equals(this.lifecycleStatus, resourceCategoryMVO.lifecycleStatus) &&
        Objects.equals(this.lastUpdate, resourceCategoryMVO.lastUpdate) &&
        Objects.equals(this.parentId, resourceCategoryMVO.parentId) &&
        Objects.equals(this.isRoot, resourceCategoryMVO.isRoot) &&
        Objects.equals(this.category, resourceCategoryMVO.category) &&
        Objects.equals(this.resourceSpecification, resourceCategoryMVO.resourceSpecification) &&
        Objects.equals(this.resourceCandidate, resourceCategoryMVO.resourceCandidate) &&
        Objects.equals(this.relatedParty, resourceCategoryMVO.relatedParty) &&
        Objects.equals(this.externalIdentifier, resourceCategoryMVO.externalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, description, name, version, validFor, lifecycleStatus, lastUpdate, parentId, isRoot, category, resourceSpecification, resourceCandidate, relatedParty, externalIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCategoryMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

