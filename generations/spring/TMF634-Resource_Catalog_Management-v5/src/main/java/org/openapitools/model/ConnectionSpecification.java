package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EndpointSpecificationRef;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConnectionSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ConnectionSpecification {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String name;

  /**
   * Association type.
   */
  public enum AssociationTypeEnum {
    POINTTO_POINT("pointtoPoint"),
    
    POINTTO_MULTIPOINT("pointtoMultipoint");

    private final String value;

    AssociationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssociationTypeEnum fromValue(String value) {
      for (AssociationTypeEnum b : AssociationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable AssociationTypeEnum associationType;

  @Valid
  private List<EndpointSpecificationRef> endpointSpecification = new ArrayList<>();

  public ConnectionSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConnectionSpecification(String atType) {
    this.atType = atType;
  }

  public ConnectionSpecification atType(String atType) {
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

  public ConnectionSpecification atBaseType(@Nullable String atBaseType) {
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

  public ConnectionSpecification atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ConnectionSpecification href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public ConnectionSpecification id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ConnectionSpecification name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Descriptive name for graph edge specification.
   * @return name
   */
  
  @Schema(name = "name", description = "Descriptive name for graph edge specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ConnectionSpecification associationType(@Nullable AssociationTypeEnum associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Association type.
   * @return associationType
   */
  
  @Schema(name = "associationType", description = "Association type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("associationType")
  public @Nullable AssociationTypeEnum getAssociationType() {
    return associationType;
  }

  public void setAssociationType(@Nullable AssociationTypeEnum associationType) {
    this.associationType = associationType;
  }

  public ConnectionSpecification endpointSpecification(List<EndpointSpecificationRef> endpointSpecification) {
    this.endpointSpecification = endpointSpecification;
    return this;
  }

  public ConnectionSpecification addEndpointSpecificationItem(EndpointSpecificationRef endpointSpecificationItem) {
    if (this.endpointSpecification == null) {
      this.endpointSpecification = new ArrayList<>();
    }
    this.endpointSpecification.add(endpointSpecificationItem);
    return this;
  }

  /**
   * Specifications for resource graph vertices connected by this edge.
   * @return endpointSpecification
   */
  @Valid 
  @Schema(name = "endpointSpecification", description = "Specifications for resource graph vertices connected by this edge.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endpointSpecification")
  public List<EndpointSpecificationRef> getEndpointSpecification() {
    return endpointSpecification;
  }

  public void setEndpointSpecification(List<EndpointSpecificationRef> endpointSpecification) {
    this.endpointSpecification = endpointSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionSpecification connectionSpecification = (ConnectionSpecification) o;
    return Objects.equals(this.atType, connectionSpecification.atType) &&
        Objects.equals(this.atBaseType, connectionSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, connectionSpecification.atSchemaLocation) &&
        Objects.equals(this.href, connectionSpecification.href) &&
        Objects.equals(this.id, connectionSpecification.id) &&
        Objects.equals(this.name, connectionSpecification.name) &&
        Objects.equals(this.associationType, connectionSpecification.associationType) &&
        Objects.equals(this.endpointSpecification, connectionSpecification.endpointSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, name, associationType, endpointSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionSpecification {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    endpointSpecification: ").append(toIndentedString(endpointSpecification)).append("\n");
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

