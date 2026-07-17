package com.example.demo.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import java.util.Map;

public class MyCustomContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // 1. Access the environment
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        // 2. Programmatically set an active profile
        environment.addActiveProfile("performance-mode");

        // 3. Inject a dynamic runtime property
        Map<String, Object> customProperties = Map.of("dynamic.api.timeout", "5000");
        MapPropertySource propertySource = new MapPropertySource("myCustomSource", customProperties);
        environment.getPropertySources().addFirst(propertySource);

        System.out.println(">>> MyCustomContextInitializer: Context initialized successfully!");
    }
}