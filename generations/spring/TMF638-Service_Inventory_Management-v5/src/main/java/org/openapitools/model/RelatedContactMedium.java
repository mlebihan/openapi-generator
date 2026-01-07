package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import org.openapitools.model.ContactMedium;
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
 * RelatedContactMedium
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class RelatedContactMedium {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String role;

  private @Nullable ContactMedium contactMedium;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime relationDate;

  public RelatedContactMedium() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedContactMedium(String atType) {
    this.atType = atType;
  }

  public RelatedContactMedium atType(String atType) {
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

  public RelatedContactMedium atBaseType(@Nullable String atBaseType) {
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

  public RelatedContactMedium atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public RelatedContactMedium role(@Nullable String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the contact medium in the context of the specific entity it is linked to.
   * @return role
   */
  
  @Schema(name = "role", description = "Role played by the contact medium in the context of the specific entity it is linked to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable String getRole() {
    return role;
  }

  public void setRole(@Nullable String role) {
    this.role = role;
  }

  public RelatedContactMedium contactMedium(@Nullable ContactMedium contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
   */
  @Valid 
  @Schema(name = "contactMedium", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactMedium")
  public @Nullable ContactMedium getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(@Nullable ContactMedium contactMedium) {
    this.contactMedium = contactMedium;
  }

  public RelatedContactMedium relationDate(@Nullable OffsetDateTime relationDate) {
    this.relationDate = relationDate;
    return this;
  }

  /**
   * Date and time when related contact medium was created.
   * @return relationDate
   */
  @Valid 
  @Schema(name = "relationDate", description = "Date and time when related contact medium was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationDate")
  public @Nullable OffsetDateTime getRelationDate() {
    return relationDate;
  }

  public void setRelationDate(@Nullable OffsetDateTime relationDate) {
    this.relationDate = relationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedContactMedium relatedContactMedium = (RelatedContactMedium) o;
    return Objects.equals(this.atType, relatedContactMedium.atType) &&
        Objects.equals(this.atBaseType, relatedContactMedium.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedContactMedium.atSchemaLocation) &&
        Objects.equals(this.role, relatedContactMedium.role) &&
        Objects.equals(this.contactMedium, relatedContactMedium.contactMedium) &&
        Objects.equals(this.relationDate, relatedContactMedium.relationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, role, contactMedium, relationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedContactMedium {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    relationDate: ").append(toIndentedString(relationDate)).append("\n");
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

