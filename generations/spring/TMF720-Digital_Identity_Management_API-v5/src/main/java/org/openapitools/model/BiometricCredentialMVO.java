package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.CredentialMVO;
import org.openapitools.model.DigitalIdentityRef;
import org.openapitools.model.RelatedContactMedium;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BiometricCredentialMVO
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:13.349318156+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class BiometricCredentialMVO extends CredentialMVO {

  private @Nullable String biometricType;

  private @Nullable String biometricSubType;

  @Valid
  private List<@Valid AttachmentRefOrValue> attachment = new ArrayList<>();

  public BiometricCredentialMVO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BiometricCredentialMVO(String atType) {
    super(atType);
  }

  public BiometricCredentialMVO biometricType(@Nullable String biometricType) {
    this.biometricType = biometricType;
    return this;
  }

  /**
   * a biometric type like finger, iris, face, etc... 
   * @return biometricType
   */
  
  @Schema(name = "biometricType", description = "a biometric type like finger, iris, face, etc... ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biometricType")
  public @Nullable String getBiometricType() {
    return biometricType;
  }

  public void setBiometricType(@Nullable String biometricType) {
    this.biometricType = biometricType;
  }

  public BiometricCredentialMVO biometricSubType(@Nullable String biometricSubType) {
    this.biometricSubType = biometricSubType;
    return this;
  }

  /**
   * a biometric sub type when required like for finger: thumb, index, ring , pinkyFinger, etc 
   * @return biometricSubType
   */
  
  @Schema(name = "biometricSubType", description = "a biometric sub type when required like for finger: thumb, index, ring , pinkyFinger, etc ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("biometricSubType")
  public @Nullable String getBiometricSubType() {
    return biometricSubType;
  }

  public void setBiometricSubType(@Nullable String biometricSubType) {
    this.biometricSubType = biometricSubType;
  }

  public BiometricCredentialMVO attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public BiometricCredentialMVO addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * List of attachment(s) associated with this biometric data.
   * @return attachment
   */
  @Valid 
  @Schema(name = "attachment", description = "List of attachment(s) associated with this biometric data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }


  public BiometricCredentialMVO atType(String atType) {
    super.atType(atType);
    return this;
  }

  public BiometricCredentialMVO atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public BiometricCredentialMVO atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public BiometricCredentialMVO href(String href) {
    super.href(href);
    return this;
  }

  public BiometricCredentialMVO id(String id) {
    super.id(id);
    return this;
  }

  public BiometricCredentialMVO relatedContactMedium(List<RelatedContactMedium> relatedContactMedium) {
    super.relatedContactMedium(relatedContactMedium);
    return this;
  }

  public BiometricCredentialMVO addRelatedContactMediumItem(RelatedContactMedium relatedContactMediumItem) {
    super.addRelatedContactMediumItem(relatedContactMediumItem);
    return this;
  }

  public BiometricCredentialMVO digitalIdentity(DigitalIdentityRef digitalIdentity) {
    super.digitalIdentity(digitalIdentity);
    return this;
  }

  public BiometricCredentialMVO lastUpdate(OffsetDateTime lastUpdate) {
    super.lastUpdate(lastUpdate);
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
    BiometricCredentialMVO biometricCredentialMVO = (BiometricCredentialMVO) o;
    return Objects.equals(this.biometricType, biometricCredentialMVO.biometricType) &&
        Objects.equals(this.biometricSubType, biometricCredentialMVO.biometricSubType) &&
        Objects.equals(this.attachment, biometricCredentialMVO.attachment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricType, biometricSubType, attachment, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricCredentialMVO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    biometricType: ").append(toIndentedString(biometricType)).append("\n");
    sb.append("    biometricSubType: ").append(toIndentedString(biometricSubType)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
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

