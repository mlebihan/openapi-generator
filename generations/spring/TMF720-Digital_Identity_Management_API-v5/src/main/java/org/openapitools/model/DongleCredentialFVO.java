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
 * DongleCredentialFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class DongleCredentialFVO extends CredentialFVO {

  private @Nullable String securityKeyId;

  private @Nullable String securityKeyType;

  private @Nullable String securityKeyProvider;

  public DongleCredentialFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DongleCredentialFVO(String atType, String id) {
    super(atType, id);
  }

  public DongleCredentialFVO securityKeyId(@Nullable String securityKeyId) {
    this.securityKeyId = securityKeyId;
    return this;
  }

  /**
   * A security key identifier, also known as the credential ID, is a unique identifier associated with a specific security key. It is generated during the enrollment process when a security key is registered with a service or platform. The security key identifier is used to identify and authenticate the security key during subsequent login attempts. It serves as a reference to the corresponding cryptographic key pair stored securely within the security key.
   * @return securityKeyId
   */
  
  @Schema(name = "securityKeyId", description = "A security key identifier, also known as the credential ID, is a unique identifier associated with a specific security key. It is generated during the enrollment process when a security key is registered with a service or platform. The security key identifier is used to identify and authenticate the security key during subsequent login attempts. It serves as a reference to the corresponding cryptographic key pair stored securely within the security key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityKeyId")
  public @Nullable String getSecurityKeyId() {
    return securityKeyId;
  }

  public void setSecurityKeyId(@Nullable String securityKeyId) {
    this.securityKeyId = securityKeyId;
  }

  public DongleCredentialFVO securityKeyType(@Nullable String securityKeyType) {
    this.securityKeyType = securityKeyType;
    return this;
  }

  /**
   * The security key type refers to the classification or category of a security key based on its underlying technology or functionality. Examples: USB security key, NFC security key.
   * @return securityKeyType
   */
  
  @Schema(name = "securityKeyType", description = "The security key type refers to the classification or category of a security key based on its underlying technology or functionality. Examples: USB security key, NFC security key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityKeyType")
  public @Nullable String getSecurityKeyType() {
    return securityKeyType;
  }

  public void setSecurityKeyType(@Nullable String securityKeyType) {
    this.securityKeyType = securityKeyType;
  }

  public DongleCredentialFVO securityKeyProvider(@Nullable String securityKeyProvider) {
    this.securityKeyProvider = securityKeyProvider;
    return this;
  }

  /**
   * A security key provider refers to an entity, such as a manufacturer, vendor, or service provider, that supplies or offers security keys to end-users or organizations. These providers may develop and produce the physical security key devices or provide the associated software, services, and infrastructure necessary for their usage. Security key providers play a crucial role in ensuring the availability, quality, and security of the security keys and associated components, including firmware updates, key management systems, and authentication protocols. They may also offer additional services like customer support, integration assistance, and compliance with industry standards.
   * @return securityKeyProvider
   */
  
  @Schema(name = "securityKeyProvider", description = "A security key provider refers to an entity, such as a manufacturer, vendor, or service provider, that supplies or offers security keys to end-users or organizations. These providers may develop and produce the physical security key devices or provide the associated software, services, and infrastructure necessary for their usage. Security key providers play a crucial role in ensuring the availability, quality, and security of the security keys and associated components, including firmware updates, key management systems, and authentication protocols. They may also offer additional services like customer support, integration assistance, and compliance with industry standards.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityKeyProvider")
  public @Nullable String getSecurityKeyProvider() {
    return securityKeyProvider;
  }

  public void setSecurityKeyProvider(@Nullable String securityKeyProvider) {
    this.securityKeyProvider = securityKeyProvider;
  }


  public DongleCredentialFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public DongleCredentialFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public DongleCredentialFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public DongleCredentialFVO href(String href) {
    super.href(href);
    return this;
  }

  public DongleCredentialFVO id(String id) {
    super.id(id);
    return this;
  }

  public DongleCredentialFVO relatedContactMedium(List<RelatedContactMediumFVO> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public DongleCredentialFVO addRelatedContactMediumItem(RelatedContactMediumFVO relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public DongleCredentialFVO digitalIdentity(DigitalIdentityRef digitalIdentity) {
    super.digitalIdentity(digitalIdentity);
    return this;
  }

  public DongleCredentialFVO lastUpdate(OffsetDateTime lastUpdate) {
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
    DongleCredentialFVO dongleCredentialFVO = (DongleCredentialFVO) o;
    return Objects.equals(this.securityKeyId, dongleCredentialFVO.securityKeyId) &&
        Objects.equals(this.securityKeyType, dongleCredentialFVO.securityKeyType) &&
        Objects.equals(this.securityKeyProvider, dongleCredentialFVO.securityKeyProvider) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityKeyId, securityKeyType, securityKeyProvider, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DongleCredentialFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    securityKeyId: ").append(toIndentedString(securityKeyId)).append("\n");
    sb.append("    securityKeyType: ").append(toIndentedString(securityKeyType)).append("\n");
    sb.append("    securityKeyProvider: ").append(toIndentedString(securityKeyProvider)).append("\n");
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

