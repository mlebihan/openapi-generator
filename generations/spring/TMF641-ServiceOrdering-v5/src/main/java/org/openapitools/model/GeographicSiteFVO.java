package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalendarPeriodFVO;
import org.openapitools.model.ExternalIdentifierFVO;
import org.openapitools.model.GeographicSiteRelationshipFVO;
import org.openapitools.model.PlaceFVO;
import org.openapitools.model.PlaceRefOrValueFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicSiteFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSiteFVO extends PlaceFVO implements PlaceRefOrValueFVO {

  private @Nullable String code;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime creationDate;

  private @Nullable String description;

  private @Nullable String status;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierFVO> externalIdentifier = new ArrayList<>();

  @Valid
  private List<CalendarPeriodFVO> calendar = new ArrayList<>();

  @Valid
  private List<@Valid PlaceRefOrValueFVO> place = new ArrayList<>();

  @Valid
  private List<GeographicSiteRelationshipFVO> siteRelationship = new ArrayList<>();

  public GeographicSiteFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteFVO(String atType) {
    super(atType);
  }

  public GeographicSiteFVO code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * A code that may be used for some addressing schemes eg: [ANSI T1.253-1999]
   * @return code
   */
  
  @Schema(name = "code", description = "A code that may be used for some addressing schemes eg: [ANSI T1.253-1999]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public GeographicSiteFVO creationDate(@Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date and time when the GeographicSite was created
   * @return creationDate
   */
  @Valid 
  @Schema(name = "creationDate", description = "Date and time when the GeographicSite was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public @Nullable OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public GeographicSiteFVO description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Text describing additional information regarding the site
   * @return description
   */
  
  @Schema(name = "description", description = "Text describing additional information regarding the site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public GeographicSiteFVO status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * The condition of the GeographicSite, such as planned, underConstruction, cancelled, active, inactive, former
   * @return status
   */
  
  @Schema(name = "status", description = "The condition of the GeographicSite, such as planned, underConstruction, cancelled, active, inactive, former", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public GeographicSiteFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSiteFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefFVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSiteFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public GeographicSiteFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
    if (this.externalIdentifier == null) {
      this.externalIdentifier = new ArrayList<>();
    }
    this.externalIdentifier.add(externalIdentifierItem);
    return this;
  }

  /**
   * Get externalIdentifier
   * @return externalIdentifier
   */
  @Valid 
  @Schema(name = "externalIdentifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifier")
  public List<ExternalIdentifierFVO> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public GeographicSiteFVO calendar(List<CalendarPeriodFVO> calendar) {
    this.calendar = calendar;
    return this;
  }

  public GeographicSiteFVO addCalendarItem(CalendarPeriodFVO calendarItem) {
    if (this.calendar == null) {
      this.calendar = new ArrayList<>();
    }
    this.calendar.add(calendarItem);
    return this;
  }

  /**
   * Get calendar
   * @return calendar
   */
  @Valid 
  @Schema(name = "calendar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calendar")
  public List<CalendarPeriodFVO> getCalendar() {
    return calendar;
  }

  public void setCalendar(List<CalendarPeriodFVO> calendar) {
    this.calendar = calendar;
  }

  public GeographicSiteFVO place(List<@Valid PlaceRefOrValueFVO> place) {
    this.place = place;
    return this;
  }

  public GeographicSiteFVO addPlaceItem(PlaceRefOrValueFVO placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
   */
  @Valid 
  @Schema(name = "place", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("place")
  public List<@Valid PlaceRefOrValueFVO> getPlace() {
    return place;
  }

  public void setPlace(List<@Valid PlaceRefOrValueFVO> place) {
    this.place = place;
  }

  public GeographicSiteFVO siteRelationship(List<GeographicSiteRelationshipFVO> siteRelationship) {
    this.siteRelationship = siteRelationship;
    return this;
  }

  public GeographicSiteFVO addSiteRelationshipItem(GeographicSiteRelationshipFVO siteRelationshipItem) {
    if (this.siteRelationship == null) {
      this.siteRelationship = new ArrayList<>();
    }
    this.siteRelationship.add(siteRelationshipItem);
    return this;
  }

  /**
   * Get siteRelationship
   * @return siteRelationship
   */
  @Valid 
  @Schema(name = "siteRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("siteRelationship")
  public List<GeographicSiteRelationshipFVO> getSiteRelationship() {
    return siteRelationship;
  }

  public void setSiteRelationship(List<GeographicSiteRelationshipFVO> siteRelationship) {
    this.siteRelationship = siteRelationship;
  }


  public GeographicSiteFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSiteFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSiteFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicSiteFVO href(String href) {
    super.href(href);
    return this;
  }

  public GeographicSiteFVO id(String id) {
    super.id(id);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSiteFVO geographicSiteFVO = (GeographicSiteFVO) o;
    return Objects.equals(this.code, geographicSiteFVO.code) &&
        Objects.equals(this.creationDate, geographicSiteFVO.creationDate) &&
        Objects.equals(this.description, geographicSiteFVO.description) &&
        Objects.equals(this.status, geographicSiteFVO.status) &&
        Objects.equals(this.relatedParty, geographicSiteFVO.relatedParty) &&
        Objects.equals(this.externalIdentifier, geographicSiteFVO.externalIdentifier) &&
        Objects.equals(this.calendar, geographicSiteFVO.calendar) &&
        Objects.equals(this.place, geographicSiteFVO.place) &&
        Objects.equals(this.siteRelationship, geographicSiteFVO.siteRelationship) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, creationDate, description, status, relatedParty, externalIdentifier, calendar, place, siteRelationship, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    siteRelationship: ").append(toIndentedString(siteRelationship)).append("\n");
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

