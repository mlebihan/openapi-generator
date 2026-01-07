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
 * LogicalResource
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class LogicalResource extends Resource {

  private @Nullable String value;

  public LogicalResource() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LogicalResource(String atType) {
    super(atType);
  }

  public LogicalResource value(@Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * the value of the logical resource. E.g '0746712345' for  MSISDN's
   * @return value
   */
  
  @Schema(name = "value", description = "the value of the logical resource. E.g '0746712345' for  MSISDN's", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable String getValue() {
    return value;
  }

  public void setValue(@Nullable String value) {
    this.value = value;
  }


  public LogicalResource atType(String atType) {
    super.atType(atType);
    return this;
  }

  public LogicalResource atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public LogicalResource atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public LogicalResource href(String href) {
    super.href(href);
    return this;
  }

  public LogicalResource id(String id) {
    super.id(id);
    return this;
  }

  public LogicalResource category(String category) {
    super.category(category);
    return this;
  }

  public LogicalResource description(String description) {
    super.description(description);
    return this;
  }

  public LogicalResource name(String name) {
    super.name(name);
    return this;
  }

  public LogicalResource endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public LogicalResource administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public LogicalResource operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public LogicalResource resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public LogicalResource usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public LogicalResource validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public LogicalResource note(List<Note> note) {
    super.note(note);
    return this;
  }

  public LogicalResource addNoteItem(Note noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public LogicalResource resourceOrderItem(List<RelatedResourceOrderItem> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public LogicalResource addResourceOrderItemItem(RelatedResourceOrderItem resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public LogicalResource place(List<RelatedPlaceRef> place) {
    super.place(place);
    return this;
  }

  public LogicalResource addPlaceItem(RelatedPlaceRef placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public LogicalResource relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public LogicalResource addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public LogicalResource supportingResource(List<@Valid ResourceRefOrValue> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public LogicalResource addSupportingResourceItem(ResourceRefOrValue supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public LogicalResource resourceRelationship(List<ResourceRelationship> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public LogicalResource addResourceRelationshipItem(ResourceRelationship resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public LogicalResource resourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public LogicalResource addResourceCharacteristicItem(Characteristic resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public LogicalResource attachment(List<AttachmentRef> attachment) {
    super.attachment(attachment);
    return this;
  }

  public LogicalResource addAttachmentItem(AttachmentRef attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public LogicalResource resourceSpecification(ResourceSpecificationRef resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public LogicalResource startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public LogicalResource resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public LogicalResource activationFeature(List<Feature> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public LogicalResource addActivationFeatureItem(Feature activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public LogicalResource intent(IntentRef intent) {
    super.intent(intent);
    return this;
  }

  public LogicalResource externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public LogicalResource addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    LogicalResource logicalResource = (LogicalResource) o;
    return Objects.equals(this.value, logicalResource.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

