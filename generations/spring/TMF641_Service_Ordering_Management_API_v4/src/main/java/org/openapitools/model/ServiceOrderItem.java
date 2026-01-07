package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppointmentRef;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderItem {

  private String id;

  private @Nullable Integer quantity;

  private OrderItemActionType action;

  private @Nullable AppointmentRef appointment;

  @Valid
  private List<@Valid ServiceOrderItemErrorMessage> errorMessage = new ArrayList<>();

  private ServiceRefOrValue service;

  @Valid
  private List<@Valid ServiceOrderItem> serviceOrderItem = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItemRelationship> serviceOrderItemRelationship = new ArrayList<>();

  private @Nullable ServiceOrderItemStateType state;

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public ServiceOrderItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderItem(String id, OrderItemActionType action, ServiceRefOrValue service) {
    this.id = id;
    this.action = action;
    this.service = service;
  }

  public ServiceOrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the individual line item
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Identifier of the individual line item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public ServiceOrderItem action(OrderItemActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @NotNull @Valid 
  @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public OrderItemActionType getAction() {
    return action;
  }

  public void setAction(OrderItemActionType action) {
    this.action = action;
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

  public ServiceOrderItem errorMessage(List<@Valid ServiceOrderItemErrorMessage> errorMessage) {
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
  public List<@Valid ServiceOrderItemErrorMessage> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(List<@Valid ServiceOrderItemErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ServiceOrderItem service(ServiceRefOrValue service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @NotNull @Valid 
  @Schema(name = "service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("service")
  public ServiceRefOrValue getService() {
    return service;
  }

  public void setService(ServiceRefOrValue service) {
    this.service = service;
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

  public ServiceOrderItem serviceOrderItemRelationship(List<@Valid ServiceOrderItemRelationship> serviceOrderItemRelationship) {
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
  public List<@Valid ServiceOrderItemRelationship> getServiceOrderItemRelationship() {
    return serviceOrderItemRelationship;
  }

  public void setServiceOrderItemRelationship(List<@Valid ServiceOrderItemRelationship> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
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

  public ServiceOrderItem atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrderItem atSchemaLocation(@Nullable URI atSchemaLocation) {
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

  public ServiceOrderItem atType(@Nullable String atType) {
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
    ServiceOrderItem serviceOrderItem = (ServiceOrderItem) o;
    return Objects.equals(this.id, serviceOrderItem.id) &&
        Objects.equals(this.quantity, serviceOrderItem.quantity) &&
        Objects.equals(this.action, serviceOrderItem.action) &&
        Objects.equals(this.appointment, serviceOrderItem.appointment) &&
        Objects.equals(this.errorMessage, serviceOrderItem.errorMessage) &&
        Objects.equals(this.service, serviceOrderItem.service) &&
        Objects.equals(this.serviceOrderItem, serviceOrderItem.serviceOrderItem) &&
        Objects.equals(this.serviceOrderItemRelationship, serviceOrderItem.serviceOrderItemRelationship) &&
        Objects.equals(this.state, serviceOrderItem.state) &&
        Objects.equals(this.atBaseType, serviceOrderItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderItem.atSchemaLocation) &&
        Objects.equals(this.atType, serviceOrderItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, action, appointment, errorMessage, service, serviceOrderItem, serviceOrderItemRelationship, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    serviceOrderItemRelationship: ").append(toIndentedString(serviceOrderItemRelationship)).append("\n");
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

