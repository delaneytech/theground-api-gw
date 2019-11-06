package io.theground.api

import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableDiscoveryClient
class RouterConfig {

    @Bean
    fun discovery (discoveryClient: DiscoveryClient) =
            DiscoveryClientRouteDefinitionLocator(discoveryClient, DiscoveryLocatorProperties())

//    @Bean
//    fun routes (builder : RouteLocatorBuilder): RouteLocator =
//            builder.routes()
//                    .route {
//                        it.path("/functions*")
//                                .uri("http://localhost:8081/functions")}
//                    .route {
//                        it.path("/functions/*")
//                                .uri("http://localhost:8081/functions")
//                    }
//                    .route {
//                        it.path("/topics*")
//                                .uri("http://localhost:8084/topics")
//                    }
//                    .route {
//                        it.path("/topics/*")
//                                .uri("http://localhost:8084/topics")
//                    }
//                    .build()
}