package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Individual;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * IndividualAttributeValueChangeEventPayload generic structure
 */

@Schema(name = "IndividualAttributeValueChangeEventPayload", description = "IndividualAttributeValueChangeEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class IndividualAttributeValueChangeEventPayload {

  private @Nullable Individual individual;

  public IndividualAttributeValueChangeEventPayload individual(@Nullable Individual individual) {
    this.individual = individual;
    return this;
  }

  /**
   * Get individual
   * @return individual
   */
  @Valid 
  @Schema(name = "individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individual")
  public @Nullable Individual getIndividual() {
    return individual;
  }

  public void setIndividual(@Nullable Individual individual) {
    this.individual = individual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualAttributeValueChangeEventPayload individualAttributeValueChangeEventPayload = (IndividualAttributeValueChangeEventPayload) o;
    return Objects.equals(this.individual, individualAttributeValueChangeEventPayload.individual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualAttributeValueChangeEventPayload {\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
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

