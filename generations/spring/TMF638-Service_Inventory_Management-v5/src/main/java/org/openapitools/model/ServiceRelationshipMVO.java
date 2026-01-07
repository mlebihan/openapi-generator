package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ServiceRefOrValueMVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceRelationshipMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceRelationshipMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  @Valid
  private List<Characteristic> serviceRelationshipCharacteristic = new ArrayList<>();

  private @Nullable ServiceRefOrValueMVO service;

  private @Nullable String relationshipType;

  public ServiceRelationshipMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceRelationshipMVO(String atType) {
    this.atType = atType;
  }

  public ServiceRelationshipMVO atType(String atType) {
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

  public ServiceRelationshipMVO atBaseType(@Nullable String atBaseType) {
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

  public ServiceRelationshipMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ServiceRelationshipMVO serviceRelationshipCharacteristic(List<Characteristic> serviceRelationshipCharacteristic) {
    this.serviceRelationshipCharacteristic = serviceRelationshipCharacteristic;
    return this;
  }

  public ServiceRelationshipMVO addServiceRelationshipCharacteristicItem(Characteristic serviceRelationshipCharacteristicItem) {
    if (this.serviceRelationshipCharacteristic == null) {
      this.serviceRelationshipCharacteristic = new ArrayList<>();
    }
    this.serviceRelationshipCharacteristic.add(serviceRelationshipCharacteristicItem);
    return this;
  }

  /**
   * Get serviceRelationshipCharacteristic
   * @return serviceRelationshipCharacteristic
   */
  @Valid 
  @Schema(name = "serviceRelationshipCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRelationshipCharacteristic")
  public List<Characteristic> getServiceRelationshipCharacteristic() {
    return serviceRelationshipCharacteristic;
  }

  public void setServiceRelationshipCharacteristic(List<Characteristic> serviceRelationshipCharacteristic) {
    this.serviceRelationshipCharacteristic = serviceRelationshipCharacteristic;
  }

  public ServiceRelationshipMVO service(@Nullable ServiceRefOrValueMVO service) {
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
  public @Nullable ServiceRefOrValueMVO getService() {
    return service;
  }

  public void setService(@Nullable ServiceRefOrValueMVO service) {
    this.service = service;
  }

  public ServiceRelationshipMVO relationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Get relationshipType
   * @return relationshipType
   */
  
  @Schema(name = "relationshipType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationshipType")
  public @Nullable String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRelationshipMVO serviceRelationshipMVO = (ServiceRelationshipMVO) o;
    return Objects.equals(this.atType, serviceRelationshipMVO.atType) &&
        Objects.equals(this.atBaseType, serviceRelationshipMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceRelationshipMVO.atSchemaLocation) &&
        Objects.equals(this.serviceRelationshipCharacteristic, serviceRelationshipMVO.serviceRelationshipCharacteristic) &&
        Objects.equals(this.service, serviceRelationshipMVO.service) &&
        Objects.equals(this.relationshipType, serviceRelationshipMVO.relationshipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, serviceRelationshipCharacteristic, service, relationshipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRelationshipMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    serviceRelationshipCharacteristic: ").append(toIndentedString(serviceRelationshipCharacteristic)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
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

