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
import org.openapitools.model.JeopardyAlert;
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
 * ServiceOrderJeopardyAlert
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderJeopardyAlert extends JeopardyAlert {

  @Valid
  private List<ServiceOrderItemRef> serviceOrderItem = new ArrayList<>();

  public ServiceOrderJeopardyAlert() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderJeopardyAlert(String atType) {
    super(atType);
  }

  public ServiceOrderJeopardyAlert serviceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderJeopardyAlert addServiceOrderItemItem(ServiceOrderItemRef serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order item references corresponded to this alert
   * @return serviceOrderItem
   */
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of order item references corresponded to this alert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }


  public ServiceOrderJeopardyAlert atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ServiceOrderJeopardyAlert atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ServiceOrderJeopardyAlert atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ServiceOrderJeopardyAlert id(String id) {
    super.id(id);
    return this;
  }

  public ServiceOrderJeopardyAlert alertDate(OffsetDateTime alertDate) {
    super.alertDate(alertDate);
    return this;
  }

  public ServiceOrderJeopardyAlert name(String name) {
    super.name(name);
    return this;
  }

  public ServiceOrderJeopardyAlert jeopardyType(String jeopardyType) {
    super.jeopardyType(jeopardyType);
    return this;
  }

  public ServiceOrderJeopardyAlert exception(String exception) {
    super.exception(exception);
    return this;
  }

  public ServiceOrderJeopardyAlert message(String message) {
    super.message(message);
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
    ServiceOrderJeopardyAlert serviceOrderJeopardyAlert = (ServiceOrderJeopardyAlert) o;
    return Objects.equals(this.serviceOrderItem, serviceOrderJeopardyAlert.serviceOrderItem) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrderItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderJeopardyAlert {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

