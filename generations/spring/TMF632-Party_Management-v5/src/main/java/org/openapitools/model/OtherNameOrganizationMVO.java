package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.TimePeriod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OtherNameOrganizationMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class OtherNameOrganizationMVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String tradingName;

  private @Nullable String nameType;

  private @Nullable String name;

  private @Nullable TimePeriod validFor;

  public OtherNameOrganizationMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OtherNameOrganizationMVO(String atType) {
    this.atType = atType;
  }

  public OtherNameOrganizationMVO atType(String atType) {
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

  public OtherNameOrganizationMVO atBaseType(@Nullable String atBaseType) {
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

  public OtherNameOrganizationMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public OtherNameOrganizationMVO tradingName(@Nullable String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

  /**
   * The name that the organization trades under
   * @return tradingName
   */
  
  @Schema(name = "tradingName", description = "The name that the organization trades under", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tradingName")
  public @Nullable String getTradingName() {
    return tradingName;
  }

  public void setTradingName(@Nullable String tradingName) {
    this.tradingName = tradingName;
  }

  public OtherNameOrganizationMVO nameType(@Nullable String nameType) {
    this.nameType = nameType;
    return this;
  }

  /**
   * Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh
   * @return nameType
   */
  
  @Schema(name = "nameType", description = "Co. , Inc. , Ltd. , Pty Ltd. , Plc; , Gmbh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameType")
  public @Nullable String getNameType() {
    return nameType;
  }

  public void setNameType(@Nullable String nameType) {
    this.nameType = nameType;
  }

  public OtherNameOrganizationMVO name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Organization name (department name for example)
   * @return name
   */
  
  @Schema(name = "name", description = "Organization name (department name for example)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public OtherNameOrganizationMVO validFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public @Nullable TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherNameOrganizationMVO otherNameOrganizationMVO = (OtherNameOrganizationMVO) o;
    return Objects.equals(this.atType, otherNameOrganizationMVO.atType) &&
        Objects.equals(this.atBaseType, otherNameOrganizationMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, otherNameOrganizationMVO.atSchemaLocation) &&
        Objects.equals(this.tradingName, otherNameOrganizationMVO.tradingName) &&
        Objects.equals(this.nameType, otherNameOrganizationMVO.nameType) &&
        Objects.equals(this.name, otherNameOrganizationMVO.name) &&
        Objects.equals(this.validFor, otherNameOrganizationMVO.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, tradingName, nameType, name, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherNameOrganizationMVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

