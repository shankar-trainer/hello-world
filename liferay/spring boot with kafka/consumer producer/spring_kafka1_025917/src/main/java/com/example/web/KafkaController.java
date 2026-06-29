package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.KafkaProducerService;

@RestController
@RequestMapping("/")
public class KafkaController {

	@Autowired
	private KafkaProducerService service;
	
	@PostMapping("/send/{msg}")
	public void senndMessage(@PathVariable  String msg) {
	  service.sendMessage(msg);
	  
	}
	
	@PostMapping("/send1")
	public void senndMessage1(@RequestParam("msg") String msg) {
		service.sendMessage(msg);
		
	}

	
}
