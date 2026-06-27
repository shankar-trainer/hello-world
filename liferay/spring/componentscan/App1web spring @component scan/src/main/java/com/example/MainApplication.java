package com.example;

import com.example.config.AppConfig;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // Initialize the Spring IoC Container using our configuration class
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the automatically scanned bean from the context
        UserService userService = context.getBean(UserService.class);
        
        // Use it
        userService.createUser("John Doe");

        // Close the context safely
        context.close();
    }
}