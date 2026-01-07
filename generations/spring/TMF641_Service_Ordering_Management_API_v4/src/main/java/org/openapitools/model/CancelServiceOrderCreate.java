package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.model.ServiceOrderRef;
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
 * Request for cancellation an existing Service order Skipped properties: id,href,state,effectiveCancellationDate,completionMessage,errorMessage
 */

@Schema(name = "CancelServiceOrder_Create", description = "Request for cancellation an existing Service order Skipped properties: id,href,state,effectiveCancellationDate,completionMessage,errorMessage")
@JsonTypeName("CancelServiceOrder_Create")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CancelServiceOrderCreate {

  private @Nullable String cancellationReason;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime requestedCancellationDate;

  private ServiceOrderRef serviceOrder;

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public CancelServiceOrderCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CancelServiceOrderCreate(ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
  }

  public CancelServiceOrderCreate cancellationReason(@Nullable String cancellationReason) {
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

  public CancelServiceOrderCreate requestedCancellationDate(@Nullable OffsetDateTime requestedCancellationDate) {
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

  public CancelServiceOrderCreate serviceOrder(ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
    return this;
  }

  /**
   * Get serviceOrder
   * @return serviceOrder
   */
  @NotNull @Valid 
  @Schema(name = "serviceOrder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceOrder")
  public ServiceOrderRef getServiceOrder() {
    return serviceOrder;
  }

  public void setServiceOrder(ServiceOrderRef serviceOrder) {
    this.serviceOrder = serviceOrder;
  }

  public CancelServiceOrderCreate atBaseType(@Nullable String atBaseType) {
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

  public CancelServiceOrderCreate atSchemaLocation(@Nullable URI atSchemaLocation) {
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

  public CancelServiceOrderCreate atType(@Nullable String atType) {
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
    CancelServiceOrderCreate cancelServiceOrderCreate = (CancelServiceOrderCreate) o;
    return Objects.equals(this.cancellationReason, cancelServiceOrderCreate.cancellationReason) &&
        Objects.equals(this.requestedCancellationDate, cancelServiceOrderCreate.requestedCancellationDate) &&
        Objects.equals(this.serviceOrder, cancelServiceOrderCreate.serviceOrder) &&
        Objects.equals(this.atBaseType, cancelServiceOrderCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, cancelServiceOrderCreate.atSchemaLocation) &&
        Objects.equals(this.atType, cancelServiceOrderCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason, requestedCancellationDate, serviceOrder, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrderCreate {\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    serviceOrder: ").append(toIndentedString(serviceOrder)).append("\n");
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

