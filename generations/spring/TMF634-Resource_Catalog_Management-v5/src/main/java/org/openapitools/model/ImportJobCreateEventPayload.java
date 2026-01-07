package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ImportJob;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ImportJobCreateEventPayload generic structure
 */

@Schema(name = "ImportJobCreateEventPayload", description = "ImportJobCreateEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ImportJobCreateEventPayload {

  private @Nullable ImportJob importJob;

  public ImportJobCreateEventPayload importJob(@Nullable ImportJob importJob) {
    this.importJob = importJob;
    return this;
  }

  /**
   * Get importJob
   * @return importJob
   */
  @Valid 
  @Schema(name = "importJob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importJob")
  public @Nullable ImportJob getImportJob() {
    return importJob;
  }

  public void setImportJob(@Nullable ImportJob importJob) {
    this.importJob = importJob;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJobCreateEventPayload importJobCreateEventPayload = (ImportJobCreateEventPayload) o;
    return Objects.equals(this.importJob, importJobCreateEventPayload.importJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJobCreateEventPayload {\n");
    sb.append("    importJob: ").append(toIndentedString(importJob)).append("\n");
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

