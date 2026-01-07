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
import org.openapitools.model.DigitalIdentity;
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
 * Response object for DigitalIdentity
 */

@Schema(name = "DigitalIdentity_RES", description = "Response object for DigitalIdentity")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class DigitalIdentityRES extends DigitalIdentity {

  public DigitalIdentityRES() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DigitalIdentityRES(String atType, String href, String id) {
    super(atType);
  }


  public DigitalIdentityRES atType(String atType) {
    super.atType(atType);
    return this;
  }

  public DigitalIdentityRES atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public DigitalIdentityRES atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public DigitalIdentityRES href(String href) {
    super.href(href);
    return this;
  }

  public DigitalIdentityRES id(String id) {
    super.id(id);
    return this;
  }

  public DigitalIdentityRES nickname(String nickname) {
    super.nickname(nickname);
    return this;
  }

  public DigitalIdentityRES state(String state) {
    super.state(state);
    return this;
  }

  public DigitalIdentityRES validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public DigitalIdentityRES credential(List<@Valid CredentialRefOrValue> credential) {
    super.credential(credential);
    return this;
  }

  public DigitalIdentityRES addCredentialItem(CredentialRefOrValue credentialItem) {
    super.addCredentialItem(credentialItem);
    return this;
  }

  public DigitalIdentityRES relatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public DigitalIdentityRES addRelatedContactMediumItem(RelatedContactMedium relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public DigitalIdentityRES attachment(List<@Valid AttachmentRefOrValue> attachment) {
    super.attachment(attachment);
    return this;
  }

  public DigitalIdentityRES addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public DigitalIdentityRES individualIdentified(IndividualRef individualIdentified) {
    super.individualIdentified(individualIdentified);
    return this;
  }

  public DigitalIdentityRES partyRoleIdentified(List<RelatedSecurityPrincipalRef> partyRoleIdentified) {
    super.partyRoleIdentified(partyRoleIdentified);
    return this;
  }

  public DigitalIdentityRES addPartyRoleIdentifiedItem(RelatedSecurityPrincipalRef partyRoleIdentifiedItem) {
    super.addPartyRoleIdentifiedItem(partyRoleIdentifiedItem);
    return this;
  }

  public DigitalIdentityRES resourceIdentified(ResourceRef resourceIdentified) {
    super.resourceIdentified(resourceIdentified);
    return this;
  }

  public DigitalIdentityRES resourceRoleIdentified(List<RelatedSecurityPrincipalRef> resourceRoleIdentified) {
    super.resourceRoleIdentified(resourceRoleIdentified);
    return this;
  }

  public DigitalIdentityRES addResourceRoleIdentifiedItem(RelatedSecurityPrincipalRef resourceRoleIdentifiedItem) {
    super.addResourceRoleIdentifiedItem(resourceRoleIdentifiedItem);
    return this;
  }

  public DigitalIdentityRES relatedSecurityPrincipal(List<RelatedSecurityPrincipalRef> relatedSecurityPrincipal) {
    super.relatedSecurityPrincipal(relatedSecurityPrincipal);
    return this;
  }

  public DigitalIdentityRES addRelatedSecurityPrincipalItem(RelatedSecurityPrincipalRef relatedSecurityPrincipalItem) {
    super.addRelatedSecurityPrincipalItem(relatedSecurityPrincipalItem);
    return this;
  }

  public DigitalIdentityRES creationDate(OffsetDateTime creationDate) {
    super.creationDate(creationDate);
    return this;
  }

  public DigitalIdentityRES lastUpdate(OffsetDateTime lastUpdate) {
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
    sb.append("class DigitalIdentityRES {\n");
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

