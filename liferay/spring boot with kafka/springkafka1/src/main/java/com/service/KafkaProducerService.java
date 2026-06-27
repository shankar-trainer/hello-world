package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "important-messages";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        // Sends the message string to our specified topic
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Sent message: " + message);
    }
}
