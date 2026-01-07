package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.model.ErrorMessage;
import org.openapitools.model.ServiceOrderRef;
import org.openapitools.model.TaskStateType;
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
 * Request for cancellation an existing Service order
 */

@Schema(name = "CancelServiceOrder", description = "Request for cancellation an existing Service order")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CancelServiceOrder {

  private @Nullable String id;

  private @Nullable URI href;

  private @Nullable String cancellationReason;

  private @Nullable String completionMessage;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime effectiveCancellationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedCancellationDate;

  private @Nullable ErrorMessage errorMessage;

  private @Nullable ServiceOrderRef serviceOrder;

  private @Nullable TaskStateType state;

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public CancelServiceOrder id(@Nullable String id) {
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

  public CancelServiceOrder href(@Nullable URI href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  @Valid 
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable URI getHref() {
    return href;
  }

  public void setHref(@Nullable URI href) {
    this.href = href;
  }

  public CancelServiceOrder cancellationReason(@Nullable String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Reason why the order is cancelled.
   * @return cancellationReason
   */
  
  @Schema(name = "cancellationReason", description = "Reason why the order is cancelled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancellationReason")
  public @Nullable String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(@Nullable String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public CancelServiceOrder completionMessage(@Nullable String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

  /**
   * an optional message describing the completion of the task if it is done as expected or it is denied for a reason (like order in an state of PoNR).
   * @return completionMessage
   */
  
  @Schema(name = "completionMessage", description = "an optional message describing the completion of the task if it is done as expected or it is denied for a reason (like order in an state of PoNR).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completionMessage")
  public @Nullable String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(@Nullable String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public CancelServiceOrder effectiveCancellationDate(@Nullable OffsetDateTime effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
    return this;
  }

  /**
   * Date when the order is cancelled.
   * @return effectiveCancellationDate
   */
  @Valid 
  @Schema(name = "effectiveCancellationDate", description = "Date when the order is cancelled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveCancellationDate")
  public @Nullable OffsetDateTime getEffectiveCancellationDate() {
    return effectiveCancellationDate;
  }

  public void setEffectiveCancellationDate(@Nullable OffsetDateTime effectiveCancellationDate) {
    this.effectiveCancellationDate = effectiveCancellationDate;
  }

  public CancelServiceOrder requestedCancellationDate(@Nullable OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
  }

  /**
   * Date when the submitter wants the order to be cancelled
   * @return requestedCancellationDate
   */
  @Valid 
  @Schema(name = "requestedCancellationDate", description = "Date when the submitter wants the order to be cancelled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedCancellationDate")
  public @Nullable OffsetDateTime getRequestedCancellationDate() {
    return requestedCancellationDate;
  }

  public void setRequestedCancellationDate(@Nullable OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

  public CancelServiceOrder errorMessage(@Nullable ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @Valid 
  @Schema(name = "errorMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public @Nullable ErrorMessage getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@Nullable ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CancelServiceOrder serviceOrder(@Nullable ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
    return this;
  }

  /**
   * Get serviceOrder
   * @return serviceOrder
   */
  @Valid 
  @Schema(name = "serviceOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrder")
  public @Nullable ServiceOrderRef getServiceOrder() {
    return serviceOrder;
  }

  public void setServiceOrder(@Nullable ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
  }

  public CancelServiceOrder state(@Nullable TaskStateType state) {
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
  public @Nullable TaskStateType getState() {
    return state;
  }

  public void setState(@Nullable TaskStateType state) {
    this.state = state;
  }

  public CancelServiceOrder atBaseType(@Nullable String atBaseType) {
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

  public CancelServiceOrder atSchemaLocation(@Nullable URI atSchemaLocation) {
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

  public CancelServiceOrder atType(@Nullable String atType) {
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
    CancelServiceOrder cancelServiceOrder = (CancelServiceOrder) o;
    return Objects.equals(this.id, cancelServiceOrder.id) &&
        Objects.equals(this.href, cancelServiceOrder.href) &&
        Objects.equals(this.cancellationReason, cancelServiceOrder.cancellationReason) &&
        Objects.equals(this.completionMessage, cancelServiceOrder.completionMessage) &&
        Objects.equals(this.effectiveCancellationDate, cancelServiceOrder.effectiveCancellationDate) &&
        Objects.equals(this.requestedCancellationDate, cancelServiceOrder.requestedCancellationDate) &&
        Objects.equals(this.errorMessage, cancelServiceOrder.errorMessage) &&
        Objects.equals(this.serviceOrder, cancelServiceOrder.serviceOrder) &&
        Objects.equals(this.state, cancelServiceOrder.state) &&
        Objects.equals(this.atBaseType, cancelServiceOrder.atBaseType) &&
        Objects.equals(this.atSchemaLocation, cancelServiceOrder.atSchemaLocation) &&
        Objects.equals(this.atType, cancelServiceOrder.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cancellationReason, completionMessage, effectiveCancellationDate, requestedCancellationDate, errorMessage, serviceOrder, state, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    effectiveCancellationDate: ").append(toIndentedString(effectiveCancellationDate)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    serviceOrder: ").append(toIndentedString(serviceOrder)).append("\n");
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

