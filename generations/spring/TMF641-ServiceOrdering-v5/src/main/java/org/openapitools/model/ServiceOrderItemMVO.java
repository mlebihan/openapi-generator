package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppointmentRefMVO;
import org.openapitools.model.JsonPatchMVO;
import org.openapitools.model.OrderItemActionType;
import org.openapitools.model.ServiceOrderItemErrorMessageMVO;
import org.openapitools.model.ServiceOrderItemRelationshipMVO;
import org.openapitools.model.ServiceOrderItemStateTypeMVO;
import org.openapitools.model.ServiceRefOrValueMVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOrderItemMVO
 */

@JsonTypeName("ServiceOrderItem_MVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderItemMVO {

  private @Nullable Integer quantity;

  private @Nullable ServiceOrderItemStateTypeMVO state;

  private @Nullable AppointmentRefMVO appointment;

  @Valid
  private List<ServiceOrderItemRelationshipMVO> serviceOrderItemRelationship = new ArrayList<>();

  @Valid
  private List<ServiceOrderItemErrorMessageMVO> errorMessage = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItemMVO> serviceOrderItem = new ArrayList<>();

  private @Nullable ServiceRefOrValueMVO service;

  private @Nullable String id;

  private @Nullable OrderItemActionType action;

  @Valid
  private List<@Valid JsonPatchMVO> modifyPath = new ArrayList<>();

  public ServiceOrderItemMVO quantity(@Nullable Integer quantity) {
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

  public ServiceOrderItemMVO state(@Nullable ServiceOrderItemStateTypeMVO state) {
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
  public @Nullable ServiceOrderItemStateTypeMVO getState() {
    return state;
  }

  public void setState(@Nullable ServiceOrderItemStateTypeMVO state) {
    this.state = state;
  }

  public ServiceOrderItemMVO appointment(@Nullable AppointmentRefMVO appointment) {
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
  public @Nullable AppointmentRefMVO getAppointment() {
    return appointment;
  }

  public void setAppointment(@Nullable AppointmentRefMVO appointment) {
    this.appointment = appointment;
  }

  public ServiceOrderItemMVO serviceOrderItemRelationship(List<ServiceOrderItemRelationshipMVO> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
    return this;
  }

  public ServiceOrderItemMVO addServiceOrderItemRelationshipItem(ServiceOrderItemRelationshipMVO serviceOrderItemRelationshipItem) {
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
  public List<ServiceOrderItemRelationshipMVO> getServiceOrderItemRelationship() {
    return serviceOrderItemRelationship;
  }

  public void setServiceOrderItemRelationship(List<ServiceOrderItemRelationshipMVO> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
  }

  public ServiceOrderItemMVO errorMessage(List<ServiceOrderItemErrorMessageMVO> errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public ServiceOrderItemMVO addErrorMessageItem(ServiceOrderItemErrorMessageMVO errorMessageItem) {
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
  public List<ServiceOrderItemErrorMessageMVO> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(List<ServiceOrderItemErrorMessageMVO> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ServiceOrderItemMVO serviceOrderItem(List<@Valid ServiceOrderItemMVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderItemMVO addServiceOrderItemItem(ServiceOrderItemMVO serviceOrderItemItem) {
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
  public List<@Valid ServiceOrderItemMVO> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItemMVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderItemMVO service(@Nullable ServiceRefOrValueMVO service) {
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
  public @Nullable ServiceRefOrValueMVO getService() {
    return service;
  }

  public void setService(@Nullable ServiceRefOrValueMVO service) {
    this.service = service;
  }

  public ServiceOrderItemMVO id(@Nullable String id) {
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

  public ServiceOrderItemMVO action(@Nullable OrderItemActionType action) {
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

  public ServiceOrderItemMVO modifyPath(List<@Valid JsonPatchMVO> modifyPath) {
    this.modifyPath = modifyPath;
    return this;
  }

  public ServiceOrderItemMVO addModifyPathItem(JsonPatchMVO modifyPathItem) {
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
  public List<@Valid JsonPatchMVO> getModifyPath() {
    return modifyPath;
  }

  public void setModifyPath(List<@Valid JsonPatchMVO> modifyPath) {
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
    ServiceOrderItemMVO serviceOrderItemMVO = (ServiceOrderItemMVO) o;
    return Objects.equals(this.quantity, serviceOrderItemMVO.quantity) &&
        Objects.equals(this.state, serviceOrderItemMVO.state) &&
        Objects.equals(this.appointment, serviceOrderItemMVO.appointment) &&
        Objects.equals(this.serviceOrderItemRelationship, serviceOrderItemMVO.serviceOrderItemRelationship) &&
        Objects.equals(this.errorMessage, serviceOrderItemMVO.errorMessage) &&
        Objects.equals(this.serviceOrderItem, serviceOrderItemMVO.serviceOrderItem) &&
        Objects.equals(this.service, serviceOrderItemMVO.service) &&
        Objects.equals(this.id, serviceOrderItemMVO.id) &&
        Objects.equals(this.action, serviceOrderItemMVO.action) &&
        Objects.equals(this.modifyPath, serviceOrderItemMVO.modifyPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, state, appointment, serviceOrderItemRelationship, errorMessage, serviceOrderItem, service, id, action, modifyPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItemMVO {\n");
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

