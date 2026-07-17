package com.example;

import com.example.config.EnvironmentSelectionInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);

        // Manually adding the initializer class
        application.addInitializers(new EnvironmentSelectionInitializer());

        application.run(args);
    }
}