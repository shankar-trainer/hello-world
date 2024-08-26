package com.ukg.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ukg.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
public class MessageController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
  //  KafkaTemplate<String, Object> kafkaTemplate1;
    KafkaTemplate<String, Customer> kafkaTemplate1;

    @PostMapping("/customer_send")
    public String sendMessage(@RequestBody Customer message) {
        try {
            kafkaTemplate1.send("NewTopic", message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "json message sent succuessfully";
    }

    @GetMapping("/publish/{msg}")
    public String sendMesage(@PathVariable("msg") String msg){
        kafkaTemplate.send("NewTopic",msg);
        return "message sent";
    }

    @GetMapping("/publish1")
    public String sendMesage1(@RequestParam("message") String msg){
        kafkaTemplate.send("NewTopic",msg);
        return "message sent1";
    }

}
