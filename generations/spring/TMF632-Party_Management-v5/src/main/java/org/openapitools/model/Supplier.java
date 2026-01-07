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
 * When business partner is the Supplier 
 */

@Schema(name = "Supplier", description = "When business partner is the Supplier ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Supplier extends PartyRole implements PartyOrPartyRole {

  public Supplier() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Supplier(String atType) {
    super(atType);
  }


  public Supplier atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Supplier atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Supplier atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Supplier href(String href) {
    super.href(href);
    return this;
  }

  public Supplier id(String id) {
    super.id(id);
    return this;
  }

  public Supplier name(String name) {
    super.name(name);
    return this;
  }

  public Supplier description(String description) {
    super.description(description);
    return this;
  }

  public Supplier role(String role) {
    super.role(role);
    return this;
  }

  public Supplier engagedParty(PartyRef engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public Supplier partyRoleSpecification(PartyRoleSpecificationRef partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public Supplier characteristic(List<Characteristic> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public Supplier addCharacteristicItem(Characteristic characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public Supplier account(List<@Valid AccountRef> account) {
    super.account(account);
    return this;
  }

  public Supplier addAccountItem(AccountRef accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public Supplier agreement(List<@Valid AgreementRef> agreement) {
    super.agreement(agreement);
    return this;
  }

  public Supplier addAgreementItem(AgreementRef agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public Supplier contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Supplier addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public Supplier paymentMethod(List<@Valid PaymentMethodRef> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public Supplier addPaymentMethodItem(PaymentMethodRef paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public Supplier creditProfile(List<CreditProfile> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public Supplier addCreditProfileItem(CreditProfile creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public Supplier relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Supplier addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Supplier status(String status) {
    super.status(status);
    return this;
  }

  public Supplier statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public Supplier validFor(TimePeriod validFor) {
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
    sb.append("class Supplier {\n");
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

