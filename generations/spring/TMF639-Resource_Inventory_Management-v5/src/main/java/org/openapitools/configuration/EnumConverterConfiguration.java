package org.openapitools.configuration;

import org.openapitools.model.OrderItemActionType;
import org.openapitools.model.ResourceAdministrativeStateType;
import org.openapitools.model.ResourceOperationalStateType;
import org.openapitools.model.ResourceStatusType;
import org.openapitools.model.ResourceUsageStateType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.orderItemActionTypeConverter")
    Converter<String, OrderItemActionType> orderItemActionTypeConverter() {
        return new Converter<String, OrderItemActionType>() {
            @Override
            public OrderItemActionType convert(String source) {
                return OrderItemActionType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.resourceAdministrativeStateTypeConverter")
    Converter<String, ResourceAdministrativeStateType> resourceAdministrativeStateTypeConverter() {
        return new Converter<String, ResourceAdministrativeStateType>() {
            @Override
            public ResourceAdministrativeStateType convert(String source) {
                return ResourceAdministrativeStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.resourceOperationalStateTypeConverter")
    Converter<String, ResourceOperationalStateType> resourceOperationalStateTypeConverter() {
        return new Converter<String, ResourceOperationalStateType>() {
            @Override
            public ResourceOperationalStateType convert(String source) {
                return ResourceOperationalStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.resourceStatusTypeConverter")
    Converter<String, ResourceStatusType> resourceStatusTypeConverter() {
        return new Converter<String, ResourceStatusType>() {
            @Override
            public ResourceStatusType convert(String source) {
                return ResourceStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.resourceUsageStateTypeConverter")
    Converter<String, ResourceUsageStateType> resourceUsageStateTypeConverter() {
        return new Converter<String, ResourceUsageStateType>() {
            @Override
            public ResourceUsageStateType convert(String source) {
                return ResourceUsageStateType.fromValue(source);
            }
        };
    }

}
