package com.example.commandeservice.controller;

import com.example.commandeservice.model.Commande;
import com.example.commandeservice.repository.CommandeRepository;
import com.example.commandeservice.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping
    public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
        Commande savedCommande = commandeRepository.save(commande);
        kafkaProducerService.sendCommandeCreeeEvent(savedCommande.getId(), savedCommande.getProduitId());
        return ResponseEntity.ok(savedCommande);
    }
}