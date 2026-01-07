package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.model.CancelOrderFVO;
import org.openapitools.model.ServiceOrderRefFVO;
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
 * CancelServiceOrderFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CancelServiceOrderFVO extends CancelOrderFVO {

  private ServiceOrderRefFVO serviceOrder;

  public CancelServiceOrderFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CancelServiceOrderFVO(ServiceOrderRefFVO serviceOrder, String atType) {
    super(atType);
    this.serviceOrder = serviceOrder;
  }

  public CancelServiceOrderFVO serviceOrder(ServiceOrderRefFVO serviceOrder) {
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
  public ServiceOrderRefFVO getServiceOrder() {
    return serviceOrder;
  }

  public void setServiceOrder(ServiceOrderRefFVO serviceOrder) {
    this.serviceOrder = serviceOrder;
  }


  public CancelServiceOrderFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public CancelServiceOrderFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public CancelServiceOrderFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public CancelServiceOrderFVO requestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    super.requestedCancellationDate(requestedCancellationDate);
    return this;
  }

  public CancelServiceOrderFVO cancellationReason(String cancellationReason) {
    super.cancellationReason(cancellationReason);
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
    CancelServiceOrderFVO cancelServiceOrderFVO = (CancelServiceOrderFVO) o;
    return Objects.equals(this.serviceOrder, cancelServiceOrderFVO.serviceOrder) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrder, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelServiceOrderFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

