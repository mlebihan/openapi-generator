package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.Quantity;
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
 * Attachment
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Attachment implements AttachmentRefOrValue {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String href;

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String url;

  private @Nullable String content;

  private @Nullable Quantity size;

  private @Nullable TimePeriod validFor;

  private @Nullable String attachmentType;

  private @Nullable String mimeType;

  public Attachment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Attachment(String atType) {
    this.atType = atType;
  }

  public Attachment atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
   */
  @NotNull 
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Attachment atBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
   */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public @Nullable String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(@Nullable String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public Attachment atSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
   */
  
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public @Nullable String getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(@Nullable String atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public Attachment href(@Nullable String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
   */
  
  @Schema(name = "href", description = "Hyperlink reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public @Nullable String getHref() {
    return href;
  }

  public void setHref(@Nullable String href) {
    this.href = href;
  }

  public Attachment id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
   */
  
  @Schema(name = "id", description = "unique identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Attachment name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the attachment
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the attachment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Attachment description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative text describing the content of the attachment
   * @return description
   */
  
  @Schema(name = "description", example = "Photograph of the Product", description = "A narrative text describing the content of the attachment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public Attachment url(@Nullable String url) {
    this.url = url;
    return this;
  }

  /**
   * Uniform Resource Locator, is a web page address (a subset of URI)
   * @return url
   */
  
  @Schema(name = "url", example = "http://host/Content/4aafacbd-11ff-4dc8-b445-305f2215715f", description = "Uniform Resource Locator, is a web page address (a subset of URI)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public @Nullable String getUrl() {
    return url;
  }

  public void setUrl(@Nullable String url) {
    this.url = url;
  }

  public Attachment content(@Nullable String content) {
    this.content = content;
    return this;
  }

  /**
   * The actual contents of the attachment object, if embedded, encoded as base64
   * @return content
   */
  
  @Schema(name = "content", description = "The actual contents of the attachment object, if embedded, encoded as base64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public @Nullable String getContent() {
    return content;
  }

  public void setContent(@Nullable String content) {
    this.content = content;
  }

  public Attachment size(@Nullable Quantity size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @Valid 
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable Quantity getSize() {
    return size;
  }

  public void setSize(@Nullable Quantity size) {
    this.size = size;
  }

  public Attachment validFor(@Nullable TimePeriod validFor) {
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

  public Attachment attachmentType(@Nullable String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

  /**
   * a business characterization of the purpose of the attachment, for example logo, instructionManual, contractCopy
   * @return attachmentType
   */
  
  @Schema(name = "attachmentType", description = "a business characterization of the purpose of the attachment, for example logo, instructionManual, contractCopy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachmentType")
  public @Nullable String getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(@Nullable String attachmentType) {
    this.attachmentType = attachmentType;
  }

  public Attachment mimeType(@Nullable String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * a technical characterization of the attachment content format using IETF Mime Types
   * @return mimeType
   */
  
  @Schema(name = "mimeType", description = "a technical characterization of the attachment content format using IETF Mime Types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mimeType")
  public @Nullable String getMimeType() {
    return mimeType;
  }

  public void setMimeType(@Nullable String mimeType) {
    this.mimeType = mimeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.atType, attachment.atType) &&
        Objects.equals(this.atBaseType, attachment.atBaseType) &&
        Objects.equals(this.atSchemaLocation, attachment.atSchemaLocation) &&
        Objects.equals(this.href, attachment.href) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.name, attachment.name) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.url, attachment.url) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.validFor, attachment.validFor) &&
        Objects.equals(this.attachmentType, attachment.attachmentType) &&
        Objects.equals(this.mimeType, attachment.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, href, id, name, description, url, content, size, validFor, attachmentType, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

