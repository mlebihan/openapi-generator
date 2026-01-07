package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.IntentExpression;
import org.openapitools.model.JsonLdExpressionValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JsonLdExpression
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class JsonLdExpression extends IntentExpression {

  private @Nullable JsonLdExpressionValue expressionValue;

  public JsonLdExpression() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonLdExpression(String atType) {
    super(atType);
  }

  public JsonLdExpression expressionValue(@Nullable JsonLdExpressionValue expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

  /**
   * Get expressionValue
   * @return expressionValue
   */
  @Valid 
  @Schema(name = "expressionValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expressionValue")
  public @Nullable JsonLdExpressionValue getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(@Nullable JsonLdExpressionValue expressionValue) {
    this.expressionValue = expressionValue;
  }


  public JsonLdExpression atType(String atType) {
    super.atType(atType);
    return this;
  }

  public JsonLdExpression atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public JsonLdExpression atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public JsonLdExpression iri(String iri) {
    super.iri(iri);
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
    JsonLdExpression jsonLdExpression = (JsonLdExpression) o;
    return Objects.equals(this.expressionValue, jsonLdExpression.expressionValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonLdExpression {\n");
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

