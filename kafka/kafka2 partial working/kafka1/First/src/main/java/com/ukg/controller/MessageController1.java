package com.ukg.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.ukg.model.Customer;
import com.ukg.repoository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receive")
public class MessageController1 {
    Customer c = null;

    @Autowired
    CustomerRepository repository;

    @GetMapping("/welcome")
    public Customer getMessage() {
        //return c;
        return repository.findById(1L).get();
    }

    @KafkaListener(groupId = "group-id-json-1", topics = "NewTopic", containerFactory = "kafkaListenerContainerFactory")
  //  @KafkaListener(groupId = "group-id-json-1", topics = "NewTopic")
    public void receivedMessage(Customer message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(message);
        System.out.println("Json message received using Kafka listener " + jsonString);
        //  c = message;
        System.out.println(message);
        repository.save(message);
    }
}
