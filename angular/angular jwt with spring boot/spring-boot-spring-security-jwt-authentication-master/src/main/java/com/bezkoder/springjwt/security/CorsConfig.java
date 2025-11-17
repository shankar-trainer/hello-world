package com.bezkoder.springjwt.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import java.util.Collections;
import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public FilterRegistrationBean<CorsFilter> platformCorsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configAutenticacao = new CorsConfiguration();

        // Configure CORS settings
        configAutenticacao.setAllowCredentials(true);
        // Use setAllowedOriginPatterns("*") to allow all origins with credentials,
        // or list specific origins (e.g., "http://localhost:3000")
        configAutenticacao.setAllowedOriginPatterns(Collections.singletonList("*"));
        configAutenticacao.setAllowedHeaders(Collections.singletonList("*"));
        configAutenticacao.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS")); // Don't forget OPTIONS
        configAutenticacao.setMaxAge(3600L); // How long the results of a preflight request can be cached

        source.registerCorsConfiguration("/**", configAutenticacao); // Apply this configuration to all paths (/**)

        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE); // Ensure the CORS filter has the highest precedence
        return bean;
    }
}
