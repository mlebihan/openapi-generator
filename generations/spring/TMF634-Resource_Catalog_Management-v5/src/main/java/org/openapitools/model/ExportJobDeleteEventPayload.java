package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ExportJob;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExportJobDeleteEventPayload generic structure
 */

@Schema(name = "ExportJobDeleteEventPayload", description = "ExportJobDeleteEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ExportJobDeleteEventPayload {

  private @Nullable ExportJob exportJob;

  public ExportJobDeleteEventPayload exportJob(@Nullable ExportJob exportJob) {
    this.exportJob = exportJob;
    return this;
  }

  /**
   * Get exportJob
   * @return exportJob
   */
  @Valid 
  @Schema(name = "exportJob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exportJob")
  public @Nullable ExportJob getExportJob() {
    return exportJob;
  }

  public void setExportJob(@Nullable ExportJob exportJob) {
    this.exportJob = exportJob;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportJobDeleteEventPayload exportJobDeleteEventPayload = (ExportJobDeleteEventPayload) o;
    return Objects.equals(this.exportJob, exportJobDeleteEventPayload.exportJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportJobDeleteEventPayload {\n");
    sb.append("    exportJob: ").append(toIndentedString(exportJob)).append("\n");
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

