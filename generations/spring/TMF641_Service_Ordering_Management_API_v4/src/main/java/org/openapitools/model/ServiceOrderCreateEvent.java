package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.ServiceOrderCreateEventPayload;
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
 * The notification data structure
 */

@Schema(name = "ServiceOrderCreateEvent", description = "The notification data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T09:45:26.708533682+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class ServiceOrderCreateEvent {

  private @Nullable ServiceOrderCreateEventPayload event;

  private @Nullable String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime eventTime;

  private @Nullable String eventType;

  private @Nullable String correlationId;

  private @Nullable String domain;

  private @Nullable String title;

  private @Nullable String description;

  private @Nullable String priority;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime timeOcurred;

  public ServiceOrderCreateEvent event(@Nullable ServiceOrderCreateEventPayload event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
   */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public @Nullable ServiceOrderCreateEventPayload getEvent() {
    return event;
  }

  public void setEvent(@Nullable ServiceOrderCreateEventPayload event) {
    this.event = event;
  }

  public ServiceOrderCreateEvent eventId(@Nullable String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The identifier of the notification.
   * @return eventId
   */
  
  @Schema(name = "eventId", description = "The identifier of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventId")
  public @Nullable String getEventId() {
    return eventId;
  }

  public void setEventId(@Nullable String eventId) {
    this.eventId = eventId;
  }

  public ServiceOrderCreateEvent eventTime(@Nullable OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Time of the event occurrence.
   * @return eventTime
   */
  @Valid 
  @Schema(name = "eventTime", description = "Time of the event occurrence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventTime")
  public @Nullable OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(@Nullable OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public ServiceOrderCreateEvent eventType(@Nullable String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the notification.
   * @return eventType
   */
  
  @Schema(name = "eventType", description = "The type of the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public @Nullable String getEventType() {
    return eventType;
  }

  public void setEventType(@Nullable String eventType) {
    this.eventType = eventType;
  }

  public ServiceOrderCreateEvent correlationId(@Nullable String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * The correlation id for this event.
   * @return correlationId
   */
  
  @Schema(name = "correlationId", description = "The correlation id for this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationId")
  public @Nullable String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(@Nullable String correlationId) {
    this.correlationId = correlationId;
  }

  public ServiceOrderCreateEvent domain(@Nullable String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain of the event.
   * @return domain
   */
  
  @Schema(name = "domain", description = "The domain of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain")
  public @Nullable String getDomain() {
    return domain;
  }

  public void setDomain(@Nullable String domain) {
    this.domain = domain;
  }

  public ServiceOrderCreateEvent title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the event.
   * @return title
   */
  
  @Schema(name = "title", description = "The title of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ServiceOrderCreateEvent description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * An explnatory of the event.
   * @return description
   */
  
  @Schema(name = "description", description = "An explnatory of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public ServiceOrderCreateEvent priority(@Nullable String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * A priority.
   * @return priority
   */
  
  @Schema(name = "priority", description = "A priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public @Nullable String getPriority() {
    return priority;
  }

  public void setPriority(@Nullable String priority) {
    this.priority = priority;
  }

  public ServiceOrderCreateEvent timeOcurred(@Nullable OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

  /**
   * The time the event occured.
   * @return timeOcurred
   */
  @Valid 
  @Schema(name = "timeOcurred", description = "The time the event occured.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOcurred")
  public @Nullable OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(@Nullable OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrderCreateEvent serviceOrderCreateEvent = (ServiceOrderCreateEvent) o;
    return Objects.equals(this.event, serviceOrderCreateEvent.event) &&
        Objects.equals(this.eventId, serviceOrderCreateEvent.eventId) &&
        Objects.equals(this.eventTime, serviceOrderCreateEvent.eventTime) &&
        Objects.equals(this.eventType, serviceOrderCreateEvent.eventType) &&
        Objects.equals(this.correlationId, serviceOrderCreateEvent.correlationId) &&
        Objects.equals(this.domain, serviceOrderCreateEvent.domain) &&
        Objects.equals(this.title, serviceOrderCreateEvent.title) &&
        Objects.equals(this.description, serviceOrderCreateEvent.description) &&
        Objects.equals(this.priority, serviceOrderCreateEvent.priority) &&
        Objects.equals(this.timeOcurred, serviceOrderCreateEvent.timeOcurred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrderCreateEvent {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
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

