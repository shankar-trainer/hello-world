package com.example.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class EnvironmentSelectionInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // Retrieve the current environment interface
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        // Read an environment variable or system property (e.g., -DAPP_ENV=prod)
        String currentEnv = System.getProperty("APP_ENV");

        if (currentEnv == null) {
            currentEnv = System.getenv("APP_ENV");
        }

        // Determine profile to activate based on the variable value
        if ("prod".equalsIgnoreCase(currentEnv)) {
            environment.setActiveProfiles("prod");
            System.out.println("Initializer: Activated 'prod' profile.");
        } else {
            // Default to dev if not specified or explicitly set to dev
            environment.setActiveProfiles("dev");
            System.out.println("Initializer: Activated 'dev' profile.");
        }
    }
}