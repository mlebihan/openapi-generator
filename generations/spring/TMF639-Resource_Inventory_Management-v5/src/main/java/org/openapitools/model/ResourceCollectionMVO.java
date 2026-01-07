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
 * ResourceCollectionMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCollectionMVO extends ResourceMVO {

  @Valid
  private List<@Valid ResourceRefOrValueMVO> containedResource = new ArrayList<>();

  public ResourceCollectionMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCollectionMVO(String atType) {
    super(atType);
  }

  public ResourceCollectionMVO containedResource(List<@Valid ResourceRefOrValueMVO> containedResource) {
    this.containedResource = containedResource;
    return this;
  }

  public ResourceCollectionMVO addContainedResourceItem(ResourceRefOrValueMVO containedResourceItem) {
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
  public List<@Valid ResourceRefOrValueMVO> getContainedResource() {
    return containedResource;
  }

  public void setContainedResource(List<@Valid ResourceRefOrValueMVO> containedResource) {
    this.containedResource = containedResource;
  }


  public ResourceCollectionMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceCollectionMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceCollectionMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceCollectionMVO href(String href) {
    super.href(href);
    return this;
  }

  public ResourceCollectionMVO id(String id) {
    super.id(id);
    return this;
  }

  public ResourceCollectionMVO category(String category) {
    super.category(category);
    return this;
  }

  public ResourceCollectionMVO description(String description) {
    super.description(description);
    return this;
  }

  public ResourceCollectionMVO name(String name) {
    super.name(name);
    return this;
  }

  public ResourceCollectionMVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public ResourceCollectionMVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public ResourceCollectionMVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public ResourceCollectionMVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public ResourceCollectionMVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public ResourceCollectionMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceCollectionMVO note(List<NoteMVO> note) {
    super.note(note);
    return this;
  }

  public ResourceCollectionMVO addNoteItem(NoteMVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public ResourceCollectionMVO resourceOrderItem(List<RelatedResourceOrderItemMVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public ResourceCollectionMVO addResourceOrderItemItem(RelatedResourceOrderItemMVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public ResourceCollectionMVO place(List<RelatedPlaceRefMVO> place) {
    super.place(place);
    return this;
  }

  public ResourceCollectionMVO addPlaceItem(RelatedPlaceRefMVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public ResourceCollectionMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceCollectionMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceCollectionMVO supportingResource(List<@Valid ResourceRefOrValueMVO> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public ResourceCollectionMVO addSupportingResourceItem(ResourceRefOrValueMVO supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public ResourceCollectionMVO resourceRelationship(List<ResourceRelationshipMVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public ResourceCollectionMVO addResourceRelationshipItem(ResourceRelationshipMVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public ResourceCollectionMVO resourceCharacteristic(List<CharacteristicMVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public ResourceCollectionMVO addResourceCharacteristicItem(CharacteristicMVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public ResourceCollectionMVO attachment(List<AttachmentRefMVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public ResourceCollectionMVO addAttachmentItem(AttachmentRefMVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public ResourceCollectionMVO resourceSpecification(ResourceSpecificationRefMVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public ResourceCollectionMVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public ResourceCollectionMVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public ResourceCollectionMVO activationFeature(List<FeatureMVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public ResourceCollectionMVO addActivationFeatureItem(FeatureMVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public ResourceCollectionMVO intent(IntentRefMVO intent) {
    super.intent(intent);
    return this;
  }

  public ResourceCollectionMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public ResourceCollectionMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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
    ResourceCollectionMVO resourceCollectionMVO = (ResourceCollectionMVO) o;
    return Objects.equals(this.containedResource, resourceCollectionMVO.containedResource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containedResource, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCollectionMVO {\n");
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

