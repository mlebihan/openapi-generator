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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PlaceFVO;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GeographicLocationFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class GeographicLocationFVO extends PlaceFVO implements GeographicLocationRefOrValueFVO, PlaceRefOrValueFVO {

  private @Nullable String id;

  private @Nullable String href;

  /**
   * The name of the GeoJSON structure used in the geometry attribute
   */
  public enum AtTypeEnum {
    GEO_JSON_POINT("GeoJsonPoint"),
    
    GEO_JSON_MULTI_POINT("GeoJsonMultiPoint"),
    
    GEO_JSON_LINE_STRING("GeoJsonLineString"),
    
    GEO_JSON_MULTI_LINE_STRING("GeoJsonMultiLineString"),
    
    GEO_JSON_POLYGON("GeoJsonPolygon");

    private final String value;

    AtTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AtTypeEnum fromValue(String value) {
      for (AtTypeEnum b : AtTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AtTypeEnum atType = AtTypeEnum.GEO_JSON_POINT;

  @Valid
  private List<BigDecimal> bbox = new ArrayList<>();

  public GeographicLocationFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeographicLocationFVO(AtTypeEnum atType) {
    super(atType.value);
    this.atType = atType;
  }

  public GeographicLocationFVO id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the geographic location
   * @return id
   */
  
  @Schema(name = "id", description = "Unique identifier of the geographic location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public GeographicLocationFVO href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * An URI used to access to the geographic location resource
   * @return href
   */
  
  @Schema(name = "href", description = "An URI used to access to the geographic location resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public GeographicLocationFVO atType(AtTypeEnum atType) {
    this.atType = atType;
    return this;
  }

  /**
   * The name of the GeoJSON structure used in the geometry attribute
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "The name of the GeoJSON structure used in the geometry attribute", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType.value;
  }

  public void setAtType(AtTypeEnum atType) {
    this.atType = atType;
  }

  public GeographicLocationFVO bbox(List<BigDecimal> bbox) {
    this.bbox = bbox;
    return this;
  }

  public GeographicLocationFVO addBboxItem(BigDecimal bboxItem) {
    if (this.bbox == null) {
      this.bbox = new ArrayList<>();
    }
    this.bbox.add(bboxItem);
    return this;
  }

  /**
   * A bounding box array that contains the geometry. The axes order follows the axes order of the geometry
   * @return bbox
   */
  @Valid 
  @Schema(name = "bbox", description = "A bounding box array that contains the geometry. The axes order follows the axes order of the geometry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bbox")
  public List<BigDecimal> getBbox() {
    return bbox;
  }

  public void setBbox(List<BigDecimal> bbox) {
    this.bbox = bbox;
  }


  public GeographicLocationFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public GeographicLocationFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
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
    GeographicLocationFVO geographicLocationFVO = (GeographicLocationFVO) o;
    return Objects.equals(this.id, geographicLocationFVO.id) &&
        Objects.equals(this.href, geographicLocationFVO.href) &&
        Objects.equals(this.atType, geographicLocationFVO.atType) &&
        Objects.equals(this.bbox, geographicLocationFVO.bbox) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, atType, bbox, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicLocationFVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
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

