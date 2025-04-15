package com.example.notificationservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @Autowired
    private EmailService emailService;

    @KafkaListener(topics = "cts-topic", groupId = "notification-group")
    public void listen(String message) {
        logger.info("Notification received: {}", message);

        // Example recipient email (replace with actual customer email)
        //String emailRecipient = "labassimarouene@gmail.com ";
//        String emailRecipient = "Shankar.Kumar@cognizant.com";
        String emailRecipient = "sankar.jaiswal@gmail.com";
        String emailSubject = "Order Confirmation";
        String emailBody = "Hello ,\n\nYour order has been successfully created.\nDetails: " + message;

        // Send the email
        emailService.sendEmail(emailRecipient, emailSubject, emailBody);
        logger.info("Confirmation email sent to: {}", emailRecipient);
    }
}
