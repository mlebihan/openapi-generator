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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Milestone;
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
 * ServiceOrderMilestone
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderMilestone extends Milestone {

  @Valid
  private List<ServiceOrderItemRef> serviceOrderItem = new ArrayList<>();

  public ServiceOrderMilestone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderMilestone(String atType) {
    super(atType);
  }

  public ServiceOrderMilestone serviceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceOrderMilestone addServiceOrderItemItem(ServiceOrderItemRef serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of order item references corresponded to this milestone
   * @return serviceOrderItem
   */
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of order item references corresponded to this milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }


  public ServiceOrderMilestone atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ServiceOrderMilestone atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ServiceOrderMilestone atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ServiceOrderMilestone description(String description) {
    super.description(description);
    return this;
  }

  public ServiceOrderMilestone id(String id) {
    super.id(id);
    return this;
  }

  public ServiceOrderMilestone status(StatusEnum status) {
    super.status(status);
    return this;
  }

  public ServiceOrderMilestone milestoneDate(OffsetDateTime milestoneDate) {
    super.milestoneDate(milestoneDate);
    return this;
  }

  public ServiceOrderMilestone name(String name) {
    super.name(name);
    return this;
  }

  public ServiceOrderMilestone message(String message) {
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
    ServiceOrderMilestone serviceOrderMilestone = (ServiceOrderMilestone) o;
    return Objects.equals(this.serviceOrderItem, serviceOrderMilestone.serviceOrderItem) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceOrderItem, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderMilestone {\n");
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

