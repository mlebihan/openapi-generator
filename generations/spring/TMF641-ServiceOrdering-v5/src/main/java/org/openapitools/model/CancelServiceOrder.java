package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.CancelOrder;
import org.openapitools.model.ServiceOrderRef;
import org.openapitools.model.TaskStateType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CancelServiceOrder
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CancelServiceOrder extends CancelOrder implements InlineObject {

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable ServiceOrderRef serviceOrder;

  public CancelServiceOrder() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CancelServiceOrder(String atType) {
    super(atType);
  }

  public CancelServiceOrder href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

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


  public CancelServiceOrder atType(String atType) {
    super.atType(atType);
    return this;
  }

  public CancelServiceOrder atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public CancelServiceOrder atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public CancelServiceOrder requestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    super.requestedCancellationDate(requestedCancellationDate);
    return this;
  }

  public CancelServiceOrder effectiveCancellationDate(OffsetDateTime effectiveCancellationDate) {
    super.effectiveCancellationDate(effectiveCancellationDate);
    return this;
  }

  public CancelServiceOrder cancellationReason(String cancellationReason) {
    super.cancellationReason(cancellationReason);
    return this;
  }

  public CancelServiceOrder state(TaskStateType state) {
    super.state(state);
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
    CancelServiceOrder cancelServiceOrder = (CancelServiceOrder) o;
    return Objects.equals(this.href, cancelServiceOrder.href) &&
        Objects.equals(this.id, cancelServiceOrder.id) &&
        Objects.equals(this.serviceOrder, cancelServiceOrder.serviceOrder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, id, serviceOrder, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceOrder: ").append(toIndentedString(serviceOrder)).append("\n");
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

