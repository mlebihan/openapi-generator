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
 * LogicalResourceMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class LogicalResourceMVO extends ResourceMVO {

  private @Nullable String value;

  public LogicalResourceMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LogicalResourceMVO(String atType) {
    super(atType);
  }

  public LogicalResourceMVO value(@Nullable String value) {
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


  public LogicalResourceMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public LogicalResourceMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public LogicalResourceMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public LogicalResourceMVO href(String href) {
    super.href(href);
    return this;
  }

  public LogicalResourceMVO id(String id) {
    super.id(id);
    return this;
  }

  public LogicalResourceMVO category(String category) {
    super.category(category);
    return this;
  }

  public LogicalResourceMVO description(String description) {
    super.description(description);
    return this;
  }

  public LogicalResourceMVO name(String name) {
    super.name(name);
    return this;
  }

  public LogicalResourceMVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public LogicalResourceMVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public LogicalResourceMVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public LogicalResourceMVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public LogicalResourceMVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public LogicalResourceMVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public LogicalResourceMVO note(List<NoteMVO> note) {
    super.note(note);
    return this;
  }

  public LogicalResourceMVO addNoteItem(NoteMVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public LogicalResourceMVO resourceOrderItem(List<RelatedResourceOrderItemMVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public LogicalResourceMVO addResourceOrderItemItem(RelatedResourceOrderItemMVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public LogicalResourceMVO place(List<RelatedPlaceRefMVO> place) {
    super.place(place);
    return this;
  }

  public LogicalResourceMVO addPlaceItem(RelatedPlaceRefMVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public LogicalResourceMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public LogicalResourceMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public LogicalResourceMVO supportingResource(List<@Valid ResourceRefOrValueMVO> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public LogicalResourceMVO addSupportingResourceItem(ResourceRefOrValueMVO supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public LogicalResourceMVO resourceRelationship(List<ResourceRelationshipMVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public LogicalResourceMVO addResourceRelationshipItem(ResourceRelationshipMVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public LogicalResourceMVO resourceCharacteristic(List<CharacteristicMVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public LogicalResourceMVO addResourceCharacteristicItem(CharacteristicMVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public LogicalResourceMVO attachment(List<AttachmentRefMVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public LogicalResourceMVO addAttachmentItem(AttachmentRefMVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public LogicalResourceMVO resourceSpecification(ResourceSpecificationRefMVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public LogicalResourceMVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public LogicalResourceMVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public LogicalResourceMVO activationFeature(List<FeatureMVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public LogicalResourceMVO addActivationFeatureItem(FeatureMVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public LogicalResourceMVO intent(IntentRefMVO intent) {
    super.intent(intent);
    return this;
  }

  public LogicalResourceMVO externalIdentifier(List<ExternalIdentifierMVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public LogicalResourceMVO addExternalIdentifierItem(ExternalIdentifierMVO externalIdentifierItem) {
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
    LogicalResourceMVO logicalResourceMVO = (LogicalResourceMVO) o;
    return Objects.equals(this.value, logicalResourceMVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalResourceMVO {\n");
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

