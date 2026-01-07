package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicSubAddressUnitMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSubAddressUnitMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String subUnitNumber;

  private @Nullable String subUnitType;

  public GeographicSubAddressUnitMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSubAddressUnitMVO(String atType) {
    this.atType = atType;
  }

  public GeographicSubAddressUnitMVO atType(String atType) {
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

  public GeographicSubAddressUnitMVO atBaseType(@Nullable String atBaseType) {
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

  public GeographicSubAddressUnitMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public GeographicSubAddressUnitMVO subUnitNumber(@Nullable String subUnitNumber) {
    this.subUnitNumber = subUnitNumber;
    return this;
  }

  /**
   * The discriminator used for the subunit, often just a simple number but may also be a range.
   * @return subUnitNumber
   */
  
  @Schema(name = "subUnitNumber", description = "The discriminator used for the subunit, often just a simple number but may also be a range.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subUnitNumber")
  public @Nullable String getSubUnitNumber() {
    return subUnitNumber;
  }

  public void setSubUnitNumber(@Nullable String subUnitNumber) {
    this.subUnitNumber = subUnitNumber;
  }

  public GeographicSubAddressUnitMVO subUnitType(@Nullable String subUnitType) {
    this.subUnitType = subUnitType;
    return this;
  }

  /**
   * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF, RACK
   * @return subUnitType
   */
  
  @Schema(name = "subUnitType", description = "The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF, RACK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subUnitType")
  public @Nullable String getSubUnitType() {
    return subUnitType;
  }

  public void setSubUnitType(@Nullable String subUnitType) {
    this.subUnitType = subUnitType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSubAddressUnitMVO geographicSubAddressUnitMVO = (GeographicSubAddressUnitMVO) o;
    return Objects.equals(this.atType, geographicSubAddressUnitMVO.atType) &&
        Objects.equals(this.atBaseType, geographicSubAddressUnitMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, geographicSubAddressUnitMVO.atSchemaLocation) &&
        Objects.equals(this.subUnitNumber, geographicSubAddressUnitMVO.subUnitNumber) &&
        Objects.equals(this.subUnitType, geographicSubAddressUnitMVO.subUnitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, subUnitNumber, subUnitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSubAddressUnitMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    subUnitNumber: ").append(toIndentedString(subUnitNumber)).append("\n");
    sb.append("    subUnitType: ").append(toIndentedString(subUnitType)).append("\n");
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

