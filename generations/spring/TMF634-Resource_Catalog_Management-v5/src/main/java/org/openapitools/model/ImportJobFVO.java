package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.model.JobStateType;
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
 * ImportJobFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ImportJobFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completionDate;

  private @Nullable String contentType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime creationDate;

  private @Nullable String errorLog;

  private @Nullable String path;

  private @Nullable JobStateType status;

  private URI url;

  public ImportJobFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ImportJobFVO(String atType, URI url) {
    this.atType = atType;
    this.url = url;
  }

  public ImportJobFVO atType(String atType) {
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

  public ImportJobFVO atBaseType(@Nullable String atBaseType) {
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

  public ImportJobFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ImportJobFVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier for import job
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier for import job", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ImportJobFVO completionDate(@Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Date at which the job was completed
   * @return completionDate
   */
  @Valid 
  @Schema(name = "completionDate", description = "Date at which the job was completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completionDate")
  public @Nullable OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public ImportJobFVO contentType(@Nullable String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Indicates the format of the imported data
   * @return contentType
   */
  
  @Schema(name = "contentType", description = "Indicates the format of the imported data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentType")
  public @Nullable String getContentType() {
    return contentType;
  }

  public void setContentType(@Nullable String contentType) {
    this.contentType = contentType;
  }

  public ImportJobFVO creationDate(@Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date at which the job was created
   * @return creationDate
   */
  @Valid 
  @Schema(name = "creationDate", description = "Date at which the job was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public @Nullable OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ImportJobFVO errorLog(@Nullable String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

  /**
   * Path to file or stream where errors encountered during the job processing can be written
   * @return errorLog
   */
  
  @Schema(name = "errorLog", description = "Path to file or stream where errors encountered during the job processing can be written", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorLog")
  public @Nullable String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(@Nullable String errorLog) {
    this.errorLog = errorLog;
  }

  public ImportJobFVO path(@Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * URL of the root resource where the content of the file specified by the import job must be applied
   * @return path
   */
  
  @Schema(name = "path", description = "URL of the root resource where the content of the file specified by the import job must be applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable String getPath() {
    return path;
  }

  public void setPath(@Nullable String path) {
    this.path = path;
  }

  public ImportJobFVO status(@Nullable JobStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable JobStateType getStatus() {
    return status;
  }

  public void setStatus(@Nullable JobStateType status) {
    this.status = status;
  }

  public ImportJobFVO url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the file containing the data to be imported
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", description = "URL of the file containing the data to be imported", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportJobFVO importJobFVO = (ImportJobFVO) o;
    return Objects.equals(this.atType, importJobFVO.atType) &&
        Objects.equals(this.atBaseType, importJobFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, importJobFVO.atSchemaLocation) &&
        Objects.equals(this.id, importJobFVO.id) &&
        Objects.equals(this.completionDate, importJobFVO.completionDate) &&
        Objects.equals(this.contentType, importJobFVO.contentType) &&
        Objects.equals(this.creationDate, importJobFVO.creationDate) &&
        Objects.equals(this.errorLog, importJobFVO.errorLog) &&
        Objects.equals(this.path, importJobFVO.path) &&
        Objects.equals(this.status, importJobFVO.status) &&
        Objects.equals(this.url, importJobFVO.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, completionDate, contentType, creationDate, errorLog, path, status, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportJobFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

