package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageProducer producer;

    // This creates an endpoint at http://localhost:8080/send
    @GetMapping("/send")
    public String publishMessage(@RequestParam("msg") String msg) {
        producer.sendMessage(msg);
        return "Successfully sent: " + msg;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> sendJson(@RequestBody UserDto user) {
        producer.sendJsonMessage(user);
        return ResponseEntity.ok("JSON message sent successfully to RabbitMQ!");
    }

}
