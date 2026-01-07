package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AgreementSpecificationRef;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.CharacteristicSpecification;
import org.openapitools.model.ConstraintRef;
import org.openapitools.model.EntitySpecificationRelationship;
import org.openapitools.model.PartyRoleSpecification;
import org.openapitools.model.PermissionSpecificationSetRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.TargetEntitySchema;
import org.openapitools.model.TimePeriod;
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


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:50:00.575868917+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public interface PatchPartyRoleSpecification200Response {
}
