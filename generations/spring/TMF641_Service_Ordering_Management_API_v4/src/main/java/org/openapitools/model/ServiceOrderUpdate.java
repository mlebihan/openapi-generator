package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalReference;
import org.openapitools.model.Note;
import org.openapitools.model.RelatedParty;
import org.openapitools.model.ServiceOrderItem;
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
 *  Skipped properties: id,href,orderDate,jeopardyAlert,errorMessage,milestone,@baseType,@schemaLocation,@type,cancellationDate,cancellationReason,category,completionDate,startDate
 */

@Schema(name = "ServiceOrder_Update", description = " Skipped properties: id,href,orderDate,jeopardyAlert,errorMessage,milestone,@baseType,@schemaLocation,@type,cancellationDate,cancellationReason,category,completionDate,startDate")
@JsonTypeName("ServiceOrder_Update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderUpdate {

  private @Nullable String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime expectedCompletionDate;

  private @Nullable String externalId;

  private @Nullable String notificationContact;

  private @Nullable String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedCompletionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedStartDate;

  @Valid
  private List<@Valid ExternalReference> externalReference = new ArrayList<>();

  @Valid
  private List<@Valid Note> note = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderRelationship> orderRelationship = new ArrayList<>();

  @Valid
  private List<@Valid RelatedParty> relatedParty = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItem> serviceOrderItem = new ArrayList<>();

  private @Nullable ServiceOrderStateType state;

  public ServiceOrderUpdate description(@Nullable String description) {
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

  public ServiceOrderUpdate expectedCompletionDate(@Nullable OffsetDateTime expectedCompletionDate) {
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

  public ServiceOrderUpdate externalId(@Nullable String externalId) {
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

  public ServiceOrderUpdate notificationContact(@Nullable String notificationContact) {
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

  public ServiceOrderUpdate priority(@Nullable String priority) {
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

  public ServiceOrderUpdate requestedCompletionDate(@Nullable OffsetDateTime requestedCompletionDate) {
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

  public ServiceOrderUpdate requestedStartDate(@Nullable OffsetDateTime requestedStartDate) {
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

  public ServiceOrderUpdate externalReference(List<@Valid ExternalReference> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public ServiceOrderUpdate addExternalReferenceItem(ExternalReference externalReferenceItem) {
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

  public ServiceOrderUpdate note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public ServiceOrderUpdate addNoteItem(Note noteItem) {
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

  public ServiceOrderUpdate orderRelationship(List<@Valid ServiceOrderRelationship> orderRelationship) {
    this.orderRelationship = orderRelationship;
    return this;
  }

  public ServiceOrderUpdate addOrderRelationshipItem(ServiceOrderRelationship orderRelationshipItem) {
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

  public ServiceOrderUpdate relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceOrderUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public ServiceOrderUpdate serviceOrderItem(List<@Valid ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderUpdate addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
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

  public ServiceOrderUpdate state(@Nullable ServiceOrderStateType state) {
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
    ServiceOrderUpdate serviceOrderUpdate = (ServiceOrderUpdate) o;
    return Objects.equals(this.description, serviceOrderUpdate.description) &&
        Objects.equals(this.expectedCompletionDate, serviceOrderUpdate.expectedCompletionDate) &&
        Objects.equals(this.externalId, serviceOrderUpdate.externalId) &&
        Objects.equals(this.notificationContact, serviceOrderUpdate.notificationContact) &&
        Objects.equals(this.priority, serviceOrderUpdate.priority) &&
        Objects.equals(this.requestedCompletionDate, serviceOrderUpdate.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, serviceOrderUpdate.requestedStartDate) &&
        Objects.equals(this.externalReference, serviceOrderUpdate.externalReference) &&
        Objects.equals(this.note, serviceOrderUpdate.note) &&
        Objects.equals(this.orderRelationship, serviceOrderUpdate.orderRelationship) &&
        Objects.equals(this.relatedParty, serviceOrderUpdate.relatedParty) &&
        Objects.equals(this.serviceOrderItem, serviceOrderUpdate.serviceOrderItem) &&
        Objects.equals(this.state, serviceOrderUpdate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expectedCompletionDate, externalId, notificationContact, priority, requestedCompletionDate, requestedStartDate, externalReference, note, orderRelationship, relatedParty, serviceOrderItem, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderRelationship: ").append(toIndentedString(orderRelationship)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
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

