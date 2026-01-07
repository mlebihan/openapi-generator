package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.ExportJobCreateEvent;
import org.openapitools.model.ExportJobDeleteEvent;
import org.openapitools.model.ExportJobStateChangeEvent;
import org.openapitools.model.ImportJobCreateEvent;
import org.openapitools.model.ImportJobDeleteEvent;
import org.openapitools.model.ImportJobStateChangeEvent;
import org.openapitools.model.ResourceCandidateAttributeValueChangeEvent;
import org.openapitools.model.ResourceCandidateCreateEvent;
import org.openapitools.model.ResourceCandidateDeleteEvent;
import org.openapitools.model.ResourceCandidateStatusChangeEvent;
import org.openapitools.model.ResourceCatalogAttributeValueChangeEvent;
import org.openapitools.model.ResourceCatalogCreateEvent;
import org.openapitools.model.ResourceCatalogDeleteEvent;
import org.openapitools.model.ResourceCatalogStatusChangeEvent;
import org.openapitools.model.ResourceCategoryAttributeValueChangeEvent;
import org.openapitools.model.ResourceCategoryCreateEvent;
import org.openapitools.model.ResourceCategoryDeleteEvent;
import org.openapitools.model.ResourceCategoryStatusChangeEvent;
import org.openapitools.model.ResourceSpecificationAttributeValueChangeEvent;
import org.openapitools.model.ResourceSpecificationCreateEvent;
import org.openapitools.model.ResourceSpecificationDeleteEvent;
import org.openapitools.model.ResourceSpecificationStatusChangeEvent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-07T14:47:47.894773969+01:00[Europe/Paris]", comments = "Generator version: 7.19.0-SNAPSHOT")
@Controller
@RequestMapping("${openapi.resourceCatalogManagement.base-path:/resourceCatalog/v5}")
public class ListenerApiController implements ListenerApi {

    private final NativeWebRequest request;

    @Autowired
    public ListenerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
