package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.Feature;
import org.openapitools.model.IntentRefOrValue;
import org.openapitools.model.Note;
import org.openapitools.model.RelatedEntityRefOrValue;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.RelatedPlaceRefOrValue;
import org.openapitools.model.RelatedServiceOrderItem;
import org.openapitools.model.ResourceRef;
import org.openapitools.model.ServiceOperatingStatusType;
import org.openapitools.model.ServiceRefOrValue;
import org.openapitools.model.ServiceRelationship;
import org.openapitools.model.ServiceSpecificationRef;
import org.openapitools.model.ServiceStateType;
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
 * Service
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Service implements ServiceRefOrValue {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String description;

  private @Nullable Boolean isServiceEnabled;

  private @Nullable Boolean hasStarted;

  private @Nullable String startMode;

  private @Nullable Boolean isStateful;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime endDate;

  @Valid
  private List<RelatedServiceOrderItem> serviceOrderItem = new ArrayList<>();

  @Valid
  private List<Note> note = new ArrayList<>();

  private @Nullable String serviceType;

  private @Nullable Boolean isBundle;

  private @Nullable String name;

  private @Nullable String category;

  @Valid
  private List<Feature> feature = new ArrayList<>();

  @Valid
  private List<RelatedEntityRefOrValue> relatedEntity = new ArrayList<>();

  @Valid
  private List<ExternalIdentifier> externalIdentifier = new ArrayList<>();

  @Valid
  private List<Characteristic> serviceCharacteristic = new ArrayList<>();

  @Valid
  private List<ServiceRelationship> serviceRelationship = new ArrayList<>();

  @Valid
  private List<@Valid ServiceRefOrValue> supportingService = new ArrayList<>();

  @Valid
  private List<@Valid ResourceRef> supportingResource = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<RelatedPlaceRefOrValue> place = new ArrayList<>();

  private @Nullable ServiceStateType state;

  private @Nullable ServiceOperatingStatusType operatingStatus;

  private @Nullable ServiceSpecificationRef serviceSpecification;

  private @Nullable String serviceDate;

  private @Nullable IntentRefOrValue intent;

  public Service() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Service(String atType) {
    this.atType = atType;
  }

  public Service atType(String atType) {
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

  public Service atBaseType(@Nullable String atBaseType) {
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

  public Service atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public Service href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public Service id(@Nullable String id) {
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

  public Service description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Free-text description of the service
   * @return description
   */
  
  @Schema(name = "description", description = "Free-text description of the service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public Service isServiceEnabled(@Nullable Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
    return this;
  }

  /**
   * If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed 
   * @return isServiceEnabled
   */
  
  @Schema(name = "isServiceEnabled", description = "If FALSE and hasStarted is FALSE, this particular Service has NOT been enabled for use - if FALSE and hasStarted is TRUE then the service has failed ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isServiceEnabled")
  public @Nullable Boolean getIsServiceEnabled() {
    return isServiceEnabled;
  }

  public void setIsServiceEnabled(@Nullable Boolean isServiceEnabled) {
    this.isServiceEnabled = isServiceEnabled;
  }

  public Service hasStarted(@Nullable Boolean hasStarted) {
    this.hasStarted = hasStarted;
    return this;
  }

  /**
   * If TRUE, this Service has already been started
   * @return hasStarted
   */
  
  @Schema(name = "hasStarted", description = "If TRUE, this Service has already been started", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasStarted")
  public @Nullable Boolean getHasStarted() {
    return hasStarted;
  }

  public void setHasStarted(@Nullable Boolean hasStarted) {
    this.hasStarted = hasStarted;
  }

  public Service startMode(@Nullable String startMode) {
    this.startMode = startMode;
    return this;
  }

  /**
   * This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above
   * @return startMode
   */
  
  @Schema(name = "startMode", description = "This attribute is an enumerated integer that indicates how the Service is started, such as: 0: Unknown; 1: Automatically by the managed environment; 2: Automatically by the owning device; 3: Manually by the Provider of the Service; 4: Manually by a Customer of the Provider; 5: Any of the above", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startMode")
  public @Nullable String getStartMode() {
    return startMode;
  }

  public void setStartMode(@Nullable String startMode) {
    this.startMode = startMode;
  }

  public Service isStateful(@Nullable Boolean isStateful) {
    this.isStateful = isStateful;
    return this;
  }

  /**
   * If TRUE, this Service can be changed without affecting any other services
   * @return isStateful
   */
  
  @Schema(name = "isStateful", description = "If TRUE, this Service can be changed without affecting any other services", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isStateful")
  public @Nullable Boolean getIsStateful() {
    return isStateful;
  }

  public void setIsStateful(@Nullable Boolean isStateful) {
    this.isStateful = isStateful;
  }

  public Service startDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the service starts
   * @return startDate
   */
  @Valid 
  @Schema(name = "startDate", description = "Date when the service starts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public @Nullable OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(@Nullable OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Service endDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date when the service ends
   * @return endDate
   */
  @Valid 
  @Schema(name = "endDate", description = "Date when the service ends", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public @Nullable OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(@Nullable OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Service serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public Service addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
    if (this.serviceOrderItem == null) {
      this.serviceOrderItem = new ArrayList<>();
    }
    this.serviceOrderItem.add(serviceOrderItemItem);
    return this;
  }

  /**
   * A list of service order items related to this service
   * @return serviceOrderItem
   */
  @Valid 
  @Schema(name = "serviceOrderItem", description = "A list of service order items related to this service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceOrderItem")
  public List<RelatedServiceOrderItem> getServiceOrderItem() {
    return serviceOrderItem;
  }

  public void setServiceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
  }

  public Service note(List<Note> note) {
    this.note = note;
    return this;
  }

  public Service addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * A list of notes made on this service
   * @return note
   */
  @Valid 
  @Schema(name = "note", description = "A list of notes made on this service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public Service serviceType(@Nullable String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Business type of the service
   * @return serviceType
   */
  
  @Schema(name = "serviceType", description = "Business type of the service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceType")
  public @Nullable String getServiceType() {
    return serviceType;
  }

  public void setServiceType(@Nullable String serviceType) {
    this.serviceType = serviceType;
  }

  public Service isBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).
   * @return isBundle
   */
  
  @Schema(name = "isBundle", description = "If true, the service is a ServiceBundle which regroup a service hierachy. If false, the service is a 'atomic' service (hierachy leaf).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public @Nullable Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(@Nullable Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public Service name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Service category(@Nullable String category) {
    this.category = category;
    return this;
  }

  /**
   * Is it a customer facing or resource facing service
   * @return category
   */
  
  @Schema(name = "category", description = "Is it a customer facing or resource facing service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable String getCategory() {
    return category;
  }

  public void setCategory(@Nullable String category) {
    this.category = category;
  }

  public Service feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public Service addFeatureItem(Feature featureItem) {
    if (this.feature == null) {
      this.feature = new ArrayList<>();
    }
    this.feature.add(featureItem);
    return this;
  }

  /**
   * A list of feature associated with this service 
   * @return feature
   */
  @Valid 
  @Schema(name = "feature", description = "A list of feature associated with this service ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feature")
  public List<Feature> getFeature() {
    return feature;
  }

  public void setFeature(List<Feature> feature) {
    this.feature = feature;
  }

  public Service relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public Service addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
    if (this.relatedEntity == null) {
      this.relatedEntity = new ArrayList<>();
    }
    this.relatedEntity.add(relatedEntityItem);
    return this;
  }

  /**
   * A list of related entities in relationship with this service
   * @return relatedEntity
   */
  @Valid 
  @Schema(name = "relatedEntity", description = "A list of related entities in relationship with this service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedEntity")
  public List<RelatedEntityRefOrValue> getRelatedEntity() {
    return relatedEntity;
  }

  public void setRelatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  public Service externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public Service addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
    if (this.externalIdentifier == null) {
      this.externalIdentifier = new ArrayList<>();
    }
    this.externalIdentifier.add(externalIdentifierItem);
    return this;
  }

  /**
   * A list of external identifiers assoicated with this service
   * @return externalIdentifier
   */
  @Valid 
  @Schema(name = "externalIdentifier", description = "A list of external identifiers assoicated with this service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalIdentifier")
  public List<ExternalIdentifier> getExternalIdentifier() {
    return externalIdentifier;
  }

  public void setExternalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
  }

  public Service serviceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public Service addServiceCharacteristicItem(Characteristic serviceCharacteristicItem) {
    if (this.serviceCharacteristic == null) {
      this.serviceCharacteristic = new ArrayList<>();
    }
    this.serviceCharacteristic.add(serviceCharacteristicItem);
    return this;
  }

  /**
   * A list of characteristics that characterize this service (ServiceCharacteristic [*]) 
   * @return serviceCharacteristic
   */
  @Valid 
  @Schema(name = "serviceCharacteristic", description = "A list of characteristics that characterize this service (ServiceCharacteristic [*]) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceCharacteristic")
  public List<Characteristic> getServiceCharacteristic() {
    return serviceCharacteristic;
  }

  public void setServiceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
  }

  public Service serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public Service addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
    if (this.serviceRelationship == null) {
      this.serviceRelationship = new ArrayList<>();
    }
    this.serviceRelationship.add(serviceRelationshipItem);
    return this;
  }

  /**
   * A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory.
   * @return serviceRelationship
   */
  @Valid 
  @Schema(name = "serviceRelationship", description = "A list of service relationships (ServiceRelationship [*]). Describes links with other service(s) in the inventory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceRelationship")
  public List<ServiceRelationship> getServiceRelationship() {
    return serviceRelationship;
  }

  public void setServiceRelationship(List<ServiceRelationship> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
  }

  public Service supportingService(List<@Valid ServiceRefOrValue> supportingService) {
    this.supportingService = supportingService;
    return this;
  }

  public Service addSupportingServiceItem(ServiceRefOrValue supportingServiceItem) {
    if (this.supportingService == null) {
      this.supportingService = new ArrayList<>();
    }
    this.supportingService.add(supportingServiceItem);
    return this;
  }

  /**
   * A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)
   * @return supportingService
   */
  @Valid 
  @Schema(name = "supportingService", description = "A list of supporting services (SupportingService [*]). A collection of services that support this service (bundling, link CFS to RFS)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportingService")
  public List<@Valid ServiceRefOrValue> getSupportingService() {
    return supportingService;
  }

  public void setSupportingService(List<@Valid ServiceRefOrValue> supportingService) {
    this.supportingService = supportingService;
  }

  public Service supportingResource(List<@Valid ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  public Service addSupportingResourceItem(ResourceRef supportingResourceItem) {
    if (this.supportingResource == null) {
      this.supportingResource = new ArrayList<>();
    }
    this.supportingResource.add(supportingResourceItem);
    return this;
  }

  /**
   * A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources
   * @return supportingResource
   */
  @Valid 
  @Schema(name = "supportingResource", description = "A list of supporting resources (SupportingResource [*]).Note: only Service of type RFS can be associated with Resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportingResource")
  public List<@Valid ResourceRef> getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(List<@Valid ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
  }

  public Service relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Service addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity
   * @return relatedParty
   */
  @Valid 
  @Schema(name = "relatedParty", description = "A list of related party references (RelatedParty [*]). A related party defines party or party role linked to a specific entity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<RelatedPartyRefOrPartyRoleRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Service place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public Service addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)
   * @return place
   */
  @Valid 
  @Schema(name = "place", description = "A list of places (Place [*]). Used to define a place useful for the service (for example a geographical place whre the service is installed)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("place")
  public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public Service state(@Nullable ServiceStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public @Nullable ServiceStateType getState() {
    return state;
  }

  public void setState(@Nullable ServiceStateType state) {
    this.state = state;
  }

  public Service operatingStatus(@Nullable ServiceOperatingStatusType operatingStatus) {
    this.operatingStatus = operatingStatus;
    return this;
  }

  /**
   * Get operatingStatus
   * @return operatingStatus
   */
  @Valid 
  @Schema(name = "operatingStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingStatus")
  public @Nullable ServiceOperatingStatusType getOperatingStatus() {
    return operatingStatus;
  }

  public void setOperatingStatus(@Nullable ServiceOperatingStatusType operatingStatus) {
    this.operatingStatus = operatingStatus;
  }

  public Service serviceSpecification(@Nullable ServiceSpecificationRef serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
    return this;
  }

  /**
   * Get serviceSpecification
   * @return serviceSpecification
   */
  @Valid 
  @Schema(name = "serviceSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSpecification")
  public @Nullable ServiceSpecificationRef getServiceSpecification() {
    return serviceSpecification;
  }

  public void setServiceSpecification(@Nullable ServiceSpecificationRef serviceSpecification) {
    this.serviceSpecification = serviceSpecification;
  }

  public Service serviceDate(@Nullable String serviceDate) {
    this.serviceDate = serviceDate;
    return this;
  }

  /**
   * Date when the service was created (whatever its status).
   * @return serviceDate
   */
  
  @Schema(name = "serviceDate", description = "Date when the service was created (whatever its status).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceDate")
  public @Nullable String getServiceDate() {
    return serviceDate;
  }

  public void setServiceDate(@Nullable String serviceDate) {
    this.serviceDate = serviceDate;
  }

  public Service intent(@Nullable IntentRefOrValue intent) {
    this.intent = intent;
    return this;
  }

  /**
   * Get intent
   * @return intent
   */
  @Valid 
  @Schema(name = "intent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intent")
  public @Nullable IntentRefOrValue getIntent() {
    return intent;
  }

  public void setIntent(@Nullable IntentRefOrValue intent) {
    this.intent = intent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.atType, service.atType) &&
        Objects.equals(this.atBaseType, service.atBaseType) &&
        Objects.equals(this.atSchemaLocation, service.atSchemaLocation) &&
        Objects.equals(this.href, service.href) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.isServiceEnabled, service.isServiceEnabled) &&
        Objects.equals(this.hasStarted, service.hasStarted) &&
        Objects.equals(this.startMode, service.startMode) &&
        Objects.equals(this.isStateful, service.isStateful) &&
        Objects.equals(this.startDate, service.startDate) &&
        Objects.equals(this.endDate, service.endDate) &&
        Objects.equals(this.serviceOrderItem, service.serviceOrderItem) &&
        Objects.equals(this.note, service.note) &&
        Objects.equals(this.serviceType, service.serviceType) &&
        Objects.equals(this.isBundle, service.isBundle) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.category, service.category) &&
        Objects.equals(this.feature, service.feature) &&
        Objects.equals(this.relatedEntity, service.relatedEntity) &&
        Objects.equals(this.externalIdentifier, service.externalIdentifier) &&
        Objects.equals(this.serviceCharacteristic, service.serviceCharacteristic) &&
        Objects.equals(this.serviceRelationship, service.serviceRelationship) &&
        Objects.equals(this.supportingService, service.supportingService) &&
        Objects.equals(this.supportingResource, service.supportingResource) &&
        Objects.equals(this.relatedParty, service.relatedParty) &&
        Objects.equals(this.place, service.place) &&
        Objects.equals(this.state, service.state) &&
        Objects.equals(this.operatingStatus, service.operatingStatus) &&
        Objects.equals(this.serviceSpecification, service.serviceSpecification) &&
        Objects.equals(this.serviceDate, service.serviceDate) &&
        Objects.equals(this.intent, service.intent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, description, isServiceEnabled, hasStarted, startMode, isStateful, startDate, endDate, serviceOrderItem, note, serviceType, isBundle, name, category, feature, relatedEntity, externalIdentifier, serviceCharacteristic, serviceRelationship, supportingService, supportingResource, relatedParty, place, state, operatingStatus, serviceSpecification, serviceDate, intent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isServiceEnabled: ").append(toIndentedString(isServiceEnabled)).append("\n");
    sb.append("    hasStarted: ").append(toIndentedString(hasStarted)).append("\n");
    sb.append("    startMode: ").append(toIndentedString(startMode)).append("\n");
    sb.append("    isStateful: ").append(toIndentedString(isStateful)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    serviceOrderItem: ").append(toIndentedString(serviceOrderItem)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    externalIdentifier: ").append(toIndentedString(externalIdentifier)).append("\n");
    sb.append("    serviceCharacteristic: ").append(toIndentedString(serviceCharacteristic)).append("\n");
    sb.append("    serviceRelationship: ").append(toIndentedString(serviceRelationship)).append("\n");
    sb.append("    supportingService: ").append(toIndentedString(supportingService)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
    sb.append("    serviceDate: ").append(toIndentedString(serviceDate)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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

