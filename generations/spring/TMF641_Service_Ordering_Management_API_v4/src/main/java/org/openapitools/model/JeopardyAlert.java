package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * A JeopardyAlert represents a predicted exception during a process that may cause a risk to complete successfully the process.
 */

@Schema(name = "JeopardyAlert", description = "A JeopardyAlert represents a predicted exception during a process that may cause a risk to complete successfully the process.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class JeopardyAlert {

  private @Nullable String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime alertDate;

  private @Nullable String exception;

  private @Nullable String jeopardyType;

  private @Nullable String message;

  private @Nullable String name;

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public JeopardyAlert id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of the JeopardyAlert
   * @return id
   */
  
  @Schema(name = "id", description = "identifier of the JeopardyAlert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public JeopardyAlert alertDate(@Nullable OffsetDateTime alertDate) {
    this.alertDate = alertDate;
    return this;
  }

  /**
   * A date time( DateTime). The date that the alert issued
   * @return alertDate
   */
  @Valid 
  @Schema(name = "alertDate", description = "A date time( DateTime). The date that the alert issued", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alertDate")
  public @Nullable OffsetDateTime getAlertDate() {
    return alertDate;
  }

  public void setAlertDate(@Nullable OffsetDateTime alertDate) {
    this.alertDate = alertDate;
  }

  public JeopardyAlert exception(@Nullable String exception) {
    this.exception = exception;
    return this;
  }

  /**
   *  The exception associated with this jeopardy alert
   * @return exception
   */
  
  @Schema(name = "exception", description = " The exception associated with this jeopardy alert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exception")
  public @Nullable String getException() {
    return exception;
  }

  public void setException(@Nullable String exception) {
    this.exception = exception;
  }

  public JeopardyAlert jeopardyType(@Nullable String jeopardyType) {
    this.jeopardyType = jeopardyType;
    return this;
  }

  /**
   * A string represents the type of jeopardy/risk like Normal, Hazard, Critical, ...
   * @return jeopardyType
   */
  
  @Schema(name = "jeopardyType", description = "A string represents the type of jeopardy/risk like Normal, Hazard, Critical, ...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jeopardyType")
  public @Nullable String getJeopardyType() {
    return jeopardyType;
  }

  public void setJeopardyType(@Nullable String jeopardyType) {
    this.jeopardyType = jeopardyType;
  }

  public JeopardyAlert message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * A string represents the message of the alert
   * @return message
   */
  
  @Schema(name = "message", description = "A string represents the message of the alert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public JeopardyAlert name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * A string used to give a name to the jeopardy alert
   * @return name
   */
  
  @Schema(name = "name", description = "A string used to give a name to the jeopardy alert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public JeopardyAlert atBaseType(@Nullable String atBaseType) {
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

  public JeopardyAlert atSchemaLocation(@Nullable URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public JeopardyAlert atType(@Nullable String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public @Nullable String getAtType() {
    return atType;
  }

  public void setAtType(@Nullable String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JeopardyAlert jeopardyAlert = (JeopardyAlert) o;
    return Objects.equals(this.id, jeopardyAlert.id) &&
        Objects.equals(this.alertDate, jeopardyAlert.alertDate) &&
        Objects.equals(this.exception, jeopardyAlert.exception) &&
        Objects.equals(this.jeopardyType, jeopardyAlert.jeopardyType) &&
        Objects.equals(this.message, jeopardyAlert.message) &&
        Objects.equals(this.name, jeopardyAlert.name) &&
        Objects.equals(this.atBaseType, jeopardyAlert.atBaseType) &&
        Objects.equals(this.atSchemaLocation, jeopardyAlert.atSchemaLocation) &&
        Objects.equals(this.atType, jeopardyAlert.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertDate, exception, jeopardyType, message, name, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JeopardyAlert {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertDate: ").append(toIndentedString(alertDate)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    jeopardyType: ").append(toIndentedString(jeopardyType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

