package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PartyRefOrPartyRoleRefFVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RelatedPartyRefOrPartyRoleRefFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class RelatedPartyRefOrPartyRoleRefFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private String role;

  private @Nullable PartyRefOrPartyRoleRefFVO partyOrPartyRole;

  public RelatedPartyRefOrPartyRoleRefFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelatedPartyRefOrPartyRoleRefFVO(String atType, String role) {
    this.atType = atType;
    this.role = role;
  }

  public RelatedPartyRefOrPartyRoleRefFVO atType(String atType) {
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

  public RelatedPartyRefOrPartyRoleRefFVO atBaseType(@Nullable String atBaseType) {
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

  public RelatedPartyRefOrPartyRoleRefFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public RelatedPartyRefOrPartyRoleRefFVO role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'
   * @return role
   */
  @NotNull 
  @Schema(name = "role", description = "Role played by the related party or party role in the context of the specific entity it is linked to. Such as 'initiator', 'customer',  'salesAgent', 'user'", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPartyRefOrPartyRoleRefFVO partyOrPartyRole(@Nullable PartyRefOrPartyRoleRefFVO partyOrPartyRole) {
    this.partyOrPartyRole = partyOrPartyRole;
    return this;
  }

  /**
   * Get partyOrPartyRole
   * @return partyOrPartyRole
   */
  @Valid 
  @Schema(name = "partyOrPartyRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyOrPartyRole")
  public @Nullable PartyRefOrPartyRoleRefFVO getPartyOrPartyRole() {
    return partyOrPartyRole;
  }

  public void setPartyOrPartyRole(@Nullable PartyRefOrPartyRoleRefFVO partyOrPartyRole) {
    this.partyOrPartyRole = partyOrPartyRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPartyRefOrPartyRoleRefFVO relatedPartyRefOrPartyRoleRefFVO = (RelatedPartyRefOrPartyRoleRefFVO) o;
    return Objects.equals(this.atType, relatedPartyRefOrPartyRoleRefFVO.atType) &&
        Objects.equals(this.atBaseType, relatedPartyRefOrPartyRoleRefFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, relatedPartyRefOrPartyRoleRefFVO.atSchemaLocation) &&
        Objects.equals(this.role, relatedPartyRefOrPartyRoleRefFVO.role) &&
        Objects.equals(this.partyOrPartyRole, relatedPartyRefOrPartyRoleRefFVO.partyOrPartyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, role, partyOrPartyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRefOrPartyRoleRefFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    partyOrPartyRole: ").append(toIndentedString(partyOrPartyRole)).append("\n");
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

