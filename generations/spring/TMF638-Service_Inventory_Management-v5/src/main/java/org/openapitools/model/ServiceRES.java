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
import org.openapitools.model.Service;
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
 * Response object for Service
 */

@Schema(name = "Service_RES", description = "Response object for Service")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceRES extends Service {

  public ServiceRES() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceRES(String atType, String href, String id) {
    super(atType);
  }


  public ServiceRES atType(String atType) {
    super.atType(atType);
    return this;
  }

  public ServiceRES atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public ServiceRES atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public ServiceRES href(String href) {
    super.href(href);
    return this;
  }

  public ServiceRES id(String id) {
    super.id(id);
    return this;
  }

  public ServiceRES description(String description) {
    super.description(description);
    return this;
  }

  public ServiceRES isServiceEnabled(Boolean isServiceEnabled) {
    super.isServiceEnabled(isServiceEnabled);
    return this;
  }

  public ServiceRES hasStarted(Boolean hasStarted) {
    super.hasStarted(hasStarted);
    return this;
  }

  public ServiceRES startMode(String startMode) {
    super.startMode(startMode);
    return this;
  }

  public ServiceRES isStateful(Boolean isStateful) {
    super.isStateful(isStateful);
    return this;
  }

  public ServiceRES startDate(OffsetDateTime startDate) {
    super.startDate(startDate);
    return this;
  }

  public ServiceRES endDate(OffsetDateTime endDate) {
    super.endDate(endDate);
    return this;
  }

  public ServiceRES serviceOrderItem(List<RelatedServiceOrderItem> serviceOrderItem) {
    super.serviceOrderItem(serviceOrderItem);
    return this;
  }

  public ServiceRES addServiceOrderItemItem(RelatedServiceOrderItem serviceOrderItemItem) {
    super.addServiceOrderItemItem(serviceOrderItemItem);
    return this;
  }

  public ServiceRES note(List<Note> note) {
    super.note(note);
    return this;
  }

  public ServiceRES addNoteItem(Note noteItem) {
    super.addNoteItem(noteItem);
    return this;
  }

  public ServiceRES serviceType(String serviceType) {
    super.serviceType(serviceType);
    return this;
  }

  public ServiceRES isBundle(Boolean isBundle) {
    super.isBundle(isBundle);
    return this;
  }

  public ServiceRES name(String name) {
    super.name(name);
    return this;
  }

  public ServiceRES category(String category) {
    super.category(category);
    return this;
  }

  public ServiceRES feature(List<Feature> feature) {
    super.feature(feature);
    return this;
  }

  public ServiceRES addFeatureItem(Feature featureItem) {
    super.addFeatureItem(featureItem);
    return this;
  }

  public ServiceRES relatedEntity(List<RelatedEntityRefOrValue> relatedEntity) {
    super.relatedEntity(relatedEntity);
    return this;
  }

  public ServiceRES addRelatedEntityItem(RelatedEntityRefOrValue relatedEntityItem) {
    super.addRelatedEntityItem(relatedEntityItem);
    return this;
  }

  public ServiceRES externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public ServiceRES addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
    super.addExternalIdentifierItem(externalIdentifierItem);
    return this;
  }

  public ServiceRES serviceCharacteristic(List<Characteristic> serviceCharacteristic) {
    super.serviceCharacteristic(serviceCharacteristic);
    return this;
  }

  public ServiceRES addServiceCharacteristicItem(Characteristic serviceCharacteristicItem) {
    super.addServiceCharacteristicItem(serviceCharacteristicItem);
    return this;
  }

  public ServiceRES serviceRelationship(List<ServiceRelationship> serviceRelationship) {
    super.serviceRelationship(serviceRelationship);
    return this;
  }

  public ServiceRES addServiceRelationshipItem(ServiceRelationship serviceRelationshipItem) {
    super.addServiceRelationshipItem(serviceRelationshipItem);
    return this;
  }

  public ServiceRES supportingService(List<@Valid ServiceRefOrValue> supportingService) {
    super.supportingService(supportingService);
    return this;
  }

  public ServiceRES addSupportingServiceItem(ServiceRefOrValue supportingServiceItem) {
    super.addSupportingServiceItem(supportingServiceItem);
    return this;
  }

  public ServiceRES supportingResource(List<@Valid ResourceRef> supportingResource) {
    super.supportingResource(supportingResource);
    return this;
  }

  public ServiceRES addSupportingResourceItem(ResourceRef supportingResourceItem) {
    super.addSupportingResourceItem(supportingResourceItem);
    return this;
  }

  public ServiceRES relatedParty(List<RelatedPartyRefOrPartyRoleRef> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public ServiceRES addRelatedPartyItem(RelatedPartyRefOrPartyRoleRef relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public ServiceRES place(List<RelatedPlaceRefOrValue> place) {
    super.place(place);
    return this;
  }

  public ServiceRES addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    super.addPlaceItem(placeItem);
    return this;
  }

  public ServiceRES state(ServiceStateType state) {
    super.state(state);
    return this;
  }

  public ServiceRES operatingStatus(ServiceOperatingStatusType operatingStatus) {
    super.operatingStatus(operatingStatus);
    return this;
  }

  public ServiceRES operatingStatusContextUpdate(ContextUpdate operatingStatusContextUpdate) {
    super.operatingStatusContextUpdate(operatingStatusContextUpdate);
    return this;
  }

  public ServiceRES serviceSpecification(ServiceSpecificationRef serviceSpecification) {
    super.serviceSpecification(serviceSpecification);
    return this;
  }

  public ServiceRES serviceDate(String serviceDate) {
    super.serviceDate(serviceDate);
    return this;
  }

  public ServiceRES intent(IntentRefOrValue intent) {
    super.intent(intent);
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
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRES {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

