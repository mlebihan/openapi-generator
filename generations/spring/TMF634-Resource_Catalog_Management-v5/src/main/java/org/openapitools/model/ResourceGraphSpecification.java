package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectionSpecification;
import org.openapitools.model.ResourceGraphSpecificationRelationship;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceGraphSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceGraphSpecification {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable String description;

  @Valid
  private List<@Valid ResourceGraphSpecificationRelationship> graphSpecificationRelationship = new ArrayList<>();

  @Valid
  private List<ConnectionSpecification> connectionSpecification = new ArrayList<>();

  public ResourceGraphSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceGraphSpecification(String atType) {
    this.atType = atType;
  }

  public ResourceGraphSpecification atType(String atType) {
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

  public ResourceGraphSpecification atBaseType(@Nullable String atBaseType) {
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

  public ResourceGraphSpecification atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ResourceGraphSpecification href(@Nullable String href) {
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

  public ResourceGraphSpecification id(@Nullable String id) {
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

  public ResourceGraphSpecification name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Descriptive name for the resource graph specification.
   * @return name
   */
  
  @Schema(name = "name", description = "Descriptive name for the resource graph specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ResourceGraphSpecification description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the resource graph specification.
   * @return description
   */
  
  @Schema(name = "description", description = "Description of the resource graph specification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ResourceGraphSpecification graphSpecificationRelationship(List<@Valid ResourceGraphSpecificationRelationship> graphSpecificationRelationship) {
    this.graphSpecificationRelationship = graphSpecificationRelationship;
    return this;
  }

  public ResourceGraphSpecification addGraphSpecificationRelationshipItem(ResourceGraphSpecificationRelationship graphSpecificationRelationshipItem) {
    if (this.graphSpecificationRelationship == null) {
      this.graphSpecificationRelationship = new ArrayList<>();
    }
    this.graphSpecificationRelationship.add(graphSpecificationRelationshipItem);
    return this;
  }

  /**
   * Relationships to other resource graph specifications.
   * @return graphSpecificationRelationship
   */
  @Valid 
  @Schema(name = "graphSpecificationRelationship", description = "Relationships to other resource graph specifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("graphSpecificationRelationship")
  public List<@Valid ResourceGraphSpecificationRelationship> getGraphSpecificationRelationship() {
    return graphSpecificationRelationship;
  }

  public void setGraphSpecificationRelationship(List<@Valid ResourceGraphSpecificationRelationship> graphSpecificationRelationship) {
    this.graphSpecificationRelationship = graphSpecificationRelationship;
  }

  public ResourceGraphSpecification connectionSpecification(List<ConnectionSpecification> connectionSpecification) {
    this.connectionSpecification = connectionSpecification;
    return this;
  }

  public ResourceGraphSpecification addConnectionSpecificationItem(ConnectionSpecification connectionSpecificationItem) {
    if (this.connectionSpecification == null) {
      this.connectionSpecification = new ArrayList<>();
    }
    this.connectionSpecification.add(connectionSpecificationItem);
    return this;
  }

  /**
   * Resource graph edge specifications.
   * @return connectionSpecification
   */
  @Valid 
  @Schema(name = "connectionSpecification", description = "Resource graph edge specifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionSpecification")
  public List<ConnectionSpecification> getConnectionSpecification() {
    return connectionSpecification;
  }

  public void setConnectionSpecification(List<ConnectionSpecification> connectionSpecification) {
    this.connectionSpecification = connectionSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceGraphSpecification resourceGraphSpecification = (ResourceGraphSpecification) o;
    return Objects.equals(this.atType, resourceGraphSpecification.atType) &&
        Objects.equals(this.atBaseType, resourceGraphSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceGraphSpecification.atSchemaLocation) &&
        Objects.equals(this.href, resourceGraphSpecification.href) &&
        Objects.equals(this.id, resourceGraphSpecification.id) &&
        Objects.equals(this.name, resourceGraphSpecification.name) &&
        Objects.equals(this.description, resourceGraphSpecification.description) &&
        Objects.equals(this.graphSpecificationRelationship, resourceGraphSpecification.graphSpecificationRelationship) &&
        Objects.equals(this.connectionSpecification, resourceGraphSpecification.connectionSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, name, description, graphSpecificationRelationship, connectionSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceGraphSpecification {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    graphSpecificationRelationship: ").append(toIndentedString(graphSpecificationRelationship)).append("\n");
    sb.append("    connectionSpecification: ").append(toIndentedString(connectionSpecification)).append("\n");
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

