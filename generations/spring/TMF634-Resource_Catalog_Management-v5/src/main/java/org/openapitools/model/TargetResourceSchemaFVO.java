package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The reference object to the schema and type of target resource which is described by resource specification
 */

@Schema(name = "TargetResourceSchema_FVO", description = "The reference object to the schema and type of target resource which is described by resource specification")
@JsonTypeName("TargetResourceSchema_FVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class TargetResourceSchemaFVO {

  private String atType;

  private URI atSchemaLocation;

  public TargetResourceSchemaFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TargetResourceSchemaFVO(String atType, URI atSchemaLocation) {
    this.atType = atType;
    this.atSchemaLocation = atSchemaLocation;
  }

  public TargetResourceSchemaFVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Class type of the target resource
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "Class type of the target resource", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public TargetResourceSchemaFVO atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * This field provides a link to the schema describing the target resource
   * @return atSchemaLocation
   */
  @NotNull @Valid 
  @Schema(name = "@schemaLocation", description = "This field provides a link to the schema describing the target resource", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetResourceSchemaFVO targetResourceSchemaFVO = (TargetResourceSchemaFVO) o;
    return Objects.equals(this.atType, targetResourceSchemaFVO.atType) &&
        Objects.equals(this.atSchemaLocation, targetResourceSchemaFVO.atSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetResourceSchemaFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
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

