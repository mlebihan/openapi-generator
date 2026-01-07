package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.Disability;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.Individual;
import org.openapitools.model.IndividualIdentification;
import org.openapitools.model.IndividualStateType;
import org.openapitools.model.LanguageAbility;
import org.openapitools.model.OtherNameIndividual;
import org.openapitools.model.PartyCreditProfile;
import org.openapitools.model.RelatedPartyOrPartyRole;
import org.openapitools.model.Skill;
import org.openapitools.model.TaxExemptionCertificate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public interface PatchIndividual200Response {
}
