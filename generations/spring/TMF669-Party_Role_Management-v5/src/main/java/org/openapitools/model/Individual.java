package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.Disability;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.IndividualIdentification;
import org.openapitools.model.IndividualStateType;
import org.openapitools.model.LanguageAbility;
import org.openapitools.model.OtherNameIndividual;
import org.openapitools.model.Party;
import org.openapitools.model.PartyCreditProfile;
import org.openapitools.model.RelatedPartyOrPartyRole;
import org.openapitools.model.Skill;
import org.openapitools.model.TaxExemptionCertificate;
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
 * Individual
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class Individual extends Party implements PartyOrPartyRole {

  private @Nullable String gender;

  private @Nullable String placeOfBirth;

  private @Nullable String countryOfBirth;

  private @Nullable String nationality;

  private @Nullable String maritalStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime birthDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime deathDate;

  private @Nullable String title;

  private @Nullable String aristocraticTitle;

  private @Nullable String generation;

  private @Nullable String preferredGivenName;

  private @Nullable String familyNamePrefix;

  private @Nullable String legalName;

  private @Nullable String middleName;

  private @Nullable String name;

  private @Nullable String formattedName;

  private @Nullable String location;

  private @Nullable IndividualStateType status;

  @Valid
  private List<@Valid OtherNameIndividual> otherName = new ArrayList<>();

  @Valid
  private List<IndividualIdentification> individualIdentification = new ArrayList<>();

  @Valid
  private List<@Valid Disability> disability = new ArrayList<>();

  @Valid
  private List<@Valid LanguageAbility> languageAbility = new ArrayList<>();

  @Valid
  private List<@Valid Skill> skill = new ArrayList<>();

  private @Nullable String familyName;

  private @Nullable String givenName;

  public Individual() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Individual(String atType) {
    super(atType);
  }

  public Individual gender(@Nullable String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender
   * @return gender
   */
  
  @Schema(name = "gender", description = "Gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable String getGender() {
    return gender;
  }

  public void setGender(@Nullable String gender) {
    this.gender = gender;
  }

  public Individual placeOfBirth(@Nullable String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  /**
   * Reference to the place where the individual was born
   * @return placeOfBirth
   */
  
  @Schema(name = "placeOfBirth", description = "Reference to the place where the individual was born", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeOfBirth")
  public @Nullable String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(@Nullable String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public Individual countryOfBirth(@Nullable String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
    return this;
  }

  /**
   * Country where the individual was born
   * @return countryOfBirth
   */
  
  @Schema(name = "countryOfBirth", description = "Country where the individual was born", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryOfBirth")
  public @Nullable String getCountryOfBirth() {
    return countryOfBirth;
  }

  public void setCountryOfBirth(@Nullable String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }

  public Individual nationality(@Nullable String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nationality
   * @return nationality
   */
  
  @Schema(name = "nationality", description = "Nationality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nationality")
  public @Nullable String getNationality() {
    return nationality;
  }

  public void setNationality(@Nullable String nationality) {
    this.nationality = nationality;
  }

  public Individual maritalStatus(@Nullable String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Marital status (married, divorced, widow ...)
   * @return maritalStatus
   */
  
  @Schema(name = "maritalStatus", description = "Marital status (married, divorced, widow ...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maritalStatus")
  public @Nullable String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(@Nullable String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public Individual birthDate(@Nullable OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Birth date
   * @return birthDate
   */
  @Valid 
  @Schema(name = "birthDate", description = "Birth date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public @Nullable OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(@Nullable OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }

  public Individual deathDate(@Nullable OffsetDateTime deathDate) {
    this.deathDate = deathDate;
    return this;
  }

  /**
   * Date of death
   * @return deathDate
   */
  @Valid 
  @Schema(name = "deathDate", description = "Date of death", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deathDate")
  public @Nullable OffsetDateTime getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(@Nullable OffsetDateTime deathDate) {
    this.deathDate = deathDate;
  }

  public Individual title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...
   * @return title
   */
  
  @Schema(name = "title", description = "Useful for titles (aristocratic, social,...) Pr, Dr, Sir, ...", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public Individual aristocraticTitle(@Nullable String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
    return this;
  }

  /**
   * e.g. Baron, Graf, Earl
   * @return aristocraticTitle
   */
  
  @Schema(name = "aristocraticTitle", description = "e.g. Baron, Graf, Earl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aristocraticTitle")
  public @Nullable String getAristocraticTitle() {
    return aristocraticTitle;
  }

  public void setAristocraticTitle(@Nullable String aristocraticTitle) {
    this.aristocraticTitle = aristocraticTitle;
  }

  public Individual generation(@Nullable String generation) {
    this.generation = generation;
    return this;
  }

  /**
   * e.g.. Sr, Jr, III (the third)
   * @return generation
   */
  
  @Schema(name = "generation", description = "e.g.. Sr, Jr, III (the third)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("generation")
  public @Nullable String getGeneration() {
    return generation;
  }

  public void setGeneration(@Nullable String generation) {
    this.generation = generation;
  }

  public Individual preferredGivenName(@Nullable String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
    return this;
  }

  /**
   * Contains the chosen name by which the individual prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname
   * @return preferredGivenName
   */
  
  @Schema(name = "preferredGivenName", description = "Contains the chosen name by which the individual prefers to be addressed. Note: This name may be a name other than a given name, such as a nickname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferredGivenName")
  public @Nullable String getPreferredGivenName() {
    return preferredGivenName;
  }

  public void setPreferredGivenName(@Nullable String preferredGivenName) {
    this.preferredGivenName = preferredGivenName;
  }

  public Individual familyNamePrefix(@Nullable String familyNamePrefix) {
    this.familyNamePrefix = familyNamePrefix;
    return this;
  }

  /**
   * Family name prefix
   * @return familyNamePrefix
   */
  
  @Schema(name = "familyNamePrefix", description = "Family name prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyNamePrefix")
  public @Nullable String getFamilyNamePrefix() {
    return familyNamePrefix;
  }

  public void setFamilyNamePrefix(@Nullable String familyNamePrefix) {
    this.familyNamePrefix = familyNamePrefix;
  }

  public Individual legalName(@Nullable String legalName) {
    this.legalName = legalName;
    return this;
  }

  /**
   * Legal name or birth name (name one has for official purposes)
   * @return legalName
   */
  
  @Schema(name = "legalName", description = "Legal name or birth name (name one has for official purposes)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legalName")
  public @Nullable String getLegalName() {
    return legalName;
  }

  public void setLegalName(@Nullable String legalName) {
    this.legalName = legalName;
  }

  public Individual middleName(@Nullable String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middles name or initial
   * @return middleName
   */
  
  @Schema(name = "middleName", description = "Middles name or initial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public @Nullable String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(@Nullable String middleName) {
    this.middleName = middleName;
  }

  public Individual name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name flatten (first, middle, and last names) - this is the name that is expected to be presented in reference data types such as PartyRef, RelatedParty, etc. that refer to Individual
   * @return name
   */
  
  @Schema(name = "name", description = "Full name flatten (first, middle, and last names) - this is the name that is expected to be presented in reference data types such as PartyRef, RelatedParty, etc. that refer to Individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Individual formattedName(@Nullable String formattedName) {
    this.formattedName = formattedName;
    return this;
  }

  /**
   * A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean)
   * @return formattedName
   */
  
  @Schema(name = "formattedName", description = "A fully formatted name in one string with all of its pieces in their proper place and all of the necessary punctuation. Useful for specific contexts (Chinese, Japanese, Korean)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formattedName")
  public @Nullable String getFormattedName() {
    return formattedName;
  }

  public void setFormattedName(@Nullable String formattedName) {
    this.formattedName = formattedName;
  }

  public Individual location(@Nullable String location) {
    this.location = location;
    return this;
  }

  /**
   * Temporary current location of the individual (may be used if the individual has approved its sharing)
   * @return location
   */
  
  @Schema(name = "location", description = "Temporary current location of the individual (may be used if the individual has approved its sharing)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public @Nullable String getLocation() {
    return location;
  }

  public void setLocation(@Nullable String location) {
    this.location = location;
  }

  public Individual status(@Nullable IndividualStateType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable IndividualStateType getStatus() {
    return status;
  }

  public void setStatus(@Nullable IndividualStateType status) {
    this.status = status;
  }

  public Individual otherName(List<@Valid OtherNameIndividual> otherName) {
    this.otherName = otherName;
    return this;
  }

  public Individual addOtherNameItem(OtherNameIndividual otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<>();
    }
    this.otherName.add(otherNameItem);
    return this;
  }

  /**
   * List of other names by which this individual is known
   * @return otherName
   */
  @Valid 
  @Schema(name = "otherName", description = "List of other names by which this individual is known", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("otherName")
  public List<@Valid OtherNameIndividual> getOtherName() {
    return otherName;
  }

  public void setOtherName(List<@Valid OtherNameIndividual> otherName) {
    this.otherName = otherName;
  }

  public Individual individualIdentification(List<IndividualIdentification> individualIdentification) {
    this.individualIdentification = individualIdentification;
    return this;
  }

  public Individual addIndividualIdentificationItem(IndividualIdentification individualIdentificationItem) {
    if (this.individualIdentification == null) {
      this.individualIdentification = new ArrayList<>();
    }
    this.individualIdentification.add(individualIdentificationItem);
    return this;
  }

  /**
   * List of official identifications issued to the individual, such as passport, driving licence, social security number
   * @return individualIdentification
   */
  @Valid 
  @Schema(name = "individualIdentification", description = "List of official identifications issued to the individual, such as passport, driving licence, social security number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("individualIdentification")
  public List<IndividualIdentification> getIndividualIdentification() {
    return individualIdentification;
  }

  public void setIndividualIdentification(List<IndividualIdentification> individualIdentification) {
    this.individualIdentification = individualIdentification;
  }

  public Individual disability(List<@Valid Disability> disability) {
    this.disability = disability;
    return this;
  }

  public Individual addDisabilityItem(Disability disabilityItem) {
    if (this.disability == null) {
      this.disability = new ArrayList<>();
    }
    this.disability.add(disabilityItem);
    return this;
  }

  /**
   * List of disabilities suffered by the individual
   * @return disability
   */
  @Valid 
  @Schema(name = "disability", description = "List of disabilities suffered by the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disability")
  public List<@Valid Disability> getDisability() {
    return disability;
  }

  public void setDisability(List<@Valid Disability> disability) {
    this.disability = disability;
  }

  public Individual languageAbility(List<@Valid LanguageAbility> languageAbility) {
    this.languageAbility = languageAbility;
    return this;
  }

  public Individual addLanguageAbilityItem(LanguageAbility languageAbilityItem) {
    if (this.languageAbility == null) {
      this.languageAbility = new ArrayList<>();
    }
    this.languageAbility.add(languageAbilityItem);
    return this;
  }

  /**
   * List of national languages known by the individual
   * @return languageAbility
   */
  @Valid 
  @Schema(name = "languageAbility", description = "List of national languages known by the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageAbility")
  public List<@Valid LanguageAbility> getLanguageAbility() {
    return languageAbility;
  }

  public void setLanguageAbility(List<@Valid LanguageAbility> languageAbility) {
    this.languageAbility = languageAbility;
  }

  public Individual skill(List<@Valid Skill> skill) {
    this.skill = skill;
    return this;
  }

  public Individual addSkillItem(Skill skillItem) {
    if (this.skill == null) {
      this.skill = new ArrayList<>();
    }
    this.skill.add(skillItem);
    return this;
  }

  /**
   * List of skills exhibited by the individual
   * @return skill
   */
  @Valid 
  @Schema(name = "skill", description = "List of skills exhibited by the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skill")
  public List<@Valid Skill> getSkill() {
    return skill;
  }

  public void setSkill(List<@Valid Skill> skill) {
    this.skill = skill;
  }

  public Individual familyName(@Nullable String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Contains the non-chosen or inherited name. Also known as last name in the Western context
   * @return familyName
   */
  
  @Schema(name = "familyName", description = "Contains the non-chosen or inherited name. Also known as last name in the Western context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyName")
  public @Nullable String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(@Nullable String familyName) {
    this.familyName = familyName;
  }

  public Individual givenName(@Nullable String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * First name of the individual
   * @return givenName
   */
  
  @Schema(name = "givenName", description = "First name of the individual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("givenName")
  public @Nullable String getGivenName() {
    return givenName;
  }

  public void setGivenName(@Nullable String givenName) {
    this.givenName = givenName;
  }


  public Individual atType(String atType) {
    super.atType(atType);
    return this;
  }

  public Individual atBaseType(String atBaseType) {
    super.atBaseType(atBaseType);
    return this;
  }

  public Individual atSchemaLocation(String atSchemaLocation) {
    super.atSchemaLocation(atSchemaLocation);
    return this;
  }

  public Individual href(String href) {
    super.href(href);
    return this;
  }

  public Individual id(String id) {
    super.id(id);
    return this;
  }

  public Individual externalReference(List<ExternalIdentifier> externalReference) {
    super.externalReference(externalReference);
    return this;
  }

  public Individual addExternalReferenceItem(ExternalIdentifier externalReferenceItem) {
    super.addExternalReferenceItem(externalReferenceItem);
    return this;
  }

  public Individual partyCharacteristic(List<Characteristic> partyCharacteristic) {
    super.partyCharacteristic(partyCharacteristic);
    return this;
  }

  public Individual addPartyCharacteristicItem(Characteristic partyCharacteristicItem) {
    super.addPartyCharacteristicItem(partyCharacteristicItem);
    return this;
  }

  public Individual taxExemptionCertificate(List<TaxExemptionCertificate> taxExemptionCertificate) {
    super.taxExemptionCertificate(taxExemptionCertificate);
    return this;
  }

  public Individual addTaxExemptionCertificateItem(TaxExemptionCertificate taxExemptionCertificateItem) {
    super.addTaxExemptionCertificateItem(taxExemptionCertificateItem);
    return this;
  }

  public Individual creditRating(List<PartyCreditProfile> creditRating) {
    super.creditRating(creditRating);
    return this;
  }

  public Individual addCreditRatingItem(PartyCreditProfile creditRatingItem) {
    super.addCreditRatingItem(creditRatingItem);
    return this;
  }

  public Individual relatedParty(List<RelatedPartyOrPartyRole> relatedParty) {
    super.relatedParty(relatedParty);
    return this;
  }

  public Individual addRelatedPartyItem(RelatedPartyOrPartyRole relatedPartyItem) {
    super.addRelatedPartyItem(relatedPartyItem);
    return this;
  }

  public Individual contactMedium(List<ContactMedium> contactMedium) {
    super.contactMedium(contactMedium);
    return this;
  }

  public Individual addContactMediumItem(ContactMedium contactMediumItem) {
    super.addContactMediumItem(contactMediumItem);
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
    Individual individual = (Individual) o;
    return Objects.equals(this.gender, individual.gender) &&
        Objects.equals(this.placeOfBirth, individual.placeOfBirth) &&
        Objects.equals(this.countryOfBirth, individual.countryOfBirth) &&
        Objects.equals(this.nationality, individual.nationality) &&
        Objects.equals(this.maritalStatus, individual.maritalStatus) &&
        Objects.equals(this.birthDate, individual.birthDate) &&
        Objects.equals(this.deathDate, individual.deathDate) &&
        Objects.equals(this.title, individual.title) &&
        Objects.equals(this.aristocraticTitle, individual.aristocraticTitle) &&
        Objects.equals(this.generation, individual.generation) &&
        Objects.equals(this.preferredGivenName, individual.preferredGivenName) &&
        Objects.equals(this.familyNamePrefix, individual.familyNamePrefix) &&
        Objects.equals(this.legalName, individual.legalName) &&
        Objects.equals(this.middleName, individual.middleName) &&
        Objects.equals(this.name, individual.name) &&
        Objects.equals(this.formattedName, individual.formattedName) &&
        Objects.equals(this.location, individual.location) &&
        Objects.equals(this.status, individual.status) &&
        Objects.equals(this.otherName, individual.otherName) &&
        Objects.equals(this.individualIdentification, individual.individualIdentification) &&
        Objects.equals(this.disability, individual.disability) &&
        Objects.equals(this.languageAbility, individual.languageAbility) &&
        Objects.equals(this.skill, individual.skill) &&
        Objects.equals(this.familyName, individual.familyName) &&
        Objects.equals(this.givenName, individual.givenName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, placeOfBirth, countryOfBirth, nationality, maritalStatus, birthDate, deathDate, title, aristocraticTitle, generation, preferredGivenName, familyNamePrefix, legalName, middleName, name, formattedName, location, status, otherName, individualIdentification, disability, languageAbility, skill, familyName, givenName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Individual {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    placeOfBirth: ").append(toIndentedString(placeOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    deathDate: ").append(toIndentedString(deathDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    aristocraticTitle: ").append(toIndentedString(aristocraticTitle)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    preferredGivenName: ").append(toIndentedString(preferredGivenName)).append("\n");
    sb.append("    familyNamePrefix: ").append(toIndentedString(familyNamePrefix)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formattedName: ").append(toIndentedString(formattedName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    individualIdentification: ").append(toIndentedString(individualIdentification)).append("\n");
    sb.append("    disability: ").append(toIndentedString(disability)).append("\n");
    sb.append("    languageAbility: ").append(toIndentedString(languageAbility)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
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

