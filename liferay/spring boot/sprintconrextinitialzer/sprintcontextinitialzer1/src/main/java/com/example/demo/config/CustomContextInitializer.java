package com.example.demo.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MapPropertySource;
import java.util.HashMap;
import java.util.Map;

public class CustomContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    
    @Override
    public void initialize(ConfigurableApplicationContext context) {
        System.out.println("--- CustomContextInitializer: Initializing Context Pre-Refresh ---");
        
        // Example: Programmatically setting properties before any beans are created
        Map<String, Object> customProperties = new HashMap<>();
        customProperties.put("app.custom.welcome-message", "Welcome to the Programmatic Spring Boot CRUD API!");
        
        context.getEnvironment().getPropertySources().addLast(
            new MapPropertySource("customInitializerProperties", customProperties)
        );
    }
}
