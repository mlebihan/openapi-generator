package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JsonPatch;
import org.openapitools.model.ServiceOrderRef;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOrderInformationRequiredEventPayload Payload structure
 */

@Schema(name = "ServiceOrderInformationRequiredEventPayload", description = "ServiceOrderInformationRequiredEventPayload Payload structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderInformationRequiredEventPayload {

  @Valid
  private List<@Valid JsonPatch> informationRequired = new ArrayList<>();

  private @Nullable ServiceOrderRef serviceOrder;

  public ServiceOrderInformationRequiredEventPayload informationRequired(List<@Valid JsonPatch> informationRequired) {
    this.informationRequired = informationRequired;
    return this;
  }

  public ServiceOrderInformationRequiredEventPayload addInformationRequiredItem(JsonPatch informationRequiredItem) {
    if (this.informationRequired == null) {
      this.informationRequired = new ArrayList<>();
    }
    this.informationRequired.add(informationRequiredItem);
    return this;
  }

  /**
   * InformationRequiredArray generic structure
   * @return informationRequired
   */
  @Valid @Size(min = 1) 
  @Schema(name = "informationRequired", description = "InformationRequiredArray generic structure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("informationRequired")
  public List<@Valid JsonPatch> getInformationRequired() {
    return informationRequired;
  }

  public void setInformationRequired(List<@Valid JsonPatch> informationRequired) {
    this.informationRequired = informationRequired;
  }

  public ServiceOrderInformationRequiredEventPayload serviceOrder(@Nullable ServiceOrderRef serviceOrder) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderInformationRequiredEventPayload serviceOrderInformationRequiredEventPayload = (ServiceOrderInformationRequiredEventPayload) o;
    return Objects.equals(this.informationRequired, serviceOrderInformationRequiredEventPayload.informationRequired) &&
        Objects.equals(this.serviceOrder, serviceOrderInformationRequiredEventPayload.serviceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationRequired, serviceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderInformationRequiredEventPayload {\n");
    sb.append("    informationRequired: ").append(toIndentedString(informationRequired)).append("\n");
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

