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
import org.openapitools.model.ExternalIdentifierFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.openapitools.model.ResourceCandidateRefFVO;
import org.openapitools.model.ResourceCategoryRefFVO;
import org.openapitools.model.ResourceSpecificationRefFVO;
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
 * ResourceCategoryFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCategoryFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  private @Nullable String description;

  private String name;

  private @Nullable String version;

  private @Nullable TimePeriod validFor;

  private @Nullable String lifecycleStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  private @Nullable String parentId;

  private @Nullable Boolean isRoot;

  @Valid
  private List<ResourceCategoryRefFVO> category = new ArrayList<>();

  @Valid
  private List<ResourceSpecificationRefFVO> resourceSpecification = new ArrayList<>();

  @Valid
  private List<ResourceCandidateRefFVO> resourceCandidate = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierFVO> externalIdentifier = new ArrayList<>();

  public ResourceCategoryFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCategoryFVO(String atType, String name) {
    this.atType = atType;
    this.name = name;
  }

  public ResourceCategoryFVO atType(String atType) {
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

  public ResourceCategoryFVO atBaseType(@Nullable String atBaseType) {
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

  public ResourceCategoryFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ResourceCategoryFVO id(@Nullable String id) {
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

  public ResourceCategoryFVO description(@Nullable String description) {
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

  public ResourceCategoryFVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Category
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "The name of the Category", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceCategoryFVO version(@Nullable String version) {
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

  public ResourceCategoryFVO validFor(@Nullable TimePeriod validFor) {
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

  public ResourceCategoryFVO lifecycleStatus(@Nullable String lifecycleStatus) {
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

  public ResourceCategoryFVO lastUpdate(@Nullable OffsetDateTime lastUpdate) {
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

  public ResourceCategoryFVO parentId(@Nullable String parentId) {
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

  public ResourceCategoryFVO isRoot(@Nullable Boolean isRoot) {
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

  public ResourceCategoryFVO category(List<ResourceCategoryRefFVO> category) {
    this.category = category;
    return this;
  }

  public ResourceCategoryFVO addCategoryItem(ResourceCategoryRefFVO categoryItem) {
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
  public List<ResourceCategoryRefFVO> getCategory() {
    return category;
  }

  public void setCategory(List<ResourceCategoryRefFVO> category) {
    this.category = category;
  }

  public ResourceCategoryFVO resourceSpecification(List<ResourceSpecificationRefFVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  public ResourceCategoryFVO addResourceSpecificationItem(ResourceSpecificationRefFVO resourceSpecificationItem) {
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
  public List<ResourceSpecificationRefFVO> getResourceSpecification() {
    return resourceSpecification;
  }

  public void setResourceSpecification(List<ResourceSpecificationRefFVO> resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  public ResourceCategoryFVO resourceCandidate(List<ResourceCandidateRefFVO> resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  public ResourceCategoryFVO addResourceCandidateItem(ResourceCandidateRefFVO resourceCandidateItem) {
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
  public List<ResourceCandidateRefFVO> getResourceCandidate() {
    return resourceCandidate;
  }

  public void setResourceCandidate(List<ResourceCandidateRefFVO> resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  public ResourceCategoryFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ResourceCategoryFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
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
  public List<RelatedPartyRefOrPartyRoleRefFVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ResourceCategoryFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ResourceCategoryFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
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
    ResourceCategoryFVO resourceCategoryFVO = (ResourceCategoryFVO) o;
    return Objects.equals(this.atType, resourceCategoryFVO.atType) &&
        Objects.equals(this.atBaseType, resourceCategoryFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceCategoryFVO.atSchemaLocation) &&
        Objects.equals(this.id, resourceCategoryFVO.id) &&
        Objects.equals(this.description, resourceCategoryFVO.description) &&
        Objects.equals(this.name, resourceCategoryFVO.name) &&
        Objects.equals(this.version, resourceCategoryFVO.version) &&
        Objects.equals(this.validFor, resourceCategoryFVO.validFor) &&
        Objects.equals(this.lifecycleStatus, resourceCategoryFVO.lifecycleStatus) &&
        Objects.equals(this.lastUpdate, resourceCategoryFVO.lastUpdate) &&
        Objects.equals(this.parentId, resourceCategoryFVO.parentId) &&
        Objects.equals(this.isRoot, resourceCategoryFVO.isRoot) &&
        Objects.equals(this.category, resourceCategoryFVO.category) &&
        Objects.equals(this.resourceSpecification, resourceCategoryFVO.resourceSpecification) &&
        Objects.equals(this.resourceCandidate, resourceCategoryFVO.resourceCandidate) &&
        Objects.equals(this.relatedParty, resourceCategoryFVO.relatedParty) &&
        Objects.equals(this.externalIdentifier, resourceCategoryFVO.externalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, description, name, version, validFor, lifecycleStatus, lastUpdate, parentId, isRoot, category, resourceSpecification, resourceCandidate, relatedParty, externalIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCategoryFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

