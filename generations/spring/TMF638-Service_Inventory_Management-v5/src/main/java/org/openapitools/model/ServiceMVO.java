package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContextUpdate;
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
import org.openapitools.model.ServiceRefOrValueMVO;
import org.openapitools.model.ServiceRelationshipMVO;
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
 * ServiceMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceMVO implements ServiceRefOrValueMVO {

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
  private List<ServiceRelationshipMVO> serviceRelationship = new ArrayList<>();

  @Valid
  private List<@Valid ServiceRefOrValueMVO> supportingService = new ArrayList<>();

  @Valid
  private List<@Valid ResourceRef> supportingResource = new ArrayList<>();

  @Valid
  private List<RelatedPartyRefOrPartyRoleRef> relatedParty = new ArrayList<>();

  @Valid
  private List<RelatedPlaceRefOrValue> place = new ArrayList<>();

  private @Nullable ServiceStateType state;

  private @Nullable ServiceOperatingStatusType operatingStatus;

  private @Nullable ContextUpdate operatingStatusContextUpdate;

  private @Nullable ServiceSpecificationRef serviceSpecification;

  private @Nullable IntentRefOrValue intent;

  public ServiceMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceMVO(String atType) {
    this.atType = atType;
  }

  public ServiceMVO atType(String atType) {
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

  public ServiceMVO atBaseType(@Nullable String atBaseType) {
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

  public ServiceMVO atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public ServiceMVO href(@Nullable String href) {
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

  public ServiceMVO id(@Nullable String id) {
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

  public ServiceMVO description(@Nullable String description) {
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

  public ServiceMVO isServiceEnabled(@Nullable Boolean isServiceEnabled) {
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

  public ServiceMVO hasStarted(@Nullable Boolean hasStarted) {
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

  public ServiceMVO startMode(@Nullable String startMode) {
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

  public ServiceMVO isStateful(@Nullable Boolean isStateful) {
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

  public ServiceMVO startDate(@Nullable OffsetDateTime startDate) {
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

  public ServiceMVO endDate(@Nullable OffsetDateTime endDate) {
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

  public ServiceMVO serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    this.serviceOrderItem = serviceOrderItem;
    return this;
  }

  public ServiceMVO addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
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

  public ServiceMVO note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ServiceMVO addNoteItem(Note noteItem) {
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

  public ServiceMVO serviceType(@Nullable String serviceType) {
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

  public ServiceMVO isBundle(@Nullable Boolean isBundle) {
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

  public ServiceMVO name(@Nullable String name) {
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

  public ServiceMVO category(@Nullable String category) {
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

  public ServiceMVO feature(List<Feature> feature) {
    this.feature = feature;
    return this;
  }

  public ServiceMVO addFeatureItem(Feature featureItem) {
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

  public ServiceMVO relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }

  public ServiceMVO addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
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

  public ServiceMVO externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    this.externalIdentifier = externalIdentifier;
    return this;
  }

  public ServiceMVO addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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

  public ServiceMVO serviceCharacteristic(List<Characteristic> serviceCharacteristic) {
    this.serviceCharacteristic = serviceCharacteristic;
    return this;
  }

  public ServiceMVO addServiceCharacteristicItem(Characteristic serviceCharacteristicItem) {
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

  public ServiceMVO serviceRelationship(List<ServiceRelationshipMVO> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
    return this;
  }

  public ServiceMVO addServiceRelationshipItem(ServiceRelationshipMVO serviceRelationshipItem) {
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
  public List<ServiceRelationshipMVO> getServiceRelationship() {
    return serviceRelationship;
  }

  public void setServiceRelationship(List<ServiceRelationshipMVO> serviceRelationship) {
    this.serviceRelationship = serviceRelationship;
  }

  public ServiceMVO supportingService(List<@Valid ServiceRefOrValueMVO> supportingService) {
    this.supportingService = supportingService;
    return this;
  }

  public ServiceMVO addSupportingServiceItem(ServiceRefOrValueMVO supportingServiceItem) {
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
  public List<@Valid ServiceRefOrValueMVO> getSupportingService() {
    return supportingService;
  }

  public void setSupportingService(List<@Valid ServiceRefOrValueMVO> supportingService) {
    this.supportingService = supportingService;
  }

  public ServiceMVO supportingResource(List<@Valid ResourceRef> supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  public ServiceMVO addSupportingResourceItem(ResourceRef supportingResourceItem) {
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

  public ServiceMVO relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ServiceMVO addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
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

  public ServiceMVO place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ServiceMVO addPlaceItem(RelatedPlaceRefOrValue placeItem) {
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

  public ServiceMVO state(@Nullable ServiceStateType state) {
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

  public ServiceMVO operatingStatus(@Nullable ServiceOperatingStatusType operatingStatus) {
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

  public ServiceMVO operatingStatusContextUpdate(@Nullable ContextUpdate operatingStatusContextUpdate) {
    this.operatingStatusContextUpdate = operatingStatusContextUpdate;
    return this;
  }

  /**
   * Get operatingStatusContextUpdate
   * @return operatingStatusContextUpdate
   */
  @Valid 
  @Schema(name = "operatingStatusContextUpdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operatingStatusContextUpdate")
  public @Nullable ContextUpdate getOperatingStatusContextUpdate() {
    return operatingStatusContextUpdate;
  }

  public void setOperatingStatusContextUpdate(@Nullable ContextUpdate operatingStatusContextUpdate) {
    this.operatingStatusContextUpdate = operatingStatusContextUpdate;
  }

  public ServiceMVO serviceSpecification(@Nullable ServiceSpecificationRef serviceSpecification) {
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

  public ServiceMVO intent(@Nullable IntentRefOrValue intent) {
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
    ServiceMVO serviceMVO = (ServiceMVO) o;
    return Objects.equals(this.atType, serviceMVO.atType) &&
        Objects.equals(this.atBaseType, serviceMVO.atBaseType) &&
        Objects.equals(this.atSchemaLocation, serviceMVO.atSchemaLocation) &&
        Objects.equals(this.href, serviceMVO.href) &&
        Objects.equals(this.id, serviceMVO.id) &&
        Objects.equals(this.description, serviceMVO.description) &&
        Objects.equals(this.isServiceEnabled, serviceMVO.isServiceEnabled) &&
        Objects.equals(this.hasStarted, serviceMVO.hasStarted) &&
        Objects.equals(this.startMode, serviceMVO.startMode) &&
        Objects.equals(this.isStateful, serviceMVO.isStateful) &&
        Objects.equals(this.startDate, serviceMVO.startDate) &&
        Objects.equals(this.endDate, serviceMVO.endDate) &&
        Objects.equals(this.serviceOrderItem, serviceMVO.serviceOrderItem) &&
        Objects.equals(this.note, serviceMVO.note) &&
        Objects.equals(this.serviceType, serviceMVO.serviceType) &&
        Objects.equals(this.isBundle, serviceMVO.isBundle) &&
        Objects.equals(this.name, serviceMVO.name) &&
        Objects.equals(this.category, serviceMVO.category) &&
        Objects.equals(this.feature, serviceMVO.feature) &&
        Objects.equals(this.relatedEntity, serviceMVO.relatedEntity) &&
        Objects.equals(this.externalIdentifier, serviceMVO.externalIdentifier) &&
        Objects.equals(this.serviceCharacteristic, serviceMVO.serviceCharacteristic) &&
        Objects.equals(this.serviceRelationship, serviceMVO.serviceRelationship) &&
        Objects.equals(this.supportingService, serviceMVO.supportingService) &&
        Objects.equals(this.supportingResource, serviceMVO.supportingResource) &&
        Objects.equals(this.relatedParty, serviceMVO.relatedParty) &&
        Objects.equals(this.place, serviceMVO.place) &&
        Objects.equals(this.state, serviceMVO.state) &&
        Objects.equals(this.operatingStatus, serviceMVO.operatingStatus) &&
        Objects.equals(this.operatingStatusContextUpdate, serviceMVO.operatingStatusContextUpdate) &&
        Objects.equals(this.serviceSpecification, serviceMVO.serviceSpecification) &&
        Objects.equals(this.intent, serviceMVO.intent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, description, isServiceEnabled, hasStarted, startMode, isStateful, startDate, endDate, serviceOrderItem, note, serviceType, isBundle, name, category, feature, relatedEntity, externalIdentifier, serviceCharacteristic, serviceRelationship, supportingService, supportingResource, relatedParty, place, state, operatingStatus, operatingStatusContextUpdate, serviceSpecification, intent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceMVO {\n");
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
    sb.append("    operatingStatusContextUpdate: ").append(toIndentedString(operatingStatusContextUpdate)).append("\n");
    sb.append("    serviceSpecification: ").append(toIndentedString(serviceSpecification)).append("\n");
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

