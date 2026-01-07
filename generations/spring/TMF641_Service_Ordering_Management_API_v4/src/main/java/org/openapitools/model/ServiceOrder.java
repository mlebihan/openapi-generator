package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalReference;
import org.openapitools.model.Note;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.ServiceOrderErrorMessage;
import org.openapitools.model.ServiceOrderItem;
import org.openapitools.model.ServiceOrderJeopardyAlert;
import org.openapitools.model.ServiceOrderMilestone;
import org.openapitools.model.ServiceOrderRelationship;
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
 * ServiceOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrder {

  private @Nullable String id;

  private @Nullable String href;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime cancellationDate;

  private @Nullable String cancellationReason;

  private @Nullable String category;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completionDate;

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime expectedCompletionDate;

  private @Nullable String externalId;

  private @Nullable String notificationContact;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime orderDate;

  private @Nullable String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedCompletionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @Valid
  private List<@Valid ServiceOrderErrorMessage> errorMessage = new ArrayList<>();

  @Valid
  private List<@Valid ExternalReference> externalReference = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderJeopardyAlert> jeopardyAlert = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderMilestone> milestone = new ArrayList<>();

  @Valid
  private List<@Valid Note> note = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderRelationship> orderRelationship = new ArrayList<>();

  @Valid
  private List<@Valid RelatedParty> relatedParty = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItem> serviceOrderItem = new ArrayList<>();

  private @Nullable ServiceOrderStateType state;

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public ServiceOrder id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID created on repository side
   * @return id
   */
  
  @Schema(name = "id", description = "ID created on repository side", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ServiceOrder href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the order
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink to access the order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public ServiceOrder cancellationDate(@Nullable OffsetDateTime cancellationDate) {
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

  public ServiceOrder cancellationReason(@Nullable String cancellationReason) {
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

  public ServiceOrder category(@Nullable String category) {
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

  public ServiceOrder completionDate(@Nullable OffsetDateTime completionDate) {
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

  public ServiceOrder description(@Nullable String description) {
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

  public ServiceOrder expectedCompletionDate(@Nullable OffsetDateTime expectedCompletionDate) {
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

  public ServiceOrder externalId(@Nullable String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID given by the consumer to facilitate searches
   * @return externalId
   */
  
  @Schema(name = "externalId", description = "ID given by the consumer to facilitate searches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public @Nullable String getExternalId() {
    return externalId;
  }

  public void setExternalId(@Nullable String externalId) {
    this.externalId = externalId;
  }

  public ServiceOrder notificationContact(@Nullable String notificationContact) {
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

  public ServiceOrder orderDate(@Nullable OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
   */
  @Valid 
  @Schema(name = "orderDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderDate")
  public @Nullable OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(@Nullable OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public ServiceOrder priority(@Nullable String priority) {
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

  public ServiceOrder requestedCompletionDate(@Nullable OffsetDateTime requestedCompletionDate) {
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

  public ServiceOrder requestedStartDate(@Nullable OffsetDateTime requestedStartDate) {
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

  public ServiceOrder startDate(@Nullable OffsetDateTime startDate) {
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

  public ServiceOrder errorMessage(List<@Valid ServiceOrderErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public ServiceOrder addErrorMessageItem(ServiceOrderErrorMessage errorMessageItem) {
    if (this.errorMessage == null) {
      this.errorMessage = new ArrayList<>();
    }
    this.errorMessage.add(errorMessageItem);
    return this;
  }

  /**
   * the error(s) cause an order status change
   * @return errorMessage
   */
  @Valid 
  @Schema(name = "errorMessage", description = "the error(s) cause an order status change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public List<@Valid ServiceOrderErrorMessage> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(List<@Valid ServiceOrderErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ServiceOrder externalReference(List<@Valid ExternalReference> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrder addExternalReferenceItem(ExternalReference externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<>();
    }
    this.externalReference.add(externalReferenceItem);
    return this;
  }

  /**
   * Get externalReference
   * @return externalReference
   */
  @Valid 
  @Schema(name = "externalReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalReference")
  public List<@Valid ExternalReference> getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(List<@Valid ExternalReference> externalReference) {
    this.externalReference = externalReference;
  }

  public ServiceOrder jeopardyAlert(List<@Valid ServiceOrderJeopardyAlert> jeopardyAlert) {
    this.jeopardyAlert = jeopardyAlert;
    return this;
  }

  public ServiceOrder addJeopardyAlertItem(ServiceOrderJeopardyAlert jeopardyAlertItem) {
    if (this.jeopardyAlert == null) {
      this.jeopardyAlert = new ArrayList<>();
    }
    this.jeopardyAlert.add(jeopardyAlertItem);
    return this;
  }

  /**
   * A list of jeopardy alerts related to this order
   * @return jeopardyAlert
   */
  @Valid 
  @Schema(name = "jeopardyAlert", description = "A list of jeopardy alerts related to this order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jeopardyAlert")
  public List<@Valid ServiceOrderJeopardyAlert> getJeopardyAlert() {
    return jeopardyAlert;
  }

  public void setJeopardyAlert(List<@Valid ServiceOrderJeopardyAlert> jeopardyAlert) {
    this.jeopardyAlert = jeopardyAlert;
  }

  public ServiceOrder milestone(List<@Valid ServiceOrderMilestone> milestone) {
    this.milestone = milestone;
    return this;
  }

  public ServiceOrder addMilestoneItem(ServiceOrderMilestone milestoneItem) {
    if (this.milestone == null) {
      this.milestone = new ArrayList<>();
    }
    this.milestone.add(milestoneItem);
    return this;
  }

  /**
   * A list of milestones related to this order
   * @return milestone
   */
  @Valid 
  @Schema(name = "milestone", description = "A list of milestones related to this order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("milestone")
  public List<@Valid ServiceOrderMilestone> getMilestone() {
    return milestone;
  }

  public void setMilestone(List<@Valid ServiceOrderMilestone> milestone) {
    this.milestone = milestone;
  }

  public ServiceOrder note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public ServiceOrder addNoteItem(Note noteItem) {
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
  public List<@Valid Note> getNote() {
    return note;
  }

  public void setNote(List<@Valid Note> note) {
    this.note = note;
  }

  public ServiceOrder orderRelationship(List<@Valid ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrder addOrderRelationshipItem(ServiceOrderRelationship orderRelationshipItem) {
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
  public List<@Valid ServiceOrderRelationship> getOrderRelationship() {
    return orderRelationship;
  }

  public void setOrderRelationship(List<@Valid ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
  }

  public ServiceOrder relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrder addRelatedPartyItem(RelatedParty relatedPartyItem) {
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
  public List<@Valid RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ServiceOrder serviceOrderItem(List<@Valid ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrder addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
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
  public List<@Valid ServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrder state(@Nullable ServiceOrderStateType state) {
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

  public ServiceOrder atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrder atSchemaLocation(@Nullable URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public ServiceOrder atType(@Nullable String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public @Nullable String getAtType() {
    return atType;
  }

  public void setAtType(@Nullable String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrder serviceOrder = (ServiceOrder) o;
    return Objects.equals(this.id, serviceOrder.id) &&
        Objects.equals(this.href, serviceOrder.href) &&
        Objects.equals(this.cancellationDate, serviceOrder.cancellationDate) &&
        Objects.equals(this.cancellationReason, serviceOrder.cancellationReason) &&
        Objects.equals(this.category, serviceOrder.category) &&
        Objects.equals(this.completionDate, serviceOrder.completionDate) &&
        Objects.equals(this.description, serviceOrder.description) &&
        Objects.equals(this.expectedCompletionDate, serviceOrder.expectedCompletionDate) &&
        Objects.equals(this.externalId, serviceOrder.externalId) &&
        Objects.equals(this.notificationContact, serviceOrder.notificationContact) &&
        Objects.equals(this.orderDate, serviceOrder.orderDate) &&
        Objects.equals(this.priority, serviceOrder.priority) &&
        Objects.equals(this.requestedCompletionDate, serviceOrder.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrder.requestedStartDate) &&
        Objects.equals(this.startDate, serviceOrder.startDate) &&
        Objects.equals(this.errorMessage, serviceOrder.errorMessage) &&
        Objects.equals(this.externalReference, serviceOrder.externalReference) &&
        Objects.equals(this.jeopardyAlert, serviceOrder.jeopardyAlert) &&
        Objects.equals(this.milestone, serviceOrder.milestone) &&
        Objects.equals(this.note, serviceOrder.note) &&
        Objects.equals(this.orderRelationship, serviceOrder.orderRelationship) &&
        Objects.equals(this.relatedParty, serviceOrder.relatedParty) &&
        Objects.equals(this.serviceOrderItem, serviceOrder.serviceOrderItem) &&
        Objects.equals(this.state, serviceOrder.state) &&
        Objects.equals(this.atBaseType, serviceOrder.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrder.atSchemaLocation) &&
        Objects.equals(this.atType, serviceOrder.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationDate, cancellationReason, category, completionDate, description, expectedCompletionDate, externalId, notificationContact, orderDate, priority, requestedCompletionDate, requestedStartDate, startDate, errorMessage, externalReference, jeopardyAlert, milestone, note, orderRelationship, relatedParty, serviceOrderItem, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    jeopardyAlert: ").append(toIndentedString(jeopardyAlert)).append("\n");
    sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderRelationship: ").append(toIndentedString(orderRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

