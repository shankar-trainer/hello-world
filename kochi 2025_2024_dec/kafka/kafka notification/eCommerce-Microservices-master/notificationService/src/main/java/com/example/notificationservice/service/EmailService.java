package com.example.notificationservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("postmaster@sandboxaf6a5713b47d457bb8fb2c9c25df583b.mailgun.org"); // Sender's email
//        message.setTo("labassimarouene@gmail.com");

        message.setFrom("shankar7979@gmail.com"); // Sender's email
        message.setTo(to); // Recipient's email

        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
        log.info("mail sent");
    }
}
