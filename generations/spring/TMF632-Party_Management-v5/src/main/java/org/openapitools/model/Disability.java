package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TimePeriod;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Lack or inadequate strength or ability.
 */

@Schema(name = "Disability", description = "Lack or inadequate strength or ability.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Disability {

  private @Nullable String disabilityCode;

  private @Nullable String disabilityName;

  private @Nullable TimePeriod validFor;

  public Disability disabilityCode(@Nullable String disabilityCode) {
    this.disabilityCode = disabilityCode;
    return this;
  }

  /**
   * Code of the disability
   * @return disabilityCode
   */
  
  @Schema(name = "disabilityCode", description = "Code of the disability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabilityCode")
  public @Nullable String getDisabilityCode() {
    return disabilityCode;
  }

  public void setDisabilityCode(@Nullable String disabilityCode) {
    this.disabilityCode = disabilityCode;
  }

  public Disability disabilityName(@Nullable String disabilityName) {
    this.disabilityName = disabilityName;
    return this;
  }

  /**
   * Name of the disability
   * @return disabilityName
   */
  
  @Schema(name = "disabilityName", description = "Name of the disability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabilityName")
  public @Nullable String getDisabilityName() {
    return disabilityName;
  }

  public void setDisabilityName(@Nullable String disabilityName) {
    this.disabilityName = disabilityName;
  }

  public Disability validFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public @Nullable TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(@Nullable TimePeriod validFor) {
    this.validFor = validFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Disability disability = (Disability) o;
    return Objects.equals(this.disabilityCode, disability.disabilityCode) &&
        Objects.equals(this.disabilityName, disability.disabilityName) &&
        Objects.equals(this.validFor, disability.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabilityCode, disabilityName, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Disability {\n");
    sb.append("    disabilityCode: ").append(toIndentedString(disabilityCode)).append("\n");
    sb.append("    disabilityName: ").append(toIndentedString(disabilityName)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

