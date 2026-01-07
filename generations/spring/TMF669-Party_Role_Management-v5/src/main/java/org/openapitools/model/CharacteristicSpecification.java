package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CharacteristicSpecificationRelationship;
import org.openapitools.model.CharacteristicValueSpecification;
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
 * CharacteristicSpecification
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public class CharacteristicSpecification {

  private String atType;

  private @Nullable String atBaseType;

  private @Nullable String atSchemaLocation;

  private @Nullable String id;

  private @Nullable String name;

  private @Nullable String valueType;

  private @Nullable String description;

  private @Nullable Boolean configurable;

  private @Nullable TimePeriod validFor;

  private @Nullable Integer minCardinality;

  private @Nullable Integer maxCardinality;

  private @Nullable Boolean isUnique;

  private @Nullable String regex;

  private @Nullable Boolean extensible;

  private @Nullable String atValueSchemaLocation;

  @Valid
  private List<CharacteristicSpecificationRelationship> charSpecRelationship = new ArrayList<>();

  @Valid
  private List<CharacteristicValueSpecification> characteristicValueSpecification = new ArrayList<>();

  public CharacteristicSpecification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CharacteristicSpecification(String atType) {
    this.atType = atType;
  }

  public CharacteristicSpecification atType(String atType) {
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

  public CharacteristicSpecification atBaseType(@Nullable String atBaseType) {
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

  public CharacteristicSpecification atSchemaLocation(@Nullable String atSchemaLocation) {
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

  public CharacteristicSpecification id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the characteristic
   * @return id
   */
  
  @Schema(name = "id", description = "Unique ID for the characteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public CharacteristicSpecification name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   * @return name
   */
  
  @Schema(name = "name", description = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CharacteristicSpecification valueType(@Nullable String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   * @return valueType
   */
  
  @Schema(name = "valueType", description = "A kind of value that the characteristic can take on, such as numeric, text and so forth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueType")
  public @Nullable String getValueType() {
    return valueType;
  }

  public void setValueType(@Nullable String valueType) {
    this.valueType = valueType;
  }

  public CharacteristicSpecification description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   * @return description
   */
  
  @Schema(name = "description", description = "A narrative that explains the CharacteristicSpecification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public CharacteristicSpecification configurable(@Nullable Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   * @return configurable
   */
  
  @Schema(name = "configurable", description = "If true, the Boolean indicates that the target Characteristic is configurable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configurable")
  public @Nullable Boolean getConfigurable() {
    return configurable;
  }

  public void setConfigurable(@Nullable Boolean configurable) {
    this.configurable = configurable;
  }

  public CharacteristicSpecification validFor(@Nullable TimePeriod validFor) {
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

  public CharacteristicSpecification minCardinality(@Nullable Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   * @return minCardinality
   */
  
  @Schema(name = "minCardinality", description = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minCardinality")
  public @Nullable Integer getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(@Nullable Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  public CharacteristicSpecification maxCardinality(@Nullable Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   * @return maxCardinality
   */
  
  @Schema(name = "maxCardinality", description = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxCardinality")
  public @Nullable Integer getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(@Nullable Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public CharacteristicSpecification isUnique(@Nullable Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * Specifies if the value of this characteristic is unique across all entities instantiated from the specification that uses this characteristc. For example, consider a ProductSpecification for a set-top box, with a CharacteristicSpecification cardID. Each set-top box must have a different value for cardID, so this isUnique attribute would be set to true for the characteristic.
   * @return isUnique
   */
  
  @Schema(name = "isUnique", description = "Specifies if the value of this characteristic is unique across all entities instantiated from the specification that uses this characteristc. For example, consider a ProductSpecification for a set-top box, with a CharacteristicSpecification cardID. Each set-top box must have a different value for cardID, so this isUnique attribute would be set to true for the characteristic.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isUnique")
  public @Nullable Boolean getIsUnique() {
    return isUnique;
  }

  public void setIsUnique(@Nullable Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public CharacteristicSpecification regex(@Nullable String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   * @return regex
   */
  
  @Schema(name = "regex", description = "A rule or principle represented in regular expression used to derive the value of a characteristic value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regex")
  public @Nullable String getRegex() {
    return regex;
  }

  public void setRegex(@Nullable String regex) {
    this.regex = regex;
  }

  public CharacteristicSpecification extensible(@Nullable Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   * @return extensible
   */
  
  @Schema(name = "extensible", description = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extensible")
  public @Nullable Boolean getExtensible() {
    return extensible;
  }

  public void setExtensible(@Nullable Boolean extensible) {
    this.extensible = extensible;
  }

  public CharacteristicSpecification atValueSchemaLocation(@Nullable String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
    return this;
  }

  /**
   * This (optional) field provides a link to the schema describing the value type.
   * @return atValueSchemaLocation
   */
  
  @Schema(name = "@valueSchemaLocation", description = "This (optional) field provides a link to the schema describing the value type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@valueSchemaLocation")
  public @Nullable String getAtValueSchemaLocation() {
    return atValueSchemaLocation;
  }

  public void setAtValueSchemaLocation(@Nullable String atValueSchemaLocation) {
    this.atValueSchemaLocation = atValueSchemaLocation;
  }

  public CharacteristicSpecification charSpecRelationship(List<CharacteristicSpecificationRelationship> charSpecRelationship) {
    this.charSpecRelationship = charSpecRelationship;
    return this;
  }

  public CharacteristicSpecification addCharSpecRelationshipItem(CharacteristicSpecificationRelationship charSpecRelationshipItem) {
    if (this.charSpecRelationship == null) {
      this.charSpecRelationship = new ArrayList<>();
    }
    this.charSpecRelationship.add(charSpecRelationshipItem);
    return this;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   * @return charSpecRelationship
   */
  @Valid 
  @Schema(name = "charSpecRelationship", description = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("charSpecRelationship")
  public List<CharacteristicSpecificationRelationship> getCharSpecRelationship() {
    return charSpecRelationship;
  }

  public void setCharSpecRelationship(List<CharacteristicSpecificationRelationship> charSpecRelationship) {
    this.charSpecRelationship = charSpecRelationship;
  }

  public CharacteristicSpecification characteristicValueSpecification(List<CharacteristicValueSpecification> characteristicValueSpecification) {
    this.characteristicValueSpecification = characteristicValueSpecification;
    return this;
  }

  public CharacteristicSpecification addCharacteristicValueSpecificationItem(CharacteristicValueSpecification characteristicValueSpecificationItem) {
    if (this.characteristicValueSpecification == null) {
      this.characteristicValueSpecification = new ArrayList<>();
    }
    this.characteristicValueSpecification.add(characteristicValueSpecificationItem);
    return this;
  }

  /**
   * A CharacteristicValueSpecification object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a CharacteristicSpecification object. The values of the attributes in the CharacteristicValueSpecification object describe the values of the attributes that a corresponding Characteristic object can take on.
   * @return characteristicValueSpecification
   */
  @Valid 
  @Schema(name = "characteristicValueSpecification", description = "A CharacteristicValueSpecification object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a CharacteristicSpecification object. The values of the attributes in the CharacteristicValueSpecification object describe the values of the attributes that a corresponding Characteristic object can take on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("characteristicValueSpecification")
  public List<CharacteristicValueSpecification> getCharacteristicValueSpecification() {
    return characteristicValueSpecification;
  }

  public void setCharacteristicValueSpecification(List<CharacteristicValueSpecification> characteristicValueSpecification) {
    this.characteristicValueSpecification = characteristicValueSpecification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicSpecification characteristicSpecification = (CharacteristicSpecification) o;
    return Objects.equals(this.atType, characteristicSpecification.atType) &&
        Objects.equals(this.atBaseType, characteristicSpecification.atBaseType) &&
        Objects.equals(this.atSchemaLocation, characteristicSpecification.atSchemaLocation) &&
        Objects.equals(this.id, characteristicSpecification.id) &&
        Objects.equals(this.name, characteristicSpecification.name) &&
        Objects.equals(this.valueType, characteristicSpecification.valueType) &&
        Objects.equals(this.description, characteristicSpecification.description) &&
        Objects.equals(this.configurable, characteristicSpecification.configurable) &&
        Objects.equals(this.validFor, characteristicSpecification.validFor) &&
        Objects.equals(this.minCardinality, characteristicSpecification.minCardinality) &&
        Objects.equals(this.maxCardinality, characteristicSpecification.maxCardinality) &&
        Objects.equals(this.isUnique, characteristicSpecification.isUnique) &&
        Objects.equals(this.regex, characteristicSpecification.regex) &&
        Objects.equals(this.extensible, characteristicSpecification.extensible) &&
        Objects.equals(this.atValueSchemaLocation, characteristicSpecification.atValueSchemaLocation) &&
        Objects.equals(this.charSpecRelationship, characteristicSpecification.charSpecRelationship) &&
        Objects.equals(this.characteristicValueSpecification, characteristicSpecification.characteristicValueSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, atBaseType, atSchemaLocation, id, name, valueType, description, configurable, validFor, minCardinality, maxCardinality, isUnique, regex, extensible, atValueSchemaLocation, charSpecRelationship, characteristicValueSpecification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicSpecification {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    atValueSchemaLocation: ").append(toIndentedString(atValueSchemaLocation)).append("\n");
    sb.append("    charSpecRelationship: ").append(toIndentedString(charSpecRelationship)).append("\n");
    sb.append("    characteristicValueSpecification: ").append(toIndentedString(characteristicValueSpecification)).append("\n");
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

