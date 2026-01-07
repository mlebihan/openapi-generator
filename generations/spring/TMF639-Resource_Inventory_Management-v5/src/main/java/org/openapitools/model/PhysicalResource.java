package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRef;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.Feature;
import org.openapitools.model.IntentRef;
import org.openapitools.model.Note;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.RelatedPlaceRef;
import org.openapitools.model.RelatedResourceOrderItem;
import org.openapitools.model.Resource;
import org.openapitools.model.ResourceAdministrativeStateType;
import org.openapitools.model.ResourceOperationalStateType;
import org.openapitools.model.ResourceRefOrValue;
import org.openapitools.model.ResourceRelationship;
import org.openapitools.model.ResourceSpecificationRef;
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
 * PhysicalResource
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PhysicalResource extends Resource {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime manufactureDate;

  private @Nullable String powerState;

  private @Nullable String serialNumber;

  private @Nullable String versionNumber;

  public PhysicalResource() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhysicalResource(String atType) {
    super(atType);
  }

  public PhysicalResource manufactureDate(@Nullable OffsetDateTime manufactureDate) {
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

  public PhysicalResource powerState(@Nullable String powerState) {
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

  public PhysicalResource serialNumber(@Nullable String serialNumber) {
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

  public PhysicalResource versionNumber(@Nullable String versionNumber) {
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


  public PhysicalResource atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PhysicalResource atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PhysicalResource atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PhysicalResource href(String href) {
    super.href(href);
    return this;
  }

  public PhysicalResource id(String id) {
    super.id(id);
    return this;
  }

  public PhysicalResource category(String category) {
    super.category(category);
    return this;
  }

  public PhysicalResource description(String description) {
    super.description(description);
    return this;
  }

  public PhysicalResource name(String name) {
    super.name(name);
    return this;
  }

  public PhysicalResource endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public PhysicalResource administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public PhysicalResource operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public PhysicalResource resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public PhysicalResource usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public PhysicalResource validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PhysicalResource note(List<Note> note) {
    super.note(note);
    return this;
  }

  public PhysicalResource addNoteItem(Note noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public PhysicalResource resourceOrderItem(List<RelatedResourceOrderItem> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public PhysicalResource addResourceOrderItemItem(RelatedResourceOrderItem resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public PhysicalResource place(List<RelatedPlaceRef> place) {
    super.place(place);
    return this;
  }

  public PhysicalResource addPlaceItem(RelatedPlaceRef placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public PhysicalResource relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PhysicalResource addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PhysicalResource supportingResource(List<@Valid ResourceRefOrValue> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public PhysicalResource addSupportingResourceItem(ResourceRefOrValue supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public PhysicalResource resourceRelationship(List<ResourceRelationship> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public PhysicalResource addResourceRelationshipItem(ResourceRelationship resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public PhysicalResource resourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public PhysicalResource addResourceCharacteristicItem(Characteristic resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public PhysicalResource attachment(List<AttachmentRef> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PhysicalResource addAttachmentItem(AttachmentRef attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PhysicalResource resourceSpecification(ResourceSpecificationRef resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public PhysicalResource startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public PhysicalResource resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public PhysicalResource activationFeature(List<Feature> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public PhysicalResource addActivationFeatureItem(Feature activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public PhysicalResource intent(IntentRef intent) {
    super.intent(intent);
    return this;
  }

  public PhysicalResource externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public PhysicalResource addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    PhysicalResource physicalResource = (PhysicalResource) o;
    return Objects.equals(this.manufactureDate, physicalResource.manufactureDate) &&
        Objects.equals(this.powerState, physicalResource.powerState) &&
        Objects.equals(this.serialNumber, physicalResource.serialNumber) &&
        Objects.equals(this.versionNumber, physicalResource.versionNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufactureDate, powerState, serialNumber, versionNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalResource {\n");
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

