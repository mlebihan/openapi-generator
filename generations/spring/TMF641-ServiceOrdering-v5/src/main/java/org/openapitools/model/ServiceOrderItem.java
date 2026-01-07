package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppointmentRef;
import org.openapitools.model.JsonPatch;
import org.openapitools.model.OrderItemActionType;
import org.openapitools.model.ServiceOrderItemErrorMessage;
import org.openapitools.model.ServiceOrderItemRelationship;
import org.openapitools.model.ServiceOrderItemStateType;
import org.openapitools.model.ServiceRefOrValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOrderItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderItem {

  private @Nullable Integer quantity;

  private @Nullable ServiceOrderItemStateType state;

  private @Nullable AppointmentRef appointment;

  @Valid
  private List<ServiceOrderItemRelationship> serviceOrderItemRelationship = new ArrayList<>();

  @Valid
  private List<ServiceOrderItemErrorMessage> errorMessage = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItem> serviceOrderItem = new ArrayList<>();

  private @Nullable ServiceRefOrValue service;

  private @Nullable String id;

  private @Nullable OrderItemActionType action;

  @Valid
  private List<@Valid JsonPatch> modifyPath = new ArrayList<>();

  public ServiceOrderItem quantity(@Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity ordered
   * @return quantity
   */
  
  @Schema(name = "quantity", description = "Quantity ordered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(@Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public ServiceOrderItem state(@Nullable ServiceOrderItemStateType state) {
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
  public @Nullable ServiceOrderItemStateType getState() {
    return state;
  }

  public void setState(@Nullable ServiceOrderItemStateType state) {
    this.state = state;
  }

  public ServiceOrderItem appointment(@Nullable AppointmentRef appointment) {
    this.appointment = appointment;
    return this;
  }

  /**
   * Get appointment
   * @return appointment
   */
  @Valid 
  @Schema(name = "appointment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appointment")
  public @Nullable AppointmentRef getAppointment() {
    return appointment;
  }

  public void setAppointment(@Nullable AppointmentRef appointment) {
    this.appointment = appointment;
  }

  public ServiceOrderItem serviceOrderItemRelationship(List<ServiceOrderItemRelationship> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
    return this;
  }

  public ServiceOrderItem addServiceOrderItemRelationshipItem(ServiceOrderItemRelationship serviceOrderItemRelationshipItem) {
    if (this.serviceOrderItemRelationship == null) {
      this.serviceOrderItemRelationship = new ArrayList<>();
    }
    this.serviceOrderItemRelationship.add(serviceOrderItemRelationshipItem);
    return this;
  }

  /**
   * A list of order items related to this order item
   * @return serviceOrderItemRelationship
   */
  @Valid 
  @Schema(name = "serviceOrderItemRelationship", description = "A list of order items related to this order item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItemRelationship")
  public List<ServiceOrderItemRelationship> getServiceOrderItemRelationship() {
    return serviceOrderItemRelationship;
  }

  public void setServiceOrderItemRelationship(List<ServiceOrderItemRelationship> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
  }

  public ServiceOrderItem errorMessage(List<ServiceOrderItemErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public ServiceOrderItem addErrorMessageItem(ServiceOrderItemErrorMessage errorMessageItem) {
    if (this.errorMessage == null) {
      this.errorMessage = new ArrayList<>();
    }
    this.errorMessage.add(errorMessageItem);
    return this;
  }

  /**
   * the error(s) cause an order item status change
   * @return errorMessage
   */
  @Valid 
  @Schema(name = "errorMessage", description = "the error(s) cause an order item status change", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public List<ServiceOrderItemErrorMessage> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(List<ServiceOrderItemErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ServiceOrderItem serviceOrderItem(List<@Valid ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderItem addServiceOrderItemItem(ServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order items embedded to this order item
   * @return serviceOrderItem
   */
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of order items embedded to this order item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<@Valid ServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderItem service(@Nullable ServiceRefOrValue service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @Valid 
  @Schema(name = "service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service")
  public @Nullable ServiceRefOrValue getService() {
    return service;
  }

  public void setService(@Nullable ServiceRefOrValue service) {
    this.service = service;
  }

  public ServiceOrderItem id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the individual line item
   * @return id
   */
  
  @Schema(name = "id", description = "Identifier of the individual line item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ServiceOrderItem action(@Nullable OrderItemActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @Valid 
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable OrderItemActionType getAction() {
    return action;
  }

  public void setAction(@Nullable OrderItemActionType action) {
    this.action = action;
  }

  public ServiceOrderItem modifyPath(List<@Valid JsonPatch> modifyPath) {
    this.modifyPath = modifyPath;
    return this;
  }

  public ServiceOrderItem addModifyPathItem(JsonPatch modifyPathItem) {
    if (this.modifyPath == null) {
      this.modifyPath = new ArrayList<>();
    }
    this.modifyPath.add(modifyPathItem);
    return this;
  }

  /**
   * A list of modification items provided for the service update when serviceOrderItem action is modify
   * @return modifyPath
   */
  @Valid 
  @Schema(name = "modifyPath", description = "A list of modification items provided for the service update when serviceOrderItem action is modify", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifyPath")
  public List<@Valid JsonPatch> getModifyPath() {
    return modifyPath;
  }

  public void setModifyPath(List<@Valid JsonPatch> modifyPath) {
    this.modifyPath = modifyPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderItem serviceOrderItem = (ServiceOrderItem) o;
    return Objects.equals(this.quantity, serviceOrderItem.quantity) &&
        Objects.equals(this.state, serviceOrderItem.state) &&
        Objects.equals(this.appointment, serviceOrderItem.appointment) &&
        Objects.equals(this.serviceOrderItemRelationship, serviceOrderItem.serviceOrderItemRelationship) &&
        Objects.equals(this.errorMessage, serviceOrderItem.errorMessage) &&
        Objects.equals(this.serviceOrderItem, serviceOrderItem.serviceOrderItem) &&
        Objects.equals(this.service, serviceOrderItem.service) &&
        Objects.equals(this.id, serviceOrderItem.id) &&
        Objects.equals(this.action, serviceOrderItem.action) &&
        Objects.equals(this.modifyPath, serviceOrderItem.modifyPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, state, appointment, serviceOrderItemRelationship, errorMessage, serviceOrderItem, service, id, action, modifyPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItem {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    serviceOrderItemRelationship: ").append(toIndentedString(serviceOrderItemRelationship)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    modifyPath: ").append(toIndentedString(modifyPath)).append("\n");
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

