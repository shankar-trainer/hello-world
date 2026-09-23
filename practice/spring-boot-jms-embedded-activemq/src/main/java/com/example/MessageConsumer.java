package com.example;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    // Listens continuously to the specified destination queue
    @JmsListener(destination = "demo-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message from queue: " + message);
        // Put your business logic processing here
    }
}
