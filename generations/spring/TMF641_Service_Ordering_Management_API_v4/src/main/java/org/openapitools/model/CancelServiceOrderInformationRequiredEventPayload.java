package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CancelServiceOrder;
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

@Schema(name = "CancelServiceOrderInformationRequiredEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CancelServiceOrderInformationRequiredEventPayload {

  private @Nullable CancelServiceOrder cancelServiceOrder;

  public CancelServiceOrderInformationRequiredEventPayload cancelServiceOrder(@Nullable CancelServiceOrder cancelServiceOrder) {
    this.cancelServiceOrder = cancelServiceOrder;
    return this;
  }

  /**
   * Get cancelServiceOrder
   * @return cancelServiceOrder
   */
  @Valid 
  @Schema(name = "cancelServiceOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cancelServiceOrder")
  public @Nullable CancelServiceOrder getCancelServiceOrder() {
    return cancelServiceOrder;
  }

  public void setCancelServiceOrder(@Nullable CancelServiceOrder cancelServiceOrder) {
    this.cancelServiceOrder = cancelServiceOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelServiceOrderInformationRequiredEventPayload cancelServiceOrderInformationRequiredEventPayload = (CancelServiceOrderInformationRequiredEventPayload) o;
    return Objects.equals(this.cancelServiceOrder, cancelServiceOrderInformationRequiredEventPayload.cancelServiceOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelServiceOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrderInformationRequiredEventPayload {\n");
    sb.append("    cancelServiceOrder: ").append(toIndentedString(cancelServiceOrder)).append("\n");
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

