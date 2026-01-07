package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.IntentExpressionFVO;
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
 * JsonLdExpressionFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class JsonLdExpressionFVO extends IntentExpressionFVO {

  private JsonLdExpressionValue expressionValue;

  public JsonLdExpressionFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonLdExpressionFVO(JsonLdExpressionValue expressionValue, String atType) {
    super(atType);
    this.expressionValue = expressionValue;
  }

  public JsonLdExpressionFVO expressionValue(JsonLdExpressionValue expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

  /**
   * Get expressionValue
   * @return expressionValue
   */
  @NotNull @Valid 
  @Schema(name = "expressionValue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expressionValue")
  public JsonLdExpressionValue getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(JsonLdExpressionValue expressionValue) {
    this.expressionValue = expressionValue;
  }


  public JsonLdExpressionFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public JsonLdExpressionFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public JsonLdExpressionFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public JsonLdExpressionFVO iri(String iri) {
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
    JsonLdExpressionFVO jsonLdExpressionFVO = (JsonLdExpressionFVO) o;
    return Objects.equals(this.expressionValue, jsonLdExpressionFVO.expressionValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonLdExpressionFVO {\n");
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

