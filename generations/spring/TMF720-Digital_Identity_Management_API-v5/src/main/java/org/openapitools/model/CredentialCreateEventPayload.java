package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Credential;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CredentialCreateEventPayload generic structure
 */

@Schema(name = "CredentialCreateEventPayload", description = "CredentialCreateEventPayload generic structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CredentialCreateEventPayload {

  private @Nullable Credential credential;

  public CredentialCreateEventPayload credential(@Nullable Credential credential) {
    this.credential = credential;
    return this;
  }

  /**
   * Get credential
   * @return credential
   */
  @Valid 
  @Schema(name = "credential", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("credential")
  public @Nullable Credential getCredential() {
    return credential;
  }

  public void setCredential(@Nullable Credential credential) {
    this.credential = credential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialCreateEventPayload credentialCreateEventPayload = (CredentialCreateEventPayload) o;
    return Objects.equals(this.credential, credentialCreateEventPayload.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialCreateEventPayload {\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

