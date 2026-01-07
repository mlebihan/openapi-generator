package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Organization;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrganizationDeleteEventPayload generic structure
 */

@Schema(name = "OrganizationDeleteEventPayload", description = "OrganizationDeleteEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class OrganizationDeleteEventPayload {

  private @Nullable Organization organization;

  public OrganizationDeleteEventPayload organization(@Nullable Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @Valid 
  @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public @Nullable Organization getOrganization() {
    return organization;
  }

  public void setOrganization(@Nullable Organization organization) {
    this.organization = organization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationDeleteEventPayload organizationDeleteEventPayload = (OrganizationDeleteEventPayload) o;
    return Objects.equals(this.organization, organizationDeleteEventPayload.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationDeleteEventPayload {\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

