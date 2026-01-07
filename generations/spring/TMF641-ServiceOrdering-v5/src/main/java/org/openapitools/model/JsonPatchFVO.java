package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Path  structure
 */

@Schema(name = "JsonPatch_FVO", description = "Path  structure")
@JsonTypeName("JsonPatch_FVO")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class JsonPatchFVO {

  /**
   * The operation to be performed
   */
  public enum OpEnum {
    ADD("add"),
    
    REMOVE("remove"),
    
    REPLACE("replace"),
    
    MOVE("move"),
    
    COPY("copy"),
    
    TEST("test");

    private final String value;

    OpEnum(String value) {
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
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpEnum op;

  private String path;

  private @Nullable Object value;

  private @Nullable String from;

  public JsonPatchFVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JsonPatchFVO(OpEnum op, String path) {
    this.op = op;
    this.path = path;
  }

  public JsonPatchFVO op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * The operation to be performed
   * @return op
   */
  @NotNull 
  @Schema(name = "op", description = "The operation to be performed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public JsonPatchFVO path(String path) {
    this.path = path;
    return this;
  }

  /**
   * A JSON-Pointer
   * @return path
   */
  @NotNull 
  @Schema(name = "path", description = "A JSON-Pointer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JsonPatchFVO value(@Nullable Object value) {
    this.value = value;
    return this;
  }

  /**
   * The value to be used within the operations.
   * @return value
   */
  
  @Schema(name = "value", description = "The value to be used within the operations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Object getValue() {
    return value;
  }

  public void setValue(@Nullable Object value) {
    this.value = value;
  }

  public JsonPatchFVO from(@Nullable String from) {
    this.from = from;
    return this;
  }

  /**
   * A string containing a JSON Pointer value.
   * @return from
   */
  
  @Schema(name = "from", description = "A string containing a JSON Pointer value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public @Nullable String getFrom() {
    return from;
  }

  public void setFrom(@Nullable String from) {
    this.from = from;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonPatchFVO jsonPatchFVO = (JsonPatchFVO) o;
    return Objects.equals(this.op, jsonPatchFVO.op) &&
        Objects.equals(this.path, jsonPatchFVO.path) &&
        Objects.equals(this.value, jsonPatchFVO.value) &&
        Objects.equals(this.from, jsonPatchFVO.from);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value, from);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPatchFVO {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
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

