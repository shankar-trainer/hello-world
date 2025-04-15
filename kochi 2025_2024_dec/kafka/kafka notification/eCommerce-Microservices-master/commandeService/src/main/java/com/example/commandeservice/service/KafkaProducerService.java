package com.example.commandeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "cts-topic";
//    private static final String TOPIC = "commande-creee";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendCommandeCreeeEvent(Long commandeId, Long produitId) {
        String message = String.format("Order %d createdfor product %d", commandeId, produitId);
        kafkaTemplate.send(TOPIC, message);
    }
}