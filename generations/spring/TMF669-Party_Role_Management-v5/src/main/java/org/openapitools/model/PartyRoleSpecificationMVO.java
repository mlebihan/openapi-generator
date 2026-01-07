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
import org.openapitools.model.AgreementSpecificationRefMVO;
import org.openapitools.model.AttachmentRefOrValueMVO;
import org.openapitools.model.CharacteristicSpecificationMVO;
import org.openapitools.model.ConstraintRefMVO;
import org.openapitools.model.EntitySpecificationMVO;
import org.openapitools.model.EntitySpecificationRelationshipMVO;
import org.openapitools.model.PermissionSpecificationSetRefMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
import org.openapitools.model.TargetEntitySchemaMVO;
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
 * PartyRoleSpecificationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PartyRoleSpecificationMVO extends EntitySpecificationMVO {

  @Valid
  private List<AgreementSpecificationRefMVO> agreementSpecification = new ArrayList<>();

  @Valid
  private List<@Valid PermissionSpecificationSetRefMVO> permissionSpecificationSet = new ArrayList<>();

  private @Nullable String status;

  public PartyRoleSpecificationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyRoleSpecificationMVO(String atType) {
    super(atType);
  }

  public PartyRoleSpecificationMVO agreementSpecification(List<AgreementSpecificationRefMVO> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  public PartyRoleSpecificationMVO addAgreementSpecificationItem(AgreementSpecificationRefMVO agreementSpecificationItem) {
    if (this.agreementSpecification == null) {
      this.agreementSpecification = new ArrayList<>();
    }
    this.agreementSpecification.add(agreementSpecificationItem);
    return this;
  }

  /**
   * Get agreementSpecification
   * @return agreementSpecification
   */
  @Valid 
  @Schema(name = "agreementSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agreementSpecification")
  public List<AgreementSpecificationRefMVO> getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(List<AgreementSpecificationRefMVO> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  public PartyRoleSpecificationMVO permissionSpecificationSet(List<@Valid PermissionSpecificationSetRefMVO> permissionSpecificationSet) {
    this.permissionSpecificationSet = permissionSpecificationSet;
    return this;
  }

  public PartyRoleSpecificationMVO addPermissionSpecificationSetItem(PermissionSpecificationSetRefMVO permissionSpecificationSetItem) {
    if (this.permissionSpecificationSet == null) {
      this.permissionSpecificationSet = new ArrayList<>();
    }
    this.permissionSpecificationSet.add(permissionSpecificationSetItem);
    return this;
  }

  /**
   * Get permissionSpecificationSet
   * @return permissionSpecificationSet
   */
  @Valid 
  @Schema(name = "permissionSpecificationSet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionSpecificationSet")
  public List<@Valid PermissionSpecificationSetRefMVO> getPermissionSpecificationSet() {
    return permissionSpecificationSet;
  }

  public void setPermissionSpecificationSet(List<@Valid PermissionSpecificationSetRefMVO> permissionSpecificationSet) {
    this.permissionSpecificationSet = permissionSpecificationSet;
  }

  public PartyRoleSpecificationMVO status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Used to track the lifecycle status of the partyRoleSpecification.
   * @return status
   */
  
  @Schema(name = "status", description = "Used to track the lifecycle status of the partyRoleSpecification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }


  public PartyRoleSpecificationMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PartyRoleSpecificationMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PartyRoleSpecificationMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PartyRoleSpecificationMVO name(String name) {
    super.name(name);
    return this;
  }

  public PartyRoleSpecificationMVO description(String description) {
    super.description(description);
    return this;
  }

  public PartyRoleSpecificationMVO lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public PartyRoleSpecificationMVO lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public PartyRoleSpecificationMVO isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public PartyRoleSpecificationMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PartyRoleSpecificationMVO version(String version) {
    super.version(version);
    return this;
  }

  public PartyRoleSpecificationMVO attachment(List<@Valid AttachmentRefOrValueMVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PartyRoleSpecificationMVO addAttachmentItem(AttachmentRefOrValueMVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PartyRoleSpecificationMVO targetEntitySchema(TargetEntitySchemaMVO targetEntitySchema) {
    super.targetEntitySchema(targetEntitySchema);
    return this;
  }

  public PartyRoleSpecificationMVO specCharacteristic(List<CharacteristicSpecificationMVO> specCharacteristic) {
    super.specCharacteristic(specCharacteristic);
    return this;
  }

  public PartyRoleSpecificationMVO addSpecCharacteristicItem(CharacteristicSpecificationMVO specCharacteristicItem) {
    super.addSpecCharacteristicItem(specCharacteristicItem);
    return this;
  }

  public PartyRoleSpecificationMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PartyRoleSpecificationMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PartyRoleSpecificationMVO constraint(List<ConstraintRefMVO> constraint) {
    super.constraint(constraint);
    return this;
  }

  public PartyRoleSpecificationMVO addConstraintItem(ConstraintRefMVO constraintItem) {
    super.addConstraintItem(constraintItem);
    return this;
  }

  public PartyRoleSpecificationMVO entitySpecRelationship(List<@Valid EntitySpecificationRelationshipMVO> entitySpecRelationship) {
    super.entitySpecRelationship(entitySpecRelationship);
    return this;
  }

  public PartyRoleSpecificationMVO addEntitySpecRelationshipItem(EntitySpecificationRelationshipMVO entitySpecRelationshipItem) {
    super.addEntitySpecRelationshipItem(entitySpecRelationshipItem);
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
    PartyRoleSpecificationMVO partyRoleSpecificationMVO = (PartyRoleSpecificationMVO) o;
    return Objects.equals(this.agreementSpecification, partyRoleSpecificationMVO.agreementSpecification) &&
        Objects.equals(this.permissionSpecificationSet, partyRoleSpecificationMVO.permissionSpecificationSet) &&
        Objects.equals(this.status, partyRoleSpecificationMVO.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementSpecification, permissionSpecificationSet, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleSpecificationMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
    sb.append("    permissionSpecificationSet: ").append(toIndentedString(permissionSpecificationSet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

