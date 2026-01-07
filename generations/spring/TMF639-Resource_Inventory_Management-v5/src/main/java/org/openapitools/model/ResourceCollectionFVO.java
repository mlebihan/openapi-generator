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
 * ResourceCollectionFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceCollectionFVO extends ResourceFVO {

  @Valid
  private List<@Valid ResourceRefOrValueFVO> containedResource = new ArrayList<>();

  public ResourceCollectionFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceCollectionFVO(String atType) {
    super(atType);
  }

  public ResourceCollectionFVO containedResource(List<@Valid ResourceRefOrValueFVO> containedResource) {
    this.containedResource = containedResource;
    return this;
  }

  public ResourceCollectionFVO addContainedResourceItem(ResourceRefOrValueFVO containedResourceItem) {
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
  public List<@Valid ResourceRefOrValueFVO> getContainedResource() {
    return containedResource;
  }

  public void setContainedResource(List<@Valid ResourceRefOrValueFVO> containedResource) {
    this.containedResource = containedResource;
  }


  public ResourceCollectionFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceCollectionFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceCollectionFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceCollectionFVO href(String href) {
    super.href(href);
    return this;
  }

  public ResourceCollectionFVO id(String id) {
    super.id(id);
    return this;
  }

  public ResourceCollectionFVO category(String category) {
    super.category(category);
    return this;
  }

  public ResourceCollectionFVO description(String description) {
    super.description(description);
    return this;
  }

  public ResourceCollectionFVO name(String name) {
    super.name(name);
    return this;
  }

  public ResourceCollectionFVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public ResourceCollectionFVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public ResourceCollectionFVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public ResourceCollectionFVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public ResourceCollectionFVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public ResourceCollectionFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceCollectionFVO note(List<NoteFVO> note) {
    super.note(note);
    return this;
  }

  public ResourceCollectionFVO addNoteItem(NoteFVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public ResourceCollectionFVO resourceOrderItem(List<RelatedResourceOrderItemFVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public ResourceCollectionFVO addResourceOrderItemItem(RelatedResourceOrderItemFVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public ResourceCollectionFVO place(List<RelatedPlaceRefFVO> place) {
    super.place(place);
    return this;
  }

  public ResourceCollectionFVO addPlaceItem(RelatedPlaceRefFVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public ResourceCollectionFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceCollectionFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceCollectionFVO supportingResource(List<@Valid ResourceRefOrValueFVO> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public ResourceCollectionFVO addSupportingResourceItem(ResourceRefOrValueFVO supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public ResourceCollectionFVO resourceRelationship(List<ResourceRelationshipFVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public ResourceCollectionFVO addResourceRelationshipItem(ResourceRelationshipFVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public ResourceCollectionFVO resourceCharacteristic(List<CharacteristicFVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public ResourceCollectionFVO addResourceCharacteristicItem(CharacteristicFVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public ResourceCollectionFVO attachment(List<AttachmentRefFVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public ResourceCollectionFVO addAttachmentItem(AttachmentRefFVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public ResourceCollectionFVO resourceSpecification(ResourceSpecificationRefFVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public ResourceCollectionFVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public ResourceCollectionFVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public ResourceCollectionFVO activationFeature(List<FeatureFVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public ResourceCollectionFVO addActivationFeatureItem(FeatureFVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public ResourceCollectionFVO intent(IntentRefFVO intent) {
    super.intent(intent);
    return this;
  }

  public ResourceCollectionFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public ResourceCollectionFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
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
    ResourceCollectionFVO resourceCollectionFVO = (ResourceCollectionFVO) o;
    return Objects.equals(this.containedResource, resourceCollectionFVO.containedResource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containedResource, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCollectionFVO {\n");
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

