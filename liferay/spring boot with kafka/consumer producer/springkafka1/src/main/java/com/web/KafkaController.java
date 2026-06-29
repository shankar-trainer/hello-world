package com.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.service.KafkaProducerService;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/publish")
    public String sendToKafka(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka successfully!";
    }
}
