package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible values for product relationship - This is informative information and implementation are free to use distinct.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:31.595271289+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
public enum ProductRelationshipType {
  
  MIGRATES_TO("migratesTo"),
  
  BUNDLES("bundles"),
  
  BUNDLED_BY("bundledBy"),
  
  RELIES_ON("reliesOn"),
  
  ENABLES("enables"),
  
  REQUIRES("requires"),
  
  DEPENDS_ON("dependsOn"),
  
  BRINGS("brings");

  private final String value;

  ProductRelationshipType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductRelationshipType fromValue(String value) {
    for (ProductRelationshipType b : ProductRelationshipType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

