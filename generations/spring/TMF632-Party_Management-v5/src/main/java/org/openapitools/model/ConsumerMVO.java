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
 * ConsumerMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ConsumerMVO extends PartyRoleMVO implements PartyOrPartyRoleMVO {

  public ConsumerMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConsumerMVO(String atType, String name, PartyRefMVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public ConsumerMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ConsumerMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ConsumerMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ConsumerMVO name(String name) {
    super.name(name);
    return this;
  }

  public ConsumerMVO description(String description) {
    super.description(description);
    return this;
  }

  public ConsumerMVO role(String role) {
    super.role(role);
    return this;
  }

  public ConsumerMVO engagedParty(PartyRefMVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public ConsumerMVO partyRoleSpecification(PartyRoleSpecificationRefMVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public ConsumerMVO characteristic(List<CharacteristicMVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public ConsumerMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public ConsumerMVO account(List<@Valid AccountRefMVO> account) {
    super.account(account);
    return this;
  }

  public ConsumerMVO addAccountItem(AccountRefMVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public ConsumerMVO agreement(List<@Valid AgreementRefMVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public ConsumerMVO addAgreementItem(AgreementRefMVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public ConsumerMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public ConsumerMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public ConsumerMVO paymentMethod(List<@Valid PaymentMethodRefMVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public ConsumerMVO addPaymentMethodItem(PaymentMethodRefMVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public ConsumerMVO creditProfile(List<CreditProfileMVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public ConsumerMVO addCreditProfileItem(CreditProfileMVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public ConsumerMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ConsumerMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ConsumerMVO status(String status) {
    super.status(status);
    return this;
  }

  public ConsumerMVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public ConsumerMVO validFor(TimePeriod validFor) {
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
    sb.append("class ConsumerMVO {\n");
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

