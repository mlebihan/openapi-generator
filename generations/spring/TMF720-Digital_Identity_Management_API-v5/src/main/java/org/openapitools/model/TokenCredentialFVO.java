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
import org.openapitools.model.CredentialFVO;
import org.openapitools.model.DigitalIdentityRef;
import org.openapitools.model.RelatedContactMediumFVO;
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
 * TokenCredentialFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class TokenCredentialFVO extends CredentialFVO {

  private @Nullable String login;

  private @Nullable String tokenCredential;

  public TokenCredentialFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TokenCredentialFVO(String atType, String id) {
    super(atType, id);
  }

  public TokenCredentialFVO login(@Nullable String login) {
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

  public TokenCredentialFVO tokenCredential(@Nullable String tokenCredential) {
    this.tokenCredential = tokenCredential;
    return this;
  }

  /**
   * Token credential identifier
   * @return tokenCredential
   */
  
  @Schema(name = "tokenCredential", description = "Token credential identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenCredential")
  public @Nullable String getTokenCredential() {
    return tokenCredential;
  }

  public void setTokenCredential(@Nullable String tokenCredential) {
    this.tokenCredential = tokenCredential;
  }


  public TokenCredentialFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public TokenCredentialFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public TokenCredentialFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public TokenCredentialFVO href(String href) {
    super.href(href);
    return this;
  }

  public TokenCredentialFVO id(String id) {
    super.id(id);
    return this;
  }

  public TokenCredentialFVO relatedContactMedium(List<RelatedContactMediumFVO> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public TokenCredentialFVO addRelatedContactMediumItem(RelatedContactMediumFVO relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public TokenCredentialFVO digitalIdentity(DigitalIdentityRef digitalIdentity) {
    super.digitalIdentity(digitalIdentity);
    return this;
  }

  public TokenCredentialFVO lastUpdate(OffsetDateTime lastUpdate) {
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
    TokenCredentialFVO tokenCredentialFVO = (TokenCredentialFVO) o;
    return Objects.equals(this.login, tokenCredentialFVO.login) &&
        Objects.equals(this.tokenCredential, tokenCredentialFVO.tokenCredential) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, tokenCredential, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCredentialFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    tokenCredential: ").append(toIndentedString(tokenCredential)).append("\n");
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

