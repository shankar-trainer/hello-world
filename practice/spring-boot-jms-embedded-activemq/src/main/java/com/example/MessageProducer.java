package com.example;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private final JmsTemplate jmsTemplate;

    // JmsTemplate is automatically injected by Spring Boot
    public MessageProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String queueName, String message) {
        System.out.println("Sending message: " + message + " to queue: " + queueName);
        jmsTemplate.convertAndSend(queueName, message);
    }
}
