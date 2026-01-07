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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RdfXmlExpressionFVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class RdfXmlExpressionFVO extends IntentExpressionFVO {

  private String expressionValue;

  public RdfXmlExpressionFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RdfXmlExpressionFVO(String expressionValue, String atType) {
    super(atType);
    this.expressionValue = expressionValue;
  }

  public RdfXmlExpressionFVO expressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
    return this;
  }

  /**
   * RDF XML Expression value encoded object
   * @return expressionValue
   */
  @NotNull 
  @Schema(name = "expressionValue", description = "RDF XML Expression value encoded object", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expressionValue")
  public String getExpressionValue() {
    return expressionValue;
  }

  public void setExpressionValue(String expressionValue) {
    this.expressionValue = expressionValue;
  }


  public RdfXmlExpressionFVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public RdfXmlExpressionFVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public RdfXmlExpressionFVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public RdfXmlExpressionFVO iri(String iri) {
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
    RdfXmlExpressionFVO rdfXmlExpressionFVO = (RdfXmlExpressionFVO) o;
    return Objects.equals(this.expressionValue, rdfXmlExpressionFVO.expressionValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressionValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RdfXmlExpressionFVO {\n");
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

