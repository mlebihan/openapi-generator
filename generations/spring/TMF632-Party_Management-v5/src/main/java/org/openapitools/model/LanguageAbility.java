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
 * Ability of an individual to understand or converse in a language.
 */

@Schema(name = "LanguageAbility", description = "Ability of an individual to understand or converse in a language.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class LanguageAbility {

  private @Nullable String languageCode;

  private @Nullable String languageName;

  private @Nullable Boolean isFavouriteLanguage;

  private @Nullable String writingProficiency;

  private @Nullable String readingProficiency;

  private @Nullable String speakingProficiency;

  private @Nullable String listeningProficiency;

  private @Nullable TimePeriod validFor;

  public LanguageAbility languageCode(@Nullable String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Language code (RFC 5646)
   * @return languageCode
   */
  
  @Schema(name = "languageCode", description = "Language code (RFC 5646)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageCode")
  public @Nullable String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(@Nullable String languageCode) {
    this.languageCode = languageCode;
  }

  public LanguageAbility languageName(@Nullable String languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * Language name
   * @return languageName
   */
  
  @Schema(name = "languageName", description = "Language name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageName")
  public @Nullable String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(@Nullable String languageName) {
    this.languageName = languageName;
  }

  public LanguageAbility isFavouriteLanguage(@Nullable Boolean isFavouriteLanguage) {
    this.isFavouriteLanguage = isFavouriteLanguage;
    return this;
  }

  /**
   * A “true” value specifies whether the language is considered by the individual as his favourite one
   * @return isFavouriteLanguage
   */
  
  @Schema(name = "isFavouriteLanguage", description = "A “true” value specifies whether the language is considered by the individual as his favourite one", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isFavouriteLanguage")
  public @Nullable Boolean getIsFavouriteLanguage() {
    return isFavouriteLanguage;
  }

  public void setIsFavouriteLanguage(@Nullable Boolean isFavouriteLanguage) {
    this.isFavouriteLanguage = isFavouriteLanguage;
  }

  public LanguageAbility writingProficiency(@Nullable String writingProficiency) {
    this.writingProficiency = writingProficiency;
    return this;
  }

  /**
   * Writing proficiency evaluated for this language
   * @return writingProficiency
   */
  
  @Schema(name = "writingProficiency", description = "Writing proficiency evaluated for this language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("writingProficiency")
  public @Nullable String getWritingProficiency() {
    return writingProficiency;
  }

  public void setWritingProficiency(@Nullable String writingProficiency) {
    this.writingProficiency = writingProficiency;
  }

  public LanguageAbility readingProficiency(@Nullable String readingProficiency) {
    this.readingProficiency = readingProficiency;
    return this;
  }

  /**
   * Reading proficiency evaluated for this language
   * @return readingProficiency
   */
  
  @Schema(name = "readingProficiency", description = "Reading proficiency evaluated for this language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("readingProficiency")
  public @Nullable String getReadingProficiency() {
    return readingProficiency;
  }

  public void setReadingProficiency(@Nullable String readingProficiency) {
    this.readingProficiency = readingProficiency;
  }

  public LanguageAbility speakingProficiency(@Nullable String speakingProficiency) {
    this.speakingProficiency = speakingProficiency;
    return this;
  }

  /**
   * Speaking proficiency evaluated for this language
   * @return speakingProficiency
   */
  
  @Schema(name = "speakingProficiency", description = "Speaking proficiency evaluated for this language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("speakingProficiency")
  public @Nullable String getSpeakingProficiency() {
    return speakingProficiency;
  }

  public void setSpeakingProficiency(@Nullable String speakingProficiency) {
    this.speakingProficiency = speakingProficiency;
  }

  public LanguageAbility listeningProficiency(@Nullable String listeningProficiency) {
    this.listeningProficiency = listeningProficiency;
    return this;
  }

  /**
   * Listening proficiency evaluated for this language
   * @return listeningProficiency
   */
  
  @Schema(name = "listeningProficiency", description = "Listening proficiency evaluated for this language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("listeningProficiency")
  public @Nullable String getListeningProficiency() {
    return listeningProficiency;
  }

  public void setListeningProficiency(@Nullable String listeningProficiency) {
    this.listeningProficiency = listeningProficiency;
  }

  public LanguageAbility validFor(@Nullable TimePeriod validFor) {
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
    LanguageAbility languageAbility = (LanguageAbility) o;
    return Objects.equals(this.languageCode, languageAbility.languageCode) &&
        Objects.equals(this.languageName, languageAbility.languageName) &&
        Objects.equals(this.isFavouriteLanguage, languageAbility.isFavouriteLanguage) &&
        Objects.equals(this.writingProficiency, languageAbility.writingProficiency) &&
        Objects.equals(this.readingProficiency, languageAbility.readingProficiency) &&
        Objects.equals(this.speakingProficiency, languageAbility.speakingProficiency) &&
        Objects.equals(this.listeningProficiency, languageAbility.listeningProficiency) &&
        Objects.equals(this.validFor, languageAbility.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, languageName, isFavouriteLanguage, writingProficiency, readingProficiency, speakingProficiency, listeningProficiency, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageAbility {\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    isFavouriteLanguage: ").append(toIndentedString(isFavouriteLanguage)).append("\n");
    sb.append("    writingProficiency: ").append(toIndentedString(writingProficiency)).append("\n");
    sb.append("    readingProficiency: ").append(toIndentedString(readingProficiency)).append("\n");
    sb.append("    speakingProficiency: ").append(toIndentedString(speakingProficiency)).append("\n");
    sb.append("    listeningProficiency: ").append(toIndentedString(listeningProficiency)).append("\n");
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

