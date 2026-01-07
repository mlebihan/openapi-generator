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
 * The event data structure
 */

@Schema(name = "ServiceOrderDeleteEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderDeleteEventPayload {

  private @Nullable ServiceOrder serviceOrder;

  public ServiceOrderDeleteEventPayload serviceOrder(@Nullable ServiceOrder serviceOrder) {
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
    ServiceOrderDeleteEventPayload serviceOrderDeleteEventPayload = (ServiceOrderDeleteEventPayload) o;
    return Objects.equals(this.serviceOrder, serviceOrderDeleteEventPayload.serviceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderDeleteEventPayload {\n");
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

