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
import org.openapitools.model.Characteristic;
import org.openapitools.model.ResourceRefOrValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResourceRelationship
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:43.055954217+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceRelationship {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private String id;

  private @Nullable String name;

  private @Nullable String atReferredType;

  @Valid
  private List<Characteristic> resourceRelationshipCharacteristic = new ArrayList<>();

  private @Nullable ResourceRefOrValue resource;

  private @Nullable String relationshipType;

  public ResourceRelationship() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceRelationship(String atType, String id) {
    this.atType = atType;
    this.id = id;
  }

  public ResourceRelationship atType(String atType) {
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

  public ResourceRelationship atBaseType(@Nullable String atBaseType) {
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

  public ResourceRelationship atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ResourceRelationship href(@Nullable String href) {
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

  public ResourceRelationship id(String id) {
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

  public ResourceRelationship name(@Nullable String name) {
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

  public ResourceRelationship atReferredType(@Nullable String atReferredType) {
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

  public ResourceRelationship resourceRelationshipCharacteristic(List<Characteristic> resourceRelationshipCharacteristic) {
    this.resourceRelationshipCharacteristic = resourceRelationshipCharacteristic;
    return this;
  }

  public ResourceRelationship addResourceRelationshipCharacteristicItem(Characteristic resourceRelationshipCharacteristicItem) {
    if (this.resourceRelationshipCharacteristic == null) {
      this.resourceRelationshipCharacteristic = new ArrayList<>();
    }
    this.resourceRelationshipCharacteristic.add(resourceRelationshipCharacteristicItem);
    return this;
  }

  /**
   * Get resourceRelationshipCharacteristic
   * @return resourceRelationshipCharacteristic
   */
  @Valid 
  @Schema(name = "resourceRelationshipCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceRelationshipCharacteristic")
  public List<Characteristic> getResourceRelationshipCharacteristic() {
    return resourceRelationshipCharacteristic;
  }

  public void setResourceRelationshipCharacteristic(List<Characteristic> resourceRelationshipCharacteristic) {
    this.resourceRelationshipCharacteristic = resourceRelationshipCharacteristic;
  }

  public ResourceRelationship resource(@Nullable ResourceRefOrValue resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public @Nullable ResourceRefOrValue getResource() {
    return resource;
  }

  public void setResource(@Nullable ResourceRefOrValue resource) {
    this.resource = resource;
  }

  public ResourceRelationship relationshipType(@Nullable String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

  /**
   * Type of the resource relationship, such as [bundled] if the resource is a bundle and you want to describe the bundled resources inside this bundle; [reliesOn] if the resource needs another already owned resource to rely on (eg: an option on an already owned mobile access resource) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful
   * @return relationshipType
   */
  
  @Schema(name = "relationshipType", description = "Type of the resource relationship, such as [bundled] if the resource is a bundle and you want to describe the bundled resources inside this bundle; [reliesOn] if the resource needs another already owned resource to rely on (eg: an option on an already owned mobile access resource) [targets] or [isTargeted] (depending on the way of expressing the link) for any other kind of links that may be useful", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResourceRelationship resourceRelationship = (ResourceRelationship) o;
    return Objects.equals(this.atType, resourceRelationship.atType) &&
        Objects.equals(this.atBaseType, resourceRelationship.atBaseType) &&
        Objects.equals(this.atSchemaLocation, resourceRelationship.atSchemaLocation) &&
        Objects.equals(this.href, resourceRelationship.href) &&
        Objects.equals(this.id, resourceRelationship.id) &&
        Objects.equals(this.name, resourceRelationship.name) &&
        Objects.equals(this.atReferredType, resourceRelationship.atReferredType) &&
        Objects.equals(this.resourceRelationshipCharacteristic, resourceRelationship.resourceRelationshipCharacteristic) &&
        Objects.equals(this.resource, resourceRelationship.resource) &&
        Objects.equals(this.relationshipType, resourceRelationship.relationshipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, name, atReferredType, resourceRelationshipCharacteristic, resource, relationshipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRelationship {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
    sb.append("    resourceRelationshipCharacteristic: ").append(toIndentedString(resourceRelationshipCharacteristic)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

