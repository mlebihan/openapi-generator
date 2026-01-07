package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * RelatedContactMediumFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class RelatedContactMediumFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private String role;

  private ContactMedium contactMedium;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime relationDate;

  public RelatedContactMediumFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedContactMediumFVO(String atType, String role, ContactMedium contactMedium) {
    this.atType = atType;
    this.role = role;
    this.contactMedium = contactMedium;
  }

  public RelatedContactMediumFVO atType(String atType) {
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

  public RelatedContactMediumFVO atBaseType(@Nullable String atBaseType) {
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

  public RelatedContactMediumFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public RelatedContactMediumFVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the contact medium in the context of the specific entity it is linked to.
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "Role played by the contact medium in the context of the specific entity it is linked to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedContactMediumFVO contactMedium(ContactMedium contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  /**
   * Get contactMedium
   * @return contactMedium
   */
  @NotNull @Valid 
  @Schema(name = "contactMedium", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contactMedium")
  public ContactMedium getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(ContactMedium contactMedium) {
    this.contactMedium = contactMedium;
  }

  public RelatedContactMediumFVO relationDate(@Nullable OffsetDateTime relationDate) {
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
    RelatedContactMediumFVO relatedContactMediumFVO = (RelatedContactMediumFVO) o;
    return Objects.equals(this.atType, relatedContactMediumFVO.atType) &&
        Objects.equals(this.atBaseType, relatedContactMediumFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedContactMediumFVO.atSchemaLocation) &&
        Objects.equals(this.role, relatedContactMediumFVO.role) &&
        Objects.equals(this.contactMedium, relatedContactMediumFVO.contactMedium) &&
        Objects.equals(this.relationDate, relatedContactMediumFVO.relationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, role, contactMedium, relationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedContactMediumFVO {\n");
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

