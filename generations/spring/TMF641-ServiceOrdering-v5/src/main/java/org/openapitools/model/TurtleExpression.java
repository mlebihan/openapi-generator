package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.IntentExpression;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TurtleExpression
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class TurtleExpression extends IntentExpression {

  private @Nullable String expressionValue;

  public TurtleExpression() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TurtleExpression(String atType) {
    super(atType);
  }

  public TurtleExpression expressionValue(@Nullable String expressionValue) {
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


  public TurtleExpression atType(String atType) {
    super.atType(atType);
    return this;
  }

  public TurtleExpression atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public TurtleExpression atSchemaLocation(String atSchemaLocation) {
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
    TurtleExpression turtleExpression = (TurtleExpression) o;
    return Objects.equals(this.expressionValue, turtleExpression.expressionValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TurtleExpression {\n");
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

