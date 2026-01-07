package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResourceCategory;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceCategoryCreateEventPayload generic structure
 */

@Schema(name = "ResourceCategoryCreateEventPayload", description = "ResourceCategoryCreateEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCategoryCreateEventPayload {

  private @Nullable ResourceCategory resourceCategory;

  public ResourceCategoryCreateEventPayload resourceCategory(@Nullable ResourceCategory resourceCategory) {
    this.resourceCategory = resourceCategory;
    return this;
  }

  /**
   * Get resourceCategory
   * @return resourceCategory
   */
  @Valid 
  @Schema(name = "resourceCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceCategory")
  public @Nullable ResourceCategory getResourceCategory() {
    return resourceCategory;
  }

  public void setResourceCategory(@Nullable ResourceCategory resourceCategory) {
    this.resourceCategory = resourceCategory;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCategoryCreateEventPayload resourceCategoryCreateEventPayload = (ResourceCategoryCreateEventPayload) o;
    return Objects.equals(this.resourceCategory, resourceCategoryCreateEventPayload.resourceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCategoryCreateEventPayload {\n");
    sb.append("    resourceCategory: ").append(toIndentedString(resourceCategory)).append("\n");
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

