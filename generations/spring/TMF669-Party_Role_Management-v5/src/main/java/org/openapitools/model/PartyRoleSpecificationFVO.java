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
import org.openapitools.model.AgreementSpecificationRefFVO;
import org.openapitools.model.AttachmentRefOrValueFVO;
import org.openapitools.model.CharacteristicSpecificationFVO;
import org.openapitools.model.ConstraintRefFVO;
import org.openapitools.model.EntitySpecificationFVO;
import org.openapitools.model.EntitySpecificationRelationshipFVO;
import org.openapitools.model.PermissionSpecificationSetRefFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.openapitools.model.TargetEntitySchemaFVO;
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
 * PartyRoleSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PartyRoleSpecificationFVO extends EntitySpecificationFVO {

  @Valid
  private List<AgreementSpecificationRefFVO> agreementSpecification = new ArrayList<>();

  @Valid
  private List<@Valid PermissionSpecificationSetRefFVO> permissionSpecificationSet = new ArrayList<>();

  private @Nullable String status;

  public PartyRoleSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyRoleSpecificationFVO(String atType, String name) {
    super(atType, name);
  }

  public PartyRoleSpecificationFVO agreementSpecification(List<AgreementSpecificationRefFVO> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  public PartyRoleSpecificationFVO addAgreementSpecificationItem(AgreementSpecificationRefFVO agreementSpecificationItem) {
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
  public List<AgreementSpecificationRefFVO> getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(List<AgreementSpecificationRefFVO> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  public PartyRoleSpecificationFVO permissionSpecificationSet(List<@Valid PermissionSpecificationSetRefFVO> permissionSpecificationSet) {
    this.permissionSpecificationSet = permissionSpecificationSet;
    return this;
  }

  public PartyRoleSpecificationFVO addPermissionSpecificationSetItem(PermissionSpecificationSetRefFVO permissionSpecificationSetItem) {
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
  public List<@Valid PermissionSpecificationSetRefFVO> getPermissionSpecificationSet() {
    return permissionSpecificationSet;
  }

  public void setPermissionSpecificationSet(List<@Valid PermissionSpecificationSetRefFVO> permissionSpecificationSet) {
    this.permissionSpecificationSet = permissionSpecificationSet;
  }

  public PartyRoleSpecificationFVO status(@Nullable String status) {
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


  public PartyRoleSpecificationFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PartyRoleSpecificationFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PartyRoleSpecificationFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PartyRoleSpecificationFVO id(String id) {
    super.id(id);
    return this;
  }

  public PartyRoleSpecificationFVO name(String name) {
    super.name(name);
    return this;
  }

  public PartyRoleSpecificationFVO description(String description) {
    super.description(description);
    return this;
  }

  public PartyRoleSpecificationFVO lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public PartyRoleSpecificationFVO lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public PartyRoleSpecificationFVO isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public PartyRoleSpecificationFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PartyRoleSpecificationFVO version(String version) {
    super.version(version);
    return this;
  }

  public PartyRoleSpecificationFVO attachment(List<@Valid AttachmentRefOrValueFVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PartyRoleSpecificationFVO addAttachmentItem(AttachmentRefOrValueFVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PartyRoleSpecificationFVO targetEntitySchema(TargetEntitySchemaFVO targetEntitySchema) {
    super.targetEntitySchema(targetEntitySchema);
    return this;
  }

  public PartyRoleSpecificationFVO specCharacteristic(List<CharacteristicSpecificationFVO> specCharacteristic) {
    super.specCharacteristic(specCharacteristic);
    return this;
  }

  public PartyRoleSpecificationFVO addSpecCharacteristicItem(CharacteristicSpecificationFVO specCharacteristicItem) {
    super.addSpecCharacteristicItem(specCharacteristicItem);
    return this;
  }

  public PartyRoleSpecificationFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PartyRoleSpecificationFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PartyRoleSpecificationFVO constraint(List<ConstraintRefFVO> constraint) {
    super.constraint(constraint);
    return this;
  }

  public PartyRoleSpecificationFVO addConstraintItem(ConstraintRefFVO constraintItem) {
    super.addConstraintItem(constraintItem);
    return this;
  }

  public PartyRoleSpecificationFVO entitySpecRelationship(List<@Valid EntitySpecificationRelationshipFVO> entitySpecRelationship) {
    super.entitySpecRelationship(entitySpecRelationship);
    return this;
  }

  public PartyRoleSpecificationFVO addEntitySpecRelationshipItem(EntitySpecificationRelationshipFVO entitySpecRelationshipItem) {
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
    PartyRoleSpecificationFVO partyRoleSpecificationFVO = (PartyRoleSpecificationFVO) o;
    return Objects.equals(this.agreementSpecification, partyRoleSpecificationFVO.agreementSpecification) &&
        Objects.equals(this.permissionSpecificationSet, partyRoleSpecificationFVO.permissionSpecificationSet) &&
        Objects.equals(this.status, partyRoleSpecificationFVO.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementSpecification, permissionSpecificationSet, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleSpecificationFVO {\n");
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

