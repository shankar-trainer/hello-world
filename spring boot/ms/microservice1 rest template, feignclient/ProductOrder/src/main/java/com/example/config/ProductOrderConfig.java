package com.example.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProductOrderConfig {

    @Bean
    @LoadBalanced
        // Enables Eureka-based service discovery

    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
