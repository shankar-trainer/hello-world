package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Tells Spring to search the 'com.example.service' package for components
//@ComponentScan(basePackages = "com.example.service")
public class AppConfig {
    // No need to write manual @Bean methods for UserService anymore!
}