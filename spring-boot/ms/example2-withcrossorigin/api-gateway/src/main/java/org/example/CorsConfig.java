//package org.example;
//
//import org.springframework.cloud.gateway.config.GlobalCorsProperties;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.reactive.CorsWebFilter;
//import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.config.CorsRegistry;
//
//import java.util.List;
//
//
//@Configuration
//public class CorsConfig {
//
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("example_route", r -> r.path("/example/**")
//                        .uri("http://localhost:8081")
//                )
//                .build();
//    }
//
//    @Bean
//    public CorsWebFilter corsWebFilter() {
//
//        CorsConfiguration corsConfig = new CorsConfiguration();
//
//        // 1. Specify allowed origins (Use specific domains in production)
//        // Note: When allowCredentials is true, wildcards like "*" are typically
//        // rejected by modern browsers; use setAllowedOriginPatterns instead.
////        corsConfig.setAllowedOriginPatterns(List.of("http://localhost:8080"));
//        corsConfig.setAllowedOriginPatterns(List.of("*"));
//
//        // 2. Specify allowed HTTP methods
//        corsConfig.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH"));
//
//        // 3. Specify allowed headers (or use "*" for all)
//        corsConfig.setAllowedHeaders(List.of("*"));
//
//        // 4. Expose headers if your frontend needs to read custom response headers
//        corsConfig.setExposedHeaders(List.of("Authorization", "Link", "X-Total-Count"));
//
//        // 5. Allow credentials (cookies, authorization headers)
//        corsConfig.setAllowCredentials(true);
//
//        // 6. Cache pre-flight response duration (in seconds)
//        corsConfig.setMaxAge(3600L);
//
//        // Register the configuration for all paths
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfig);
//
//        return new CorsWebFilter(source);
//    }
//}
