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
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.CredentialRefOrValue;
import org.openapitools.model.IndividualRef;
import org.openapitools.model.RelatedContactMedium;
import org.openapitools.model.RelatedSecurityPrincipalRef;
import org.openapitools.model.ResourceRef;
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
 * DigitalIdentityMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class DigitalIdentityMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String nickname;

  private @Nullable String state;

  private @Nullable TimePeriod validFor;

  @Valid
  private List<@Valid CredentialRefOrValue> credential = new ArrayList<>();

  @Valid
  private List<RelatedContactMedium> relatedContactMedium = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentRefOrValue> attachment = new ArrayList<>();

  private @Nullable IndividualRef individualIdentified;

  @Valid
  private List<RelatedSecurityPrincipalRef> partyRoleIdentified = new ArrayList<>();

  private @Nullable ResourceRef resourceIdentified;

  @Valid
  private List<RelatedSecurityPrincipalRef> resourceRoleIdentified = new ArrayList<>();

  @Valid
  private List<RelatedSecurityPrincipalRef> relatedSecurityPrincipal = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  public DigitalIdentityMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DigitalIdentityMVO(String atType) {
    this.atType = atType;
  }

  public DigitalIdentityMVO atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public DigitalIdentityMVO atBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public @Nullable String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public DigitalIdentityMVO atSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public DigitalIdentityMVO href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public DigitalIdentityMVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public DigitalIdentityMVO nickname(@Nullable String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Nickname associated to this digital identity (like Juanito17 or the QuebecMoose etc...).
   * @return nickname
   */
  
  @Schema(name = "nickname", description = "Nickname associated to this digital identity (like Juanito17 or the QuebecMoose etc...).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nickname")
  public @Nullable String getNickname() {
    return nickname;
  }

  public void setNickname(@Nullable String nickname) {
    this.nickname = nickname;
  }

  public DigitalIdentityMVO state(@Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * Represents the current lifecycle status of the digital identity, such as Active (Represents a valid and currently accessible digital identity. Users with an active status can log in, access resources, and perform authorized actions.), Inactive (Indicates that a digital identity is temporarily disabled or not in use. Users with an inactive status cannot log in or access resources until reactivated.), Locked (A status triggered by multiple failed login attempts. A locked identity prevents further login until an administrator intervenes or a specified time elapses.), Suspended (Denotes a temporary suspension due to policy violations or other reasons. Users with a suspended status cannot perform actions until the suspension is lifted.), Pending Approval (Refers to newly created identities awaiting approval from administrators. These identities are not yet fully active.), Expired (Indicates that an identity's validity period has lapsed. Users with an expired status need to renew their credentials or revalidate their identity.), Terminated (Represents a permanently disabled identity. Users with a “terminated” status no longer have access rights.). It reflects whether the identity is valid and can be used for authentication or authorization.
   * @return state
   */
  
  @Schema(name = "state", example = "Active", description = "Represents the current lifecycle status of the digital identity, such as Active (Represents a valid and currently accessible digital identity. Users with an active status can log in, access resources, and perform authorized actions.), Inactive (Indicates that a digital identity is temporarily disabled or not in use. Users with an inactive status cannot log in or access resources until reactivated.), Locked (A status triggered by multiple failed login attempts. A locked identity prevents further login until an administrator intervenes or a specified time elapses.), Suspended (Denotes a temporary suspension due to policy violations or other reasons. Users with a suspended status cannot perform actions until the suspension is lifted.), Pending Approval (Refers to newly created identities awaiting approval from administrators. These identities are not yet fully active.), Expired (Indicates that an identity's validity period has lapsed. Users with an expired status need to renew their credentials or revalidate their identity.), Terminated (Represents a permanently disabled identity. Users with a “terminated” status no longer have access rights.). It reflects whether the identity is valid and can be used for authentication or authorization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable String getState() {
    return state;
  }

  public void setState(@Nullable String state) {
    this.state = state;
  }

  public DigitalIdentityMVO validFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public @Nullable TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
  }

  public DigitalIdentityMVO credential(List<@Valid CredentialRefOrValue> credential) {
    this.credential = credential;
    return this;
  }

  public DigitalIdentityMVO addCredentialItem(CredentialRefOrValue credentialItem) {
    if (this.credential == null) {
      this.credential = new ArrayList<>();
    }
    this.credential.add(credentialItem);
    return this;
  }

  /**
   * A list of credential/authentification method that are used for this digital identity.
   * @return credential
   */
  @Valid 
  @Schema(name = "credential", description = "A list of credential/authentification method that are used for this digital identity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credential")
  public List<@Valid CredentialRefOrValue> getCredential() {
    return credential;
  }

  public void setCredential(List<@Valid CredentialRefOrValue> credential) {
    this.credential = credential;
  }

  public DigitalIdentityMVO relatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    this.relatedContactMedium = relatedContactMedium;
    return this;
  }

  public DigitalIdentityMVO addRelatedContactMediumItem(RelatedContactMedium relatedContactMediumItem) {
    if (this.relatedContactMedium == null) {
      this.relatedContactMedium = new ArrayList<>();
    }
    this.relatedContactMedium.add(relatedContactMediumItem);
    return this;
  }

  /**
   * List of digital identity related contact mediums, such as digital-id-recovery-email, digital-id-recovery-phone, digital-id-2nd-factor-email, digital-id-2nd-factor-phone.
   * @return relatedContactMedium
   */
  @Valid 
  @Schema(name = "relatedContactMedium", description = "List of digital identity related contact mediums, such as digital-id-recovery-email, digital-id-recovery-phone, digital-id-2nd-factor-email, digital-id-2nd-factor-phone.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedContactMedium")
  public List<RelatedContactMedium> getRelatedContactMedium() {
    return relatedContactMedium;
  }

  public void setRelatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    this.relatedContactMedium = relatedContactMedium;
  }

  public DigitalIdentityMVO attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public DigitalIdentityMVO addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * List of attachment associated with this digital identity. Could be use to link a cute cat or moose picture to a digital identity for example.
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", description = "List of attachment associated with this digital identity. Could be use to link a cute cat or moose picture to a digital identity for example.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public DigitalIdentityMVO individualIdentified(@Nullable IndividualRef individualIdentified) {
    this.individualIdentified = individualIdentified;
    return this;
  }

  /**
   * Get individualIdentified
   * @return individualIdentified
   */
  @Valid 
  @Schema(name = "individualIdentified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualIdentified")
  public @Nullable IndividualRef getIndividualIdentified() {
    return individualIdentified;
  }

  public void setIndividualIdentified(@Nullable IndividualRef individualIdentified) {
    this.individualIdentified = individualIdentified;
  }

  public DigitalIdentityMVO partyRoleIdentified(List<RelatedSecurityPrincipalRef> partyRoleIdentified) {
    this.partyRoleIdentified = partyRoleIdentified;
    return this;
  }

  public DigitalIdentityMVO addPartyRoleIdentifiedItem(RelatedSecurityPrincipalRef partyRoleIdentifiedItem) {
    if (this.partyRoleIdentified == null) {
      this.partyRoleIdentified = new ArrayList<>();
    }
    this.partyRoleIdentified.add(partyRoleIdentifiedItem);
    return this;
  }

  /**
   * Related Party/PartyRole(s) who are identified by this digital identity.
   * @return partyRoleIdentified
   */
  @Valid 
  @Schema(name = "partyRoleIdentified", description = "Related Party/PartyRole(s) who are identified by this digital identity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyRoleIdentified")
  public List<RelatedSecurityPrincipalRef> getPartyRoleIdentified() {
    return partyRoleIdentified;
  }

  public void setPartyRoleIdentified(List<RelatedSecurityPrincipalRef> partyRoleIdentified) {
    this.partyRoleIdentified = partyRoleIdentified;
  }

  public DigitalIdentityMVO resourceIdentified(@Nullable ResourceRef resourceIdentified) {
    this.resourceIdentified = resourceIdentified;
    return this;
  }

  /**
   * Get resourceIdentified
   * @return resourceIdentified
   */
  @Valid 
  @Schema(name = "resourceIdentified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceIdentified")
  public @Nullable ResourceRef getResourceIdentified() {
    return resourceIdentified;
  }

  public void setResourceIdentified(@Nullable ResourceRef resourceIdentified) {
    this.resourceIdentified = resourceIdentified;
  }

  public DigitalIdentityMVO resourceRoleIdentified(List<RelatedSecurityPrincipalRef> resourceRoleIdentified) {
    this.resourceRoleIdentified = resourceRoleIdentified;
    return this;
  }

  public DigitalIdentityMVO addResourceRoleIdentifiedItem(RelatedSecurityPrincipalRef resourceRoleIdentifiedItem) {
    if (this.resourceRoleIdentified == null) {
      this.resourceRoleIdentified = new ArrayList<>();
    }
    this.resourceRoleIdentified.add(resourceRoleIdentifiedItem);
    return this;
  }

  /**
   * Related Resource/ResourceRole(s) who are identified by this digital identity.
   * @return resourceRoleIdentified
   */
  @Valid 
  @Schema(name = "resourceRoleIdentified", description = "Related Resource/ResourceRole(s) who are identified by this digital identity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceRoleIdentified")
  public List<RelatedSecurityPrincipalRef> getResourceRoleIdentified() {
    return resourceRoleIdentified;
  }

  public void setResourceRoleIdentified(List<RelatedSecurityPrincipalRef> resourceRoleIdentified) {
    this.resourceRoleIdentified = resourceRoleIdentified;
  }

  public DigitalIdentityMVO relatedSecurityPrincipal(List<RelatedSecurityPrincipalRef> relatedSecurityPrincipal) {
    this.relatedSecurityPrincipal = relatedSecurityPrincipal;
    return this;
  }

  public DigitalIdentityMVO addRelatedSecurityPrincipalItem(RelatedSecurityPrincipalRef relatedSecurityPrincipalItem) {
    if (this.relatedSecurityPrincipal == null) {
      this.relatedSecurityPrincipal = new ArrayList<>();
    }
    this.relatedSecurityPrincipal.add(relatedSecurityPrincipalItem);
    return this;
  }

  /**
   * Security principal who have an interest in this digital identity (like the organization in charge of providing identity). This is NOT the party identified by this digital identity.
   * @return relatedSecurityPrincipal
   */
  @Valid 
  @Schema(name = "relatedSecurityPrincipal", description = "Security principal who have an interest in this digital identity (like the organization in charge of providing identity). This is NOT the party identified by this digital identity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedSecurityPrincipal")
  public List<RelatedSecurityPrincipalRef> getRelatedSecurityPrincipal() {
    return relatedSecurityPrincipal;
  }

  public void setRelatedSecurityPrincipal(List<RelatedSecurityPrincipalRef> relatedSecurityPrincipal) {
    this.relatedSecurityPrincipal = relatedSecurityPrincipal;
  }

  public DigitalIdentityMVO lastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the Digital Identity last update (timestamp)
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the Digital Identity last update (timestamp)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public @Nullable OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalIdentityMVO digitalIdentityMVO = (DigitalIdentityMVO) o;
    return Objects.equals(this.atType, digitalIdentityMVO.atType) &&
        Objects.equals(this.atBaseType, digitalIdentityMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, digitalIdentityMVO.atSchemaLocation) &&
        Objects.equals(this.href, digitalIdentityMVO.href) &&
        Objects.equals(this.id, digitalIdentityMVO.id) &&
        Objects.equals(this.nickname, digitalIdentityMVO.nickname) &&
        Objects.equals(this.state, digitalIdentityMVO.state) &&
        Objects.equals(this.validFor, digitalIdentityMVO.validFor) &&
        Objects.equals(this.credential, digitalIdentityMVO.credential) &&
        Objects.equals(this.relatedContactMedium, digitalIdentityMVO.relatedContactMedium) &&
        Objects.equals(this.attachment, digitalIdentityMVO.attachment) &&
        Objects.equals(this.individualIdentified, digitalIdentityMVO.individualIdentified) &&
        Objects.equals(this.partyRoleIdentified, digitalIdentityMVO.partyRoleIdentified) &&
        Objects.equals(this.resourceIdentified, digitalIdentityMVO.resourceIdentified) &&
        Objects.equals(this.resourceRoleIdentified, digitalIdentityMVO.resourceRoleIdentified) &&
        Objects.equals(this.relatedSecurityPrincipal, digitalIdentityMVO.relatedSecurityPrincipal) &&
        Objects.equals(this.lastUpdate, digitalIdentityMVO.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, nickname, state, validFor, credential, relatedContactMedium, attachment, individualIdentified, partyRoleIdentified, resourceIdentified, resourceRoleIdentified, relatedSecurityPrincipal, lastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalIdentityMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    relatedContactMedium: ").append(toIndentedString(relatedContactMedium)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    individualIdentified: ").append(toIndentedString(individualIdentified)).append("\n");
    sb.append("    partyRoleIdentified: ").append(toIndentedString(partyRoleIdentified)).append("\n");
    sb.append("    resourceIdentified: ").append(toIndentedString(resourceIdentified)).append("\n");
    sb.append("    resourceRoleIdentified: ").append(toIndentedString(resourceRoleIdentified)).append("\n");
    sb.append("    relatedSecurityPrincipal: ").append(toIndentedString(relatedSecurityPrincipal)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

