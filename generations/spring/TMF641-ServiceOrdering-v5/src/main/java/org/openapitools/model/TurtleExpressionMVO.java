package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.IntentExpressionMVO;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TurtleExpressionMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class TurtleExpressionMVO extends IntentExpressionMVO {

  private @Nullable String expressionValue;

  public TurtleExpressionMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TurtleExpressionMVO(String atType) {
    super(atType);
  }

  public TurtleExpressionMVO expressionValue(@Nullable String expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

  /**
   * Turtle Expression value is the ontology-encoded form of the Intent as Turtle RDF as defined in https://www.w3.org/TR/turtle/
   * @return expressionValue
   */
  
  @Schema(name = "expressionValue", description = "Turtle Expression value is the ontology-encoded form of the Intent as Turtle RDF as defined in https://www.w3.org/TR/turtle/", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expressionValue")
  public @Nullable String getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(@Nullable String expressionValue) {
    this.expressionValue = expressionValue;
  }


  public TurtleExpressionMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public TurtleExpressionMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public TurtleExpressionMVO atSchemaLocation(String atSchemaLocation) {
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
    TurtleExpressionMVO turtleExpressionMVO = (TurtleExpressionMVO) o;
    return Objects.equals(this.expressionValue, turtleExpressionMVO.expressionValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurtleExpressionMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expressionValue: ").append(toIndentedString(expressionValue)).append("\n");
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

