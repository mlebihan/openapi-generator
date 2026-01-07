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
import org.openapitools.model.GeographicSubAddressUnitFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicSubAddressFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicSubAddressFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String buildingName;

  private @Nullable String levelNumber;

  private @Nullable String levelType;

  private @Nullable String name;

  private @Nullable String privateStreetName;

  private @Nullable String privateStreetNumber;

  @Valid
  private List<GeographicSubAddressUnitFVO> subUnit = new ArrayList<>();

  private @Nullable String subAddressType;

  public GeographicSubAddressFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicSubAddressFVO(String atType) {
    this.atType = atType;
  }

  public GeographicSubAddressFVO atType(String atType) {
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

  public GeographicSubAddressFVO atBaseType(@Nullable String atBaseType) {
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

  public GeographicSubAddressFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public GeographicSubAddressFVO href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Link to the subAddress
   * @return href
   */
  
  @Schema(name = "href", description = "Link to the subAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public GeographicSubAddressFVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Identifier of the subAddress
   * @return id
   */
  
  @Schema(name = "id", description = "Unique Identifier of the subAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public GeographicSubAddressFVO buildingName(@Nullable String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * allows for buildings that have well-known names
   * @return buildingName
   */
  
  @Schema(name = "buildingName", description = "allows for buildings that have well-known names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buildingName")
  public @Nullable String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(@Nullable String buildingName) {
    this.buildingName = buildingName;
  }

  public GeographicSubAddressFVO levelNumber(@Nullable String levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

  /**
   * used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
   * @return levelNumber
   */
  
  @Schema(name = "levelNumber", description = "used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levelNumber")
  public @Nullable String getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(@Nullable String levelNumber) {
    this.levelNumber = levelNumber;
  }

  public GeographicSubAddressFVO levelType(@Nullable String levelType) {
    this.levelType = levelType;
    return this;
  }

  /**
   * describes level types within a building
   * @return levelType
   */
  
  @Schema(name = "levelType", description = "describes level types within a building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("levelType")
  public @Nullable String getLevelType() {
    return levelType;
  }

  public void setLevelType(@Nullable String levelType) {
    this.levelType = levelType;
  }

  public GeographicSubAddressFVO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the subAddress to identify it with a meaningful identification
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the subAddress to identify it with a meaningful identification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public GeographicSubAddressFVO privateStreetName(@Nullable String privateStreetName) {
    this.privateStreetName = privateStreetName;
    return this;
  }

  /**
   * private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office.
   * @return privateStreetName
   */
  
  @Schema(name = "privateStreetName", description = "private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privateStreetName")
  public @Nullable String getPrivateStreetName() {
    return privateStreetName;
  }

  public void setPrivateStreetName(@Nullable String privateStreetName) {
    this.privateStreetName = privateStreetName;
  }

  public GeographicSubAddressFVO privateStreetNumber(@Nullable String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
    return this;
  }

  /**
   * private streets numbers internal to a private street
   * @return privateStreetNumber
   */
  
  @Schema(name = "privateStreetNumber", description = "private streets numbers internal to a private street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privateStreetNumber")
  public @Nullable String getPrivateStreetNumber() {
    return privateStreetNumber;
  }

  public void setPrivateStreetNumber(@Nullable String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
  }

  public GeographicSubAddressFVO subUnit(List<GeographicSubAddressUnitFVO> subUnit) {
    this.subUnit = subUnit;
    return this;
  }

  public GeographicSubAddressFVO addSubUnitItem(GeographicSubAddressUnitFVO subUnitItem) {
    if (this.subUnit == null) {
      this.subUnit = new ArrayList<>();
    }
    this.subUnit.add(subUnitItem);
    return this;
  }

  /**
   * Representation of a SubUnit. It is used for describing subunit within a subAddress e.g. BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
   * @return subUnit
   */
  @Valid 
  @Schema(name = "subUnit", description = "Representation of a SubUnit. It is used for describing subunit within a subAddress e.g. BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subUnit")
  public List<GeographicSubAddressUnitFVO> getSubUnit() {
    return subUnit;
  }

  public void setSubUnit(List<GeographicSubAddressUnitFVO> subUnit) {
    this.subUnit = subUnit;
  }

  public GeographicSubAddressFVO subAddressType(@Nullable String subAddressType) {
    this.subAddressType = subAddressType;
    return this;
  }

  /**
   * Type of subAddress : it can be a subunit or a private street
   * @return subAddressType
   */
  
  @Schema(name = "subAddressType", description = "Type of subAddress : it can be a subunit or a private street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subAddressType")
  public @Nullable String getSubAddressType() {
    return subAddressType;
  }

  public void setSubAddressType(@Nullable String subAddressType) {
    this.subAddressType = subAddressType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicSubAddressFVO geographicSubAddressFVO = (GeographicSubAddressFVO) o;
    return Objects.equals(this.atType, geographicSubAddressFVO.atType) &&
        Objects.equals(this.atBaseType, geographicSubAddressFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, geographicSubAddressFVO.atSchemaLocation) &&
        Objects.equals(this.href, geographicSubAddressFVO.href) &&
        Objects.equals(this.id, geographicSubAddressFVO.id) &&
        Objects.equals(this.buildingName, geographicSubAddressFVO.buildingName) &&
        Objects.equals(this.levelNumber, geographicSubAddressFVO.levelNumber) &&
        Objects.equals(this.levelType, geographicSubAddressFVO.levelType) &&
        Objects.equals(this.name, geographicSubAddressFVO.name) &&
        Objects.equals(this.privateStreetName, geographicSubAddressFVO.privateStreetName) &&
        Objects.equals(this.privateStreetNumber, geographicSubAddressFVO.privateStreetNumber) &&
        Objects.equals(this.subUnit, geographicSubAddressFVO.subUnit) &&
        Objects.equals(this.subAddressType, geographicSubAddressFVO.subAddressType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, buildingName, levelNumber, levelType, name, privateStreetName, privateStreetNumber, subUnit, subAddressType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSubAddressFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
    sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privateStreetName: ").append(toIndentedString(privateStreetName)).append("\n");
    sb.append("    privateStreetNumber: ").append(toIndentedString(privateStreetNumber)).append("\n");
    sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
    sb.append("    subAddressType: ").append(toIndentedString(subAddressType)).append("\n");
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

