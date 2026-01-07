package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IndividualIdentification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class IndividualIdentification {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String identificationId;

  private @Nullable String issuingAuthority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime issuingDate;

  private @Nullable String identificationType;

  private @Nullable TimePeriod validFor;

  private @Nullable AttachmentRefOrValue attachment;

  public IndividualIdentification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IndividualIdentification(String atType) {
    this.atType = atType;
  }

  public IndividualIdentification atType(String atType) {
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

  public IndividualIdentification atBaseType(@Nullable String atBaseType) {
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

  public IndividualIdentification atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public IndividualIdentification identificationId(@Nullable String identificationId) {
    this.identificationId = identificationId;
    return this;
  }

  /**
   * Identifier
   * @return identificationId
   */
  
  @Schema(name = "identificationId", description = "Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identificationId")
  public @Nullable String getIdentificationId() {
    return identificationId;
  }

  public void setIdentificationId(@Nullable String identificationId) {
    this.identificationId = identificationId;
  }

  public IndividualIdentification issuingAuthority(@Nullable String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

  /**
   * Authority which has issued the identifier, such as: social security, town hall
   * @return issuingAuthority
   */
  
  @Schema(name = "issuingAuthority", description = "Authority which has issued the identifier, such as: social security, town hall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingAuthority")
  public @Nullable String getIssuingAuthority() {
    return issuingAuthority;
  }

  public void setIssuingAuthority(@Nullable String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }

  public IndividualIdentification issuingDate(@Nullable OffsetDateTime issuingDate) {
    this.issuingDate = issuingDate;
    return this;
  }

  /**
   * Date at which the identifier was issued
   * @return issuingDate
   */
  @Valid 
  @Schema(name = "issuingDate", description = "Date at which the identifier was issued", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuingDate")
  public @Nullable OffsetDateTime getIssuingDate() {
    return issuingDate;
  }

  public void setIssuingDate(@Nullable OffsetDateTime issuingDate) {
    this.issuingDate = issuingDate;
  }

  public IndividualIdentification identificationType(@Nullable String identificationType) {
    this.identificationType = identificationType;
    return this;
  }

  /**
   * Identification type (passport, national identity card, drivers license, social security number, birth certificate)
   * @return identificationType
   */
  
  @Schema(name = "identificationType", description = "Identification type (passport, national identity card, drivers license, social security number, birth certificate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identificationType")
  public @Nullable String getIdentificationType() {
    return identificationType;
  }

  public void setIdentificationType(@Nullable String identificationType) {
    this.identificationType = identificationType;
  }

  public IndividualIdentification validFor(@Nullable TimePeriod validFor) {
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

  public IndividualIdentification attachment(@Nullable AttachmentRefOrValue attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Get attachment
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public @Nullable AttachmentRefOrValue getAttachment() {
    return attachment;
  }

  public void setAttachment(@Nullable AttachmentRefOrValue attachment) {
    this.attachment = attachment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualIdentification individualIdentification = (IndividualIdentification) o;
    return Objects.equals(this.atType, individualIdentification.atType) &&
        Objects.equals(this.atBaseType, individualIdentification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, individualIdentification.atSchemaLocation) &&
        Objects.equals(this.identificationId, individualIdentification.identificationId) &&
        Objects.equals(this.issuingAuthority, individualIdentification.issuingAuthority) &&
        Objects.equals(this.issuingDate, individualIdentification.issuingDate) &&
        Objects.equals(this.identificationType, individualIdentification.identificationType) &&
        Objects.equals(this.validFor, individualIdentification.validFor) &&
        Objects.equals(this.attachment, individualIdentification.attachment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, identificationId, issuingAuthority, issuingDate, identificationType, validFor, attachment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualIdentification {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    identificationId: ").append(toIndentedString(identificationId)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    identificationType: ").append(toIndentedString(identificationType)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

