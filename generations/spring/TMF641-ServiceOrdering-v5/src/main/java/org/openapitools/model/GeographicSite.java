package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CalendarPeriod;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.GeographicSiteRelationship;
import org.openapitools.model.Place;
import org.openapitools.model.PlaceRefOrValue;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
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
 * GeographicSite
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSite extends Place implements PlaceRefOrValue {

  private @Nullable String code;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime creationDate;

  private @Nullable String description;

  private @Nullable String status;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<ExternalIdentifier> externalIdentifier = new ArrayList<>();

  @Valid
  private List<CalendarPeriod> calendar = new ArrayList<>();

  @Valid
  private List<@Valid PlaceRefOrValue> place = new ArrayList<>();

  @Valid
  private List<GeographicSiteRelationship> siteRelationship = new ArrayList<>();

  public GeographicSite() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSite(String atType) {
    super(atType);
  }

  public GeographicSite code(@Nullable String code) {
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

  public GeographicSite creationDate(@Nullable OffsetDateTime creationDate) {
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

  public GeographicSite description(@Nullable String description) {
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

  public GeographicSite status(@Nullable String status) {
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

  public GeographicSite relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSite addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
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
  public List<RelatedPartyRefOrPartyRoleRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSite externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public GeographicSite addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
  public List<ExternalIdentifier> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public GeographicSite calendar(List<CalendarPeriod> calendar) {
    this.calendar = calendar;
    return this;
  }

  public GeographicSite addCalendarItem(CalendarPeriod calendarItem) {
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
  public List<CalendarPeriod> getCalendar() {
    return calendar;
  }

  public void setCalendar(List<CalendarPeriod> calendar) {
    this.calendar = calendar;
  }

  public GeographicSite place(List<@Valid PlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public GeographicSite addPlaceItem(PlaceRefOrValue placeItem) {
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
  public List<@Valid PlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<@Valid PlaceRefOrValue> place) {
    this.place = place;
  }

  public GeographicSite siteRelationship(List<GeographicSiteRelationship> siteRelationship) {
    this.siteRelationship = siteRelationship;
    return this;
  }

  public GeographicSite addSiteRelationshipItem(GeographicSiteRelationship siteRelationshipItem) {
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
  public List<GeographicSiteRelationship> getSiteRelationship() {
    return siteRelationship;
  }

  public void setSiteRelationship(List<GeographicSiteRelationship> siteRelationship) {
    this.siteRelationship = siteRelationship;
  }


  public GeographicSite atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSite atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSite atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicSite href(String href) {
    super.href(href);
    return this;
  }

  public GeographicSite id(String id) {
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
    GeographicSite geographicSite = (GeographicSite) o;
    return Objects.equals(this.code, geographicSite.code) &&
        Objects.equals(this.creationDate, geographicSite.creationDate) &&
        Objects.equals(this.description, geographicSite.description) &&
        Objects.equals(this.status, geographicSite.status) &&
        Objects.equals(this.relatedParty, geographicSite.relatedParty) &&
        Objects.equals(this.externalIdentifier, geographicSite.externalIdentifier) &&
        Objects.equals(this.calendar, geographicSite.calendar) &&
        Objects.equals(this.place, geographicSite.place) &&
        Objects.equals(this.siteRelationship, geographicSite.siteRelationship) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, creationDate, description, status, relatedParty, externalIdentifier, calendar, place, siteRelationship, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSite {\n");
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

