package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AgreementSpecificationRef;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.CharacteristicSpecification;
import org.openapitools.model.ConstraintRef;
import org.openapitools.model.EntitySpecification;
import org.openapitools.model.EntitySpecificationRelationship;
import org.openapitools.model.PermissionSpecificationSetRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.TargetEntitySchema;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PartyRoleSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PartyRoleSpecification extends EntitySpecification implements PatchPartyRoleSpecification200Response {

  @Valid
  private List<AgreementSpecificationRef> agreementSpecification = new ArrayList<>();

  @Valid
  private List<@Valid PermissionSpecificationSetRef> permissionSpecificationSet = new ArrayList<>();

  private @Nullable String status;

  public PartyRoleSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyRoleSpecification(String atType) {
    super(atType);
  }

  public PartyRoleSpecification agreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

  public PartyRoleSpecification addAgreementSpecificationItem(AgreementSpecificationRef agreementSpecificationItem) {
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
  public List<AgreementSpecificationRef> getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(List<AgreementSpecificationRef> agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }

  public PartyRoleSpecification permissionSpecificationSet(List<@Valid PermissionSpecificationSetRef> permissionSpecificationSet) {
    this.permissionSpecificationSet = permissionSpecificationSet;
    return this;
  }

  public PartyRoleSpecification addPermissionSpecificationSetItem(PermissionSpecificationSetRef permissionSpecificationSetItem) {
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
  public List<@Valid PermissionSpecificationSetRef> getPermissionSpecificationSet() {
    return permissionSpecificationSet;
  }

  public void setPermissionSpecificationSet(List<@Valid PermissionSpecificationSetRef> permissionSpecificationSet) {
    this.permissionSpecificationSet = permissionSpecificationSet;
  }

  public PartyRoleSpecification status(@Nullable String status) {
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


  public PartyRoleSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PartyRoleSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PartyRoleSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PartyRoleSpecification href(String href) {
    super.href(href);
    return this;
  }

  public PartyRoleSpecification id(String id) {
    super.id(id);
    return this;
  }

  public PartyRoleSpecification name(String name) {
    super.name(name);
    return this;
  }

  public PartyRoleSpecification description(String description) {
    super.description(description);
    return this;
  }

  public PartyRoleSpecification lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public PartyRoleSpecification lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public PartyRoleSpecification isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public PartyRoleSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PartyRoleSpecification version(String version) {
    super.version(version);
    return this;
  }

  public PartyRoleSpecification attachment(List<@Valid AttachmentRefOrValue> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PartyRoleSpecification addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PartyRoleSpecification targetEntitySchema(TargetEntitySchema targetEntitySchema) {
    super.targetEntitySchema(targetEntitySchema);
    return this;
  }

  public PartyRoleSpecification specCharacteristic(List<CharacteristicSpecification> specCharacteristic) {
    super.specCharacteristic(specCharacteristic);
    return this;
  }

  public PartyRoleSpecification addSpecCharacteristicItem(CharacteristicSpecification specCharacteristicItem) {
    super.addSpecCharacteristicItem(specCharacteristicItem);
    return this;
  }

  public PartyRoleSpecification relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PartyRoleSpecification addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PartyRoleSpecification constraint(List<ConstraintRef> constraint) {
    super.constraint(constraint);
    return this;
  }

  public PartyRoleSpecification addConstraintItem(ConstraintRef constraintItem) {
    super.addConstraintItem(constraintItem);
    return this;
  }

  public PartyRoleSpecification entitySpecRelationship(List<@Valid EntitySpecificationRelationship> entitySpecRelationship) {
    super.entitySpecRelationship(entitySpecRelationship);
    return this;
  }

  public PartyRoleSpecification addEntitySpecRelationshipItem(EntitySpecificationRelationship entitySpecRelationshipItem) {
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
    PartyRoleSpecification partyRoleSpecification = (PartyRoleSpecification) o;
    return Objects.equals(this.agreementSpecification, partyRoleSpecification.agreementSpecification) &&
        Objects.equals(this.permissionSpecificationSet, partyRoleSpecification.permissionSpecificationSet) &&
        Objects.equals(this.status, partyRoleSpecification.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementSpecification, permissionSpecificationSet, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleSpecification {\n");
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

