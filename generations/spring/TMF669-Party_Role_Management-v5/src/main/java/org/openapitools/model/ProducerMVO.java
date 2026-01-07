package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AccountRefMVO;
import org.openapitools.model.AgreementRefMVO;
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.ContactMediumMVO;
import org.openapitools.model.CreditProfileMVO;
import org.openapitools.model.PartyRefMVO;
import org.openapitools.model.PartyRoleMVO;
import org.openapitools.model.PartyRoleSpecificationRefMVO;
import org.openapitools.model.PaymentMethodRefMVO;
import org.openapitools.model.RelatedPartyOrPartyRoleMVO;
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
 * ProducerMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ProducerMVO extends PartyRoleMVO implements PartyOrPartyRoleMVO {

  public ProducerMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProducerMVO(String atType) {
    super(atType);
  }


  public ProducerMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ProducerMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ProducerMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ProducerMVO name(String name) {
    super.name(name);
    return this;
  }

  public ProducerMVO description(String description) {
    super.description(description);
    return this;
  }

  public ProducerMVO role(String role) {
    super.role(role);
    return this;
  }

  public ProducerMVO engagedParty(PartyRefMVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public ProducerMVO partyRoleSpecification(PartyRoleSpecificationRefMVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public ProducerMVO characteristic(List<CharacteristicMVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public ProducerMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public ProducerMVO account(List<@Valid AccountRefMVO> account) {
    super.account(account);
    return this;
  }

  public ProducerMVO addAccountItem(AccountRefMVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public ProducerMVO agreement(List<@Valid AgreementRefMVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public ProducerMVO addAgreementItem(AgreementRefMVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public ProducerMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public ProducerMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public ProducerMVO paymentMethod(List<@Valid PaymentMethodRefMVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public ProducerMVO addPaymentMethodItem(PaymentMethodRefMVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public ProducerMVO creditProfile(List<CreditProfileMVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public ProducerMVO addCreditProfileItem(CreditProfileMVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public ProducerMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ProducerMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ProducerMVO status(String status) {
    super.status(status);
    return this;
  }

  public ProducerMVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public ProducerMVO validFor(TimePeriod validFor) {
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
    sb.append("class ProducerMVO {\n");
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

