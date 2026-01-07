package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OrderItemActionType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RelatedServiceOrderItem
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class RelatedServiceOrderItem {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String atReferredType;

  private @Nullable String serviceOrderHref;

  private @Nullable String serviceOrderId;

  private @Nullable OrderItemActionType itemAction;

  private @Nullable String itemId;

  private @Nullable String role;

  public RelatedServiceOrderItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedServiceOrderItem(String atType) {
    this.atType = atType;
  }

  public RelatedServiceOrderItem atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public RelatedServiceOrderItem atBaseType(@Nullable String atBaseType) {
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

  public RelatedServiceOrderItem atSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public RelatedServiceOrderItem atReferredType(@Nullable String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
   */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public @Nullable String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(@Nullable String atReferredType) {
    this.atReferredType = atReferredType;
  }

  public RelatedServiceOrderItem serviceOrderHref(@Nullable String serviceOrderHref) {
    this.serviceOrderHref = serviceOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return serviceOrderHref
   */
  
  @Schema(name = "serviceOrderHref", description = "Reference of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderHref")
  public @Nullable String getServiceOrderHref() {
    return serviceOrderHref;
  }

  public void setServiceOrderHref(@Nullable String serviceOrderHref) {
    this.serviceOrderHref = serviceOrderHref;
  }

  public RelatedServiceOrderItem serviceOrderId(@Nullable String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return serviceOrderId
   */
  
  @Schema(name = "serviceOrderId", description = "Unique identifier of a related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderId")
  public @Nullable String getServiceOrderId() {
    return serviceOrderId;
  }

  public void setServiceOrderId(@Nullable String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
  }

  public RelatedServiceOrderItem itemAction(@Nullable OrderItemActionType itemAction) {
    this.itemAction = itemAction;
    return this;
  }

  /**
   * Get itemAction
   * @return itemAction
   */
  @Valid 
  @Schema(name = "itemAction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemAction")
  public @Nullable OrderItemActionType getItemAction() {
    return itemAction;
  }

  public void setItemAction(@Nullable OrderItemActionType itemAction) {
    this.itemAction = itemAction;
  }

  public RelatedServiceOrderItem itemId(@Nullable String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Identifier of the order item where the service was managed
   * @return itemId
   */
  
  @Schema(name = "itemId", description = "Identifier of the order item where the service was managed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemId")
  public @Nullable String getItemId() {
    return itemId;
  }

  public void setItemId(@Nullable String itemId) {
    this.itemId = itemId;
  }

  public RelatedServiceOrderItem role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the service order item for this service
   * @return role
   */
  
  @Schema(name = "role", description = "role of the service order item for this service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable String getRole() {
    return role;
  }

  public void setRole(@Nullable String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedServiceOrderItem relatedServiceOrderItem = (RelatedServiceOrderItem) o;
    return Objects.equals(this.atType, relatedServiceOrderItem.atType) &&
        Objects.equals(this.atBaseType, relatedServiceOrderItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedServiceOrderItem.atSchemaLocation) &&
        Objects.equals(this.atReferredType, relatedServiceOrderItem.atReferredType) &&
        Objects.equals(this.serviceOrderHref, relatedServiceOrderItem.serviceOrderHref) &&
        Objects.equals(this.serviceOrderId, relatedServiceOrderItem.serviceOrderId) &&
        Objects.equals(this.itemAction, relatedServiceOrderItem.itemAction) &&
        Objects.equals(this.itemId, relatedServiceOrderItem.itemId) &&
        Objects.equals(this.role, relatedServiceOrderItem.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, atReferredType, serviceOrderHref, serviceOrderId, itemAction, itemId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedServiceOrderItem {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("    serviceOrderHref: ").append(toIndentedString(serviceOrderHref)).append("\n");
    sb.append("    serviceOrderId: ").append(toIndentedString(serviceOrderId)).append("\n");
    sb.append("    itemAction: ").append(toIndentedString(itemAction)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

