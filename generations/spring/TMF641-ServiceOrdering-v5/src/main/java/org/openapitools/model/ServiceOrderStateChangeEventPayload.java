package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ServiceOrder;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOrderStateChangeEventPayload
 */

@Schema(name = "ServiceOrderStateChangeEventPayload", description = "ServiceOrderStateChangeEventPayload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderStateChangeEventPayload {

  private @Nullable ServiceOrder serviceOrder;

  public ServiceOrderStateChangeEventPayload serviceOrder(@Nullable ServiceOrder serviceOrder) {
    this.serviceOrder = serviceOrder;
    return this;
  }

  /**
   * Get serviceOrder
   * @return serviceOrder
   */
  @Valid 
  @Schema(name = "ServiceOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceOrder")
  public @Nullable ServiceOrder getServiceOrder() {
    return serviceOrder;
  }

  public void setServiceOrder(@Nullable ServiceOrder serviceOrder) {
    this.serviceOrder = serviceOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderStateChangeEventPayload serviceOrderStateChangeEventPayload = (ServiceOrderStateChangeEventPayload) o;
    return Objects.equals(this.serviceOrder, serviceOrderStateChangeEventPayload.serviceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderStateChangeEventPayload {\n");
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

