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
import org.openapitools.model.CharacteristicFVO;
import org.openapitools.model.ExternalReferenceFVO;
import org.openapitools.model.Note;
import org.openapitools.model.OrderSpecificationRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
import org.openapitools.model.ServiceOrderItemFVO;
import org.openapitools.model.ServiceOrderRelationshipFVO;
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
 * ServiceOrderFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String category;

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime expectedCompletionDate;

  @Valid
  private List<ExternalReferenceFVO> externalReference = new ArrayList<>();

  @Valid
  private List<Note> note = new ArrayList<>();

  private @Nullable String notificationContact;

  @Valid
  private List<ServiceOrderRelationshipFVO> orderRelationship = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItemFVO> serviceOrderItem = new ArrayList<>();

  private @Nullable String priority;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedCompletionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedStartDate;

  private @Nullable OrderSpecificationRef orderSpecification;

  @Valid
  private List<CharacteristicFVO> orderCharacteristic = new ArrayList<>();

  public ServiceOrderFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderFVO(String atType, List<@Valid ServiceOrderItemFVO> serviceOrderItem) {
    this.atType = atType;
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderFVO atType(String atType) {
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

  public ServiceOrderFVO atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrderFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ServiceOrderFVO href(@Nullable String href) {
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

  public ServiceOrderFVO id(@Nullable String id) {
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

  public ServiceOrderFVO category(@Nullable String category) {
    this.category = category;
    return this;
  }

  /**
   * Used to categorize the order, useful for the OM system, such as: Broadband, TVOption
   * @return category
   */
  
  @Schema(name = "category", description = "Used to categorize the order, useful for the OM system, such as: Broadband, TVOption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable String getCategory() {
    return category;
  }

  public void setCategory(@Nullable String category) {
    this.category = category;
  }

  public ServiceOrderFVO description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * A free-text description of the service order
   * @return description
   */
  
  @Schema(name = "description", description = "A free-text description of the service order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ServiceOrderFVO expectedCompletionDate(@Nullable OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
    return this;
  }

  /**
   * Expected delivery date amended by the provider
   * @return expectedCompletionDate
   */
  @Valid 
  @Schema(name = "expectedCompletionDate", description = "Expected delivery date amended by the provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedCompletionDate")
  public @Nullable OffsetDateTime getExpectedCompletionDate() {
    return expectedCompletionDate;
  }

  public void setExpectedCompletionDate(@Nullable OffsetDateTime expectedCompletionDate) {
    this.expectedCompletionDate = expectedCompletionDate;
  }

  public ServiceOrderFVO externalReference(List<ExternalReferenceFVO> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrderFVO addExternalReferenceItem(ExternalReferenceFVO externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<>();
    }
    this.externalReference.add(externalReferenceItem);
    return this;
  }

  /**
   * 
   * @return externalReference
   */
  @Valid 
  @Schema(name = "externalReference", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalReference")
  public List<ExternalReferenceFVO> getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(List<ExternalReferenceFVO> externalReference) {
    this.externalReference = externalReference;
  }

  public ServiceOrderFVO note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceOrderFVO addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Extra-information about the order; e.g. useful to add extra delivery information that could be useful for a human process
   * @return note
   */
  @Valid 
  @Schema(name = "note", description = "Extra-information about the order; e.g. useful to add extra delivery information that could be useful for a human process", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ServiceOrderFVO notificationContact(@Nullable String notificationContact) {
    this.notificationContact = notificationContact;
    return this;
  }

  /**
   * Contact attached to the order to send back information regarding this order
   * @return notificationContact
   */
  
  @Schema(name = "notificationContact", description = "Contact attached to the order to send back information regarding this order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationContact")
  public @Nullable String getNotificationContact() {
    return notificationContact;
  }

  public void setNotificationContact(@Nullable String notificationContact) {
    this.notificationContact = notificationContact;
  }

  public ServiceOrderFVO orderRelationship(List<ServiceOrderRelationshipFVO> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrderFVO addOrderRelationshipItem(ServiceOrderRelationshipFVO orderRelationshipItem) {
    if (this.orderRelationship == null) {
      this.orderRelationship = new ArrayList<>();
    }
    this.orderRelationship.add(orderRelationshipItem);
    return this;
  }

  /**
   * A list of service orders related to this order (e.g. prerequisite, dependent on)
   * @return orderRelationship
   */
  @Valid 
  @Schema(name = "orderRelationship", description = "A list of service orders related to this order (e.g. prerequisite, dependent on)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderRelationship")
  public List<ServiceOrderRelationshipFVO> getOrderRelationship() {
    return orderRelationship;
  }

  public void setOrderRelationship(List<ServiceOrderRelationshipFVO> orderRelationship) {
    this.orderRelationship = orderRelationship;
  }

  public ServiceOrderFVO serviceOrderItem(List<@Valid ServiceOrderItemFVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderFVO addServiceOrderItemItem(ServiceOrderItemFVO serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items to be processed by this order
   * @return serviceOrderItem
   */
  @NotNull @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of service order items to be processed by this order", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<@Valid ServiceOrderItemFVO> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItemFVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderFVO priority(@Nullable String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Can be used by consumers to prioritize orders in a Service Order Management system
   * @return priority
   */
  
  @Schema(name = "priority", description = "Can be used by consumers to prioritize orders in a Service Order Management system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public @Nullable String getPriority() {
    return priority;
  }

  public void setPriority(@Nullable String priority) {
    this.priority = priority;
  }

  public ServiceOrderFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrderFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of parties which are involved in this order and the role they are playing
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "A list of parties which are involved in this order and the role they are playing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefFVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceOrderFVO requestedCompletionDate(@Nullable OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

  /**
   * Requested delivery date from the requestors perspective
   * @return requestedCompletionDate
   */
  @Valid 
  @Schema(name = "requestedCompletionDate", description = "Requested delivery date from the requestors perspective", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedCompletionDate")
  public @Nullable OffsetDateTime getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  public void setRequestedCompletionDate(@Nullable OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  public ServiceOrderFVO requestedStartDate(@Nullable OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  /**
   * Order start date wished by the requestor
   * @return requestedStartDate
   */
  @Valid 
  @Schema(name = "requestedStartDate", description = "Order start date wished by the requestor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedStartDate")
  public @Nullable OffsetDateTime getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(@Nullable OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  public ServiceOrderFVO orderSpecification(@Nullable OrderSpecificationRef orderSpecification) {
    this.orderSpecification = orderSpecification;
    return this;
  }

  /**
   * Get orderSpecification
   * @return orderSpecification
   */
  @Valid 
  @Schema(name = "orderSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderSpecification")
  public @Nullable OrderSpecificationRef getOrderSpecification() {
    return orderSpecification;
  }

  public void setOrderSpecification(@Nullable OrderSpecificationRef orderSpecification) {
    this.orderSpecification = orderSpecification;
  }

  public ServiceOrderFVO orderCharacteristic(List<CharacteristicFVO> orderCharacteristic) {
    this.orderCharacteristic = orderCharacteristic;
    return this;
  }

  public ServiceOrderFVO addOrderCharacteristicItem(CharacteristicFVO orderCharacteristicItem) {
    if (this.orderCharacteristic == null) {
      this.orderCharacteristic = new ArrayList<>();
    }
    this.orderCharacteristic.add(orderCharacteristicItem);
    return this;
  }

  /**
   * A list of characteristics that characterize this order 
   * @return orderCharacteristic
   */
  @Valid 
  @Schema(name = "orderCharacteristic", description = "A list of characteristics that characterize this order ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderCharacteristic")
  public List<CharacteristicFVO> getOrderCharacteristic() {
    return orderCharacteristic;
  }

  public void setOrderCharacteristic(List<CharacteristicFVO> orderCharacteristic) {
    this.orderCharacteristic = orderCharacteristic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderFVO serviceOrderFVO = (ServiceOrderFVO) o;
    return Objects.equals(this.atType, serviceOrderFVO.atType) &&
        Objects.equals(this.atBaseType, serviceOrderFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderFVO.atSchemaLocation) &&
        Objects.equals(this.href, serviceOrderFVO.href) &&
        Objects.equals(this.id, serviceOrderFVO.id) &&
        Objects.equals(this.category, serviceOrderFVO.category) &&
        Objects.equals(this.description, serviceOrderFVO.description) &&
        Objects.equals(this.expectedCompletionDate, serviceOrderFVO.expectedCompletionDate) &&
        Objects.equals(this.externalReference, serviceOrderFVO.externalReference) &&
        Objects.equals(this.note, serviceOrderFVO.note) &&
        Objects.equals(this.notificationContact, serviceOrderFVO.notificationContact) &&
        Objects.equals(this.orderRelationship, serviceOrderFVO.orderRelationship) &&
        Objects.equals(this.serviceOrderItem, serviceOrderFVO.serviceOrderItem) &&
        Objects.equals(this.priority, serviceOrderFVO.priority) &&
        Objects.equals(this.relatedParty, serviceOrderFVO.relatedParty) &&
        Objects.equals(this.requestedCompletionDate, serviceOrderFVO.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrderFVO.requestedStartDate) &&
        Objects.equals(this.orderSpecification, serviceOrderFVO.orderSpecification) &&
        Objects.equals(this.orderCharacteristic, serviceOrderFVO.orderCharacteristic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, category, description, expectedCompletionDate, externalReference, note, notificationContact, orderRelationship, serviceOrderItem, priority, relatedParty, requestedCompletionDate, requestedStartDate, orderSpecification, orderCharacteristic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    orderRelationship: ").append(toIndentedString(orderRelationship)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    orderSpecification: ").append(toIndentedString(orderSpecification)).append("\n");
    sb.append("    orderCharacteristic: ").append(toIndentedString(orderCharacteristic)).append("\n");
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

