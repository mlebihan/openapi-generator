package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountRef;
import org.openapitools.model.AgreementRef;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.CreditProfile;
import org.openapitools.model.PartyRef;
import org.openapitools.model.PartyRole;
import org.openapitools.model.PartyRoleSpecificationRef;
import org.openapitools.model.PaymentMethodRef;
import org.openapitools.model.RelatedPartyOrPartyRole;
import org.openapitools.model.TimePeriod;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Producer
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Producer extends PartyRole implements PartyOrPartyRole {

  public Producer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Producer(String atType) {
    super(atType);
  }


  public Producer atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Producer atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Producer atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Producer href(String href) {
    super.href(href);
    return this;
  }

  public Producer id(String id) {
    super.id(id);
    return this;
  }

  public Producer name(String name) {
    super.name(name);
    return this;
  }

  public Producer description(String description) {
    super.description(description);
    return this;
  }

  public Producer role(String role) {
    super.role(role);
    return this;
  }

  public Producer engagedParty(PartyRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public Producer partyRoleSpecification(PartyRoleSpecificationRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public Producer characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public Producer addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public Producer account(List<@Valid AccountRef> account) {
    super.account(account);
    return this;
  }

  public Producer addAccountItem(AccountRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public Producer agreement(List<@Valid AgreementRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public Producer addAgreementItem(AgreementRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public Producer contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Producer addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public Producer paymentMethod(List<@Valid PaymentMethodRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public Producer addPaymentMethodItem(PaymentMethodRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public Producer creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public Producer addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public Producer relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Producer addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Producer status(String status) {
    super.status(status);
    return this;
  }

  public Producer statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public Producer validFor(TimePeriod validFor) {
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Producer {\n");
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

