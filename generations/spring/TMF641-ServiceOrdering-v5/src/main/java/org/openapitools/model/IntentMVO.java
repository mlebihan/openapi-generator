package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValueMVO;
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.EntityRef;
import org.openapitools.model.EntityRelationshipMVO;
import org.openapitools.model.IntentExpressionMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
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
 * IntentMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class IntentMVO implements IntentRefOrValueMVO {

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
  private List<@Valid EntityRelationshipMVO> intentRelationship = new ArrayList<>();

  @Valid
  private List<CharacteristicMVO> characteristic = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty = new ArrayList<>();

  @Valid
  private List<@Valid AttachmentRefOrValueMVO> attachment = new ArrayList<>();

  private @Nullable String name;

  private @Nullable IntentExpressionMVO expression;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  private @Nullable String lifecycleStatus;

  public IntentMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IntentMVO(String atType) {
    this.atType = atType;
  }

  public IntentMVO atType(String atType) {
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

  public IntentMVO atBaseType(@Nullable String atBaseType) {
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

  public IntentMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public IntentMVO href(@Nullable String href) {
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

  public IntentMVO id(@Nullable String id) {
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

  public IntentMVO description(@Nullable String description) {
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

  public IntentMVO validFor(@Nullable TimePeriod validFor) {
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

  public IntentMVO isBundle(@Nullable Boolean isBundle) {
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

  public IntentMVO priority(@Nullable String priority) {
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

  public IntentMVO statusChangeDate(@Nullable OffsetDateTime statusChangeDate) {
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

  public IntentMVO context(@Nullable String context) {
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

  public IntentMVO version(@Nullable String version) {
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

  public IntentMVO intentSpecification(@Nullable EntityRef intentSpecification) {
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

  public IntentMVO intentRelationship(List<@Valid EntityRelationshipMVO> intentRelationship) {
    this.intentRelationship = intentRelationship;
    return this;
  }

  public IntentMVO addIntentRelationshipItem(EntityRelationshipMVO intentRelationshipItem) {
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
  public List<@Valid EntityRelationshipMVO> getIntentRelationship() {
    return intentRelationship;
  }

  public void setIntentRelationship(List<@Valid EntityRelationshipMVO> intentRelationship) {
    this.intentRelationship = intentRelationship;
  }

  public IntentMVO characteristic(List<CharacteristicMVO> characteristic) {
    this.characteristic = characteristic;
    return this;
  }

  public IntentMVO addCharacteristicItem(CharacteristicMVO characteristicItem) {
    if (this.characteristic == null) {
      this.characteristic = new ArrayList<>();
    }
    this.characteristic.add(characteristicItem);
    return this;
  }

  /**
   * Get characteristic
   * @return characteristic
   */
  @Valid 
  @Schema(name = "characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristic")
  public List<CharacteristicMVO> getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(List<CharacteristicMVO> characteristic) {
    this.characteristic = characteristic;
  }

  public IntentMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public IntentMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefMVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public IntentMVO attachment(List<@Valid AttachmentRefOrValueMVO> attachment) {
    this.attachment = attachment;
    return this;
  }

  public IntentMVO addAttachmentItem(AttachmentRefOrValueMVO attachmentItem) {
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
  public List<@Valid AttachmentRefOrValueMVO> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValueMVO> attachment) {
    this.attachment = attachment;
  }

  public IntentMVO name(@Nullable String name) {
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

  public IntentMVO expression(@Nullable IntentExpressionMVO expression) {
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
  public @Nullable IntentExpressionMVO getExpression() {
    return expression;
  }

  public void setExpression(@Nullable IntentExpressionMVO expression) {
    this.expression = expression;
  }

  public IntentMVO creationDate(@Nullable OffsetDateTime creationDate) {
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

  public IntentMVO lastUpdate(@Nullable OffsetDateTime lastUpdate) {
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

  public IntentMVO lifecycleStatus(@Nullable String lifecycleStatus) {
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
    IntentMVO intentMVO = (IntentMVO) o;
    return Objects.equals(this.atType, intentMVO.atType) &&
        Objects.equals(this.atBaseType, intentMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, intentMVO.atSchemaLocation) &&
        Objects.equals(this.href, intentMVO.href) &&
        Objects.equals(this.id, intentMVO.id) &&
        Objects.equals(this.description, intentMVO.description) &&
        Objects.equals(this.validFor, intentMVO.validFor) &&
        Objects.equals(this.isBundle, intentMVO.isBundle) &&
        Objects.equals(this.priority, intentMVO.priority) &&
        Objects.equals(this.statusChangeDate, intentMVO.statusChangeDate) &&
        Objects.equals(this.context, intentMVO.context) &&
        Objects.equals(this.version, intentMVO.version) &&
        Objects.equals(this.intentSpecification, intentMVO.intentSpecification) &&
        Objects.equals(this.intentRelationship, intentMVO.intentRelationship) &&
        Objects.equals(this.characteristic, intentMVO.characteristic) &&
        Objects.equals(this.relatedParty, intentMVO.relatedParty) &&
        Objects.equals(this.attachment, intentMVO.attachment) &&
        Objects.equals(this.name, intentMVO.name) &&
        Objects.equals(this.expression, intentMVO.expression) &&
        Objects.equals(this.creationDate, intentMVO.creationDate) &&
        Objects.equals(this.lastUpdate, intentMVO.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, intentMVO.lifecycleStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, description, validFor, isBundle, priority, statusChangeDate, context, version, intentSpecification, intentRelationship, characteristic, relatedParty, attachment, name, expression, creationDate, lastUpdate, lifecycleStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentMVO {\n");
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

