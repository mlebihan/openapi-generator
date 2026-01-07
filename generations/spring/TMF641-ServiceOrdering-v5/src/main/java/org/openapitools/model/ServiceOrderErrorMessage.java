package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ErrorMessage;
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
 * ServiceOrderErrorMessage
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderErrorMessage extends ErrorMessage {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime timestamp;

  @Valid
  private List<ServiceOrderItemRef> serviceOrderItem = new ArrayList<>();

  public ServiceOrderErrorMessage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderErrorMessage(String atType) {
    super(atType);
    this.atType = atType;
  }

  public ServiceOrderErrorMessage atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Get atType
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
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

  public ServiceOrderErrorMessage atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ServiceOrderErrorMessage serviceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
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
  public List<ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }


  public ServiceOrderErrorMessage code(String code) {
    super.code(code);
    return this;
  }

  public ServiceOrderErrorMessage reason(String reason) {
    super.reason(reason);
    return this;
  }

  public ServiceOrderErrorMessage message(String message) {
    super.message(message);
    return this;
  }

  public ServiceOrderErrorMessage status(String status) {
    super.status(status);
    return this;
  }

  public ServiceOrderErrorMessage referenceError(String referenceError) {
    super.referenceError(referenceError);
    return this;
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
    return Objects.equals(this.atType, serviceOrderErrorMessage.atType) &&
        Objects.equals(this.atBaseType, serviceOrderErrorMessage.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderErrorMessage.atSchemaLocation) &&
        Objects.equals(this.timestamp, serviceOrderErrorMessage.timestamp) &&
        Objects.equals(this.serviceOrderItem, serviceOrderErrorMessage.serviceOrderItem) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, timestamp, serviceOrderItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderErrorMessage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
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

