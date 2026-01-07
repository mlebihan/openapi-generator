package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.ContactMedium;
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
 * PhoneContactMedium
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PhoneContactMedium extends ContactMedium {

  private @Nullable String phoneNumber;

  public PhoneContactMedium() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhoneContactMedium(String atType) {
    super(atType);
  }

  public PhoneContactMedium phoneNumber(@Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The phone number of the contact
   * @return phoneNumber
   */
  
  @Schema(name = "phoneNumber", description = "The phone number of the contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneNumber")
  public @Nullable String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneContactMedium atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PhoneContactMedium atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PhoneContactMedium atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PhoneContactMedium id(String id) {
    super.id(id);
    return this;
  }

  public PhoneContactMedium preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public PhoneContactMedium contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public PhoneContactMedium validFor(TimePeriod validFor) {
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
    PhoneContactMedium phoneContactMedium = (PhoneContactMedium) o;
    return Objects.equals(this.phoneNumber, phoneContactMedium.phoneNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneContactMedium {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

