package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.Characteristic;
import org.openapitools.model.EntityRef;
import org.openapitools.model.EntityRelationship;
import org.openapitools.model.IntentExpression;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
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
 * Intent
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Intent implements IntentRefOrValue {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String description;

  private @Nullable TimePeriod validFor;

  private @Nullable Boolean isBundle;

  private @Nullable String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime statusChangeDate;

  private @Nullable String context;

  private @Nullable String version;

  private @Nullable EntityRef intentSpecification;

  @Valid
  private List<@Valid EntityRelationship> intentRelationship = new ArrayList<>();

  @Valid
  private List<Characteristic> characteristic = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentRefOrValue> attachment = new ArrayList<>();

  private @Nullable String name;

  private @Nullable IntentExpression expression;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  private @Nullable String lifecycleStatus;

  public Intent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Intent(String atType) {
    this.atType = atType;
  }

  public Intent atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Intent atBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public @Nullable String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public Intent atSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public Intent href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public Intent id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Intent description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the intent.
   * @return description
   */
  
  @Schema(name = "description", description = "The description of the intent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public Intent validFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public @Nullable TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
  }

  public Intent isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * isBundle determines whether an intent represents a single intent (false), or a bundle of intents(true).
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "isBundle determines whether an intent represents a single intent (false), or a bundle of intents(true).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public @Nullable Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public Intent priority(@Nullable String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Can be used by intent owner to prioritize intents in an intent management system
   * @return priority
   */
  
  @Schema(name = "priority", description = "Can be used by intent owner to prioritize intents in an intent management system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public @Nullable String getPriority() {
    return priority;
  }

  public void setPriority(@Nullable String priority) {
    this.priority = priority;
  }

  public Intent statusChangeDate(@Nullable OffsetDateTime statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
    return this;
  }

  /**
   * A date time( DateTime). The date that the entity status changed to the current one
   * @return statusChangeDate
   */
  @Valid 
  @Schema(name = "statusChangeDate", description = "A date time( DateTime). The date that the entity status changed to the current one", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusChangeDate")
  public @Nullable OffsetDateTime getStatusChangeDate() {
    return statusChangeDate;
  }

  public void setStatusChangeDate(@Nullable OffsetDateTime statusChangeDate) {
    this.statusChangeDate = statusChangeDate;
  }

  public Intent context(@Nullable String context) {
    this.context = context;
    return this;
  }

  /**
   * A string used to give a context to the intent
   * @return context
   */
  
  @Schema(name = "context", description = "A string used to give a context to the intent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public @Nullable String getContext() {
    return context;
  }

  public void setContext(@Nullable String context) {
    this.context = context;
  }

  public Intent version(@Nullable String version) {
    this.version = version;
    return this;
  }

  /**
   * A field that identifies the specific version of an instance of an intent.
   * @return version
   */
  
  @Schema(name = "version", description = "A field that identifies the specific version of an instance of an intent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public @Nullable String getVersion() {
    return version;
  }

  public void setVersion(@Nullable String version) {
    this.version = version;
  }

  public Intent intentSpecification(@Nullable EntityRef intentSpecification) {
    this.intentSpecification = intentSpecification;
    return this;
  }

  /**
   * Get intentSpecification
   * @return intentSpecification
   */
  @Valid 
  @Schema(name = "intentSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intentSpecification")
  public @Nullable EntityRef getIntentSpecification() {
    return intentSpecification;
  }

  public void setIntentSpecification(@Nullable EntityRef intentSpecification) {
    this.intentSpecification = intentSpecification;
  }

  public Intent intentRelationship(List<@Valid EntityRelationship> intentRelationship) {
    this.intentRelationship = intentRelationship;
    return this;
  }

  public Intent addIntentRelationshipItem(EntityRelationship intentRelationshipItem) {
    if (this.intentRelationship == null) {
      this.intentRelationship = new ArrayList<>();
    }
    this.intentRelationship.add(intentRelationshipItem);
    return this;
  }

  /**
   * A list of intents related to this intent
   * @return intentRelationship
   */
  @Valid 
  @Schema(name = "intentRelationship", description = "A list of intents related to this intent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intentRelationship")
  public List<@Valid EntityRelationship> getIntentRelationship() {
    return intentRelationship;
  }

  public void setIntentRelationship(List<@Valid EntityRelationship> intentRelationship) {
    this.intentRelationship = intentRelationship;
  }

  public Intent characteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public Intent addCharacteristicItem(Characteristic characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * Collection of characteristics
   * @return characteristic
   */
  @Valid 
  @Schema(name = "characteristic", description = "Collection of characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristic")
  public List<Characteristic> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<Characteristic> characteristic) {
    this.characteristic = characteristic;
  }

  public Intent relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Intent addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Collection of related parties
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "Collection of related parties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Intent attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public Intent addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Attachments that may be of relevance to this intent, such as picture, document, media
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", description = "Attachments that may be of relevance to this intent, such as picture, document, media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public Intent name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the intent.
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the intent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Intent expression(@Nullable IntentExpression expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   */
  @Valid 
  @Schema(name = "expression", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expression")
  public @Nullable IntentExpression getExpression() {
    return expression;
  }

  public void setExpression(@Nullable IntentExpression expression) {
    this.expression = expression;
  }

  public Intent creationDate(@Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Date and time of the creation of this REST resource
   * @return creationDate
   */
  @Valid 
  @Schema(name = "creationDate", description = "Date and time of the creation of this REST resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public @Nullable OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(@Nullable OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Intent lastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update of this REST resource
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the last update of this REST resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public @Nullable OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Intent lifecycleStatus(@Nullable String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status of this intent
   * @return lifecycleStatus
   */
  
  @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status of this intent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycleStatus")
  public @Nullable String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(@Nullable String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intent intent = (Intent) o;
    return Objects.equals(this.atType, intent.atType) &&
        Objects.equals(this.atBaseType, intent.atBaseType) &&
        Objects.equals(this.atSchemaLocation, intent.atSchemaLocation) &&
        Objects.equals(this.href, intent.href) &&
        Objects.equals(this.id, intent.id) &&
        Objects.equals(this.description, intent.description) &&
        Objects.equals(this.validFor, intent.validFor) &&
        Objects.equals(this.isBundle, intent.isBundle) &&
        Objects.equals(this.priority, intent.priority) &&
        Objects.equals(this.statusChangeDate, intent.statusChangeDate) &&
        Objects.equals(this.context, intent.context) &&
        Objects.equals(this.version, intent.version) &&
        Objects.equals(this.intentSpecification, intent.intentSpecification) &&
        Objects.equals(this.intentRelationship, intent.intentRelationship) &&
        Objects.equals(this.characteristic, intent.characteristic) &&
        Objects.equals(this.relatedParty, intent.relatedParty) &&
        Objects.equals(this.attachment, intent.attachment) &&
        Objects.equals(this.name, intent.name) &&
        Objects.equals(this.expression, intent.expression) &&
        Objects.equals(this.creationDate, intent.creationDate) &&
        Objects.equals(this.lastUpdate, intent.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, intent.lifecycleStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, description, validFor, isBundle, priority, statusChangeDate, context, version, intentSpecification, intentRelationship, characteristic, relatedParty, attachment, name, expression, creationDate, lastUpdate, lifecycleStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intent {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    statusChangeDate: ").append(toIndentedString(statusChangeDate)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    intentSpecification: ").append(toIndentedString(intentSpecification)).append("\n");
    sb.append("    intentRelationship: ").append(toIndentedString(intentRelationship)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
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

