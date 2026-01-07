package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EndpointSpecificationRefFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConnectionSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ConnectionSpecificationFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

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

  private AssociationTypeEnum associationType;

  @Valid
  private List<EndpointSpecificationRefFVO> endpointSpecification = new ArrayList<>();

  public ConnectionSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConnectionSpecificationFVO(String atType, AssociationTypeEnum associationType, List<EndpointSpecificationRefFVO> endpointSpecification) {
    this.atType = atType;
    this.associationType = associationType;
    this.endpointSpecification = endpointSpecification;
  }

  public ConnectionSpecificationFVO atType(String atType) {
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

  public ConnectionSpecificationFVO atBaseType(@Nullable String atBaseType) {
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

  public ConnectionSpecificationFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ConnectionSpecificationFVO id(@Nullable String id) {
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

  public ConnectionSpecificationFVO name(@Nullable String name) {
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

  public ConnectionSpecificationFVO associationType(AssociationTypeEnum associationType) {
    this.associationType = associationType;
    return this;
  }

  /**
   * Association type.
   * @return associationType
   */
  @NotNull 
  @Schema(name = "associationType", description = "Association type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("associationType")
  public AssociationTypeEnum getAssociationType() {
    return associationType;
  }

  public void setAssociationType(AssociationTypeEnum associationType) {
    this.associationType = associationType;
  }

  public ConnectionSpecificationFVO endpointSpecification(List<EndpointSpecificationRefFVO> endpointSpecification) {
    this.endpointSpecification = endpointSpecification;
    return this;
  }

  public ConnectionSpecificationFVO addEndpointSpecificationItem(EndpointSpecificationRefFVO endpointSpecificationItem) {
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
  @NotNull @Valid 
  @Schema(name = "endpointSpecification", description = "Specifications for resource graph vertices connected by this edge.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endpointSpecification")
  public List<EndpointSpecificationRefFVO> getEndpointSpecification() {
    return endpointSpecification;
  }

  public void setEndpointSpecification(List<EndpointSpecificationRefFVO> endpointSpecification) {
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
    ConnectionSpecificationFVO connectionSpecificationFVO = (ConnectionSpecificationFVO) o;
    return Objects.equals(this.atType, connectionSpecificationFVO.atType) &&
        Objects.equals(this.atBaseType, connectionSpecificationFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, connectionSpecificationFVO.atSchemaLocation) &&
        Objects.equals(this.id, connectionSpecificationFVO.id) &&
        Objects.equals(this.name, connectionSpecificationFVO.name) &&
        Objects.equals(this.associationType, connectionSpecificationFVO.associationType) &&
        Objects.equals(this.endpointSpecification, connectionSpecificationFVO.endpointSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, name, associationType, endpointSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionSpecificationFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
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

