package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Catalog;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.ResourceCategoryRef;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceCatalog
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCatalog extends Catalog implements PatchResourceCatalog200Response {

  @Valid
  private List<ResourceCategoryRef> category = new ArrayList<>();

  @Valid
  private List<ExternalIdentifier> externalIdentifier = new ArrayList<>();

  public ResourceCatalog() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCatalog(String atType) {
    super(atType);
  }

  public ResourceCatalog category(List<ResourceCategoryRef> category) {
    this.category = category;
    return this;
  }

  public ResourceCatalog addCategoryItem(ResourceCategoryRef categoryItem) {
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
  public List<ResourceCategoryRef> getCategory() {
    return category;
  }

  public void setCategory(List<ResourceCategoryRef> category) {
    this.category = category;
  }

  public ResourceCatalog externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ResourceCatalog addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
  public List<ExternalIdentifier> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }


  public ResourceCatalog atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceCatalog atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceCatalog atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceCatalog href(String href) {
    super.href(href);
    return this;
  }

  public ResourceCatalog id(String id) {
    super.id(id);
    return this;
  }

  public ResourceCatalog description(String description) {
    super.description(description);
    return this;
  }

  public ResourceCatalog catalogType(String catalogType) {
    super.catalogType(catalogType);
    return this;
  }

  public ResourceCatalog validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceCatalog version(String version) {
    super.version(version);
    return this;
  }

  public ResourceCatalog relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceCatalog addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceCatalog lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public ResourceCatalog lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public ResourceCatalog name(String name) {
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
    ResourceCatalog resourceCatalog = (ResourceCatalog) o;
    return Objects.equals(this.category, resourceCatalog.category) &&
        Objects.equals(this.externalIdentifier, resourceCatalog.externalIdentifier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, externalIdentifier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCatalog {\n");
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

