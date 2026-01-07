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
 * ResourceCollection
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCollection extends Resource {

  @Valid
  private List<@Valid ResourceRefOrValue> containedResource = new ArrayList<>();

  public ResourceCollection() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCollection(String atType) {
    super(atType);
  }

  public ResourceCollection containedResource(List<@Valid ResourceRefOrValue> containedResource) {
    this.containedResource = containedResource;
    return this;
  }

  public ResourceCollection addContainedResourceItem(ResourceRefOrValue containedResourceItem) {
    if (this.containedResource == null) {
      this.containedResource = new ArrayList<>();
    }
    this.containedResource.add(containedResourceItem);
    return this;
  }

  /**
   * The Resource members of the collection.
   * @return containedResource
   */
  @Valid 
  @Schema(name = "containedResource", description = "The Resource members of the collection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containedResource")
  public List<@Valid ResourceRefOrValue> getContainedResource() {
    return containedResource;
  }

  public void setContainedResource(List<@Valid ResourceRefOrValue> containedResource) {
    this.containedResource = containedResource;
  }


  public ResourceCollection atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceCollection atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceCollection atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceCollection href(String href) {
    super.href(href);
    return this;
  }

  public ResourceCollection id(String id) {
    super.id(id);
    return this;
  }

  public ResourceCollection category(String category) {
    super.category(category);
    return this;
  }

  public ResourceCollection description(String description) {
    super.description(description);
    return this;
  }

  public ResourceCollection name(String name) {
    super.name(name);
    return this;
  }

  public ResourceCollection endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public ResourceCollection administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public ResourceCollection operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public ResourceCollection resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public ResourceCollection usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public ResourceCollection validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceCollection note(List<Note> note) {
    super.note(note);
    return this;
  }

  public ResourceCollection addNoteItem(Note noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public ResourceCollection resourceOrderItem(List<RelatedResourceOrderItem> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public ResourceCollection addResourceOrderItemItem(RelatedResourceOrderItem resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public ResourceCollection place(List<RelatedPlaceRef> place) {
    super.place(place);
    return this;
  }

  public ResourceCollection addPlaceItem(RelatedPlaceRef placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public ResourceCollection relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceCollection addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceCollection supportingResource(List<@Valid ResourceRefOrValue> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public ResourceCollection addSupportingResourceItem(ResourceRefOrValue supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public ResourceCollection resourceRelationship(List<ResourceRelationship> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public ResourceCollection addResourceRelationshipItem(ResourceRelationship resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public ResourceCollection resourceCharacteristic(List<Characteristic> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public ResourceCollection addResourceCharacteristicItem(Characteristic resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public ResourceCollection attachment(List<AttachmentRef> attachment) {
    super.attachment(attachment);
    return this;
  }

  public ResourceCollection addAttachmentItem(AttachmentRef attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public ResourceCollection resourceSpecification(ResourceSpecificationRef resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public ResourceCollection startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public ResourceCollection resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public ResourceCollection activationFeature(List<Feature> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public ResourceCollection addActivationFeatureItem(Feature activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public ResourceCollection intent(IntentRef intent) {
    super.intent(intent);
    return this;
  }

  public ResourceCollection externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public ResourceCollection addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    ResourceCollection resourceCollection = (ResourceCollection) o;
    return Objects.equals(this.containedResource, resourceCollection.containedResource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containedResource, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    containedResource: ").append(toIndentedString(containedResource)).append("\n");
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

