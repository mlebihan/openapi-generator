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
import org.openapitools.model.ExternalReference;
import org.openapitools.model.Note;
import org.openapitools.model.OrderSpecificationRef;
import org.openapitools.model.RelatedPartyRefOrPartyRoleRef;
import org.openapitools.model.ServiceOrder;
import org.openapitools.model.ServiceOrderErrorMessage;
import org.openapitools.model.ServiceOrderItem;
import org.openapitools.model.ServiceOrderJeopardyAlert;
import org.openapitools.model.ServiceOrderMilestone;
import org.openapitools.model.ServiceOrderRelationship;
import org.openapitools.model.ServiceOrderStateType;
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


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T10:17:52.404004263+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public interface PatchServiceOrder200Response {
}
