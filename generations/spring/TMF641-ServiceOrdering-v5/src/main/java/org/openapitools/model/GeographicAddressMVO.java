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
import org.openapitools.model.ExternalIdentifierMVO;
import org.openapitools.model.GeographicLocationRefOrValueMVO;
import org.openapitools.model.GeographicSubAddressMVO;
import org.openapitools.model.PlaceMVO;
import org.openapitools.model.StandardIdentifierMVO;
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
 * GeographicAddressMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicAddressMVO extends PlaceMVO implements PlaceRefOrValueMVO {

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
  private List<StandardIdentifierMVO> countryCode = new ArrayList<>();

  @Valid
  private List<ExternalIdentifierMVO> externalIdentifier = new ArrayList<>();

  private @Nullable GeographicLocationRefOrValueMVO geographicLocation;

  @Valid
  private List<GeographicSubAddressMVO> geographicSubAddress = new ArrayList<>();

  private @Nullable String geographicAddressType;

  public GeographicAddressMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicAddressMVO(String atType) {
    super(atType);
  }

  public GeographicAddressMVO city(@Nullable String city) {
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

  public GeographicAddressMVO country(@Nullable String country) {
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

  public GeographicAddressMVO locality(@Nullable String locality) {
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

  public GeographicAddressMVO postcode(@Nullable String postcode) {
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

  public GeographicAddressMVO stateOrProvince(@Nullable String stateOrProvince) {
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

  public GeographicAddressMVO streetName(@Nullable String streetName) {
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

  public GeographicAddressMVO streetNr(@Nullable String streetNr) {
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

  public GeographicAddressMVO streetNrLast(@Nullable String streetNrLast) {
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

  public GeographicAddressMVO streetNrLastSuffix(@Nullable String streetNrLastSuffix) {
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

  public GeographicAddressMVO streetNrSuffix(@Nullable String streetNrSuffix) {
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

  public GeographicAddressMVO streetSuffix(@Nullable String streetSuffix) {
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

  public GeographicAddressMVO streetType(@Nullable String streetType) {
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

  public GeographicAddressMVO countryCode(List<StandardIdentifierMVO> countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public GeographicAddressMVO addCountryCodeItem(StandardIdentifierMVO countryCodeItem) {
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
  public List<StandardIdentifierMVO> getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(List<StandardIdentifierMVO> countryCode) {
    this.countryCode = countryCode;
  }

  public GeographicAddressMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public GeographicAddressMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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

  public GeographicAddressMVO geographicLocation(@Nullable GeographicLocationRefOrValueMVO geographicLocation) {
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
  public @Nullable GeographicLocationRefOrValueMVO getGeographicLocation() {
    return geographicLocation;
  }

  public void setGeographicLocation(@Nullable GeographicLocationRefOrValueMVO geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

  public GeographicAddressMVO geographicSubAddress(List<GeographicSubAddressMVO> geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
    return this;
  }

  public GeographicAddressMVO addGeographicSubAddressItem(GeographicSubAddressMVO geographicSubAddressItem) {
    if (this.geographicSubAddress == null) {
      this.geographicSubAddress = new ArrayList<>();
    }
    this.geographicSubAddress.add(geographicSubAddressItem);
    return this;
  }

  /**
   * Get geographicSubAddress
   * @return geographicSubAddress
   */
  @Valid 
  @Schema(name = "geographicSubAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicSubAddress")
  public List<GeographicSubAddressMVO> getGeographicSubAddress() {
    return geographicSubAddress;
  }

  public void setGeographicSubAddress(List<GeographicSubAddressMVO> geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
  }

  public GeographicAddressMVO geographicAddressType(@Nullable String geographicAddressType) {
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


  public GeographicAddressMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicAddressMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicAddressMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicAddressMVO href(String href) {
    super.href(href);
    return this;
  }

  public GeographicAddressMVO id(String id) {
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
    GeographicAddressMVO geographicAddressMVO = (GeographicAddressMVO) o;
    return Objects.equals(this.city, geographicAddressMVO.city) &&
        Objects.equals(this.country, geographicAddressMVO.country) &&
        Objects.equals(this.locality, geographicAddressMVO.locality) &&
        Objects.equals(this.postcode, geographicAddressMVO.postcode) &&
        Objects.equals(this.stateOrProvince, geographicAddressMVO.stateOrProvince) &&
        Objects.equals(this.streetName, geographicAddressMVO.streetName) &&
        Objects.equals(this.streetNr, geographicAddressMVO.streetNr) &&
        Objects.equals(this.streetNrLast, geographicAddressMVO.streetNrLast) &&
        Objects.equals(this.streetNrLastSuffix, geographicAddressMVO.streetNrLastSuffix) &&
        Objects.equals(this.streetNrSuffix, geographicAddressMVO.streetNrSuffix) &&
        Objects.equals(this.streetSuffix, geographicAddressMVO.streetSuffix) &&
        Objects.equals(this.streetType, geographicAddressMVO.streetType) &&
        Objects.equals(this.countryCode, geographicAddressMVO.countryCode) &&
        Objects.equals(this.externalIdentifier, geographicAddressMVO.externalIdentifier) &&
        Objects.equals(this.geographicLocation, geographicAddressMVO.geographicLocation) &&
        Objects.equals(this.geographicSubAddress, geographicAddressMVO.geographicSubAddress) &&
        Objects.equals(this.geographicAddressType, geographicAddressMVO.geographicAddressType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, locality, postcode, stateOrProvince, streetName, streetNr, streetNrLast, streetNrLastSuffix, streetNrSuffix, streetSuffix, streetType, countryCode, externalIdentifier, geographicLocation, geographicSubAddress, geographicAddressType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressMVO {\n");
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
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
    sb.append("    geographicSubAddress: ").append(toIndentedString(geographicSubAddress)).append("\n");
    sb.append("    geographicAddressType: ").append(toIndentedString(geographicAddressType)).append("\n");
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

