package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * HourPeriodMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class HourPeriodMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String endHour;

  private @Nullable String startHour;

  public HourPeriodMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HourPeriodMVO(String atType) {
    this.atType = atType;
  }

  public HourPeriodMVO atType(String atType) {
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

  public HourPeriodMVO atBaseType(@Nullable String atBaseType) {
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

  public HourPeriodMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public HourPeriodMVO endHour(@Nullable String endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * The time when the status ends applying
   * @return endHour
   */
  
  @Schema(name = "endHour", description = "The time when the status ends applying", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endHour")
  public @Nullable String getEndHour() {
    return endHour;
  }

  public void setEndHour(@Nullable String endHour) {
    this.endHour = endHour;
  }

  public HourPeriodMVO startHour(@Nullable String startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * The time when the status starts applying
   * @return startHour
   */
  
  @Schema(name = "startHour", description = "The time when the status starts applying", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startHour")
  public @Nullable String getStartHour() {
    return startHour;
  }

  public void setStartHour(@Nullable String startHour) {
    this.startHour = startHour;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourPeriodMVO hourPeriodMVO = (HourPeriodMVO) o;
    return Objects.equals(this.atType, hourPeriodMVO.atType) &&
        Objects.equals(this.atBaseType, hourPeriodMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, hourPeriodMVO.atSchemaLocation) &&
        Objects.equals(this.endHour, hourPeriodMVO.endHour) &&
        Objects.equals(this.startHour, hourPeriodMVO.startHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, endHour, startHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourPeriodMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
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

