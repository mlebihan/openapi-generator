package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.ContactMediumMVO;
import org.openapitools.model.ExternalIdentifierMVO;
import org.openapitools.model.OrganizationChildRelationshipMVO;
import org.openapitools.model.OrganizationIdentificationMVO;
import org.openapitools.model.OrganizationParentRelationshipMVO;
import org.openapitools.model.OrganizationStateType;
import org.openapitools.model.OtherNameOrganizationMVO;
import org.openapitools.model.PartyCreditProfileMVO;
import org.openapitools.model.PartyMVO;
import org.openapitools.model.RelatedPartyOrPartyRoleMVO;
import org.openapitools.model.TaxExemptionCertificateMVO;
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
 * OrganizationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class OrganizationMVO extends PartyMVO implements PartyOrPartyRoleMVO {

  private @Nullable Boolean isLegalEntity;

  private @Nullable Boolean isHeadOffice;

  private @Nullable String organizationType;

  private @Nullable TimePeriod existsDuring;

  private @Nullable String name;

  private @Nullable String nameType;

  private @Nullable OrganizationStateType status;

  @Valid
  private List<OtherNameOrganizationMVO> otherName = new ArrayList<>();

  @Valid
  private List<OrganizationIdentificationMVO> organizationIdentification = new ArrayList<>();

  @Valid
  private List<OrganizationChildRelationshipMVO> organizationChildRelationship = new ArrayList<>();

  private @Nullable OrganizationParentRelationshipMVO organizationParentRelationship;

  private @Nullable String tradingName;

  public OrganizationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganizationMVO(String atType) {
    super(atType);
  }

  public OrganizationMVO isLegalEntity(@Nullable Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
    return this;
  }

  /**
   * If value is true, the organization is a legal entity known by a national referential.
   * @return isLegalEntity
   */
  
  @Schema(name = "isLegalEntity", description = "If value is true, the organization is a legal entity known by a national referential.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isLegalEntity")
  public @Nullable Boolean getIsLegalEntity() {
    return isLegalEntity;
  }

  public void setIsLegalEntity(@Nullable Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
  }

  public OrganizationMVO isHeadOffice(@Nullable Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
    return this;
  }

  /**
   * If value is true, the organization is the head office
   * @return isHeadOffice
   */
  
  @Schema(name = "isHeadOffice", description = "If value is true, the organization is the head office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isHeadOffice")
  public @Nullable Boolean getIsHeadOffice() {
    return isHeadOffice;
  }

  public void setIsHeadOffice(@Nullable Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
  }

  public OrganizationMVO organizationType(@Nullable String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  /**
   * Type of Organization (company, department...)
   * @return organizationType
   */
  
  @Schema(name = "organizationType", description = "Type of Organization (company, department...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationType")
  public @Nullable String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(@Nullable String organizationType) {
    this.organizationType = organizationType;
  }

  public OrganizationMVO existsDuring(@Nullable TimePeriod existsDuring) {
    this.existsDuring = existsDuring;
    return this;
  }

  /**
   * Get existsDuring
   * @return existsDuring
   */
  @Valid 
  @Schema(name = "existsDuring", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("existsDuring")
  public @Nullable TimePeriod getExistsDuring() {
    return existsDuring;
  }

  public void setExistsDuring(@Nullable TimePeriod existsDuring) {
    this.existsDuring = existsDuring;
  }

  public OrganizationMVO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Organization name (department name for example)
   * @return name
   */
  
  @Schema(name = "name", description = "Organization name (department name for example)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OrganizationMVO nameType(@Nullable String nameType) {
    this.nameType = nameType;
    return this;
  }

  /**
   * Type of the name : Co, Inc, Ltd, etc.
   * @return nameType
   */
  
  @Schema(name = "nameType", description = "Type of the name : Co, Inc, Ltd, etc.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameType")
  public @Nullable String getNameType() {
    return nameType;
  }

  public void setNameType(@Nullable String nameType) {
    this.nameType = nameType;
  }

  public OrganizationMVO status(@Nullable OrganizationStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable OrganizationStateType getStatus() {
    return status;
  }

  public void setStatus(@Nullable OrganizationStateType status) {
    this.status = status;
  }

  public OrganizationMVO otherName(List<OtherNameOrganizationMVO> otherName) {
    this.otherName = otherName;
    return this;
  }

  public OrganizationMVO addOtherNameItem(OtherNameOrganizationMVO otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<>();
    }
    this.otherName.add(otherNameItem);
    return this;
  }

  /**
   * List of additional names by which the organization is known
   * @return otherName
   */
  @Valid 
  @Schema(name = "otherName", description = "List of additional names by which the organization is known", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherName")
  public List<OtherNameOrganizationMVO> getOtherName() {
    return otherName;
  }

  public void setOtherName(List<OtherNameOrganizationMVO> otherName) {
    this.otherName = otherName;
  }

  public OrganizationMVO organizationIdentification(List<OrganizationIdentificationMVO> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
    return this;
  }

  public OrganizationMVO addOrganizationIdentificationItem(OrganizationIdentificationMVO organizationIdentificationItem) {
    if (this.organizationIdentification == null) {
      this.organizationIdentification = new ArrayList<>();
    }
    this.organizationIdentification.add(organizationIdentificationItem);
    return this;
  }

  /**
   * List of official identifiers given to the organization, for example company number in the registry of companies
   * @return organizationIdentification
   */
  @Valid 
  @Schema(name = "organizationIdentification", description = "List of official identifiers given to the organization, for example company number in the registry of companies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationIdentification")
  public List<OrganizationIdentificationMVO> getOrganizationIdentification() {
    return organizationIdentification;
  }

  public void setOrganizationIdentification(List<OrganizationIdentificationMVO> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
  }

  public OrganizationMVO organizationChildRelationship(List<OrganizationChildRelationshipMVO> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
    return this;
  }

  public OrganizationMVO addOrganizationChildRelationshipItem(OrganizationChildRelationshipMVO organizationChildRelationshipItem) {
    if (this.organizationChildRelationship == null) {
      this.organizationChildRelationship = new ArrayList<>();
    }
    this.organizationChildRelationship.add(organizationChildRelationshipItem);
    return this;
  }

  /**
   * List of organizations that are contained within this organization. For example if this organization is the Legal Department, the child organizations might include Claims, Courts, Contracts
   * @return organizationChildRelationship
   */
  @Valid 
  @Schema(name = "organizationChildRelationship", description = "List of organizations that are contained within this organization. For example if this organization is the Legal Department, the child organizations might include Claims, Courts, Contracts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationChildRelationship")
  public List<OrganizationChildRelationshipMVO> getOrganizationChildRelationship() {
    return organizationChildRelationship;
  }

  public void setOrganizationChildRelationship(List<OrganizationChildRelationshipMVO> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
  }

  public OrganizationMVO organizationParentRelationship(@Nullable OrganizationParentRelationshipMVO organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
    return this;
  }

  /**
   * Get organizationParentRelationship
   * @return organizationParentRelationship
   */
  @Valid 
  @Schema(name = "organizationParentRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizationParentRelationship")
  public @Nullable OrganizationParentRelationshipMVO getOrganizationParentRelationship() {
    return organizationParentRelationship;
  }

  public void setOrganizationParentRelationship(@Nullable OrganizationParentRelationshipMVO organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
  }

  public OrganizationMVO tradingName(@Nullable String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  /**
   * Name that the organization (unit) trades under
   * @return tradingName
   */
  
  @Schema(name = "tradingName", description = "Name that the organization (unit) trades under", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tradingName")
  public @Nullable String getTradingName() {
    return tradingName;
  }

  public void setTradingName(@Nullable String tradingName) {
    this.tradingName = tradingName;
  }


  public OrganizationMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public OrganizationMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public OrganizationMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public OrganizationMVO externalReference(List<ExternalIdentifierMVO> externalReference) {
    super.externalReference(externalReference);
    return this;
  }

  public OrganizationMVO addExternalReferenceItem(ExternalIdentifierMVO externalReferenceItem) {
    super.addExternalReferenceItem(externalReferenceItem);
    return this;
  }

  public OrganizationMVO partyCharacteristic(List<CharacteristicMVO> partyCharacteristic) {
    super.partyCharacteristic(partyCharacteristic);
    return this;
  }

  public OrganizationMVO addPartyCharacteristicItem(CharacteristicMVO partyCharacteristicItem) {
    super.addPartyCharacteristicItem(partyCharacteristicItem);
    return this;
  }

  public OrganizationMVO taxExemptionCertificate(List<TaxExemptionCertificateMVO> taxExemptionCertificate) {
    super.taxExemptionCertificate(taxExemptionCertificate);
    return this;
  }

  public OrganizationMVO addTaxExemptionCertificateItem(TaxExemptionCertificateMVO taxExemptionCertificateItem) {
    super.addTaxExemptionCertificateItem(taxExemptionCertificateItem);
    return this;
  }

  public OrganizationMVO creditRating(List<PartyCreditProfileMVO> creditRating) {
    super.creditRating(creditRating);
    return this;
  }

  public OrganizationMVO addCreditRatingItem(PartyCreditProfileMVO creditRatingItem) {
    super.addCreditRatingItem(creditRatingItem);
    return this;
  }

  public OrganizationMVO relatedParty(List<RelatedPartyOrPartyRoleMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public OrganizationMVO addRelatedPartyItem(RelatedPartyOrPartyRoleMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public OrganizationMVO contactMedium(List<ContactMediumMVO> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public OrganizationMVO addContactMediumItem(ContactMediumMVO contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
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
    OrganizationMVO organizationMVO = (OrganizationMVO) o;
    return Objects.equals(this.isLegalEntity, organizationMVO.isLegalEntity) &&
        Objects.equals(this.isHeadOffice, organizationMVO.isHeadOffice) &&
        Objects.equals(this.organizationType, organizationMVO.organizationType) &&
        Objects.equals(this.existsDuring, organizationMVO.existsDuring) &&
        Objects.equals(this.name, organizationMVO.name) &&
        Objects.equals(this.nameType, organizationMVO.nameType) &&
        Objects.equals(this.status, organizationMVO.status) &&
        Objects.equals(this.otherName, organizationMVO.otherName) &&
        Objects.equals(this.organizationIdentification, organizationMVO.organizationIdentification) &&
        Objects.equals(this.organizationChildRelationship, organizationMVO.organizationChildRelationship) &&
        Objects.equals(this.organizationParentRelationship, organizationMVO.organizationParentRelationship) &&
        Objects.equals(this.tradingName, organizationMVO.tradingName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLegalEntity, isHeadOffice, organizationType, existsDuring, name, nameType, status, otherName, organizationIdentification, organizationChildRelationship, organizationParentRelationship, tradingName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    isLegalEntity: ").append(toIndentedString(isLegalEntity)).append("\n");
    sb.append("    isHeadOffice: ").append(toIndentedString(isHeadOffice)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    existsDuring: ").append(toIndentedString(existsDuring)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    organizationIdentification: ").append(toIndentedString(organizationIdentification)).append("\n");
    sb.append("    organizationChildRelationship: ").append(toIndentedString(organizationChildRelationship)).append("\n");
    sb.append("    organizationParentRelationship: ").append(toIndentedString(organizationParentRelationship)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
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

