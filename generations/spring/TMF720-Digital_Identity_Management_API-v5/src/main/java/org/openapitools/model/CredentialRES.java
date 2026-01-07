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
import org.openapitools.model.Credential;
import org.openapitools.model.DigitalIdentityRef;
import org.openapitools.model.RelatedContactMedium;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response object for Credential
 */

@Schema(name = "Credential_RES", description = "Response object for Credential")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CredentialRES extends Credential {

  public CredentialRES() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CredentialRES(String atType, String href, String id) {
    super(atType);
  }


  public CredentialRES atType(String atType) {
    super.atType(atType);
    return this;
  }

  public CredentialRES atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public CredentialRES atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public CredentialRES href(String href) {
    super.href(href);
    return this;
  }

  public CredentialRES id(String id) {
    super.id(id);
    return this;
  }

  public CredentialRES state(String state) {
    super.state(state);
    return this;
  }

  public CredentialRES validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public CredentialRES trustLevel(String trustLevel) {
    super.trustLevel(trustLevel);
    return this;
  }

  public CredentialRES relatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public CredentialRES addRelatedContactMediumItem(RelatedContactMedium relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public CredentialRES digitalIdentity(DigitalIdentityRef digitalIdentity) {
    super.digitalIdentity(digitalIdentity);
    return this;
  }

  public CredentialRES creationDate(OffsetDateTime creationDate) {
    super.creationDate(creationDate);
    return this;
  }

  public CredentialRES lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialRES {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

