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
import org.openapitools.model.CharacteristicMVO;
import org.openapitools.model.ExternalReferenceMVO;
import org.openapitools.model.NoteMVO;
import org.openapitools.model.OrderSpecificationRefMVO;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefMVO;
import org.openapitools.model.ServiceOrderItemMVO;
import org.openapitools.model.ServiceOrderRelationshipMVO;
import org.openapitools.model.ServiceOrderStateType;
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
 * ServiceOrderMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime cancellationDate;

  private @Nullable String cancellationReason;

  private @Nullable String category;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completionDate;

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime expectedCompletionDate;

  @Valid
  private List<ExternalReferenceMVO> externalReference = new ArrayList<>();

  @Valid
  private List<NoteMVO> note = new ArrayList<>();

  private @Nullable String notificationContact;

  @Valid
  private List<ServiceOrderRelationshipMVO> orderRelationship = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItemMVO> serviceOrderItem = new ArrayList<>();

  private @Nullable String priority;

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedCompletionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  private @Nullable OrderSpecificationRefMVO orderSpecification;

  @Valid
  private List<CharacteristicMVO> orderCharacteristic = new ArrayList<>();

  private @Nullable ServiceOrderStateType state;

  public ServiceOrderMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderMVO(String atType) {
    this.atType = atType;
  }

  public ServiceOrderMVO atType(String atType) {
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

  public ServiceOrderMVO atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrderMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ServiceOrderMVO href(@Nullable String href) {
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

  public ServiceOrderMVO id(@Nullable String id) {
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

  public ServiceOrderMVO cancellationDate(@Nullable OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled. This is used when order is cancelled. 
   * @return cancellationDate
   */
  @Valid 
  @Schema(name = "cancellationDate", description = "Date when the order is cancelled. This is used when order is cancelled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancellationDate")
  public @Nullable OffsetDateTime getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(@Nullable OffsetDateTime cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public ServiceOrderMVO cancellationReason(@Nullable String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled. This is used when order is cancelled. 
   * @return cancellationReason
   */
  
  @Schema(name = "cancellationReason", description = "Reason why the order is cancelled. This is used when order is cancelled. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancellationReason")
  public @Nullable String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(@Nullable String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public ServiceOrderMVO category(@Nullable String category) {
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

  public ServiceOrderMVO completionDate(@Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  /**
   * Effective delivery date amended by the provider
   * @return completionDate
   */
  @Valid 
  @Schema(name = "completionDate", description = "Effective delivery date amended by the provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completionDate")
  public @Nullable OffsetDateTime getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(@Nullable OffsetDateTime completionDate) {
    this.completionDate = completionDate;
  }

  public ServiceOrderMVO description(@Nullable String description) {
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

  public ServiceOrderMVO expectedCompletionDate(@Nullable OffsetDateTime expectedCompletionDate) {
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

  public ServiceOrderMVO externalReference(List<ExternalReferenceMVO> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrderMVO addExternalReferenceItem(ExternalReferenceMVO externalReferenceItem) {
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
  public List<ExternalReferenceMVO> getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(List<ExternalReferenceMVO> externalReference) {
    this.externalReference = externalReference;
  }

  public ServiceOrderMVO note(List<NoteMVO> note) {
    this.note = note;
    return this;
  }

  public ServiceOrderMVO addNoteItem(NoteMVO noteItem) {
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
  public List<NoteMVO> getNote() {
    return note;
  }

  public void setNote(List<NoteMVO> note) {
    this.note = note;
  }

  public ServiceOrderMVO notificationContact(@Nullable String notificationContact) {
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

  public ServiceOrderMVO orderRelationship(List<ServiceOrderRelationshipMVO> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrderMVO addOrderRelationshipItem(ServiceOrderRelationshipMVO orderRelationshipItem) {
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
  public List<ServiceOrderRelationshipMVO> getOrderRelationship() {
    return orderRelationship;
  }

  public void setOrderRelationship(List<ServiceOrderRelationshipMVO> orderRelationship) {
    this.orderRelationship = orderRelationship;
  }

  public ServiceOrderMVO serviceOrderItem(List<@Valid ServiceOrderItemMVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderMVO addServiceOrderItemItem(ServiceOrderItemMVO serviceOrderItemItem) {
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
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of service order items to be processed by this order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<@Valid ServiceOrderItemMVO> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItemMVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderMVO priority(@Nullable String priority) {
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

  public ServiceOrderMVO relatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrderMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefMVO relatedPartyItem) {
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
  public List<RelatedPartyRefOrPartyRoleRefMVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefMVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceOrderMVO requestedCompletionDate(@Nullable OffsetDateTime requestedCompletionDate) {
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

  public ServiceOrderMVO requestedStartDate(@Nullable OffsetDateTime requestedStartDate) {
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

  public ServiceOrderMVO startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the order was started for processing
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", description = "Date when the order was started for processing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ServiceOrderMVO orderSpecification(@Nullable OrderSpecificationRefMVO orderSpecification) {
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
  public @Nullable OrderSpecificationRefMVO getOrderSpecification() {
    return orderSpecification;
  }

  public void setOrderSpecification(@Nullable OrderSpecificationRefMVO orderSpecification) {
    this.orderSpecification = orderSpecification;
  }

  public ServiceOrderMVO orderCharacteristic(List<CharacteristicMVO> orderCharacteristic) {
    this.orderCharacteristic = orderCharacteristic;
    return this;
  }

  public ServiceOrderMVO addOrderCharacteristicItem(CharacteristicMVO orderCharacteristicItem) {
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
  public List<CharacteristicMVO> getOrderCharacteristic() {
    return orderCharacteristic;
  }

  public void setOrderCharacteristic(List<CharacteristicMVO> orderCharacteristic) {
    this.orderCharacteristic = orderCharacteristic;
  }

  public ServiceOrderMVO state(@Nullable ServiceOrderStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable ServiceOrderStateType getState() {
    return state;
  }

  public void setState(@Nullable ServiceOrderStateType state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderMVO serviceOrderMVO = (ServiceOrderMVO) o;
    return Objects.equals(this.atType, serviceOrderMVO.atType) &&
        Objects.equals(this.atBaseType, serviceOrderMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderMVO.atSchemaLocation) &&
        Objects.equals(this.href, serviceOrderMVO.href) &&
        Objects.equals(this.id, serviceOrderMVO.id) &&
        Objects.equals(this.cancellationDate, serviceOrderMVO.cancellationDate) &&
        Objects.equals(this.cancellationReason, serviceOrderMVO.cancellationReason) &&
        Objects.equals(this.category, serviceOrderMVO.category) &&
        Objects.equals(this.completionDate, serviceOrderMVO.completionDate) &&
        Objects.equals(this.description, serviceOrderMVO.description) &&
        Objects.equals(this.expectedCompletionDate, serviceOrderMVO.expectedCompletionDate) &&
        Objects.equals(this.externalReference, serviceOrderMVO.externalReference) &&
        Objects.equals(this.note, serviceOrderMVO.note) &&
        Objects.equals(this.notificationContact, serviceOrderMVO.notificationContact) &&
        Objects.equals(this.orderRelationship, serviceOrderMVO.orderRelationship) &&
        Objects.equals(this.serviceOrderItem, serviceOrderMVO.serviceOrderItem) &&
        Objects.equals(this.priority, serviceOrderMVO.priority) &&
        Objects.equals(this.relatedParty, serviceOrderMVO.relatedParty) &&
        Objects.equals(this.requestedCompletionDate, serviceOrderMVO.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrderMVO.requestedStartDate) &&
        Objects.equals(this.startDate, serviceOrderMVO.startDate) &&
        Objects.equals(this.orderSpecification, serviceOrderMVO.orderSpecification) &&
        Objects.equals(this.orderCharacteristic, serviceOrderMVO.orderCharacteristic) &&
        Objects.equals(this.state, serviceOrderMVO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, cancellationDate, cancellationReason, category, completionDate, description, expectedCompletionDate, externalReference, note, notificationContact, orderRelationship, serviceOrderItem, priority, relatedParty, requestedCompletionDate, requestedStartDate, startDate, orderSpecification, orderCharacteristic, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
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
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    orderSpecification: ").append(toIndentedString(orderSpecification)).append("\n");
    sb.append("    orderCharacteristic: ").append(toIndentedString(orderCharacteristic)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

