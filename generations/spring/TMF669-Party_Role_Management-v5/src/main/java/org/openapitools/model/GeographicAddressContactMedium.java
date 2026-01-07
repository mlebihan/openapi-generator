package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.GeographicAddressRef;
import org.openapitools.model.TimePeriod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicAddressContactMedium
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicAddressContactMedium extends ContactMedium {

  private @Nullable String city;

  private @Nullable String country;

  private @Nullable String postCode;

  private @Nullable String stateOrProvince;

  private @Nullable String street1;

  private @Nullable String street2;

  private @Nullable GeographicAddressRef geographicAddress;

  public GeographicAddressContactMedium() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicAddressContactMedium(String atType) {
    super(atType);
  }

  public GeographicAddressContactMedium city(@Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * The city
   * @return city
   */
  
  @Schema(name = "city", description = "The city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public @Nullable String getCity() {
    return city;
  }

  public void setCity(@Nullable String city) {
    this.city = city;
  }

  public GeographicAddressContactMedium country(@Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country
   * @return country
   */
  
  @Schema(name = "country", description = "The country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable String getCountry() {
    return country;
  }

  public void setCountry(@Nullable String country) {
    this.country = country;
  }

  public GeographicAddressContactMedium postCode(@Nullable String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Postcode
   * @return postCode
   */
  
  @Schema(name = "postCode", description = "Postcode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postCode")
  public @Nullable String getPostCode() {
    return postCode;
  }

  public void setPostCode(@Nullable String postCode) {
    this.postCode = postCode;
  }

  public GeographicAddressContactMedium stateOrProvince(@Nullable String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * State or province
   * @return stateOrProvince
   */
  
  @Schema(name = "stateOrProvince", description = "State or province", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateOrProvince")
  public @Nullable String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(@Nullable String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public GeographicAddressContactMedium street1(@Nullable String street1) {
    this.street1 = street1;
    return this;
  }

  /**
   * Describes the street
   * @return street1
   */
  
  @Schema(name = "street1", description = "Describes the street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street1")
  public @Nullable String getStreet1() {
    return street1;
  }

  public void setStreet1(@Nullable String street1) {
    this.street1 = street1;
  }

  public GeographicAddressContactMedium street2(@Nullable String street2) {
    this.street2 = street2;
    return this;
  }

  /**
   * Complementary street description
   * @return street2
   */
  
  @Schema(name = "street2", description = "Complementary street description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street2")
  public @Nullable String getStreet2() {
    return street2;
  }

  public void setStreet2(@Nullable String street2) {
    this.street2 = street2;
  }

  public GeographicAddressContactMedium geographicAddress(@Nullable GeographicAddressRef geographicAddress) {
    this.geographicAddress = geographicAddress;
    return this;
  }

  /**
   * Get geographicAddress
   * @return geographicAddress
   */
  @Valid 
  @Schema(name = "geographicAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geographicAddress")
  public @Nullable GeographicAddressRef getGeographicAddress() {
    return geographicAddress;
  }

  public void setGeographicAddress(@Nullable GeographicAddressRef geographicAddress) {
    this.geographicAddress = geographicAddress;
  }


  public GeographicAddressContactMedium atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicAddressContactMedium atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicAddressContactMedium atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicAddressContactMedium id(String id) {
    super.id(id);
    return this;
  }

  public GeographicAddressContactMedium preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public GeographicAddressContactMedium contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public GeographicAddressContactMedium validFor(TimePeriod validFor) {
    super.validFor(validFor);
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
    GeographicAddressContactMedium geographicAddressContactMedium = (GeographicAddressContactMedium) o;
    return Objects.equals(this.city, geographicAddressContactMedium.city) &&
        Objects.equals(this.country, geographicAddressContactMedium.country) &&
        Objects.equals(this.postCode, geographicAddressContactMedium.postCode) &&
        Objects.equals(this.stateOrProvince, geographicAddressContactMedium.stateOrProvince) &&
        Objects.equals(this.street1, geographicAddressContactMedium.street1) &&
        Objects.equals(this.street2, geographicAddressContactMedium.street2) &&
        Objects.equals(this.geographicAddress, geographicAddressContactMedium.geographicAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, postCode, stateOrProvince, street1, street2, geographicAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicAddressContactMedium {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    geographicAddress: ").append(toIndentedString(geographicAddress)).append("\n");
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

