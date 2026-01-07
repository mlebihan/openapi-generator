package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HourPeriod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CalendarPeriodFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CalendarPeriodFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String day;

  private @Nullable String timeZone;

  @Valid
  private List<HourPeriod> hourPeriod = new ArrayList<>();

  private String status;

  public CalendarPeriodFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CalendarPeriodFVO(String atType, String status) {
    this.atType = atType;
    this.status = status;
  }

  public CalendarPeriodFVO atType(String atType) {
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

  public CalendarPeriodFVO atBaseType(@Nullable String atBaseType) {
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

  public CalendarPeriodFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public CalendarPeriodFVO day(@Nullable String day) {
    this.day = day;
    return this;
  }

  /**
   * Day where the calendar status applies (e.g.: monday, mon-to-fri, weekdays, weekend, all week, ...)
   * @return day
   */
  
  @Schema(name = "day", description = "Day where the calendar status applies (e.g.: monday, mon-to-fri, weekdays, weekend, all week, ...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("day")
  public @Nullable String getDay() {
    return day;
  }

  public void setDay(@Nullable String day) {
    this.day = day;
  }

  public CalendarPeriodFVO timeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Indication of the timezone applicable to the calendar information (e.g.: Paris, GMT+1)
   * @return timeZone
   */
  
  @Schema(name = "timeZone", description = "Indication of the timezone applicable to the calendar information (e.g.: Paris, GMT+1)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeZone")
  public @Nullable String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(@Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public CalendarPeriodFVO hourPeriod(List<HourPeriod> hourPeriod) {
    this.hourPeriod = hourPeriod;
    return this;
  }

  public CalendarPeriodFVO addHourPeriodItem(HourPeriod hourPeriodItem) {
    if (this.hourPeriod == null) {
      this.hourPeriod = new ArrayList<>();
    }
    this.hourPeriod.add(hourPeriodItem);
    return this;
  }

  /**
   * Collection of hour intervals
   * @return hourPeriod
   */
  @Valid 
  @Schema(name = "hourPeriod", description = "Collection of hour intervals", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hourPeriod")
  public List<HourPeriod> getHourPeriod() {
    return hourPeriod;
  }

  public void setHourPeriod(List<HourPeriod> hourPeriod) {
    this.hourPeriod = hourPeriod;
  }

  public CalendarPeriodFVO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indication of the availability of the calendar period (e.g.: available, booked, etc.)
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "Indication of the availability of the calendar period (e.g.: available, booked, etc.)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarPeriodFVO calendarPeriodFVO = (CalendarPeriodFVO) o;
    return Objects.equals(this.atType, calendarPeriodFVO.atType) &&
        Objects.equals(this.atBaseType, calendarPeriodFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, calendarPeriodFVO.atSchemaLocation) &&
        Objects.equals(this.day, calendarPeriodFVO.day) &&
        Objects.equals(this.timeZone, calendarPeriodFVO.timeZone) &&
        Objects.equals(this.hourPeriod, calendarPeriodFVO.hourPeriod) &&
        Objects.equals(this.status, calendarPeriodFVO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, day, timeZone, hourPeriod, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarPeriodFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    hourPeriod: ").append(toIndentedString(hourPeriod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

