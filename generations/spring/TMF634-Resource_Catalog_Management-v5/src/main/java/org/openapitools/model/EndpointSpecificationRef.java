package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.ConnectionPointSpecificationRef;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EndpointSpecificationRef
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class EndpointSpecificationRef {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private String id;

  private @Nullable String name;

  private @Nullable String atReferredType;

  private @Nullable String role;

  private Boolean isRoot = true;

  private @Nullable ConnectionPointSpecificationRef connectionPointSpecification;

  public EndpointSpecificationRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EndpointSpecificationRef(String atType, String id) {
    this.atType = atType;
    this.id = id;
  }

  public EndpointSpecificationRef atType(String atType) {
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

  public EndpointSpecificationRef atBaseType(@Nullable String atBaseType) {
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

  public EndpointSpecificationRef atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public EndpointSpecificationRef href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * The URI of the referred entity.
   * @return href
   */
  
  @Schema(name = "href", description = "The URI of the referred entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public EndpointSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the referred entity.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The identifier of the referred entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EndpointSpecificationRef name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the referred entity.
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the referred entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public EndpointSpecificationRef atReferredType(@Nullable String atReferredType) {
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

  public EndpointSpecificationRef role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the Resource Function.
   * @return role
   */
  
  @Schema(name = "role", description = "Role of the Resource Function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable String getRole() {
    return role;
  }

  public void setRole(@Nullable String role) {
    this.role = role;
  }

  public EndpointSpecificationRef isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  /**
   * Directionality: true when endpoint is a source, false when a sink. If true for all endpoints connectivity is bidirectional. Default is true.
   * @return isRoot
   */
  
  @Schema(name = "isRoot", description = "Directionality: true when endpoint is a source, false when a sink. If true for all endpoints connectivity is bidirectional. Default is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isRoot")
  public Boolean getIsRoot() {
    return isRoot;
  }

  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }

  public EndpointSpecificationRef connectionPointSpecification(@Nullable ConnectionPointSpecificationRef connectionPointSpecification) {
    this.connectionPointSpecification = connectionPointSpecification;
    return this;
  }

  /**
   * Get connectionPointSpecification
   * @return connectionPointSpecification
   */
  @Valid 
  @Schema(name = "connectionPointSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionPointSpecification")
  public @Nullable ConnectionPointSpecificationRef getConnectionPointSpecification() {
    return connectionPointSpecification;
  }

  public void setConnectionPointSpecification(@Nullable ConnectionPointSpecificationRef connectionPointSpecification) {
    this.connectionPointSpecification = connectionPointSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSpecificationRef endpointSpecificationRef = (EndpointSpecificationRef) o;
    return Objects.equals(this.atType, endpointSpecificationRef.atType) &&
        Objects.equals(this.atBaseType, endpointSpecificationRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, endpointSpecificationRef.atSchemaLocation) &&
        Objects.equals(this.href, endpointSpecificationRef.href) &&
        Objects.equals(this.id, endpointSpecificationRef.id) &&
        Objects.equals(this.name, endpointSpecificationRef.name) &&
        Objects.equals(this.atReferredType, endpointSpecificationRef.atReferredType) &&
        Objects.equals(this.role, endpointSpecificationRef.role) &&
        Objects.equals(this.isRoot, endpointSpecificationRef.isRoot) &&
        Objects.equals(this.connectionPointSpecification, endpointSpecificationRef.connectionPointSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, name, atReferredType, role, isRoot, connectionPointSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSpecificationRef {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    connectionPointSpecification: ").append(toIndentedString(connectionPointSpecification)).append("\n");
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

