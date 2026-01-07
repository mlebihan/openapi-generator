package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * ServiceOrderMilestone represents an action or event marking a significant change or stage in processing of a service order.
 */

@Schema(name = "ServiceOrderMilestone", description = "ServiceOrderMilestone represents an action or event marking a significant change or stage in processing of a service order.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderMilestone {

  private @Nullable String id;

  private @Nullable String description;

  private @Nullable String message;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime milestoneDate;

  private @Nullable String name;

  private @Nullable String status;

  @Valid
  private List<@Valid ServiceOrderItemRef> serviceOrderItem = new ArrayList<>();

  private @Nullable String atBaseType;

  private @Nullable URI atSchemaLocation;

  private @Nullable String atType;

  public ServiceOrderMilestone id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * identifier of the Milestone
   * @return id
   */
  
  @Schema(name = "id", description = "identifier of the Milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ServiceOrderMilestone description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * free-text description of the Milestone
   * @return description
   */
  
  @Schema(name = "description", description = "free-text description of the Milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ServiceOrderMilestone message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * A string represents the message of the milestone
   * @return message
   */
  
  @Schema(name = "message", description = "A string represents the message of the milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public ServiceOrderMilestone milestoneDate(@Nullable OffsetDateTime milestoneDate) {
    this.milestoneDate = milestoneDate;
    return this;
  }

  /**
   * A date time( DateTime). The date that the milestone happens
   * @return milestoneDate
   */
  @Valid 
  @Schema(name = "milestoneDate", description = "A date time( DateTime). The date that the milestone happens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("milestoneDate")
  public @Nullable OffsetDateTime getMilestoneDate() {
    return milestoneDate;
  }

  public void setMilestoneDate(@Nullable OffsetDateTime milestoneDate) {
    this.milestoneDate = milestoneDate;
  }

  public ServiceOrderMilestone name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * A string used to give a name to the milestone
   * @return name
   */
  
  @Schema(name = "name", description = "A string used to give a name to the milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ServiceOrderMilestone status(@Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * The milestone status
   * @return status
   */
  
  @Schema(name = "status", description = "The milestone status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable String getStatus() {
    return status;
  }

  public void setStatus(@Nullable String status) {
    this.status = status;
  }

  public ServiceOrderMilestone serviceOrderItem(List<@Valid ServiceOrderItemRef> serviceOrderItem) {
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
  public List<@Valid ServiceOrderItemRef> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<@Valid ServiceOrderItemRef> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public ServiceOrderMilestone atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrderMilestone atSchemaLocation(@Nullable URI atSchemaLocation) {
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

  public ServiceOrderMilestone atType(@Nullable String atType) {
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
    ServiceOrderMilestone serviceOrderMilestone = (ServiceOrderMilestone) o;
    return Objects.equals(this.id, serviceOrderMilestone.id) &&
        Objects.equals(this.description, serviceOrderMilestone.description) &&
        Objects.equals(this.message, serviceOrderMilestone.message) &&
        Objects.equals(this.milestoneDate, serviceOrderMilestone.milestoneDate) &&
        Objects.equals(this.name, serviceOrderMilestone.name) &&
        Objects.equals(this.status, serviceOrderMilestone.status) &&
        Objects.equals(this.serviceOrderItem, serviceOrderMilestone.serviceOrderItem) &&
        Objects.equals(this.atBaseType, serviceOrderMilestone.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderMilestone.atSchemaLocation) &&
        Objects.equals(this.atType, serviceOrderMilestone.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, message, milestoneDate, name, status, serviceOrderItem, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderMilestone {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    milestoneDate: ").append(toIndentedString(milestoneDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
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

