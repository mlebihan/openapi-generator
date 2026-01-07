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
import org.openapitools.model.AccountRefFVO;
import org.openapitools.model.AgreementRefFVO;
import org.openapitools.model.CharacteristicFVO;
import org.openapitools.model.ContactMediumFVO;
import org.openapitools.model.CreditProfileFVO;
import org.openapitools.model.PartyRefFVO;
import org.openapitools.model.PartyRoleFVO;
import org.openapitools.model.PartyRoleSpecificationRefFVO;
import org.openapitools.model.PaymentMethodRefFVO;
import org.openapitools.model.RelatedPartyOrPartyRoleFVO;
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
 * ProducerFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ProducerFVO extends PartyRoleFVO implements PartyOrPartyRoleFVO {

  public ProducerFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProducerFVO(String atType, String name, PartyRefFVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public ProducerFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ProducerFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ProducerFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ProducerFVO id(String id) {
    super.id(id);
    return this;
  }

  public ProducerFVO name(String name) {
    super.name(name);
    return this;
  }

  public ProducerFVO description(String description) {
    super.description(description);
    return this;
  }

  public ProducerFVO role(String role) {
    super.role(role);
    return this;
  }

  public ProducerFVO engagedParty(PartyRefFVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public ProducerFVO partyRoleSpecification(PartyRoleSpecificationRefFVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public ProducerFVO characteristic(List<CharacteristicFVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public ProducerFVO addCharacteristicItem(CharacteristicFVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public ProducerFVO account(List<@Valid AccountRefFVO> account) {
    super.account(account);
    return this;
  }

  public ProducerFVO addAccountItem(AccountRefFVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public ProducerFVO agreement(List<@Valid AgreementRefFVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public ProducerFVO addAgreementItem(AgreementRefFVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public ProducerFVO contactMedium(List<ContactMediumFVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public ProducerFVO addContactMediumItem(ContactMediumFVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public ProducerFVO paymentMethod(List<@Valid PaymentMethodRefFVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public ProducerFVO addPaymentMethodItem(PaymentMethodRefFVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public ProducerFVO creditProfile(List<CreditProfileFVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public ProducerFVO addCreditProfileItem(CreditProfileFVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public ProducerFVO relatedParty(List<RelatedPartyOrPartyRoleFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ProducerFVO addRelatedPartyItem(RelatedPartyOrPartyRoleFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ProducerFVO status(String status) {
    super.status(status);
    return this;
  }

  public ProducerFVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public ProducerFVO validFor(TimePeriod validFor) {
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
    sb.append("class ProducerFVO {\n");
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

