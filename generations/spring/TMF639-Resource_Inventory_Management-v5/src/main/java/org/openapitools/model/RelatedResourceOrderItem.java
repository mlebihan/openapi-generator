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
 * RelatedResourceOrderItem
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class RelatedResourceOrderItem {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String atReferredType;

  private @Nullable String resourceOrderHref;

  private @Nullable String resourceOrderId;

  private @Nullable OrderItemActionType itemAction;

  private @Nullable String itemId;

  private @Nullable String role;

  public RelatedResourceOrderItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedResourceOrderItem(String atType) {
    this.atType = atType;
  }

  public RelatedResourceOrderItem atType(String atType) {
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

  public RelatedResourceOrderItem atBaseType(@Nullable String atBaseType) {
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

  public RelatedResourceOrderItem atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public RelatedResourceOrderItem atReferredType(@Nullable String atReferredType) {
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

  public RelatedResourceOrderItem resourceOrderHref(@Nullable String resourceOrderHref) {
    this.resourceOrderHref = resourceOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return resourceOrderHref
   */
  
  @Schema(name = "resourceOrderHref", description = "Reference of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceOrderHref")
  public @Nullable String getResourceOrderHref() {
    return resourceOrderHref;
  }

  public void setResourceOrderHref(@Nullable String resourceOrderHref) {
    this.resourceOrderHref = resourceOrderHref;
  }

  public RelatedResourceOrderItem resourceOrderId(@Nullable String resourceOrderId) {
    this.resourceOrderId = resourceOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return resourceOrderId
   */
  
  @Schema(name = "resourceOrderId", description = "Unique identifier of a related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceOrderId")
  public @Nullable String getResourceOrderId() {
    return resourceOrderId;
  }

  public void setResourceOrderId(@Nullable String resourceOrderId) {
    this.resourceOrderId = resourceOrderId;
  }

  public RelatedResourceOrderItem itemAction(@Nullable OrderItemActionType itemAction) {
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

  public RelatedResourceOrderItem itemId(@Nullable String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Identifier of the order item where the resource was managed
   * @return itemId
   */
  
  @Schema(name = "itemId", description = "Identifier of the order item where the resource was managed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemId")
  public @Nullable String getItemId() {
    return itemId;
  }

  public void setItemId(@Nullable String itemId) {
    this.itemId = itemId;
  }

  public RelatedResourceOrderItem role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the resource order item for this resource
   * @return role
   */
  
  @Schema(name = "role", description = "role of the resource order item for this resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RelatedResourceOrderItem relatedResourceOrderItem = (RelatedResourceOrderItem) o;
    return Objects.equals(this.atType, relatedResourceOrderItem.atType) &&
        Objects.equals(this.atBaseType, relatedResourceOrderItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedResourceOrderItem.atSchemaLocation) &&
        Objects.equals(this.atReferredType, relatedResourceOrderItem.atReferredType) &&
        Objects.equals(this.resourceOrderHref, relatedResourceOrderItem.resourceOrderHref) &&
        Objects.equals(this.resourceOrderId, relatedResourceOrderItem.resourceOrderId) &&
        Objects.equals(this.itemAction, relatedResourceOrderItem.itemAction) &&
        Objects.equals(this.itemId, relatedResourceOrderItem.itemId) &&
        Objects.equals(this.role, relatedResourceOrderItem.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, atReferredType, resourceOrderHref, resourceOrderId, itemAction, itemId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedResourceOrderItem {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("    resourceOrderHref: ").append(toIndentedString(resourceOrderHref)).append("\n");
    sb.append("    resourceOrderId: ").append(toIndentedString(resourceOrderId)).append("\n");
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

