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
import org.openapitools.model.CatalogMVO;
import org.openapitools.model.ExternalIdentifierMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
import org.openapitools.model.ResourceCategoryRefMVO;
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
 * ResourceCatalogMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCatalogMVO extends CatalogMVO {

  @Valid
  private List<ResourceCategoryRefMVO> category = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierMVO> externalIdentifier = new ArrayList<>();

  public ResourceCatalogMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCatalogMVO(String atType) {
    super(atType);
  }

  public ResourceCatalogMVO category(List<ResourceCategoryRefMVO> category) {
    this.category = category;
    return this;
  }

  public ResourceCatalogMVO addCategoryItem(ResourceCategoryRefMVO categoryItem) {
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
  public List<ResourceCategoryRefMVO> getCategory() {
    return category;
  }

  public void setCategory(List<ResourceCategoryRefMVO> category) {
    this.category = category;
  }

  public ResourceCatalogMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ResourceCatalogMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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


  public ResourceCatalogMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceCatalogMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceCatalogMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceCatalogMVO description(String description) {
    super.description(description);
    return this;
  }

  public ResourceCatalogMVO catalogType(String catalogType) {
    super.catalogType(catalogType);
    return this;
  }

  public ResourceCatalogMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceCatalogMVO version(String version) {
    super.version(version);
    return this;
  }

  public ResourceCatalogMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceCatalogMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceCatalogMVO lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public ResourceCatalogMVO lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public ResourceCatalogMVO name(String name) {
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
    ResourceCatalogMVO resourceCatalogMVO = (ResourceCatalogMVO) o;
    return Objects.equals(this.category, resourceCatalogMVO.category) &&
        Objects.equals(this.externalIdentifier, resourceCatalogMVO.externalIdentifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, externalIdentifier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCatalogMVO {\n");
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

