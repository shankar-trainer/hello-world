package com;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.MessageConsumer;
import com.example.MessageProducer;

@SpringBootApplication
public class JmsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runDemo(MessageProducer producer) {
        return args -> {
            // Sends a sample text message over to the listener queue
            producer.sendMessage("demo-queue", "Hello World from Spring Boot JMS!");
        };
    }
}
