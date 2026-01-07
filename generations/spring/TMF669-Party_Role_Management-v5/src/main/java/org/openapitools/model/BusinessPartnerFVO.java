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
 * When business partner is the BusinessPartner 
 */

@Schema(name = "BusinessPartner_FVO", description = "When business partner is the BusinessPartner ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class BusinessPartnerFVO extends PartyRoleFVO implements PartyOrPartyRoleFVO {

  public BusinessPartnerFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessPartnerFVO(String atType, String name, PartyRefFVO engagedParty) {
    super(atType, name, engagedParty);
  }


  public BusinessPartnerFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BusinessPartnerFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BusinessPartnerFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BusinessPartnerFVO id(String id) {
    super.id(id);
    return this;
  }

  public BusinessPartnerFVO name(String name) {
    super.name(name);
    return this;
  }

  public BusinessPartnerFVO description(String description) {
    super.description(description);
    return this;
  }

  public BusinessPartnerFVO role(String role) {
    super.role(role);
    return this;
  }

  public BusinessPartnerFVO engagedParty(PartyRefFVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public BusinessPartnerFVO partyRoleSpecification(PartyRoleSpecificationRefFVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public BusinessPartnerFVO characteristic(List<CharacteristicFVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public BusinessPartnerFVO addCharacteristicItem(CharacteristicFVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public BusinessPartnerFVO account(List<@Valid AccountRefFVO> account) {
    super.account(account);
    return this;
  }

  public BusinessPartnerFVO addAccountItem(AccountRefFVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public BusinessPartnerFVO agreement(List<@Valid AgreementRefFVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public BusinessPartnerFVO addAgreementItem(AgreementRefFVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public BusinessPartnerFVO contactMedium(List<ContactMediumFVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public BusinessPartnerFVO addContactMediumItem(ContactMediumFVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public BusinessPartnerFVO paymentMethod(List<@Valid PaymentMethodRefFVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public BusinessPartnerFVO addPaymentMethodItem(PaymentMethodRefFVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public BusinessPartnerFVO creditProfile(List<CreditProfileFVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public BusinessPartnerFVO addCreditProfileItem(CreditProfileFVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public BusinessPartnerFVO relatedParty(List<RelatedPartyOrPartyRoleFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public BusinessPartnerFVO addRelatedPartyItem(RelatedPartyOrPartyRoleFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public BusinessPartnerFVO status(String status) {
    super.status(status);
    return this;
  }

  public BusinessPartnerFVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public BusinessPartnerFVO validFor(TimePeriod validFor) {
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
    sb.append("class BusinessPartnerFVO {\n");
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

