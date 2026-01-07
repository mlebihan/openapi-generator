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
 * When business partner is the BusinessPartner 
 */

@Schema(name = "BusinessPartner_MVO", description = "When business partner is the BusinessPartner ")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class BusinessPartnerMVO extends PartyRoleMVO implements PartyOrPartyRoleMVO {

  public BusinessPartnerMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BusinessPartnerMVO(String atType) {
    super(atType);
  }


  public BusinessPartnerMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BusinessPartnerMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BusinessPartnerMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BusinessPartnerMVO name(String name) {
    super.name(name);
    return this;
  }

  public BusinessPartnerMVO description(String description) {
    super.description(description);
    return this;
  }

  public BusinessPartnerMVO role(String role) {
    super.role(role);
    return this;
  }

  public BusinessPartnerMVO engagedParty(PartyRefMVO engagedParty) {
    super.engagedParty(engagedParty);
    return this;
  }

  public BusinessPartnerMVO partyRoleSpecification(PartyRoleSpecificationRefMVO partyRoleSpecification) {
    super.partyRoleSpecification(partyRoleSpecification);
    return this;
  }

  public BusinessPartnerMVO characteristic(List<CharacteristicMVO> characteristic) {
    super.characteristic(characteristic);
    return this;
  }

  public BusinessPartnerMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    super.addCharacteristicItem(characteristicItem);
    return this;
  }

  public BusinessPartnerMVO account(List<@Valid AccountRefMVO> account) {
    super.account(account);
    return this;
  }

  public BusinessPartnerMVO addAccountItem(AccountRefMVO accountItem) {
    super.addAccountItem(accountItem);
    return this;
  }

  public BusinessPartnerMVO agreement(List<@Valid AgreementRefMVO> agreement) {
    super.agreement(agreement);
    return this;
  }

  public BusinessPartnerMVO addAgreementItem(AgreementRefMVO agreementItem) {
    super.addAgreementItem(agreementItem);
    return this;
  }

  public BusinessPartnerMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public BusinessPartnerMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
    return this;
  }

  public BusinessPartnerMVO paymentMethod(List<@Valid PaymentMethodRefMVO> paymentMethod) {
    super.paymentMethod(paymentMethod);
    return this;
  }

  public BusinessPartnerMVO addPaymentMethodItem(PaymentMethodRefMVO paymentMethodItem) {
    super.addPaymentMethodItem(paymentMethodItem);
    return this;
  }

  public BusinessPartnerMVO creditProfile(List<CreditProfileMVO> creditProfile) {
    super.creditProfile(creditProfile);
    return this;
  }

  public BusinessPartnerMVO addCreditProfileItem(CreditProfileMVO creditProfileItem) {
    super.addCreditProfileItem(creditProfileItem);
    return this;
  }

  public BusinessPartnerMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public BusinessPartnerMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public BusinessPartnerMVO status(String status) {
    super.status(status);
    return this;
  }

  public BusinessPartnerMVO statusReason(String statusReason) {
    super.statusReason(statusReason);
    return this;
  }

  public BusinessPartnerMVO validFor(TimePeriod validFor) {
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
    sb.append("class BusinessPartnerMVO {\n");
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

