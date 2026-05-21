package com.cts.mail;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) {
        // 1. Define Mail Server Properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.example.com"); // Replace with your SMTP Host
        properties.put("mail.smtp.port", "587");             // 587 is standard for TLS
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");  // Enable TLS encryption

        // 2. Credentials
        final String username = "your-email@example.com";
        final String password = "your-app-password"; // Use App Passwords for Gmail/Outlook

        // 3. Create the Session object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // 4. Create a default MimeMessage object
            Message message = new MimeMessage(session);

            // 5. Set From, To, Subject, and Body
            message.setFrom(new InternetAddress("your-email@example.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("recipient@example.com")
            );
            message.setSubject("Testing JavaMail API");
            message.setText("Hello, this is a test email sent from a Java application!");

            // 6. Send message
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}