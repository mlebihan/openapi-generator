package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ServiceOrderItemRef;
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
 * A ServiceOrderErrorMessage represents an error that causes a status change in a service order.
 */

@Schema(name = "ServiceOrderErrorMessage", description = "A ServiceOrderErrorMessage represents an error that causes a status change in a service order.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderErrorMessage {

  private @Nullable String code;

  private @Nullable String message;

  private @Nullable String reason;

  private @Nullable URI referenceError;

  private @Nullable String status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime timestamp;

  @Valid
  private List<@Valid ServiceOrderItemRef> serviceOrderItem = new ArrayList<>();

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public ServiceOrderErrorMessage code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * error code
   * @return code
   */
  
  @Schema(name = "code", description = "error code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public ServiceOrderErrorMessage message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * More details and corrective actions related to the error
   * @return message
   */
  
  @Schema(name = "message", description = "More details and corrective actions related to the error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ServiceOrderErrorMessage reason(@Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Explanation of the reason for the error
   * @return reason
   */
  
  @Schema(name = "reason", description = "Explanation of the reason for the error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public @Nullable String getReason() {
    return reason;
  }

  public void setReason(@Nullable String reason) {
    this.reason = reason;
  }

  public ServiceOrderErrorMessage referenceError(@Nullable URI referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * URI of documentation describing the error
   * @return referenceError
   */
  @Valid 
  @Schema(name = "referenceError", description = "URI of documentation describing the error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("referenceError")
  public @Nullable URI getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(@Nullable URI referenceError) {
    this.referenceError = referenceError;
  }

  public ServiceOrderErrorMessage status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * error code extension like sys-ABC-2001
   * @return status
   */
  
  @Schema(name = "status", description = "error code extension like sys-ABC-2001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public ServiceOrderErrorMessage timestamp(@Nullable OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Date when the error happened
   * @return timestamp
   */
  @Valid 
  @Schema(name = "timestamp", description = "Date when the error happened", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public @Nullable OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(@Nullable OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ServiceOrderErrorMessage serviceOrderItem(List<@Valid ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderErrorMessage addServiceOrderItemItem(ServiceOrderItemRef serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order item references corresponded to this error
   * @return serviceOrderItem
   */
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of order item references corresponded to this error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<@Valid ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderErrorMessage atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrderErrorMessage atSchemaLocation(@Nullable URI atSchemaLocation) {
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

  public ServiceOrderErrorMessage atType(@Nullable String atType) {
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
    ServiceOrderErrorMessage serviceOrderErrorMessage = (ServiceOrderErrorMessage) o;
    return Objects.equals(this.code, serviceOrderErrorMessage.code) &&
        Objects.equals(this.message, serviceOrderErrorMessage.message) &&
        Objects.equals(this.reason, serviceOrderErrorMessage.reason) &&
        Objects.equals(this.referenceError, serviceOrderErrorMessage.referenceError) &&
        Objects.equals(this.status, serviceOrderErrorMessage.status) &&
        Objects.equals(this.timestamp, serviceOrderErrorMessage.timestamp) &&
        Objects.equals(this.serviceOrderItem, serviceOrderErrorMessage.serviceOrderItem) &&
        Objects.equals(this.atBaseType, serviceOrderErrorMessage.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderErrorMessage.atSchemaLocation) &&
        Objects.equals(this.atType, serviceOrderErrorMessage.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, reason, referenceError, status, timestamp, serviceOrderItem, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderErrorMessage {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
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

