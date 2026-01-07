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
import java.net.URI;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Common
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:49:14.698852092+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Common {

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

  public Common atId(@Nullable URI atId) {
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

  public Common atValue(@Nullable String atValue) {
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

  public Common atLanguage(@Nullable String atLanguage) {
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

  public Common atType(@Nullable String atType) {
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

  public Common atContainer(@Nullable AtContainerEnum atContainer) {
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

  public Common atList(Object atList) {
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

  public Common atSet(Object atSet) {
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

  public Common atReverse(@Nullable String atReverse) {
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

  public Common atBase(@Nullable URI atBase) {
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

  public Common atVocab(@Nullable URI atVocab) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Common common = (Common) o;
    return Objects.equals(this.atId, common.atId) &&
        Objects.equals(this.atValue, common.atValue) &&
        Objects.equals(this.atLanguage, common.atLanguage) &&
        Objects.equals(this.atType, common.atType) &&
        Objects.equals(this.atContainer, common.atContainer) &&
        equalsNullable(this.atList, common.atList) &&
        equalsNullable(this.atSet, common.atSet) &&
        Objects.equals(this.atReverse, common.atReverse) &&
        Objects.equals(this.atBase, common.atBase) &&
        Objects.equals(this.atVocab, common.atVocab);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atValue, atLanguage, atType, atContainer, hashCodeNullable(atList), hashCodeNullable(atSet), atReverse, atBase, atVocab);
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
    sb.append("class Common {\n");
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

