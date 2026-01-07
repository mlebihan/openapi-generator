package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * TaxDefinition
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class TaxDefinition {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable TimePeriod validFor;

  private @Nullable String jurisdictionName;

  private @Nullable String jurisdictionLevel;

  private @Nullable String taxType;

  public TaxDefinition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaxDefinition(String atType) {
    this.atType = atType;
  }

  public TaxDefinition atType(String atType) {
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

  public TaxDefinition atBaseType(@Nullable String atBaseType) {
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

  public TaxDefinition atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public TaxDefinition id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the tax.
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of the tax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public TaxDefinition name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Tax name.
   * @return name
   */
  
  @Schema(name = "name", description = "Tax name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TaxDefinition validFor(@Nullable TimePeriod validFor) {
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

  public TaxDefinition jurisdictionName(@Nullable String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
    return this;
  }

  /**
   * Name of the jurisdiction that levies the tax
   * @return jurisdictionName
   */
  
  @Schema(name = "jurisdictionName", example = "USA", description = "Name of the jurisdiction that levies the tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdictionName")
  public @Nullable String getJurisdictionName() {
    return jurisdictionName;
  }

  public void setJurisdictionName(@Nullable String jurisdictionName) {
    this.jurisdictionName = jurisdictionName;
  }

  public TaxDefinition jurisdictionLevel(@Nullable String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
    return this;
  }

  /**
   * Level of the jurisdiction that levies the tax
   * @return jurisdictionLevel
   */
  
  @Schema(name = "jurisdictionLevel", example = "Country", description = "Level of the jurisdiction that levies the tax", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdictionLevel")
  public @Nullable String getJurisdictionLevel() {
    return jurisdictionLevel;
  }

  public void setJurisdictionLevel(@Nullable String jurisdictionLevel) {
    this.jurisdictionLevel = jurisdictionLevel;
  }

  public TaxDefinition taxType(@Nullable String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Type of the tax.
   * @return taxType
   */
  
  @Schema(name = "taxType", example = "VAT", description = "Type of the tax.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxType")
  public @Nullable String getTaxType() {
    return taxType;
  }

  public void setTaxType(@Nullable String taxType) {
    this.taxType = taxType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxDefinition taxDefinition = (TaxDefinition) o;
    return Objects.equals(this.atType, taxDefinition.atType) &&
        Objects.equals(this.atBaseType, taxDefinition.atBaseType) &&
        Objects.equals(this.atSchemaLocation, taxDefinition.atSchemaLocation) &&
        Objects.equals(this.id, taxDefinition.id) &&
        Objects.equals(this.name, taxDefinition.name) &&
        Objects.equals(this.validFor, taxDefinition.validFor) &&
        Objects.equals(this.jurisdictionName, taxDefinition.jurisdictionName) &&
        Objects.equals(this.jurisdictionLevel, taxDefinition.jurisdictionLevel) &&
        Objects.equals(this.taxType, taxDefinition.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, name, validFor, jurisdictionName, jurisdictionLevel, taxType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxDefinition {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    jurisdictionName: ").append(toIndentedString(jurisdictionName)).append("\n");
    sb.append("    jurisdictionLevel: ").append(toIndentedString(jurisdictionLevel)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

