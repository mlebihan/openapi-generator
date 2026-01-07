package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResourceSpecification;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceSpecificationCreateEventPayload generic structure
 */

@Schema(name = "ResourceSpecificationCreateEventPayload", description = "ResourceSpecificationCreateEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceSpecificationCreateEventPayload {

  private @Nullable ResourceSpecification resourceSpecification;

  public ResourceSpecificationCreateEventPayload resourceSpecification(@Nullable ResourceSpecification resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
    return this;
  }

  /**
   * Get resourceSpecification
   * @return resourceSpecification
   */
  @Valid 
  @Schema(name = "resourceSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceSpecification")
  public @Nullable ResourceSpecification getResourceSpecification() {
    return resourceSpecification;
  }

  public void setResourceSpecification(@Nullable ResourceSpecification resourceSpecification) {
    this.resourceSpecification = resourceSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceSpecificationCreateEventPayload resourceSpecificationCreateEventPayload = (ResourceSpecificationCreateEventPayload) o;
    return Objects.equals(this.resourceSpecification, resourceSpecificationCreateEventPayload.resourceSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceSpecificationCreateEventPayload {\n");
    sb.append("    resourceSpecification: ").append(toIndentedString(resourceSpecification)).append("\n");
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

