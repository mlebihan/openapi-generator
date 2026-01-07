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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefMVO;
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.ExternalIdentifierMVO;
import org.openapitools.model.FeatureMVO;
import org.openapitools.model.IntentRefMVO;
import org.openapitools.model.NoteMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
import org.openapitools.model.RelatedPlaceRefMVO;
import org.openapitools.model.RelatedResourceOrderItemMVO;
import org.openapitools.model.ResourceAdministrativeStateType;
import org.openapitools.model.ResourceMVO;
import org.openapitools.model.ResourceOperationalStateType;
import org.openapitools.model.ResourceRefOrValueMVO;
import org.openapitools.model.ResourceRelationshipMVO;
import org.openapitools.model.ResourceSpecificationRefMVO;
import org.openapitools.model.ResourceStatusType;
import org.openapitools.model.ResourceUsageStateType;
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
 * PhysicalResourceMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PhysicalResourceMVO extends ResourceMVO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime manufactureDate;

  private @Nullable String powerState;

  private @Nullable String serialNumber;

  private @Nullable String versionNumber;

  public PhysicalResourceMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhysicalResourceMVO(String atType) {
    super(atType);
  }

  public PhysicalResourceMVO manufactureDate(@Nullable OffsetDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
    return this;
  }

  /**
   * This is a string attribute that defines the date of manufacture of this item in the fixed format \"dd/mm/yyyy\". This is an optional attribute.
   * @return manufactureDate
   */
  @Valid 
  @Schema(name = "manufactureDate", description = "This is a string attribute that defines the date of manufacture of this item in the fixed format \"dd/mm/yyyy\". This is an optional attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manufactureDate")
  public @Nullable OffsetDateTime getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(@Nullable OffsetDateTime manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  public PhysicalResourceMVO powerState(@Nullable String powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * This defines the current power status of the hardware item. Values include:    0:  Unknown   1:  Not Applicable   2:  No Power Applied   3: Full Power Applied   4:  Power Save - Normal   5:  Power Save - Degraded   6:  Power Save - Standby   7:  Power Save - Critical   8:  Power Save - Low Power Mode   9:  Power Save - Unknown  10: Power Cycle  11: Power Warning  12: Power Off
   * @return powerState
   */
  
  @Schema(name = "powerState", description = "This defines the current power status of the hardware item. Values include:    0:  Unknown   1:  Not Applicable   2:  No Power Applied   3: Full Power Applied   4:  Power Save - Normal   5:  Power Save - Degraded   6:  Power Save - Standby   7:  Power Save - Critical   8:  Power Save - Low Power Mode   9:  Power Save - Unknown  10: Power Cycle  11: Power Warning  12: Power Off", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("powerState")
  public @Nullable String getPowerState() {
    return powerState;
  }

  public void setPowerState(@Nullable String powerState) {
    this.powerState = powerState;
  }

  public PhysicalResourceMVO serialNumber(@Nullable String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * This is a string that represents a manufacturer-allocated number used to identify different instances of the same hardware item. The ModelNumber and PartNumber attributes are used to identify different types of hardware items. This is a REQUIRED attribute.
   * @return serialNumber
   */
  
  @Schema(name = "serialNumber", description = "This is a string that represents a manufacturer-allocated number used to identify different instances of the same hardware item. The ModelNumber and PartNumber attributes are used to identify different types of hardware items. This is a REQUIRED attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialNumber")
  public @Nullable String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(@Nullable String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public PhysicalResourceMVO versionNumber(@Nullable String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * This is a string that identifies the version of this physical resource. This is an optional attribute.
   * @return versionNumber
   */
  
  @Schema(name = "versionNumber", description = "This is a string that identifies the version of this physical resource. This is an optional attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionNumber")
  public @Nullable String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(@Nullable String versionNumber) {
    this.versionNumber = versionNumber;
  }


  public PhysicalResourceMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PhysicalResourceMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PhysicalResourceMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PhysicalResourceMVO href(String href) {
    super.href(href);
    return this;
  }

  public PhysicalResourceMVO id(String id) {
    super.id(id);
    return this;
  }

  public PhysicalResourceMVO category(String category) {
    super.category(category);
    return this;
  }

  public PhysicalResourceMVO description(String description) {
    super.description(description);
    return this;
  }

  public PhysicalResourceMVO name(String name) {
    super.name(name);
    return this;
  }

  public PhysicalResourceMVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public PhysicalResourceMVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public PhysicalResourceMVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public PhysicalResourceMVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public PhysicalResourceMVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public PhysicalResourceMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PhysicalResourceMVO note(List<NoteMVO> note) {
    super.note(note);
    return this;
  }

  public PhysicalResourceMVO addNoteItem(NoteMVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public PhysicalResourceMVO resourceOrderItem(List<RelatedResourceOrderItemMVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public PhysicalResourceMVO addResourceOrderItemItem(RelatedResourceOrderItemMVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public PhysicalResourceMVO place(List<RelatedPlaceRefMVO> place) {
    super.place(place);
    return this;
  }

  public PhysicalResourceMVO addPlaceItem(RelatedPlaceRefMVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public PhysicalResourceMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PhysicalResourceMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PhysicalResourceMVO supportingResource(List<@Valid ResourceRefOrValueMVO> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public PhysicalResourceMVO addSupportingResourceItem(ResourceRefOrValueMVO supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public PhysicalResourceMVO resourceRelationship(List<ResourceRelationshipMVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public PhysicalResourceMVO addResourceRelationshipItem(ResourceRelationshipMVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public PhysicalResourceMVO resourceCharacteristic(List<CharacteristicMVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public PhysicalResourceMVO addResourceCharacteristicItem(CharacteristicMVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public PhysicalResourceMVO attachment(List<AttachmentRefMVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PhysicalResourceMVO addAttachmentItem(AttachmentRefMVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PhysicalResourceMVO resourceSpecification(ResourceSpecificationRefMVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public PhysicalResourceMVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public PhysicalResourceMVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public PhysicalResourceMVO activationFeature(List<FeatureMVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public PhysicalResourceMVO addActivationFeatureItem(FeatureMVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public PhysicalResourceMVO intent(IntentRefMVO intent) {
    super.intent(intent);
    return this;
  }

  public PhysicalResourceMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public PhysicalResourceMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
    super.addExternalIdentifierItem(externalIdentifierItem);
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
    PhysicalResourceMVO physicalResourceMVO = (PhysicalResourceMVO) o;
    return Objects.equals(this.manufactureDate, physicalResourceMVO.manufactureDate) &&
        Objects.equals(this.powerState, physicalResourceMVO.powerState) &&
        Objects.equals(this.serialNumber, physicalResourceMVO.serialNumber) &&
        Objects.equals(this.versionNumber, physicalResourceMVO.versionNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufactureDate, powerState, serialNumber, versionNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalResourceMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    manufactureDate: ").append(toIndentedString(manufactureDate)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

