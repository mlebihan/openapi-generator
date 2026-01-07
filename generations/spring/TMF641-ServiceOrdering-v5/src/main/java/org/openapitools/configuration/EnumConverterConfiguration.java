package org.openapitools.configuration;

import org.openapitools.model.OrderItemActionType;
import org.openapitools.model.ServiceOperatingStatusType;
import org.openapitools.model.ServiceOrderStateType;
import org.openapitools.model.ServiceStateType;
import org.openapitools.model.TaskStateType;

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
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.serviceOperatingStatusTypeConverter")
    Converter<String, ServiceOperatingStatusType> serviceOperatingStatusTypeConverter() {
        return new Converter<String, ServiceOperatingStatusType>() {
            @Override
            public ServiceOperatingStatusType convert(String source) {
                return ServiceOperatingStatusType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.serviceOrderStateTypeConverter")
    Converter<String, ServiceOrderStateType> serviceOrderStateTypeConverter() {
        return new Converter<String, ServiceOrderStateType>() {
            @Override
            public ServiceOrderStateType convert(String source) {
                return ServiceOrderStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.serviceStateTypeConverter")
    Converter<String, ServiceStateType> serviceStateTypeConverter() {
        return new Converter<String, ServiceStateType>() {
            @Override
            public ServiceStateType convert(String source) {
                return ServiceStateType.fromValue(source);
            }
        };
    }
    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.taskStateTypeConverter")
    Converter<String, TaskStateType> taskStateTypeConverter() {
        return new Converter<String, TaskStateType>() {
            @Override
            public TaskStateType convert(String source) {
                return TaskStateType.fromValue(source);
            }
        };
    }

}
