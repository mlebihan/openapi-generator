package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PartyRole;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PartyRoleSpecificationStateChangeEventPayload generic structure
 */

@Schema(name = "PartyRoleSpecificationStateChangeEventPayload", description = "PartyRoleSpecificationStateChangeEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class PartyRoleSpecificationStateChangeEventPayload {

  private @Nullable PartyRole partyRole;

  public PartyRoleSpecificationStateChangeEventPayload partyRole(@Nullable PartyRole partyRole) {
    this.partyRole = partyRole;
    return this;
  }

  /**
   * Get partyRole
   * @return partyRole
   */
  @Valid 
  @Schema(name = "partyRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partyRole")
  public @Nullable PartyRole getPartyRole() {
    return partyRole;
  }

  public void setPartyRole(@Nullable PartyRole partyRole) {
    this.partyRole = partyRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyRoleSpecificationStateChangeEventPayload partyRoleSpecificationStateChangeEventPayload = (PartyRoleSpecificationStateChangeEventPayload) o;
    return Objects.equals(this.partyRole, partyRoleSpecificationStateChangeEventPayload.partyRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyRoleSpecificationStateChangeEventPayload {\n");
    sb.append("    partyRole: ").append(toIndentedString(partyRole)).append("\n");
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

