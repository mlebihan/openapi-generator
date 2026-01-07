package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ContactMediumFVO;
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
 * PhoneContactMediumFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PhoneContactMediumFVO extends ContactMediumFVO {

  private @Nullable String phoneNumber;

  public PhoneContactMediumFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhoneContactMediumFVO(String atType) {
    super(atType);
  }

  public PhoneContactMediumFVO phoneNumber(@Nullable String phoneNumber) {
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


  public PhoneContactMediumFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PhoneContactMediumFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PhoneContactMediumFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PhoneContactMediumFVO id(String id) {
    super.id(id);
    return this;
  }

  public PhoneContactMediumFVO preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public PhoneContactMediumFVO contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public PhoneContactMediumFVO validFor(TimePeriod validFor) {
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
    PhoneContactMediumFVO phoneContactMediumFVO = (PhoneContactMediumFVO) o;
    return Objects.equals(this.phoneNumber, phoneContactMediumFVO.phoneNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneContactMediumFVO {\n");
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

