package com.api.gateway.config;

@Configuration
public class ConfigRouter {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/test-gateway/**")
                        .uri("https://www.google.com/")
                        .id("google"))
                /*
                Exemplo buscando rota no service registry precisa utilizar o lb://{nome-da-aplicação}
                .route(r -> r.path("/consumer/**")
                        .uri("lb://SECOND-SERVICE")
                        .id("consumerModule"))

                 */
                .build();
    }
}