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
import org.openapitools.model.CalendarPeriodMVO;
import org.openapitools.model.ExternalIdentifierMVO;
import org.openapitools.model.GeographicSiteRelationshipMVO;
import org.openapitools.model.PlaceMVO;
import org.openapitools.model.PlaceRefOrValueMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
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
 * GeographicSiteMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSiteMVO extends PlaceMVO implements PlaceRefOrValueMVO {

  private @Nullable String code;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime creationDate;

  private @Nullable String description;

  private @Nullable String status;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierMVO> externalIdentifier = new ArrayList<>();

  @Valid
  private List<CalendarPeriodMVO> calendar = new ArrayList<>();

  @Valid
  private List<@Valid PlaceRefOrValueMVO> place = new ArrayList<>();

  @Valid
  private List<GeographicSiteRelationshipMVO> siteRelationship = new ArrayList<>();

  public GeographicSiteMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteMVO(String atType) {
    super(atType);
  }

  public GeographicSiteMVO code(@Nullable String code) {
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

  public GeographicSiteMVO creationDate(@Nullable OffsetDateTime creationDate) {
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

  public GeographicSiteMVO description(@Nullable String description) {
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

  public GeographicSiteMVO status(@Nullable String status) {
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

  public GeographicSiteMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSiteMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
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
  public List<RelatedPartyRefOrPartyRoleRefMVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSiteMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public GeographicSiteMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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
  public List<ExternalIdentifierMVO> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public GeographicSiteMVO calendar(List<CalendarPeriodMVO> calendar) {
    this.calendar = calendar;
    return this;
  }

  public GeographicSiteMVO addCalendarItem(CalendarPeriodMVO calendarItem) {
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
  public List<CalendarPeriodMVO> getCalendar() {
    return calendar;
  }

  public void setCalendar(List<CalendarPeriodMVO> calendar) {
    this.calendar = calendar;
  }

  public GeographicSiteMVO place(List<@Valid PlaceRefOrValueMVO> place) {
    this.place = place;
    return this;
  }

  public GeographicSiteMVO addPlaceItem(PlaceRefOrValueMVO placeItem) {
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
  public List<@Valid PlaceRefOrValueMVO> getPlace() {
    return place;
  }

  public void setPlace(List<@Valid PlaceRefOrValueMVO> place) {
    this.place = place;
  }

  public GeographicSiteMVO siteRelationship(List<GeographicSiteRelationshipMVO> siteRelationship) {
    this.siteRelationship = siteRelationship;
    return this;
  }

  public GeographicSiteMVO addSiteRelationshipItem(GeographicSiteRelationshipMVO siteRelationshipItem) {
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
  public List<GeographicSiteRelationshipMVO> getSiteRelationship() {
    return siteRelationship;
  }

  public void setSiteRelationship(List<GeographicSiteRelationshipMVO> siteRelationship) {
    this.siteRelationship = siteRelationship;
  }


  public GeographicSiteMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSiteMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSiteMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicSiteMVO href(String href) {
    super.href(href);
    return this;
  }

  public GeographicSiteMVO id(String id) {
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
    GeographicSiteMVO geographicSiteMVO = (GeographicSiteMVO) o;
    return Objects.equals(this.code, geographicSiteMVO.code) &&
        Objects.equals(this.creationDate, geographicSiteMVO.creationDate) &&
        Objects.equals(this.description, geographicSiteMVO.description) &&
        Objects.equals(this.status, geographicSiteMVO.status) &&
        Objects.equals(this.relatedParty, geographicSiteMVO.relatedParty) &&
        Objects.equals(this.externalIdentifier, geographicSiteMVO.externalIdentifier) &&
        Objects.equals(this.calendar, geographicSiteMVO.calendar) &&
        Objects.equals(this.place, geographicSiteMVO.place) &&
        Objects.equals(this.siteRelationship, geographicSiteMVO.siteRelationship) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, creationDate, description, status, relatedParty, externalIdentifier, calendar, place, siteRelationship, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteMVO {\n");
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

