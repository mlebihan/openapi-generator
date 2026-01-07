package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.CalendarPeriod;
import org.openapitools.model.Characteristic;
import org.openapitools.model.Feature;
import org.openapitools.model.FeatureRelationship;
import org.openapitools.model.Note;
import org.openapitools.model.PolicyRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicSiteFeature
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSiteFeature extends Feature {

  @Valid
  private List<CalendarPeriod> validFor = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentRefOrValue> attachment = new ArrayList<>();

  @Valid
  private List<Note> note = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<String> featureCategory = new ArrayList<>();

  public GeographicSiteFeature() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSiteFeature(String atType) {
    super(atType);
  }

  public GeographicSiteFeature validFor(List<CalendarPeriod> validFor) {
    this.validFor = validFor;
    return this;
  }

  public GeographicSiteFeature addValidForItem(CalendarPeriod validForItem) {
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
  public List<CalendarPeriod> getValidFor() {
    return validFor;
  }

  public void setValidFor(List<CalendarPeriod> validFor) {
    this.validFor = validFor;
  }

  public GeographicSiteFeature attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public GeographicSiteFeature addAttachmentItem(AttachmentRefOrValue attachmentItem) {
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
  public List<@Valid AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public GeographicSiteFeature note(List<Note> note) {
    this.note = note;
    return this;
  }

  public GeographicSiteFeature addNoteItem(Note noteItem) {
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

  public GeographicSiteFeature relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public GeographicSiteFeature addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
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
  public List<RelatedPartyRefOrPartyRoleRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public GeographicSiteFeature featureCategory(List<String> featureCategory) {
    this.featureCategory = featureCategory;
    return this;
  }

  public GeographicSiteFeature addFeatureCategoryItem(String featureCategoryItem) {
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


  public GeographicSiteFeature atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeographicSiteFeature atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicSiteFeature atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeographicSiteFeature isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public GeographicSiteFeature featureRelationship(List<FeatureRelationship> featureRelationship) {
    super.featureRelationship(featureRelationship);
    return this;
  }

  public GeographicSiteFeature addFeatureRelationshipItem(FeatureRelationship featureRelationshipItem) {
    super.addFeatureRelationshipItem(featureRelationshipItem);
    return this;
  }

  public GeographicSiteFeature featureCharacteristic(List<Characteristic> featureCharacteristic) {
    super.featureCharacteristic(featureCharacteristic);
    return this;
  }

  public GeographicSiteFeature addFeatureCharacteristicItem(Characteristic featureCharacteristicItem) {
    super.addFeatureCharacteristicItem(featureCharacteristicItem);
    return this;
  }

  public GeographicSiteFeature policyConstraint(List<PolicyRef> policyConstraint) {
    super.policyConstraint(policyConstraint);
    return this;
  }

  public GeographicSiteFeature addPolicyConstraintItem(PolicyRef policyConstraintItem) {
    super.addPolicyConstraintItem(policyConstraintItem);
    return this;
  }

  public GeographicSiteFeature isEnabled(Boolean isEnabled) {
    super.isEnabled(isEnabled);
    return this;
  }

  public GeographicSiteFeature id(String id) {
    super.id(id);
    return this;
  }

  public GeographicSiteFeature name(String name) {
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
    GeographicSiteFeature geographicSiteFeature = (GeographicSiteFeature) o;
    return Objects.equals(this.validFor, geographicSiteFeature.validFor) &&
        Objects.equals(this.attachment, geographicSiteFeature.attachment) &&
        Objects.equals(this.note, geographicSiteFeature.note) &&
        Objects.equals(this.relatedParty, geographicSiteFeature.relatedParty) &&
        Objects.equals(this.featureCategory, geographicSiteFeature.featureCategory) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFor, attachment, note, relatedParty, featureCategory, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSiteFeature {\n");
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

