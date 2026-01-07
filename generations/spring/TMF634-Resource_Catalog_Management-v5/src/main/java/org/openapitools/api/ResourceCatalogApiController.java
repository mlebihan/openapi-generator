package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.JsonPatch;
import org.springframework.lang.Nullable;
import org.openapitools.model.PatchResourceCatalog200Response;
import org.openapitools.model.ResourceCatalog;
import org.openapitools.model.ResourceCatalogFVO;
import org.openapitools.model.ResourceCatalogMVO;


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
public class ResourceCatalogApiController implements ResourceCatalogApi {

    private final NativeWebRequest request;

    @Autowired
    public ResourceCatalogApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
