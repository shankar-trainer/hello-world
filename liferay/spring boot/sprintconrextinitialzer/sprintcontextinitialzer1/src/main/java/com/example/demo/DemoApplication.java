package com.example.demo;

import com.example.demo.config.CustomContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        
        // Register the context initializer programmatically
        app.addInitializers(new CustomContextInitializer());
        
        app.run(args);
    }
}