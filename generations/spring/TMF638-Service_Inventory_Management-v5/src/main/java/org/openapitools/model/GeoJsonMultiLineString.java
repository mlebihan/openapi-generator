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
import org.openapitools.model.MultiLineString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeoJson MultiLineString is a one or more GeoJSON LineStrings
 */

@Schema(name = "GeoJsonMultiLineString", description = "GeoJson MultiLineString is a one or more GeoJSON LineStrings")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeoJsonMultiLineString extends GeographicLocation {

  private @Nullable MultiLineString geoJson;

  public GeoJsonMultiLineString() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoJsonMultiLineString(String atType) {
    super(atType);
  }

  public GeoJsonMultiLineString geoJson(@Nullable MultiLineString geoJson) {
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
  public @Nullable MultiLineString getGeoJson() {
    return geoJson;
  }

  public void setGeoJson(@Nullable MultiLineString geoJson) {
    this.geoJson = geoJson;
  }


  public GeoJsonMultiLineString bbox(List<BigDecimal> bbox) {
    super.bbox(bbox);
    return this;
  }

  public GeoJsonMultiLineString addBboxItem(BigDecimal bboxItem) {
    super.addBboxItem(bboxItem);
    return this;
  }

  public GeoJsonMultiLineString atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeoJsonMultiLineString atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeoJsonMultiLineString atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeoJsonMultiLineString href(String href) {
    super.href(href);
    return this;
  }

  public GeoJsonMultiLineString id(String id) {
    super.id(id);
    return this;
  }

  public GeoJsonMultiLineString externalIdentifier(List<ExternalIdentifier> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public GeoJsonMultiLineString addExternalIdentifierItem(ExternalIdentifier externalIdentifierItem) {
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
    GeoJsonMultiLineString geoJsonMultiLineString = (GeoJsonMultiLineString) o;
    return Objects.equals(this.geoJson, geoJsonMultiLineString.geoJson) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoJson, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonMultiLineString {\n");
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

