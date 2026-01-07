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
import org.openapitools.model.CheckCredential;
import org.openapitools.model.Credential;
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
 * Response object for CheckCredential
 */

@Schema(name = "CheckCredential_RES", description = "Response object for CheckCredential")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CheckCredentialRES extends CheckCredential {

  public CheckCredentialRES() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckCredentialRES(String atType, String href, String id) {
    super(atType);
  }


  public CheckCredentialRES atType(String atType) {
    super.atType(atType);
    return this;
  }

  public CheckCredentialRES atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public CheckCredentialRES atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public CheckCredentialRES href(String href) {
    super.href(href);
    return this;
  }

  public CheckCredentialRES id(String id) {
    super.id(id);
    return this;
  }

  public CheckCredentialRES credential(Credential credential) {
    super.credential(credential);
    return this;
  }

  public CheckCredentialRES creationDate(OffsetDateTime creationDate) {
    super.creationDate(creationDate);
    return this;
  }

  public CheckCredentialRES status(String status) {
    super.status(status);
    return this;
  }

  public CheckCredentialRES lastUpdate(OffsetDateTime lastUpdate) {
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
    sb.append("class CheckCredentialRES {\n");
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

