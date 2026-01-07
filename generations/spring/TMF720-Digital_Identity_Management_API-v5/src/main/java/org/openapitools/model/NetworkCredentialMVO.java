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
import org.openapitools.model.CredentialMVO;
import org.openapitools.model.DigitalIdentityRef;
import org.openapitools.model.RelatedContactMedium;
import org.openapitools.model.ResourceRef;
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
 * NetworkCredentialMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class NetworkCredentialMVO extends CredentialMVO {

  private @Nullable String password;

  private @Nullable ResourceRef resource;

  public NetworkCredentialMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NetworkCredentialMVO(String atType) {
    super(atType);
  }

  public NetworkCredentialMVO password(@Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Credential password to use resource based credential. Sensitive data such as passwords MUST be ommitted in GET responses.
   * @return password
   */
  
  @Schema(name = "password", description = "Credential password to use resource based credential. Sensitive data such as passwords MUST be ommitted in GET responses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable String getPassword() {
    return password;
  }

  public void setPassword(@Nullable String password) {
    this.password = password;
  }

  public NetworkCredentialMVO resource(@Nullable ResourceRef resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public @Nullable ResourceRef getResource() {
    return resource;
  }

  public void setResource(@Nullable ResourceRef resource) {
    this.resource = resource;
  }


  public NetworkCredentialMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public NetworkCredentialMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public NetworkCredentialMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public NetworkCredentialMVO href(String href) {
    super.href(href);
    return this;
  }

  public NetworkCredentialMVO id(String id) {
    super.id(id);
    return this;
  }

  public NetworkCredentialMVO relatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public NetworkCredentialMVO addRelatedContactMediumItem(RelatedContactMedium relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public NetworkCredentialMVO digitalIdentity(DigitalIdentityRef digitalIdentity) {
    super.digitalIdentity(digitalIdentity);
    return this;
  }

  public NetworkCredentialMVO lastUpdate(OffsetDateTime lastUpdate) {
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
    NetworkCredentialMVO networkCredentialMVO = (NetworkCredentialMVO) o;
    return Objects.equals(this.password, networkCredentialMVO.password) &&
        Objects.equals(this.resource, networkCredentialMVO.resource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, resource, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkCredentialMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

