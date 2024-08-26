package com.ukg.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ukg.dto.Customer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
@RequestMapping("/receive")
//@AllArgsConstructor
public class MessageController1 {

    String received;

    @GetMapping("/welcome")
    public String getMessage(){
        return  received;
    }
//
//    @GetMapping("/welcome1")
//    public JSONPObject getMessage1(){
//        JSONPObject jsonObject= new JSONPObject(received );
//        return  jsonObject;
//    }

    @KafkaListener(groupId = "group-id-json-1", topics = "NewTopic", containerFactory = "kafkaListenerContainerFactory")
    public void receivedMessage(String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(message);
        System.out.println("Json message received using Kafka listener " + jsonString);
        received= jsonString;
    }
}
