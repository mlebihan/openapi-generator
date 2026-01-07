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
import org.openapitools.model.AttachmentRefFVO;
import org.openapitools.model.CharacteristicFVO;
import org.openapitools.model.ExternalIdentifierFVO;
import org.openapitools.model.FeatureFVO;
import org.openapitools.model.IntentRefFVO;
import org.openapitools.model.NoteFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.openapitools.model.RelatedPlaceRefFVO;
import org.openapitools.model.RelatedResourceOrderItemFVO;
import org.openapitools.model.ResourceAdministrativeStateType;
import org.openapitools.model.ResourceFVO;
import org.openapitools.model.ResourceOperationalStateType;
import org.openapitools.model.ResourceRefOrValueFVO;
import org.openapitools.model.ResourceRelationshipFVO;
import org.openapitools.model.ResourceSpecificationRefFVO;
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
 * PhysicalResourceFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PhysicalResourceFVO extends ResourceFVO {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime manufactureDate;

  private @Nullable String powerState;

  private @Nullable String serialNumber;

  private @Nullable String versionNumber;

  public PhysicalResourceFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhysicalResourceFVO(String atType) {
    super(atType);
  }

  public PhysicalResourceFVO manufactureDate(@Nullable OffsetDateTime manufactureDate) {
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

  public PhysicalResourceFVO powerState(@Nullable String powerState) {
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

  public PhysicalResourceFVO serialNumber(@Nullable String serialNumber) {
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

  public PhysicalResourceFVO versionNumber(@Nullable String versionNumber) {
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


  public PhysicalResourceFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PhysicalResourceFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PhysicalResourceFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PhysicalResourceFVO href(String href) {
    super.href(href);
    return this;
  }

  public PhysicalResourceFVO id(String id) {
    super.id(id);
    return this;
  }

  public PhysicalResourceFVO category(String category) {
    super.category(category);
    return this;
  }

  public PhysicalResourceFVO description(String description) {
    super.description(description);
    return this;
  }

  public PhysicalResourceFVO name(String name) {
    super.name(name);
    return this;
  }

  public PhysicalResourceFVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public PhysicalResourceFVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public PhysicalResourceFVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public PhysicalResourceFVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public PhysicalResourceFVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public PhysicalResourceFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PhysicalResourceFVO note(List<NoteFVO> note) {
    super.note(note);
    return this;
  }

  public PhysicalResourceFVO addNoteItem(NoteFVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public PhysicalResourceFVO resourceOrderItem(List<RelatedResourceOrderItemFVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public PhysicalResourceFVO addResourceOrderItemItem(RelatedResourceOrderItemFVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public PhysicalResourceFVO place(List<RelatedPlaceRefFVO> place) {
    super.place(place);
    return this;
  }

  public PhysicalResourceFVO addPlaceItem(RelatedPlaceRefFVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public PhysicalResourceFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PhysicalResourceFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PhysicalResourceFVO supportingResource(List<@Valid ResourceRefOrValueFVO> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public PhysicalResourceFVO addSupportingResourceItem(ResourceRefOrValueFVO supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public PhysicalResourceFVO resourceRelationship(List<ResourceRelationshipFVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public PhysicalResourceFVO addResourceRelationshipItem(ResourceRelationshipFVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public PhysicalResourceFVO resourceCharacteristic(List<CharacteristicFVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public PhysicalResourceFVO addResourceCharacteristicItem(CharacteristicFVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public PhysicalResourceFVO attachment(List<AttachmentRefFVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PhysicalResourceFVO addAttachmentItem(AttachmentRefFVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PhysicalResourceFVO resourceSpecification(ResourceSpecificationRefFVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public PhysicalResourceFVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public PhysicalResourceFVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public PhysicalResourceFVO activationFeature(List<FeatureFVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public PhysicalResourceFVO addActivationFeatureItem(FeatureFVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public PhysicalResourceFVO intent(IntentRefFVO intent) {
    super.intent(intent);
    return this;
  }

  public PhysicalResourceFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public PhysicalResourceFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
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
    PhysicalResourceFVO physicalResourceFVO = (PhysicalResourceFVO) o;
    return Objects.equals(this.manufactureDate, physicalResourceFVO.manufactureDate) &&
        Objects.equals(this.powerState, physicalResourceFVO.powerState) &&
        Objects.equals(this.serialNumber, physicalResourceFVO.serialNumber) &&
        Objects.equals(this.versionNumber, physicalResourceFVO.versionNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufactureDate, powerState, serialNumber, versionNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalResourceFVO {\n");
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

