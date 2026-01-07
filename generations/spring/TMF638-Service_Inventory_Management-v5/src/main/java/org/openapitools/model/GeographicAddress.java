package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.GeographicAddressRelationship;
import org.openapitools.model.GeographicLocationRefOrValue;
import org.openapitools.model.GeographicSiteRefOrValue;
import org.openapitools.model.GeographicSubAddress;
import org.openapitools.model.Place;
import org.openapitools.model.StandardIdentifier;
import org.springframework.lang.Nullable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicAddress
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicAddress extends Place implements PlaceRefOrValue {

  private @Nullable String city;

  private @Nullable String country;

  private @Nullable String locality;

  private @Nullable String postcode;

  private @Nullable String stateOrProvince;

  private @Nullable String streetName;

  private @Nullable String streetNr;

  private @Nullable String streetNrLast;

  private @Nullable String streetNrLastSuffix;

  private @Nullable String streetNrSuffix;

  private @Nullable String streetSuffix;

  private @Nullable String streetType;

  @Valid
  private List<StandardIdentifier> countryCode = new ArrayList<>();

  private @Nullable GeographicLocationRefOrValue geographicLocation;

  @Valid
  private List<GeographicSubAddress> geographicSubAddress = new ArrayList<>();

  private @Nullable String geographicAddressType;

  private @Nullable GeographicSiteRefOrValue geographicSite;

  @Valid
  private List<GeographicAddressRelationship> geographicAddressRelationship = new ArrayList<>();

  public GeographicAddress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicAddress(String atType) {
    super(atType);
  }

  public GeographicAddress city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * City that the address is in
   * @return city
   */
  
  @Schema(name = "city", description = "City that the address is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public GeographicAddress country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country that the address is in
   * @return country
   */
  
  @Schema(name = "country", description = "Country that the address is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public GeographicAddress locality(@Nullable String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature. [ANZLIC-STREET], or a suburb, a bounded locality within a city, town or shire principally of urban character [ANZLICSTREET]
   * @return locality
   */
  
  @Schema(name = "locality", description = "An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature. [ANZLIC-STREET], or a suburb, a bounded locality within a city, town or shire principally of urban character [ANZLICSTREET]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locality")
  public @Nullable String getLocality() {
    return locality;
  }

  public void setLocality(@Nullable String locality) {
    this.locality = locality;
  }

  public GeographicAddress postcode(@Nullable String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also know as zipcode)
   * @return postcode
   */
  
  @Schema(name = "postcode", description = "descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also know as zipcode)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postcode")
  public @Nullable String getPostcode() {
    return postcode;
  }

  public void setPostcode(@Nullable String postcode) {
    this.postcode = postcode;
  }

  public GeographicAddress stateOrProvince(@Nullable String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * the State or Province that the address is in
   * @return stateOrProvince
   */
  
  @Schema(name = "stateOrProvince", description = "the State or Province that the address is in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateOrProvince")
  public @Nullable String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(@Nullable String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public GeographicAddress streetName(@Nullable String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of the street or other street type
   * @return streetName
   */
  
  @Schema(name = "streetName", description = "Name of the street or other street type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetName")
  public @Nullable String getStreetName() {
    return streetName;
  }

  public void setStreetName(@Nullable String streetName) {
    this.streetName = streetName;
  }

  public GeographicAddress streetNr(@Nullable String streetNr) {
    this.streetNr = streetNr;
    return this;
  }

  /**
   * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
   * @return streetNr
   */
  
  @Schema(name = "streetNr", description = "Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetNr")
  public @Nullable String getStreetNr() {
    return streetNr;
  }

  public void setStreetNr(@Nullable String streetNr) {
    this.streetNr = streetNr;
  }

  public GeographicAddress streetNrLast(@Nullable String streetNrLast) {
    this.streetNrLast = streetNrLast;
    return this;
  }

  /**
   * Last number in a range of street numbers allocated to a property
   * @return streetNrLast
   */
  
  @Schema(name = "streetNrLast", description = "Last number in a range of street numbers allocated to a property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetNrLast")
  public @Nullable String getStreetNrLast() {
    return streetNrLast;
  }

  public void setStreetNrLast(@Nullable String streetNrLast) {
    this.streetNrLast = streetNrLast;
  }

  public GeographicAddress streetNrLastSuffix(@Nullable String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
    return this;
  }

  /**
   * Last street number suffix for a ranged address
   * @return streetNrLastSuffix
   */
  
  @Schema(name = "streetNrLastSuffix", description = "Last street number suffix for a ranged address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetNrLastSuffix")
  public @Nullable String getStreetNrLastSuffix() {
    return streetNrLastSuffix;
  }

  public void setStreetNrLastSuffix(@Nullable String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
  }

  public GeographicAddress streetNrSuffix(@Nullable String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
    return this;
  }

  /**
   * the first street number suffix
   * @return streetNrSuffix
   */
  
  @Schema(name = "streetNrSuffix", description = "the first street number suffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetNrSuffix")
  public @Nullable String getStreetNrSuffix() {
    return streetNrSuffix;
  }

  public void setStreetNrSuffix(@Nullable String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
  }

  public GeographicAddress streetSuffix(@Nullable String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

  /**
   * A modifier denoting a relative direction
   * @return streetSuffix
   */
  
  @Schema(name = "streetSuffix", description = "A modifier denoting a relative direction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetSuffix")
  public @Nullable String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(@Nullable String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public GeographicAddress streetType(@Nullable String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf 
   * @return streetType
   */
  
  @Schema(name = "streetType", description = "alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetType")
  public @Nullable String getStreetType() {
    return streetType;
  }

  public void setStreetType(@Nullable String streetType) {
    this.streetType = streetType;
  }

  public GeographicAddress countryCode(List<StandardIdentifier> countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public GeographicAddress addCountryCodeItem(StandardIdentifier countryCodeItem) {
    if (this.countryCode == null) {
      this.countryCode = new ArrayList<>();
    }
    this.countryCode.add(countryCodeItem);
    return this;
  }

  /**
   * Country codes are short alphabetic or numeric geographical codes (geocodes) developed to represent countries and dependent areas, for use in data processing and communications. Several different systems have been developed to do this. The term country code frequently refers to ISO 3166-1 alpha-2 or international dialing codes, the E.164 country calling codes.
   * @return countryCode
   */
  @Valid 
  @Schema(name = "countryCode", description = "Country codes are short alphabetic or numeric geographical codes (geocodes) developed to represent countries and dependent areas, for use in data processing and communications. Several different systems have been developed to do this. The term country code frequently refers to ISO 3166-1 alpha-2 or international dialing codes, the E.164 country calling codes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public List<StandardIdentifier> getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(List<StandardIdentifier> countryCode) {
    this.countryCode = countryCode;
  }

  public GeographicAddress geographicLocation(@Nullable GeographicLocationRefOrValue geographicLocation) {
    this.geographicLocation = geographicLocation;
    return this;
  }

  /**
   * Get geographicLocation
   * @return geographicLocation
   */
  @Valid 
  @Schema(name = "geographicLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicLocation")
  public @Nullable GeographicLocationRefOrValue getGeographicLocation() {
    return geographicLocation;
  }

  public void setGeographicLocation(@Nullable GeographicLocationRefOrValue geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

  public GeographicAddress geographicSubAddress(List<GeographicSubAddress> geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
    return this;
  }

  public GeographicAddress addGeographicSubAddressItem(GeographicSubAddress geographicSubAddressItem) {
    if (this.geographicSubAddress == null) {
      this.geographicSubAddress = new ArrayList<>();
    }
    this.geographicSubAddress.add(geographicSubAddressItem);
    return this;
  }

  /**
   * Collection of sub addresses
   * @return geographicSubAddress
   */
  @Valid 
  @Schema(name = "geographicSubAddress", description = "Collection of sub addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicSubAddress")
  public List<GeographicSubAddress> getGeographicSubAddress() {
    return geographicSubAddress;
  }

  public void setGeographicSubAddress(List<GeographicSubAddress> geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
  }

  public GeographicAddress geographicAddressType(@Nullable String geographicAddressType) {
    this.geographicAddressType = geographicAddressType;
    return this;
  }

  /**
   * Classification of the address, e.g., residential, industrial 
   * @return geographicAddressType
   */
  
  @Schema(name = "geographicAddressType", description = "Classification of the address, e.g., residential, industrial ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicAddressType")
  public @Nullable String getGeographicAddressType() {
    return geographicAddressType;
  }

  public void setGeographicAddressType(@Nullable String geographicAddressType) {
    this.geographicAddressType = geographicAddressType;
  }

  public GeographicAddress geographicSite(@Nullable GeographicSiteRefOrValue geographicSite) {
    this.geographicSite = geographicSite;
    return this;
  }

  /**
   * Get geographicSite
   * @return geographicSite
   */
  @Valid 
  @Schema(name = "geographicSite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicSite")
  public @Nullable GeographicSiteRefOrValue getGeographicSite() {
    return geographicSite;
  }

  public void setGeographicSite(@Nullable GeographicSiteRefOrValue geographicSite) {
    this.geographicSite = geographicSite;
  }

  public GeographicAddress geographicAddressRelationship(List<GeographicAddressRelationship> geographicAddressRelationship) {
    this.geographicAddressRelationship = geographicAddressRelationship;
    return this;
  }

  public GeographicAddress addGeographicAddressRelationshipItem(GeographicAddressRelationship geographicAddressRelationshipItem) {
    if (this.geographicAddressRelationship == null) {
      this.geographicAddressRelationship = new ArrayList<>();
    }
    this.geographicAddressRelationship.add(geographicAddressRelationshipItem);
    return this;
  }

  /**
   * A list of geographic addresses relationships. Represents a relationship between geographic addresses
   * @return geographicAddressRelationship
   */
  @Valid 
  @Schema(name = "geographicAddressRelationship", description = "A list of geographic addresses relationships. Represents a relationship between geographic addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicAddressRelationship")
  public List<GeographicAddressRelationship> getGeographicAddressRelationship() {
    return geographicAddressRelationship;
  }

  public void setGeographicAddressRelationship(List<GeographicAddressRelationship> geographicAddressRelationship) {
    this.geographicAddressRelationship = geographicAddressRelationship;
  }


  public GeographicAddress atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicAddress atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicAddress atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicAddress href(String href) {
    super.href(href);
    return this;
  }

  public GeographicAddress id(String id) {
    super.id(id);
    return this;
  }

  public GeographicAddress externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public GeographicAddress addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
    super.addExternalIdentifierItem(externalIdentifierItem);
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
    GeographicAddress geographicAddress = (GeographicAddress) o;
    return Objects.equals(this.city, geographicAddress.city) &&
        Objects.equals(this.country, geographicAddress.country) &&
        Objects.equals(this.locality, geographicAddress.locality) &&
        Objects.equals(this.postcode, geographicAddress.postcode) &&
        Objects.equals(this.stateOrProvince, geographicAddress.stateOrProvince) &&
        Objects.equals(this.streetName, geographicAddress.streetName) &&
        Objects.equals(this.streetNr, geographicAddress.streetNr) &&
        Objects.equals(this.streetNrLast, geographicAddress.streetNrLast) &&
        Objects.equals(this.streetNrLastSuffix, geographicAddress.streetNrLastSuffix) &&
        Objects.equals(this.streetNrSuffix, geographicAddress.streetNrSuffix) &&
        Objects.equals(this.streetSuffix, geographicAddress.streetSuffix) &&
        Objects.equals(this.streetType, geographicAddress.streetType) &&
        Objects.equals(this.countryCode, geographicAddress.countryCode) &&
        Objects.equals(this.geographicLocation, geographicAddress.geographicLocation) &&
        Objects.equals(this.geographicSubAddress, geographicAddress.geographicSubAddress) &&
        Objects.equals(this.geographicAddressType, geographicAddress.geographicAddressType) &&
        Objects.equals(this.geographicSite, geographicAddress.geographicSite) &&
        Objects.equals(this.geographicAddressRelationship, geographicAddress.geographicAddressRelationship) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, locality, postcode, stateOrProvince, streetName, streetNr, streetNrLast, streetNrLastSuffix, streetNrSuffix, streetSuffix, streetType, countryCode, geographicLocation, geographicSubAddress, geographicAddressType, geographicSite, geographicAddressRelationship, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNr: ").append(toIndentedString(streetNr)).append("\n");
    sb.append("    streetNrLast: ").append(toIndentedString(streetNrLast)).append("\n");
    sb.append("    streetNrLastSuffix: ").append(toIndentedString(streetNrLastSuffix)).append("\n");
    sb.append("    streetNrSuffix: ").append(toIndentedString(streetNrSuffix)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
    sb.append("    geographicSubAddress: ").append(toIndentedString(geographicSubAddress)).append("\n");
    sb.append("    geographicAddressType: ").append(toIndentedString(geographicAddressType)).append("\n");
    sb.append("    geographicSite: ").append(toIndentedString(geographicSite)).append("\n");
    sb.append("    geographicAddressRelationship: ").append(toIndentedString(geographicAddressRelationship)).append("\n");
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

