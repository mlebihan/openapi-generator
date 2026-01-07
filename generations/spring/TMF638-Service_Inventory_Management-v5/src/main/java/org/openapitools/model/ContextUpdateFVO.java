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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EntityRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRefFVO;
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
 * ContextUpdateFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ContextUpdateFVO {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime lastUpdate;

  private @Nullable String reason;

  @Valid
  private List<EntityRef> relatedEntity = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty = new ArrayList<>();

  public ContextUpdateFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContextUpdateFVO(String atType) {
    this.atType = atType;
  }

  public ContextUpdateFVO atType(String atType) {
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

  public ContextUpdateFVO atBaseType(@Nullable String atBaseType) {
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

  public ContextUpdateFVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ContextUpdateFVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the context update
   * @return id
   */
  
  @Schema(name = "id", description = "Identifier of the context update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ContextUpdateFVO lastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * The date and time the status/state last changed.
   * @return lastUpdate
   */
  @Valid 
  @Schema(name = "lastUpdate", description = "The date and time the status/state last changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdate")
  public @Nullable OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@Nullable OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ContextUpdateFVO reason(@Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason/context for the current value of the status/state.
   * @return reason
   */
  
  @Schema(name = "reason", description = "The reason/context for the current value of the status/state.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public @Nullable String getReason() {
    return reason;
  }

  public void setReason(@Nullable String reason) {
    this.reason = reason;
  }

  public ContextUpdateFVO relatedEntity(List<EntityRef> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public ContextUpdateFVO addRelatedEntityItem(EntityRef relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * A list of entities that represent observations, anomalies or managing entities etc associated to the current status/state value.
   * @return relatedEntity
   */
  @Valid 
  @Schema(name = "relatedEntity", description = "A list of entities that represent observations, anomalies or managing entities etc associated to the current status/state value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedEntity")
  public List<EntityRef> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<EntityRef> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public ContextUpdateFVO relatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ContextUpdateFVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRefFVO relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties associated to the current status/state value.
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "List of parties associated to the current status/state value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRefFVO> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRefFVO> relatedParty) {
    this.relatedParty = relatedParty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextUpdateFVO contextUpdateFVO = (ContextUpdateFVO) o;
    return Objects.equals(this.atType, contextUpdateFVO.atType) &&
        Objects.equals(this.atBaseType, contextUpdateFVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, contextUpdateFVO.atSchemaLocation) &&
        Objects.equals(this.id, contextUpdateFVO.id) &&
        Objects.equals(this.lastUpdate, contextUpdateFVO.lastUpdate) &&
        Objects.equals(this.reason, contextUpdateFVO.reason) &&
        Objects.equals(this.relatedEntity, contextUpdateFVO.relatedEntity) &&
        Objects.equals(this.relatedParty, contextUpdateFVO.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, lastUpdate, reason, relatedEntity, relatedParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextUpdateFVO {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

