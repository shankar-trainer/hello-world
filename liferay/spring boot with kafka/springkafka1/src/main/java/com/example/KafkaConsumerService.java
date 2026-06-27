package com.example;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "important-messages", groupId = "my-first-group")
    public void consumeMessage(String message) {
        // This runs automatically whenever a new message lands on the topic
        System.out.println("Successfully consumed message: " + message);
    }
}
