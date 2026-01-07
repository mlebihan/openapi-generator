package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Common;
import org.openapitools.model.Context;
import org.openapitools.model.Graph;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Json LD expression value schema
 */

@Schema(name = "JsonLdExpressionValue", description = "Json LD expression value schema")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class JsonLdExpressionValue {

  private @Nullable Object atContext;

  @Valid
  private List<@Valid Common> atGraph = new ArrayList<>();

  private @Nullable URI atId;

  private @Nullable String atValue;

  private @Nullable String atLanguage;

  private @Nullable String atType;

  /**
   * Used to set the default container type for a term.
   */
  public enum AtContainerEnum {
    _LANGUAGE("@language"),
    
    _LIST("@list"),
    
    _INDEX("@index"),
    
    _SET("@set");

    private final String value;

    AtContainerEnum(String value) {
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
    public static AtContainerEnum fromValue(String value) {
      for (AtContainerEnum b : AtContainerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable AtContainerEnum atContainer;

  private JsonNullable<Object> atList = JsonNullable.<Object>undefined();

  private JsonNullable<Object> atSet = JsonNullable.<Object>undefined();

  private @Nullable String atReverse;

  private @Nullable URI atBase;

  private @Nullable URI atVocab;

  public JsonLdExpressionValue atContext(@Nullable Object atContext) {
    this.atContext = atContext;
    return this;
  }

  /**
   * Used to define the short-hand names that are used throughout a JSON-LD document.
   * @return atContext
   */
  
  @Schema(name = "@context", description = "Used to define the short-hand names that are used throughout a JSON-LD document.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@context")
  public @Nullable Object getAtContext() {
    return atContext;
  }

  public void setAtContext(@Nullable Object atContext) {
    this.atContext = atContext;
  }

  public JsonLdExpressionValue atGraph(List<@Valid Common> atGraph) {
    this.atGraph = atGraph;
    return this;
  }

  public JsonLdExpressionValue addAtGraphItem(Common atGraphItem) {
    if (this.atGraph == null) {
      this.atGraph = new ArrayList<>();
    }
    this.atGraph.add(atGraphItem);
    return this;
  }

  /**
   * Used to express a graph.
   * @return atGraph
   */
  @Valid 
  @Schema(name = "@graph", description = "Used to express a graph.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@graph")
  public List<@Valid Common> getAtGraph() {
    return atGraph;
  }

  public void setAtGraph(List<@Valid Common> atGraph) {
    this.atGraph = atGraph;
  }

  public JsonLdExpressionValue atId(@Nullable URI atId) {
    this.atId = atId;
    return this;
  }

  /**
   * Used to uniquely identify things that are being described in the document with IRIs or blank node identifiers.
   * @return atId
   */
  @Valid 
  @Schema(name = "@id", description = "Used to uniquely identify things that are being described in the document with IRIs or blank node identifiers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@id")
  public @Nullable URI getAtId() {
    return atId;
  }

  public void setAtId(@Nullable URI atId) {
    this.atId = atId;
  }

  public JsonLdExpressionValue atValue(@Nullable String atValue) {
    this.atValue = atValue;
    return this;
  }

  /**
   * Used to specify the data that is associated with a particular property in the graph.
   * @return atValue
   */
  
  @Schema(name = "@value", description = "Used to specify the data that is associated with a particular property in the graph.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@value")
  public @Nullable String getAtValue() {
    return atValue;
  }

  public void setAtValue(@Nullable String atValue) {
    this.atValue = atValue;
  }

  public JsonLdExpressionValue atLanguage(@Nullable String atLanguage) {
    this.atLanguage = atLanguage;
    return this;
  }

  /**
   * Used to specify the language for a particular string value or the default language of a JSON-LD document.
   * @return atLanguage
   */
  
  @Schema(name = "@language", description = "Used to specify the language for a particular string value or the default language of a JSON-LD document.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@language")
  public @Nullable String getAtLanguage() {
    return atLanguage;
  }

  public void setAtLanguage(@Nullable String atLanguage) {
    this.atLanguage = atLanguage;
  }

  public JsonLdExpressionValue atType(@Nullable String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Used to set the data type of a node or typed value.
   * @return atType
   */
  
  @Schema(name = "@type", description = "Used to set the data type of a node or typed value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public @Nullable String getAtType() {
    return atType;
  }

  public void setAtType(@Nullable String atType) {
    this.atType = atType;
  }

  public JsonLdExpressionValue atContainer(@Nullable AtContainerEnum atContainer) {
    this.atContainer = atContainer;
    return this;
  }

  /**
   * Used to set the default container type for a term.
   * @return atContainer
   */
  
  @Schema(name = "@container", description = "Used to set the default container type for a term.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@container")
  public @Nullable AtContainerEnum getAtContainer() {
    return atContainer;
  }

  public void setAtContainer(@Nullable AtContainerEnum atContainer) {
    this.atContainer = atContainer;
  }

  public JsonLdExpressionValue atList(Object atList) {
    this.atList = JsonNullable.of(atList);
    return this;
  }

  /**
   * Used to express an ordered set of data.
   * @return atList
   */
  
  @Schema(name = "@list", description = "Used to express an ordered set of data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@list")
  public JsonNullable<Object> getAtList() {
    return atList;
  }

  public void setAtList(JsonNullable<Object> atList) {
    this.atList = atList;
  }

  public JsonLdExpressionValue atSet(Object atSet) {
    this.atSet = JsonNullable.of(atSet);
    return this;
  }

  /**
   * Used to express an unordered set of data and to ensure that values are always represented as arrays.
   * @return atSet
   */
  
  @Schema(name = "@set", description = "Used to express an unordered set of data and to ensure that values are always represented as arrays.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@set")
  public JsonNullable<Object> getAtSet() {
    return atSet;
  }

  public void setAtSet(JsonNullable<Object> atSet) {
    this.atSet = atSet;
  }

  public JsonLdExpressionValue atReverse(@Nullable String atReverse) {
    this.atReverse = atReverse;
    return this;
  }

  /**
   * Used to express reverse properties.
   * @return atReverse
   */
  
  @Schema(name = "@reverse", description = "Used to express reverse properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@reverse")
  public @Nullable String getAtReverse() {
    return atReverse;
  }

  public void setAtReverse(@Nullable String atReverse) {
    this.atReverse = atReverse;
  }

  public JsonLdExpressionValue atBase(@Nullable URI atBase) {
    this.atBase = atBase;
    return this;
  }

  /**
   * Used to set the base IRI against which relative IRIs are resolved
   * @return atBase
   */
  @Valid 
  @Schema(name = "@base", description = "Used to set the base IRI against which relative IRIs are resolved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@base")
  public @Nullable URI getAtBase() {
    return atBase;
  }

  public void setAtBase(@Nullable URI atBase) {
    this.atBase = atBase;
  }

  public JsonLdExpressionValue atVocab(@Nullable URI atVocab) {
    this.atVocab = atVocab;
    return this;
  }

  /**
   * Used to expand properties and values in @type with a common prefix IRI
   * @return atVocab
   */
  @Valid 
  @Schema(name = "@vocab", description = "Used to expand properties and values in @type with a common prefix IRI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@vocab")
  public @Nullable URI getAtVocab() {
    return atVocab;
  }

  public void setAtVocab(@Nullable URI atVocab) {
    this.atVocab = atVocab;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public JsonLdExpressionValue putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonLdExpressionValue jsonLdExpressionValue = (JsonLdExpressionValue) o;
    return Objects.equals(this.atContext, jsonLdExpressionValue.atContext) &&
        Objects.equals(this.atGraph, jsonLdExpressionValue.atGraph) &&
        Objects.equals(this.atId, jsonLdExpressionValue.atId) &&
        Objects.equals(this.atValue, jsonLdExpressionValue.atValue) &&
        Objects.equals(this.atLanguage, jsonLdExpressionValue.atLanguage) &&
        Objects.equals(this.atType, jsonLdExpressionValue.atType) &&
        Objects.equals(this.atContainer, jsonLdExpressionValue.atContainer) &&
        equalsNullable(this.atList, jsonLdExpressionValue.atList) &&
        equalsNullable(this.atSet, jsonLdExpressionValue.atSet) &&
        Objects.equals(this.atReverse, jsonLdExpressionValue.atReverse) &&
        Objects.equals(this.atBase, jsonLdExpressionValue.atBase) &&
        Objects.equals(this.atVocab, jsonLdExpressionValue.atVocab) &&
    Objects.equals(this.additionalProperties, jsonLdExpressionValue.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(atContext, atGraph, atId, atValue, atLanguage, atType, atContainer, hashCodeNullable(atList), hashCodeNullable(atSet), atReverse, atBase, atVocab, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonLdExpressionValue {\n");
    sb.append("    atContext: ").append(toIndentedString(atContext)).append("\n");
    sb.append("    atGraph: ").append(toIndentedString(atGraph)).append("\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atValue: ").append(toIndentedString(atValue)).append("\n");
    sb.append("    atLanguage: ").append(toIndentedString(atLanguage)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atContainer: ").append(toIndentedString(atContainer)).append("\n");
    sb.append("    atList: ").append(toIndentedString(atList)).append("\n");
    sb.append("    atSet: ").append(toIndentedString(atSet)).append("\n");
    sb.append("    atReverse: ").append(toIndentedString(atReverse)).append("\n");
    sb.append("    atBase: ").append(toIndentedString(atBase)).append("\n");
    sb.append("    atVocab: ").append(toIndentedString(atVocab)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

