package io.theground.api

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RouterConfig {

    @Bean
    fun routes (builder : RouteLocatorBuilder): RouteLocator =
            builder.routes()
                    .route {
                        it.path("/functions*")
                                .uri("http://function-api.api/functions")}
                    .route {
                        it.path("/functions/*")
                                .uri("http://function-api.api/functions")
                    }
                    .build()
}