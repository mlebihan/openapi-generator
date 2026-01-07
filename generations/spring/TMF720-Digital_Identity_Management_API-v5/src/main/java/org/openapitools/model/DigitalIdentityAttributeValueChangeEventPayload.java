package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DigitalIdentity;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DigitalIdentityAttributeValueChangeEventPayload generic structure
 */

@Schema(name = "DigitalIdentityAttributeValueChangeEventPayload", description = "DigitalIdentityAttributeValueChangeEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class DigitalIdentityAttributeValueChangeEventPayload {

  private @Nullable DigitalIdentity digitalIdentity;

  public DigitalIdentityAttributeValueChangeEventPayload digitalIdentity(@Nullable DigitalIdentity digitalIdentity) {
    this.digitalIdentity = digitalIdentity;
    return this;
  }

  /**
   * Get digitalIdentity
   * @return digitalIdentity
   */
  @Valid 
  @Schema(name = "digitalIdentity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("digitalIdentity")
  public @Nullable DigitalIdentity getDigitalIdentity() {
    return digitalIdentity;
  }

  public void setDigitalIdentity(@Nullable DigitalIdentity digitalIdentity) {
    this.digitalIdentity = digitalIdentity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalIdentityAttributeValueChangeEventPayload digitalIdentityAttributeValueChangeEventPayload = (DigitalIdentityAttributeValueChangeEventPayload) o;
    return Objects.equals(this.digitalIdentity, digitalIdentityAttributeValueChangeEventPayload.digitalIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digitalIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalIdentityAttributeValueChangeEventPayload {\n");
    sb.append("    digitalIdentity: ").append(toIndentedString(digitalIdentity)).append("\n");
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

