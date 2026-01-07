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
 * PartyCreditProfileFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PartyCreditProfileFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  private @Nullable String creditAgencyName;

  private @Nullable String creditAgencyType;

  private @Nullable String ratingReference;

  private @Nullable Integer ratingScore;

  private @Nullable TimePeriod validFor;

  public PartyCreditProfileFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PartyCreditProfileFVO(String atType) {
    this.atType = atType;
  }

  public PartyCreditProfileFVO atType(String atType) {
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

  public PartyCreditProfileFVO atBaseType(@Nullable String atBaseType) {
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

  public PartyCreditProfileFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public PartyCreditProfileFVO id(@Nullable String id) {
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

  public PartyCreditProfileFVO creditAgencyName(@Nullable String creditAgencyName) {
    this.creditAgencyName = creditAgencyName;
    return this;
  }

  /**
   * Name of the credit agency giving the score
   * @return creditAgencyName
   */
  
  @Schema(name = "creditAgencyName", description = "Name of the credit agency giving the score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditAgencyName")
  public @Nullable String getCreditAgencyName() {
    return creditAgencyName;
  }

  public void setCreditAgencyName(@Nullable String creditAgencyName) {
    this.creditAgencyName = creditAgencyName;
  }

  public PartyCreditProfileFVO creditAgencyType(@Nullable String creditAgencyType) {
    this.creditAgencyType = creditAgencyType;
    return this;
  }

  /**
   * Type of the credit agency giving the score
   * @return creditAgencyType
   */
  
  @Schema(name = "creditAgencyType", description = "Type of the credit agency giving the score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creditAgencyType")
  public @Nullable String getCreditAgencyType() {
    return creditAgencyType;
  }

  public void setCreditAgencyType(@Nullable String creditAgencyType) {
    this.creditAgencyType = creditAgencyType;
  }

  public PartyCreditProfileFVO ratingReference(@Nullable String ratingReference) {
    this.ratingReference = ratingReference;
    return this;
  }

  /**
   * Reference corresponding to the credit rating
   * @return ratingReference
   */
  
  @Schema(name = "ratingReference", description = "Reference corresponding to the credit rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingReference")
  public @Nullable String getRatingReference() {
    return ratingReference;
  }

  public void setRatingReference(@Nullable String ratingReference) {
    this.ratingReference = ratingReference;
  }

  public PartyCreditProfileFVO ratingScore(@Nullable Integer ratingScore) {
    this.ratingScore = ratingScore;
    return this;
  }

  /**
   * A measure of a party's creditworthiness calculated on the basis of a combination of factors such as their income and credit history
   * @return ratingScore
   */
  
  @Schema(name = "ratingScore", description = "A measure of a party's creditworthiness calculated on the basis of a combination of factors such as their income and credit history", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ratingScore")
  public @Nullable Integer getRatingScore() {
    return ratingScore;
  }

  public void setRatingScore(@Nullable Integer ratingScore) {
    this.ratingScore = ratingScore;
  }

  public PartyCreditProfileFVO validFor(@Nullable TimePeriod validFor) {
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
    PartyCreditProfileFVO partyCreditProfileFVO = (PartyCreditProfileFVO) o;
    return Objects.equals(this.atType, partyCreditProfileFVO.atType) &&
        Objects.equals(this.atBaseType, partyCreditProfileFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, partyCreditProfileFVO.atSchemaLocation) &&
        Objects.equals(this.id, partyCreditProfileFVO.id) &&
        Objects.equals(this.creditAgencyName, partyCreditProfileFVO.creditAgencyName) &&
        Objects.equals(this.creditAgencyType, partyCreditProfileFVO.creditAgencyType) &&
        Objects.equals(this.ratingReference, partyCreditProfileFVO.ratingReference) &&
        Objects.equals(this.ratingScore, partyCreditProfileFVO.ratingScore) &&
        Objects.equals(this.validFor, partyCreditProfileFVO.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, creditAgencyName, creditAgencyType, ratingReference, ratingScore, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyCreditProfileFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creditAgencyName: ").append(toIndentedString(creditAgencyName)).append("\n");
    sb.append("    creditAgencyType: ").append(toIndentedString(creditAgencyType)).append("\n");
    sb.append("    ratingReference: ").append(toIndentedString(ratingReference)).append("\n");
    sb.append("    ratingScore: ").append(toIndentedString(ratingScore)).append("\n");
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

