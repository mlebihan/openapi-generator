package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValueFVO;
import org.openapitools.model.CalendarPeriodFVO;
import org.openapitools.model.CharacteristicFVO;
import org.openapitools.model.FeatureFVO;
import org.openapitools.model.FeatureRelationshipFVO;
import org.openapitools.model.Note;
import org.openapitools.model.PolicyRefFVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicSiteFeatureFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSiteFeatureFVO extends FeatureFVO {

  @Valid
  private List<CalendarPeriodFVO> validFor = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentRefOrValueFVO> attachment = new ArrayList<>();

  @Valid
  private List<Note> note = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty = new ArrayList<>();

  @Valid
  private List<String> featureCategory = new ArrayList<>();

  public GeographicSiteFeatureFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteFeatureFVO(String atType, String name) {
    super(atType, name);
  }

  public GeographicSiteFeatureFVO validFor(List<CalendarPeriodFVO> validFor) {
    this.validFor = validFor;
    return this;
  }

  public GeographicSiteFeatureFVO addValidForItem(CalendarPeriodFVO validForItem) {
    if (this.validFor == null) {
      this.validFor = new ArrayList<>();
    }
    this.validFor.add(validForItem);
    return this;
  }

  /**
   * Collection of validity information
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", description = "Collection of validity information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public List<CalendarPeriodFVO> getValidFor() {
    return validFor;
  }

  public void setValidFor(List<CalendarPeriodFVO> validFor) {
    this.validFor = validFor;
  }

  public GeographicSiteFeatureFVO attachment(List<@Valid AttachmentRefOrValueFVO> attachment) {
    this.attachment = attachment;
    return this;
  }

  public GeographicSiteFeatureFVO addAttachmentItem(AttachmentRefOrValueFVO attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Attachments that may be of relevance to this specification, such as picture, document, media
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", description = "Attachments that may be of relevance to this specification, such as picture, document, media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValueFVO> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValueFVO> attachment) {
    this.attachment = attachment;
  }

  public GeographicSiteFeatureFVO note(List<Note> note) {
    this.note = note;
    return this;
  }

  public GeographicSiteFeatureFVO addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Collection of notes
   * @return note
   */
  @Valid 
  @Schema(name = "note", description = "Collection of notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public GeographicSiteFeatureFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSiteFeatureFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * The associated party or partyRole
   * @return relatedParty
   */
  @Valid @Size(min = 1) 
  @Schema(name = "relatedParty", description = "The associated party or partyRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefFVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSiteFeatureFVO featureCategory(List<String> featureCategory) {
    this.featureCategory = featureCategory;
    return this;
  }

  public GeographicSiteFeatureFVO addFeatureCategoryItem(String featureCategoryItem) {
    if (this.featureCategory == null) {
      this.featureCategory = new ArrayList<>();
    }
    this.featureCategory.add(featureCategoryItem);
    return this;
  }

  /**
   * Collection of feature category
   * @return featureCategory
   */
  
  @Schema(name = "featureCategory", description = "Collection of feature category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featureCategory")
  public List<String> getFeatureCategory() {
    return featureCategory;
  }

  public void setFeatureCategory(List<String> featureCategory) {
    this.featureCategory = featureCategory;
  }


  public GeographicSiteFeatureFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSiteFeatureFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSiteFeatureFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicSiteFeatureFVO isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public GeographicSiteFeatureFVO featureRelationship(List<FeatureRelationshipFVO> featureRelationship) {
    super.featureRelationship(featureRelationship);
    return this;
  }

  public GeographicSiteFeatureFVO addFeatureRelationshipItem(FeatureRelationshipFVO featureRelationshipItem) {
    super.addFeatureRelationshipItem(featureRelationshipItem);
    return this;
  }

  public GeographicSiteFeatureFVO featureCharacteristic(List<CharacteristicFVO> featureCharacteristic) {
    super.featureCharacteristic(featureCharacteristic);
    return this;
  }

  public GeographicSiteFeatureFVO addFeatureCharacteristicItem(CharacteristicFVO featureCharacteristicItem) {
    super.addFeatureCharacteristicItem(featureCharacteristicItem);
    return this;
  }

  public GeographicSiteFeatureFVO policyConstraint(List<PolicyRefFVO> policyConstraint) {
    super.policyConstraint(policyConstraint);
    return this;
  }

  public GeographicSiteFeatureFVO addPolicyConstraintItem(PolicyRefFVO policyConstraintItem) {
    super.addPolicyConstraintItem(policyConstraintItem);
    return this;
  }

  public GeographicSiteFeatureFVO isEnabled(Boolean isEnabled) {
    super.isEnabled(isEnabled);
    return this;
  }

  public GeographicSiteFeatureFVO id(String id) {
    super.id(id);
    return this;
  }

  public GeographicSiteFeatureFVO name(String name) {
    super.name(name);
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
    GeographicSiteFeatureFVO geographicSiteFeatureFVO = (GeographicSiteFeatureFVO) o;
    return Objects.equals(this.validFor, geographicSiteFeatureFVO.validFor) &&
        Objects.equals(this.attachment, geographicSiteFeatureFVO.attachment) &&
        Objects.equals(this.note, geographicSiteFeatureFVO.note) &&
        Objects.equals(this.relatedParty, geographicSiteFeatureFVO.relatedParty) &&
        Objects.equals(this.featureCategory, geographicSiteFeatureFVO.featureCategory) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFor, attachment, note, relatedParty, featureCategory, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteFeatureFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    featureCategory: ").append(toIndentedString(featureCategory)).append("\n");
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

