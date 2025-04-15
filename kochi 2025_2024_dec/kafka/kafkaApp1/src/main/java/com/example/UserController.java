package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable String  msg){
        kafkaTemplate.send("test",msg);
        log.info("message sent "+msg);
        return "message sent<p>:"+msg;
    }
    @KafkaListener(groupId = "group1",topics ="test",containerFactory = "kafkaListenerContainerFactory")
    @GetMapping("/welcome")
    public String receiveMessage(String msg){
        //logger.info("message is "+msg);
        System.out.println("received message "+msg);
        return  "Message  received "+msg;
    }
}
