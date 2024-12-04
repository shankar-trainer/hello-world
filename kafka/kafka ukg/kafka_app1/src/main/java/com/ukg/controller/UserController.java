package com.ukg.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class UserController {

    Logger logger =Logger.getLogger(UserController.class);

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    @GetMapping("/send/{msg}")
    public String hello(@PathVariable("msg") String message){
        kafkaTemplate.send("ukg-topic",message);
     return  "Message Sent is "+message;
    }

    @KafkaListener(groupId = "group1",topics ="ukg-topic",containerFactory = "kafkaListenerContainerFactory")
    public void receiveMessage(String msg){
        logger.info("message is "+msg);
        System.out.println("received message "+msg);
    }

}
