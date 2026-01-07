package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Digital Identity Management API")
                                .description("## TMF720 - Digital Identity Management API  Digital Identity Management API enables the creation, management, and verification of digital identities for individuals, resources, and specific roles. Each identity can be associated with multiple authentication methods (such as passwords, biometrics, and tokens) and contact information to facilitate secure access and recovery.")
                                .version("5.0.0")
                )
        ;
    }
}