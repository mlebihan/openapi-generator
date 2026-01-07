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
 * LogicalResourceFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class LogicalResourceFVO extends ResourceFVO {

  private @Nullable String value;

  public LogicalResourceFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LogicalResourceFVO(String atType) {
    super(atType);
  }

  public LogicalResourceFVO value(@Nullable String value) {
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


  public LogicalResourceFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public LogicalResourceFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public LogicalResourceFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public LogicalResourceFVO href(String href) {
    super.href(href);
    return this;
  }

  public LogicalResourceFVO id(String id) {
    super.id(id);
    return this;
  }

  public LogicalResourceFVO category(String category) {
    super.category(category);
    return this;
  }

  public LogicalResourceFVO description(String description) {
    super.description(description);
    return this;
  }

  public LogicalResourceFVO name(String name) {
    super.name(name);
    return this;
  }

  public LogicalResourceFVO endOperatingDate(OffsetDateTime endOperatingDate) {
    super.endOperatingDate(endOperatingDate);
    return this;
  }

  public LogicalResourceFVO administrativeState(ResourceAdministrativeStateType administrativeState) {
    super.administrativeState(administrativeState);
    return this;
  }

  public LogicalResourceFVO operationalState(ResourceOperationalStateType operationalState) {
    super.operationalState(operationalState);
    return this;
  }

  public LogicalResourceFVO resourceStatus(ResourceStatusType resourceStatus) {
    super.resourceStatus(resourceStatus);
    return this;
  }

  public LogicalResourceFVO usageState(ResourceUsageStateType usageState) {
    super.usageState(usageState);
    return this;
  }

  public LogicalResourceFVO validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public LogicalResourceFVO note(List<NoteFVO> note) {
    super.note(note);
    return this;
  }

  public LogicalResourceFVO addNoteItem(NoteFVO noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public LogicalResourceFVO resourceOrderItem(List<RelatedResourceOrderItemFVO> resourceOrderItem) {
    super.resourceOrderItem(resourceOrderItem);
    return this;
  }

  public LogicalResourceFVO addResourceOrderItemItem(RelatedResourceOrderItemFVO resourceOrderItemItem) {
    super.addResourceOrderItemItem(resourceOrderItemItem);
    return this;
  }

  public LogicalResourceFVO place(List<RelatedPlaceRefFVO> place) {
    super.place(place);
    return this;
  }

  public LogicalResourceFVO addPlaceItem(RelatedPlaceRefFVO placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public LogicalResourceFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public LogicalResourceFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public LogicalResourceFVO supportingResource(List<@Valid ResourceRefOrValueFVO> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public LogicalResourceFVO addSupportingResourceItem(ResourceRefOrValueFVO supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public LogicalResourceFVO resourceRelationship(List<ResourceRelationshipFVO> resourceRelationship) {
    super.resourceRelationship(resourceRelationship);
    return this;
  }

  public LogicalResourceFVO addResourceRelationshipItem(ResourceRelationshipFVO resourceRelationshipItem) {
    super.addResourceRelationshipItem(resourceRelationshipItem);
    return this;
  }

  public LogicalResourceFVO resourceCharacteristic(List<CharacteristicFVO> resourceCharacteristic) {
    super.resourceCharacteristic(resourceCharacteristic);
    return this;
  }

  public LogicalResourceFVO addResourceCharacteristicItem(CharacteristicFVO resourceCharacteristicItem) {
    super.addResourceCharacteristicItem(resourceCharacteristicItem);
    return this;
  }

  public LogicalResourceFVO attachment(List<AttachmentRefFVO> attachment) {
    super.attachment(attachment);
    return this;
  }

  public LogicalResourceFVO addAttachmentItem(AttachmentRefFVO attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public LogicalResourceFVO resourceSpecification(ResourceSpecificationRefFVO resourceSpecification) {
    super.resourceSpecification(resourceSpecification);
    return this;
  }

  public LogicalResourceFVO startOperatingDate(OffsetDateTime startOperatingDate) {
    super.startOperatingDate(startOperatingDate);
    return this;
  }

  public LogicalResourceFVO resourceVersion(String resourceVersion) {
    super.resourceVersion(resourceVersion);
    return this;
  }

  public LogicalResourceFVO activationFeature(List<FeatureFVO> activationFeature) {
    super.activationFeature(activationFeature);
    return this;
  }

  public LogicalResourceFVO addActivationFeatureItem(FeatureFVO activationFeatureItem) {
    super.addActivationFeatureItem(activationFeatureItem);
    return this;
  }

  public LogicalResourceFVO intent(IntentRefFVO intent) {
    super.intent(intent);
    return this;
  }

  public LogicalResourceFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public LogicalResourceFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
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
    LogicalResourceFVO logicalResourceFVO = (LogicalResourceFVO) o;
    return Objects.equals(this.value, logicalResourceFVO.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalResourceFVO {\n");
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

