package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResourceCandidate;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceCandidateDeleteEventPayload generic structure
 */

@Schema(name = "ResourceCandidateDeleteEventPayload", description = "ResourceCandidateDeleteEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCandidateDeleteEventPayload {

  private @Nullable ResourceCandidate resourceCandidate;

  public ResourceCandidateDeleteEventPayload resourceCandidate(@Nullable ResourceCandidate resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  /**
   * Get resourceCandidate
   * @return resourceCandidate
   */
  @Valid 
  @Schema(name = "resourceCandidate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceCandidate")
  public @Nullable ResourceCandidate getResourceCandidate() {
    return resourceCandidate;
  }

  public void setResourceCandidate(@Nullable ResourceCandidate resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCandidateDeleteEventPayload resourceCandidateDeleteEventPayload = (ResourceCandidateDeleteEventPayload) o;
    return Objects.equals(this.resourceCandidate, resourceCandidateDeleteEventPayload.resourceCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceCandidate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCandidateDeleteEventPayload {\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
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

