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
 * Response object for Resource
 */

@Schema(name = "Resource_RES", description = "Response object for Resource")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceRES extends Resource {

  public ResourceRES() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceRES(String atType, String href, String id) {
    super(atType);
  }


  public ResourceRES atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceRES atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceRES atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceRES href(String href) {
    super.href(href);
    return this;
  }

  public ResourceRES id(String id) {
    super.id(id);
    return this;
  }

  public ResourceRES category(String category) {
    super.category(category);
    return this;
  }

  public ResourceRES description(String description) {
    super.description(description);
    return this;
  }

  public ResourceRES name(String name) {
    super.name(name);
    return this;
  }

  public ResourceRES endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public ResourceRES administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public ResourceRES operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public ResourceRES resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public ResourceRES usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public ResourceRES validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceRES note(List<Note> note) {
    super.note(note);
    return this;
  }

  public ResourceRES addNoteItem(Note noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public ResourceRES resourceOrderItem(List<RelatedResourceOrderItem> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public ResourceRES addResourceOrderItemItem(RelatedResourceOrderItem resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public ResourceRES place(List<RelatedPlaceRef> place) {
    super.place(place);
    return this;
  }

  public ResourceRES addPlaceItem(RelatedPlaceRef placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public ResourceRES relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceRES addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceRES supportingResource(List<@Valid ResourceRefOrValue> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public ResourceRES addSupportingResourceItem(ResourceRefOrValue supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public ResourceRES resourceRelationship(List<ResourceRelationship> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public ResourceRES addResourceRelationshipItem(ResourceRelationship resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public ResourceRES resourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public ResourceRES addResourceCharacteristicItem(Characteristic resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public ResourceRES attachment(List<AttachmentRef> attachment) {
    super.attachment(attachment);
    return this;
  }

  public ResourceRES addAttachmentItem(AttachmentRef attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public ResourceRES resourceSpecification(ResourceSpecificationRef resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public ResourceRES startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public ResourceRES resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public ResourceRES activationFeature(List<Feature> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public ResourceRES addActivationFeatureItem(Feature activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public ResourceRES intent(IntentRef intent) {
    super.intent(intent);
    return this;
  }

  public ResourceRES externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public ResourceRES addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRES {\n");
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

