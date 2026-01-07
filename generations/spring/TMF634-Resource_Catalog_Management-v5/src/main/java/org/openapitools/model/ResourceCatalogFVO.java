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
import org.openapitools.model.CatalogFVO;
import org.openapitools.model.ExternalIdentifierFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.openapitools.model.ResourceCategoryRefFVO;
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
 * ResourceCatalogFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCatalogFVO extends CatalogFVO {

  @Valid
  private List<ResourceCategoryRefFVO> category = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierFVO> externalIdentifier = new ArrayList<>();

  public ResourceCatalogFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCatalogFVO(String atType, String name) {
    super(atType, name);
  }

  public ResourceCatalogFVO category(List<ResourceCategoryRefFVO> category) {
    this.category = category;
    return this;
  }

  public ResourceCatalogFVO addCategoryItem(ResourceCategoryRefFVO categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * List of root categories contained in this catalog
   * @return category
   */
  @Valid 
  @Schema(name = "category", description = "List of root categories contained in this catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public List<ResourceCategoryRefFVO> getCategory() {
    return category;
  }

  public void setCategory(List<ResourceCategoryRefFVO> category) {
    this.category = category;
  }

  public ResourceCatalogFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ResourceCatalogFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
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


  public ResourceCatalogFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceCatalogFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceCatalogFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceCatalogFVO id(String id) {
    super.id(id);
    return this;
  }

  public ResourceCatalogFVO description(String description) {
    super.description(description);
    return this;
  }

  public ResourceCatalogFVO catalogType(String catalogType) {
    super.catalogType(catalogType);
    return this;
  }

  public ResourceCatalogFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceCatalogFVO version(String version) {
    super.version(version);
    return this;
  }

  public ResourceCatalogFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceCatalogFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceCatalogFVO lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public ResourceCatalogFVO lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public ResourceCatalogFVO name(String name) {
    super.name(name);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCatalogFVO resourceCatalogFVO = (ResourceCatalogFVO) o;
    return Objects.equals(this.category, resourceCatalogFVO.category) &&
        Objects.equals(this.externalIdentifier, resourceCatalogFVO.externalIdentifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, externalIdentifier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCatalogFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

