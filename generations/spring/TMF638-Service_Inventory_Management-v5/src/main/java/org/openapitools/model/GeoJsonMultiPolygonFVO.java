package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExternalIdentifierFVO;
import org.openapitools.model.GeographicLocationFVO;
import org.openapitools.model.MultiPolygon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A GeoJson MultiPolygon is an array of polygons
 */

@Schema(name = "GeoJsonMultiPolygon_FVO", description = "A GeoJson MultiPolygon is an array of polygons")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeoJsonMultiPolygonFVO extends GeographicLocationFVO {

  private @Nullable MultiPolygon geoJson;

  public GeoJsonMultiPolygonFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeoJsonMultiPolygonFVO(String atType) {
    super(atType);
  }

  public GeoJsonMultiPolygonFVO geoJson(@Nullable MultiPolygon geoJson) {
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
  public @Nullable MultiPolygon getGeoJson() {
    return geoJson;
  }

  public void setGeoJson(@Nullable MultiPolygon geoJson) {
    this.geoJson = geoJson;
  }


  public GeoJsonMultiPolygonFVO bbox(List<BigDecimal> bbox) {
    super.bbox(bbox);
    return this;
  }

  public GeoJsonMultiPolygonFVO addBboxItem(BigDecimal bboxItem) {
    super.addBboxItem(bboxItem);
    return this;
  }

  public GeoJsonMultiPolygonFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public GeoJsonMultiPolygonFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeoJsonMultiPolygonFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public GeoJsonMultiPolygonFVO href(String href) {
    super.href(href);
    return this;
  }

  public GeoJsonMultiPolygonFVO id(String id) {
    super.id(id);
    return this;
  }

  public GeoJsonMultiPolygonFVO externalIdentifier(List<ExternalIdentifierFVO> externalIdentifier) {
    super.externalIdentifier(externalIdentifier);
    return this;
  }

  public GeoJsonMultiPolygonFVO addExternalIdentifierItem(ExternalIdentifierFVO externalIdentifierItem) {
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
    GeoJsonMultiPolygonFVO geoJsonMultiPolygonFVO = (GeoJsonMultiPolygonFVO) o;
    return Objects.equals(this.geoJson, geoJsonMultiPolygonFVO.geoJson) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geoJson, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoJsonMultiPolygonFVO {\n");
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

