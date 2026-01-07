package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.GeographicLocation;
import org.openapitools.model.Point;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A GeoJsonPoint is a single point
 */

@Schema(name = "GeoJsonPoint", description = "A GeoJsonPoint is a single point")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeoJsonPoint extends GeographicLocation {

  private @Nullable Point geoJson;

  public GeoJsonPoint() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoJsonPoint(String atType) {
    super(atType);
  }

  public GeoJsonPoint geoJson(@Nullable Point geoJson) {
    this.geoJson = geoJson;
    return this;
  }

  /**
   * Get geoJson
   * @return geoJson
   */
  @Valid 
  @Schema(name = "geoJson", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("geoJson")
  public @Nullable Point getGeoJson() {
    return geoJson;
  }

  public void setGeoJson(@Nullable Point geoJson) {
    this.geoJson = geoJson;
  }


  public GeoJsonPoint bbox(List<BigDecimal> bbox) {
    super.bbox(bbox);
    return this;
  }

  public GeoJsonPoint addBboxItem(BigDecimal bboxItem) {
    super.addBboxItem(bboxItem);
    return this;
  }

  public GeoJsonPoint atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeoJsonPoint atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeoJsonPoint atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeoJsonPoint href(String href) {
    super.href(href);
    return this;
  }

  public GeoJsonPoint id(String id) {
    super.id(id);
    return this;
  }

  public GeoJsonPoint externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public GeoJsonPoint addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    GeoJsonPoint geoJsonPoint = (GeoJsonPoint) o;
    return Objects.equals(this.geoJson, geoJsonPoint.geoJson) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoJson, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    geoJson: ").append(toIndentedString(geoJson)).append("\n");
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

