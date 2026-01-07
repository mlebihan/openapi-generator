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
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.FeatureSpecification;
import org.openapitools.model.IntentSpecificationRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.ResourceSpecification;
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
 * PhysicalResourceSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PhysicalResourceSpecification extends ResourceSpecification {

  private @Nullable String model;

  private @Nullable String part;

  private @Nullable String sku;

  private @Nullable String vendor;

  public PhysicalResourceSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PhysicalResourceSpecification(String atType) {
    super(atType);
  }

  public PhysicalResourceSpecification model(@Nullable String model) {
    this.model = model;
    return this;
  }

  /**
   * This is a string that represents a manufacturer-allocated number used to identify the general type and/or category of the hardware item. This, in combination with the Part and the Vendor, identify different types of hardware items. The SerialNumber can then be used to differentiate between different instances of the same type of hardware item. This is an optional attribute.
   * @return model
   */
  
  @Schema(name = "model", description = "This is a string that represents a manufacturer-allocated number used to identify the general type and/or category of the hardware item. This, in combination with the Part and the Vendor, identify different types of hardware items. The SerialNumber can then be used to differentiate between different instances of the same type of hardware item. This is an optional attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public @Nullable String getModel() {
    return model;
  }

  public void setModel(@Nullable String model) {
    this.model = model;
  }

  public PhysicalResourceSpecification part(@Nullable String part) {
    this.part = part;
    return this;
  }

  /**
   * This is a string that defines a manufacturer-allocated part number assigned by the organization that manufactures the hardware item. This, in combination with the Model and the Vendor, identify different types of hardware items. The SerialNumber can then be used to differentiate between different instances of the same type of hardware item. This is a REQUIRED attribute.
   * @return part
   */
  
  @Schema(name = "part", description = "This is a string that defines a manufacturer-allocated part number assigned by the organization that manufactures the hardware item. This, in combination with the Model and the Vendor, identify different types of hardware items. The SerialNumber can then be used to differentiate between different instances of the same type of hardware item. This is a REQUIRED attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("part")
  public @Nullable String getPart() {
    return part;
  }

  public void setPart(@Nullable String part) {
    this.part = part;
  }

  public PhysicalResourceSpecification sku(@Nullable String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * This is a string that defines the manufacturer-allocated Stock Keeping Unit (SKU) number of the hardware item. This is an optional attribute.
   * @return sku
   */
  
  @Schema(name = "sku", description = "This is a string that defines the manufacturer-allocated Stock Keeping Unit (SKU) number of the hardware item. This is an optional attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sku")
  public @Nullable String getSku() {
    return sku;
  }

  public void setSku(@Nullable String sku) {
    this.sku = sku;
  }

  public PhysicalResourceSpecification vendor(@Nullable String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * This is a string that defines the name of the manufacturer. This, in combination with the Model and the Part, identify different types of hardware items. The SerialNumber can then be used to differentiate between different instances of the same type of hardware item. This is a REQUIRED attribute for a physical resource.
   * @return vendor
   */
  
  @Schema(name = "vendor", description = "This is a string that defines the name of the manufacturer. This, in combination with the Model and the Part, identify different types of hardware items. The SerialNumber can then be used to differentiate between different instances of the same type of hardware item. This is a REQUIRED attribute for a physical resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendor")
  public @Nullable String getVendor() {
    return vendor;
  }

  public void setVendor(@Nullable String vendor) {
    this.vendor = vendor;
  }


  public PhysicalResourceSpecification atType(String atType) {
    super.atType(atType);
    return this;
  }

  public PhysicalResourceSpecification atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public PhysicalResourceSpecification atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public PhysicalResourceSpecification href(String href) {
    super.href(href);
    return this;
  }

  public PhysicalResourceSpecification id(String id) {
    super.id(id);
    return this;
  }

  public PhysicalResourceSpecification description(String description) {
    super.description(description);
    return this;
  }

  public PhysicalResourceSpecification version(String version) {
    super.version(version);
    return this;
  }

  public PhysicalResourceSpecification validFor(TimePeriod validFor) {
    super.validFor(validFor);
    return this;
  }

  public PhysicalResourceSpecification isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public PhysicalResourceSpecification lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
    return this;
  }

  public PhysicalResourceSpecification lifecycleStatus(String lifecycleStatus) {
    super.lifecycleStatus(lifecycleStatus);
    return this;
  }

  public PhysicalResourceSpecification name(String name) {
    super.name(name);
    return this;
  }

  public PhysicalResourceSpecification category(String category) {
    super.category(category);
    return this;
  }

  public PhysicalResourceSpecification targetResourceSchema(TargetResourceSchema targetResourceSchema) {
    super.targetResourceSchema(targetResourceSchema);
    return this;
  }

  public PhysicalResourceSpecification featureSpecification(List<FeatureSpecification> featureSpecification) {
    super.featureSpecification(featureSpecification);
    return this;
  }

  public PhysicalResourceSpecification addFeatureSpecificationItem(FeatureSpecification featureSpecificationItem) {
    super.addFeatureSpecificationItem(featureSpecificationItem);
    return this;
  }

  public PhysicalResourceSpecification attachment(List<@Valid AttachmentRefOrValue> attachment) {
    super.attachment(attachment);
    return this;
  }

  public PhysicalResourceSpecification addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    super.addAttachmentItem(attachmentItem);
    return this;
  }

  public PhysicalResourceSpecification relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public PhysicalResourceSpecification addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public PhysicalResourceSpecification resourceSpecCharacteristic(List<CharacteristicSpecification> resourceSpecCharacteristic) {
    super.resourceSpecCharacteristic(resourceSpecCharacteristic);
    return this;
  }

  public PhysicalResourceSpecification addResourceSpecCharacteristicItem(CharacteristicSpecification resourceSpecCharacteristicItem) {
    super.addResourceSpecCharacteristicItem(resourceSpecCharacteristicItem);
    return this;
  }

  public PhysicalResourceSpecification resourceSpecRelationship(List<ResourceSpecificationRelationship> resourceSpecRelationship) {
    super.resourceSpecRelationship(resourceSpecRelationship);
    return this;
  }

  public PhysicalResourceSpecification addResourceSpecRelationshipItem(ResourceSpecificationRelationship resourceSpecRelationshipItem) {
    super.addResourceSpecRelationshipItem(resourceSpecRelationshipItem);
    return this;
  }

  public PhysicalResourceSpecification intentSpecification(IntentSpecificationRef intentSpecification) {
    super.intentSpecification(intentSpecification);
    return this;
  }

  public PhysicalResourceSpecification externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public PhysicalResourceSpecification addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    PhysicalResourceSpecification physicalResourceSpecification = (PhysicalResourceSpecification) o;
    return Objects.equals(this.model, physicalResourceSpecification.model) &&
        Objects.equals(this.part, physicalResourceSpecification.part) &&
        Objects.equals(this.sku, physicalResourceSpecification.sku) &&
        Objects.equals(this.vendor, physicalResourceSpecification.vendor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, part, sku, vendor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalResourceSpecification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

