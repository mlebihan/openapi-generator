package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Service;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOperatingStatusChangeEventPayload generic structure
 */

@Schema(name = "ServiceOperatingStatusChangeEventPayload", description = "ServiceOperatingStatusChangeEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOperatingStatusChangeEventPayload {

  private @Nullable Service service;

  public ServiceOperatingStatusChangeEventPayload service(@Nullable Service service) {
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
  public @Nullable Service getService() {
    return service;
  }

  public void setService(@Nullable Service service) {
    this.service = service;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOperatingStatusChangeEventPayload serviceOperatingStatusChangeEventPayload = (ServiceOperatingStatusChangeEventPayload) o;
    return Objects.equals(this.service, serviceOperatingStatusChangeEventPayload.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOperatingStatusChangeEventPayload {\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

