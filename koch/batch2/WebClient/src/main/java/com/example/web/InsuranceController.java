package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.model.Insurance;

import reactor.core.publisher.Flux;

@RestController

public class InsuranceController {

	WebClient client=WebClient.create("http://localhost:6060/insurance");
	
	@GetMapping("/all")
	public Flux<Insurance> getAllInsurance(){
	 return 	client.get().uri("/insurance").retrieve().bodyToFlux(Insurance.class);
	}
	
	
}
