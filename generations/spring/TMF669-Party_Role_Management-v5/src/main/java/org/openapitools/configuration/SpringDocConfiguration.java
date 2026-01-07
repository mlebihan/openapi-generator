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
                                .title("Party Role Management")
                                .description("**TMF API Reference : TMF669 - Party Role Management API**  **Release : 23.0 - June 2023**  This API can be seen as a generalization of TMF629 Customer Management API where Party Roles may be any – not only a Customer. It shares the same data structure as the TMF629 Customer Management API but its use is intended for more general cases, for instance within a partnership where the defined roles depend on the partnership kind (see TMF668 Partnership Type Management API).  This API defines 2 resources: - PartyRole: it is the basis data for a partyRole (customer, partner...). It is the business incarnation of the Party. It assumes the use of the following API : TMF632 Party Management API for access to parties, TMF666 Account Management API for definition of accounts, TMF651 Agreement Management API for agreement definition, - PartyRoleSpecification: this resource provides characteristics to describe a partyRole and the context where the partyRole is created. A partyRoleSpecification contains a reference to an array of permissionSpecificationSet (see TMF672 User Roles and Permissions API). They provide information on the permissions to build when creating a new PartyRole.  This API plays an important role in the global party domain relating to TMF672 User Roles and Permissions API, TMF632 Party Management API, TMF669 Party Role Management API, TMF629 Customer Management API, TMF720 Digital Identity Management API, TMF691 Federated Identity API and TMF639 Resource Management API. In summary, these TM Forum Open APIs are related to managing parties and their associated roles and digital identities within a network, as well as controlling access to information and resources through user roles and permissions. They provide a standardized way for organizations to manage these processes and enable integration with other systems.")
                                .version("5.0.0")
                )
        ;
    }
}