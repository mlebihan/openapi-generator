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
 * CharacteristicValueSpecificationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CharacteristicValueSpecificationFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String valueType;

  private @Nullable Boolean isDefault;

  private @Nullable String unitOfMeasure;

  private @Nullable TimePeriod validFor;

  private @Nullable Integer valueFrom;

  private @Nullable Integer valueTo;

  private @Nullable String rangeInterval;

  private @Nullable String regex;

  public CharacteristicValueSpecificationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicValueSpecificationFVO(String atType) {
    this.atType = atType;
  }

  public CharacteristicValueSpecificationFVO atType(String atType) {
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

  public CharacteristicValueSpecificationFVO atBaseType(@Nullable String atBaseType) {
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

  public CharacteristicValueSpecificationFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public CharacteristicValueSpecificationFVO valueType(@Nullable String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic value can take on, such as numeric, text and so forth
   * @return valueType
   */
  
  @Schema(name = "valueType", description = "A kind of value that the characteristic value can take on, such as numeric, text and so forth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueType")
  public @Nullable String getValueType() {
    return valueType;
  }

  public void setValueType(@Nullable String valueType) {
    this.valueType = valueType;
  }

  public CharacteristicValueSpecificationFVO isDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * If true, the Boolean Indicates if the value is the default value for a characteristic
   * @return isDefault
   */
  
  @Schema(name = "isDefault", description = "If true, the Boolean Indicates if the value is the default value for a characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isDefault")
  public @Nullable Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public CharacteristicValueSpecificationFVO unitOfMeasure(@Nullable String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.
   * @return unitOfMeasure
   */
  
  @Schema(name = "unitOfMeasure", description = "A length, surface, volume, dry measure, liquid measure, money, weight, time, and the like. In general, a determinate quantity or magnitude of the kind designated, taken as a standard of comparison for others of the same kind, in assigning to them numerical values, as 1 foot, 1 yard, 1 mile, 1 square foot.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitOfMeasure")
  public @Nullable String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(@Nullable String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public CharacteristicValueSpecificationFVO validFor(@Nullable TimePeriod validFor) {
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

  public CharacteristicValueSpecificationFVO valueFrom(@Nullable Integer valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * The low range value that a characteristic can take on
   * @return valueFrom
   */
  
  @Schema(name = "valueFrom", description = "The low range value that a characteristic can take on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueFrom")
  public @Nullable Integer getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(@Nullable Integer valueFrom) {
    this.valueFrom = valueFrom;
  }

  public CharacteristicValueSpecificationFVO valueTo(@Nullable Integer valueTo) {
    this.valueTo = valueTo;
    return this;
  }

  /**
   * The upper range value that a characteristic can take on
   * @return valueTo
   */
  
  @Schema(name = "valueTo", description = "The upper range value that a characteristic can take on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueTo")
  public @Nullable Integer getValueTo() {
    return valueTo;
  }

  public void setValueTo(@Nullable Integer valueTo) {
    this.valueTo = valueTo;
  }

  public CharacteristicValueSpecificationFVO rangeInterval(@Nullable String rangeInterval) {
    this.rangeInterval = rangeInterval;
    return this;
  }

  /**
   * An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".
   * @return rangeInterval
   */
  
  @Schema(name = "rangeInterval", description = "An indicator that specifies the inclusion or exclusion of the valueFrom and valueTo attributes. If applicable, possible values are \"open\", \"closed\", \"closedBottom\" and \"closedTop\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rangeInterval")
  public @Nullable String getRangeInterval() {
    return rangeInterval;
  }

  public void setRangeInterval(@Nullable String rangeInterval) {
    this.rangeInterval = rangeInterval;
  }

  public CharacteristicValueSpecificationFVO regex(@Nullable String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A regular expression constraint for given value
   * @return regex
   */
  
  @Schema(name = "regex", description = "A regular expression constraint for given value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regex")
  public @Nullable String getRegex() {
    return regex;
  }

  public void setRegex(@Nullable String regex) {
    this.regex = regex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicValueSpecificationFVO characteristicValueSpecificationFVO = (CharacteristicValueSpecificationFVO) o;
    return Objects.equals(this.atType, characteristicValueSpecificationFVO.atType) &&
        Objects.equals(this.atBaseType, characteristicValueSpecificationFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicValueSpecificationFVO.atSchemaLocation) &&
        Objects.equals(this.valueType, characteristicValueSpecificationFVO.valueType) &&
        Objects.equals(this.isDefault, characteristicValueSpecificationFVO.isDefault) &&
        Objects.equals(this.unitOfMeasure, characteristicValueSpecificationFVO.unitOfMeasure) &&
        Objects.equals(this.validFor, characteristicValueSpecificationFVO.validFor) &&
        Objects.equals(this.valueFrom, characteristicValueSpecificationFVO.valueFrom) &&
        Objects.equals(this.valueTo, characteristicValueSpecificationFVO.valueTo) &&
        Objects.equals(this.rangeInterval, characteristicValueSpecificationFVO.rangeInterval) &&
        Objects.equals(this.regex, characteristicValueSpecificationFVO.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, valueType, isDefault, unitOfMeasure, validFor, valueFrom, valueTo, rangeInterval, regex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicValueSpecificationFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
    sb.append("    valueTo: ").append(toIndentedString(valueTo)).append("\n");
    sb.append("    rangeInterval: ").append(toIndentedString(rangeInterval)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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

