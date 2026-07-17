package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

// Custom initializer
public class MyApplicationContextInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment env = applicationContext.getEnvironment();
        // Add a custom property before the context is refreshed
        env.getSystemProperties().put("app.custom.message", "Hello from Initializer!");
        System.out.println("ApplicationContextInitializer executed.");
    }

    // Main method to run without Spring Boot
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext();
//        context.addApplicationContextInitializer(new MyApplicationContextInitializer());
//        context.register(AppConfig.class);
//        context.refresh();
//
//        MyService service = context.getBean(MyService.class);
//        service.printMessage();
//
//        context.close();
//    }
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyApplicationContextInitializer.class);

        // Register your custom initializer here
        application.addInitializers(new MyApplicationContextInitializer());

        ConfigurableApplicationContext context = application.run(args);


        MyService service = context.getBean(MyService.class);
        service.printMessage();

        context.close();
    }
}


@Configuration
class AppConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}

// Simple service bean
class MyService {
    public void printMessage() {
        String message = System.getProperty("app.custom.message", "Default Message");
        System.out.println("Message: " + message);
    }
}