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
import org.openapitools.model.AppointmentRef;
import org.openapitools.model.JsonPatchFVO;
import org.openapitools.model.OrderItemActionType;
import org.openapitools.model.ServiceOrderItemErrorMessage;
import org.openapitools.model.ServiceOrderItemRelationship;
import org.openapitools.model.ServiceOrderItemStateType;
import org.openapitools.model.ServiceRefOrValueFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOrderItemFVO
 */

@JsonTypeName("ServiceOrderItem_FVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderItemFVO {

  private @Nullable Integer quantity;

  private @Nullable ServiceOrderItemStateType state;

  private @Nullable AppointmentRef appointment;

  @Valid
  private List<ServiceOrderItemRelationship> serviceOrderItemRelationship = new ArrayList<>();

  @Valid
  private List<ServiceOrderItemErrorMessage> errorMessage = new ArrayList<>();

  @Valid
  private List<@Valid ServiceOrderItemFVO> serviceOrderItem = new ArrayList<>();

  private ServiceRefOrValueFVO service;

  private String id;

  private OrderItemActionType action;

  @Valid
  private List<@Valid JsonPatchFVO> modifyPath = new ArrayList<>();

  public ServiceOrderItemFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderItemFVO(ServiceRefOrValueFVO service, String id, OrderItemActionType action) {
    this.service = service;
    this.id = id;
    this.action = action;
  }

  public ServiceOrderItemFVO quantity(@Nullable Integer quantity) {
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

  public ServiceOrderItemFVO state(@Nullable ServiceOrderItemStateType state) {
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

  public ServiceOrderItemFVO appointment(@Nullable AppointmentRef appointment) {
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

  public ServiceOrderItemFVO serviceOrderItemRelationship(List<ServiceOrderItemRelationship> serviceOrderItemRelationship) {
    this.serviceOrderItemRelationship = serviceOrderItemRelationship;
    return this;
  }

  public ServiceOrderItemFVO addServiceOrderItemRelationshipItem(ServiceOrderItemRelationship serviceOrderItemRelationshipItem) {
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

  public ServiceOrderItemFVO errorMessage(List<ServiceOrderItemErrorMessage> errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public ServiceOrderItemFVO addErrorMessageItem(ServiceOrderItemErrorMessage errorMessageItem) {
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

  public ServiceOrderItemFVO serviceOrderItem(List<@Valid ServiceOrderItemFVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderItemFVO addServiceOrderItemItem(ServiceOrderItemFVO serviceOrderItemItem) {
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
  public List<@Valid ServiceOrderItemFVO> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItemFVO> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderItemFVO service(ServiceRefOrValueFVO service) {
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
  public ServiceRefOrValueFVO getService() {
    return service;
  }

  public void setService(ServiceRefOrValueFVO service) {
    this.service = service;
  }

  public ServiceOrderItemFVO id(String id) {
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

  public ServiceOrderItemFVO action(OrderItemActionType action) {
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

  public ServiceOrderItemFVO modifyPath(List<@Valid JsonPatchFVO> modifyPath) {
    this.modifyPath = modifyPath;
    return this;
  }

  public ServiceOrderItemFVO addModifyPathItem(JsonPatchFVO modifyPathItem) {
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
  public List<@Valid JsonPatchFVO> getModifyPath() {
    return modifyPath;
  }

  public void setModifyPath(List<@Valid JsonPatchFVO> modifyPath) {
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
    ServiceOrderItemFVO serviceOrderItemFVO = (ServiceOrderItemFVO) o;
    return Objects.equals(this.quantity, serviceOrderItemFVO.quantity) &&
        Objects.equals(this.state, serviceOrderItemFVO.state) &&
        Objects.equals(this.appointment, serviceOrderItemFVO.appointment) &&
        Objects.equals(this.serviceOrderItemRelationship, serviceOrderItemFVO.serviceOrderItemRelationship) &&
        Objects.equals(this.errorMessage, serviceOrderItemFVO.errorMessage) &&
        Objects.equals(this.serviceOrderItem, serviceOrderItemFVO.serviceOrderItem) &&
        Objects.equals(this.service, serviceOrderItemFVO.service) &&
        Objects.equals(this.id, serviceOrderItemFVO.id) &&
        Objects.equals(this.action, serviceOrderItemFVO.action) &&
        Objects.equals(this.modifyPath, serviceOrderItemFVO.modifyPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, state, appointment, serviceOrderItemRelationship, errorMessage, serviceOrderItem, service, id, action, modifyPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItemFVO {\n");
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

