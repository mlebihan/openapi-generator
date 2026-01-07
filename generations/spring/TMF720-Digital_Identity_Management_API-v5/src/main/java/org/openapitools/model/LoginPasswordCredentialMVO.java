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
 * LoginPasswordCredentialMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class LoginPasswordCredentialMVO extends CredentialMVO {

  private @Nullable String login;

  private @Nullable String password;

  public LoginPasswordCredentialMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoginPasswordCredentialMVO(String atType) {
    super(atType);
  }

  public LoginPasswordCredentialMVO login(@Nullable String login) {
    this.login = login;
    return this;
  }

  /**
   * credential login
   * @return login
   */
  
  @Schema(name = "login", description = "credential login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login")
  public @Nullable String getLogin() {
    return login;
  }

  public void setLogin(@Nullable String login) {
    this.login = login;
  }

  public LoginPasswordCredentialMVO password(@Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * credential password - must be in write only
   * @return password
   */
  
  @Schema(name = "password", description = "credential password - must be in write only", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable String getPassword() {
    return password;
  }

  public void setPassword(@Nullable String password) {
    this.password = password;
  }


  public LoginPasswordCredentialMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public LoginPasswordCredentialMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public LoginPasswordCredentialMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public LoginPasswordCredentialMVO href(String href) {
    super.href(href);
    return this;
  }

  public LoginPasswordCredentialMVO id(String id) {
    super.id(id);
    return this;
  }

  public LoginPasswordCredentialMVO relatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public LoginPasswordCredentialMVO addRelatedContactMediumItem(RelatedContactMedium relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public LoginPasswordCredentialMVO digitalIdentity(DigitalIdentityRef digitalIdentity) {
    super.digitalIdentity(digitalIdentity);
    return this;
  }

  public LoginPasswordCredentialMVO lastUpdate(OffsetDateTime lastUpdate) {
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
    LoginPasswordCredentialMVO loginPasswordCredentialMVO = (LoginPasswordCredentialMVO) o;
    return Objects.equals(this.login, loginPasswordCredentialMVO.login) &&
        Objects.equals(this.password, loginPasswordCredentialMVO.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginPasswordCredentialMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

