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
 * FaxContactMediumFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class FaxContactMediumFVO extends ContactMediumFVO {

  private @Nullable String faxNumber;

  public FaxContactMediumFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FaxContactMediumFVO(String atType) {
    super(atType);
  }

  public FaxContactMediumFVO faxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

  /**
   * The fax number of the contact
   * @return faxNumber
   */
  
  @Schema(name = "faxNumber", description = "The fax number of the contact", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("faxNumber")
  public @Nullable String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(@Nullable String faxNumber) {
    this.faxNumber = faxNumber;
  }


  public FaxContactMediumFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public FaxContactMediumFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public FaxContactMediumFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public FaxContactMediumFVO id(String id) {
    super.id(id);
    return this;
  }

  public FaxContactMediumFVO preferred(Boolean preferred) {
    super.preferred(preferred);
    return this;
  }

  public FaxContactMediumFVO contactType(String contactType) {
    super.contactType(contactType);
    return this;
  }

  public FaxContactMediumFVO validFor(TimePeriod validFor) {
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
    FaxContactMediumFVO faxContactMediumFVO = (FaxContactMediumFVO) o;
    return Objects.equals(this.faxNumber, faxContactMediumFVO.faxNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faxNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxContactMediumFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
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

