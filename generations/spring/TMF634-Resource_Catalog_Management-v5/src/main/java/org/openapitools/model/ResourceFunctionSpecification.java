package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.CharacteristicSpecification;
import org.openapitools.model.ConnectionPointSpecificationRef;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.FeatureSpecification;
import org.openapitools.model.IntentSpecificationRef;
import org.openapitools.model.LogicalResourceSpecification;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.ResourceGraphSpecification;
import org.openapitools.model.ResourceSpecificationRelationship;
import org.openapitools.model.TargetResourceSchema;
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
 * ResourceFunctionSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ResourceFunctionSpecification extends LogicalResourceSpecification {

  @Valid
  private List<ConnectionPointSpecificationRef> connectionPointSpecification = new ArrayList<>();

  @Valid
  private List<ResourceGraphSpecification> connectivitySpecification = new ArrayList<>();

  public ResourceFunctionSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceFunctionSpecification(String atType) {
    super(atType);
  }

  public ResourceFunctionSpecification connectionPointSpecification(List<ConnectionPointSpecificationRef> connectionPointSpecification) {
    this.connectionPointSpecification = connectionPointSpecification;
    return this;
  }

  public ResourceFunctionSpecification addConnectionPointSpecificationItem(ConnectionPointSpecificationRef connectionPointSpecificationItem) {
    if (this.connectionPointSpecification == null) {
      this.connectionPointSpecification = new ArrayList<>();
    }
    this.connectionPointSpecification.add(connectionPointSpecificationItem);
    return this;
  }

  /**
   * External connection point specifications. These are the service access points (SAP) where inputs and outputs of the function are available.
   * @return connectionPointSpecification
   */
  @Valid 
  @Schema(name = "connectionPointSpecification", description = "External connection point specifications. These are the service access points (SAP) where inputs and outputs of the function are available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionPointSpecification")
  public List<ConnectionPointSpecificationRef> getConnectionPointSpecification() {
    return connectionPointSpecification;
  }

  public void setConnectionPointSpecification(List<ConnectionPointSpecificationRef> connectionPointSpecification) {
    this.connectionPointSpecification = connectionPointSpecification;
  }

  public ResourceFunctionSpecification connectivitySpecification(List<ResourceGraphSpecification> connectivitySpecification) {
    this.connectivitySpecification = connectivitySpecification;
    return this;
  }

  public ResourceFunctionSpecification addConnectivitySpecificationItem(ResourceGraphSpecification connectivitySpecificationItem) {
    if (this.connectivitySpecification == null) {
      this.connectivitySpecification = new ArrayList<>();
    }
    this.connectivitySpecification.add(connectivitySpecificationItem);
    return this;
  }

  /**
   * Internal connectivity potential specifications.
   * @return connectivitySpecification
   */
  @Valid 
  @Schema(name = "connectivitySpecification", description = "Internal connectivity potential specifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectivitySpecification")
  public List<ResourceGraphSpecification> getConnectivitySpecification() {
    return connectivitySpecification;
  }

  public void setConnectivitySpecification(List<ResourceGraphSpecification> connectivitySpecification) {
    this.connectivitySpecification = connectivitySpecification;
  }


  public ResourceFunctionSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ResourceFunctionSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ResourceFunctionSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ResourceFunctionSpecification href(String href) {
    super.href(href);
    return this;
  }

  public ResourceFunctionSpecification id(String id) {
    super.id(id);
    return this;
  }

  public ResourceFunctionSpecification description(String description) {
    super.description(description);
    return this;
  }

  public ResourceFunctionSpecification version(String version) {
    super.version(version);
    return this;
  }

  public ResourceFunctionSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public ResourceFunctionSpecification isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public ResourceFunctionSpecification lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public ResourceFunctionSpecification lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public ResourceFunctionSpecification name(String name) {
    super.name(name);
    return this;
  }

  public ResourceFunctionSpecification category(String category) {
    super.category(category);
    return this;
  }

  public ResourceFunctionSpecification targetResourceSchema(TargetResourceSchema targetResourceSchema) {
    super.targetResourceSchema(targetResourceSchema);
    return this;
  }

  public ResourceFunctionSpecification featureSpecification(List<FeatureSpecification> featureSpecification) {
    super.featureSpecification(featureSpecification);
    return this;
  }

  public ResourceFunctionSpecification addFeatureSpecificationItem(FeatureSpecification featureSpecificationItem) {
    super.addFeatureSpecificationItem(featureSpecificationItem);
    return this;
  }

  public ResourceFunctionSpecification attachment(List<@Valid AttachmentRefOrValue> attachment) {
    super.attachment(attachment);
    return this;
  }

  public ResourceFunctionSpecification addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public ResourceFunctionSpecification relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ResourceFunctionSpecification addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ResourceFunctionSpecification resourceSpecCharacteristic(List<CharacteristicSpecification> resourceSpecCharacteristic) {
    super.resourceSpecCharacteristic(resourceSpecCharacteristic);
    return this;
  }

  public ResourceFunctionSpecification addResourceSpecCharacteristicItem(CharacteristicSpecification resourceSpecCharacteristicItem) {
    super.addResourceSpecCharacteristicItem(resourceSpecCharacteristicItem);
    return this;
  }

  public ResourceFunctionSpecification resourceSpecRelationship(List<ResourceSpecificationRelationship> resourceSpecRelationship) {
    super.resourceSpecRelationship(resourceSpecRelationship);
    return this;
  }

  public ResourceFunctionSpecification addResourceSpecRelationshipItem(ResourceSpecificationRelationship resourceSpecRelationshipItem) {
    super.addResourceSpecRelationshipItem(resourceSpecRelationshipItem);
    return this;
  }

  public ResourceFunctionSpecification intentSpecification(IntentSpecificationRef intentSpecification) {
    super.intentSpecification(intentSpecification);
    return this;
  }

  public ResourceFunctionSpecification externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public ResourceFunctionSpecification addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
    super.addExternalIdentifierItem(externalIdentifierItem);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceFunctionSpecification resourceFunctionSpecification = (ResourceFunctionSpecification) o;
    return Objects.equals(this.connectionPointSpecification, resourceFunctionSpecification.connectionPointSpecification) &&
        Objects.equals(this.connectivitySpecification, resourceFunctionSpecification.connectivitySpecification) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionPointSpecification, connectivitySpecification, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceFunctionSpecification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionPointSpecification: ").append(toIndentedString(connectionPointSpecification)).append("\n");
    sb.append("    connectivitySpecification: ").append(toIndentedString(connectivitySpecification)).append("\n");
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

