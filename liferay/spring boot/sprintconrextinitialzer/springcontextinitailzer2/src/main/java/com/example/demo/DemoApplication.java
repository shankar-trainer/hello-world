package com.example.demo;

import com.example.demo.initializer.MyCustomContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);

        // Register the initializer manually
        app.addInitializers(new MyCustomContextInitializer());

        app.run(args);
    }
}