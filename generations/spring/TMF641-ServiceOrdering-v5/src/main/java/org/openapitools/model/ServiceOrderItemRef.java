package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceOrderItemRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderItemRef {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String atReferredType;

  private @Nullable String itemId;

  private @Nullable URI serviceOrderHref;

  private @Nullable String serviceOrderId;

  public ServiceOrderItemRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceOrderItemRef(String atType) {
    this.atType = atType;
  }

  public ServiceOrderItemRef atType(String atType) {
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

  public ServiceOrderItemRef atBaseType(@Nullable String atBaseType) {
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

  public ServiceOrderItemRef atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ServiceOrderItemRef atReferredType(@Nullable String atReferredType) {
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

  public ServiceOrderItemRef itemId(@Nullable String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * Identifier of the line item
   * @return itemId
   */
  
  @Schema(name = "itemId", description = "Identifier of the line item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemId")
  public @Nullable String getItemId() {
    return itemId;
  }

  public void setItemId(@Nullable String itemId) {
    this.itemId = itemId;
  }

  public ServiceOrderItemRef serviceOrderHref(@Nullable URI serviceOrderHref) {
    this.serviceOrderHref = serviceOrderHref;
    return this;
  }

  /**
   * Link to the order to which this item belongs to
   * @return serviceOrderHref
   */
  @Valid 
  @Schema(name = "serviceOrderHref", description = "Link to the order to which this item belongs to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderHref")
  public @Nullable URI getServiceOrderHref() {
    return serviceOrderHref;
  }

  public void setServiceOrderHref(@Nullable URI serviceOrderHref) {
    this.serviceOrderHref = serviceOrderHref;
  }

  public ServiceOrderItemRef serviceOrderId(@Nullable String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
    return this;
  }

  /**
   * Identifier of the order that this item belongs to
   * @return serviceOrderId
   */
  
  @Schema(name = "serviceOrderId", description = "Identifier of the order that this item belongs to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderId")
  public @Nullable String getServiceOrderId() {
    return serviceOrderId;
  }

  public void setServiceOrderId(@Nullable String serviceOrderId) {
    this.serviceOrderId = serviceOrderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderItemRef serviceOrderItemRef = (ServiceOrderItemRef) o;
    return Objects.equals(this.atType, serviceOrderItemRef.atType) &&
        Objects.equals(this.atBaseType, serviceOrderItemRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceOrderItemRef.atSchemaLocation) &&
        Objects.equals(this.atReferredType, serviceOrderItemRef.atReferredType) &&
        Objects.equals(this.itemId, serviceOrderItemRef.itemId) &&
        Objects.equals(this.serviceOrderHref, serviceOrderItemRef.serviceOrderHref) &&
        Objects.equals(this.serviceOrderId, serviceOrderItemRef.serviceOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, atReferredType, itemId, serviceOrderHref, serviceOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderItemRef {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    serviceOrderHref: ").append(toIndentedString(serviceOrderHref)).append("\n");
    sb.append("    serviceOrderId: ").append(toIndentedString(serviceOrderId)).append("\n");
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

