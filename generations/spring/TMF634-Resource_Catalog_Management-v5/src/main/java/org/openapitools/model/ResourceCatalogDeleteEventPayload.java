package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResourceCatalog;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceCatalogDeleteEventPayload generic structure
 */

@Schema(name = "ResourceCatalogDeleteEventPayload", description = "ResourceCatalogDeleteEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCatalogDeleteEventPayload {

  private @Nullable ResourceCatalog resourceCatalog;

  public ResourceCatalogDeleteEventPayload resourceCatalog(@Nullable ResourceCatalog resourceCatalog) {
    this.resourceCatalog = resourceCatalog;
    return this;
  }

  /**
   * Get resourceCatalog
   * @return resourceCatalog
   */
  @Valid 
  @Schema(name = "resourceCatalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceCatalog")
  public @Nullable ResourceCatalog getResourceCatalog() {
    return resourceCatalog;
  }

  public void setResourceCatalog(@Nullable ResourceCatalog resourceCatalog) {
    this.resourceCatalog = resourceCatalog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCatalogDeleteEventPayload resourceCatalogDeleteEventPayload = (ResourceCatalogDeleteEventPayload) o;
    return Objects.equals(this.resourceCatalog, resourceCatalogDeleteEventPayload.resourceCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCatalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCatalogDeleteEventPayload {\n");
    sb.append("    resourceCatalog: ").append(toIndentedString(resourceCatalog)).append("\n");
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

