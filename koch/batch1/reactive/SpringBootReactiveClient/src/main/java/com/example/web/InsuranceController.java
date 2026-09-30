package com.example.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.model.Insurance;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class InsuranceController {

	WebClient webClient = WebClient.create("http://localhost:6060/insurance/");

	@GetMapping("/all")
	public Flux<Insurance> getAll() {
		return webClient.get().uri("insurance").retrieve().bodyToFlux(Insurance.class);
	}
	
	@GetMapping("/find/{id}")
	public Mono<Insurance> getById(@PathVariable("id") int id) {
		return webClient.get().uri("insurance/"+id).retrieve().bodyToMono(Insurance.class);
	}
	
	@PostMapping("/add")
	public Mono<Insurance> addInsurance(@RequestBody Insurance insurance) {
//		return webClient.post().uri("insurance").syncBody(insurance).retrieve().bodyToMono(Insurance.class);
		return webClient.post().uri("insurance").bodyValue(insurance).retrieve().bodyToMono(Insurance.class);
	}
	
	@PutMapping("/update")
	public Mono<Insurance> updateInsurance(@RequestBody Insurance insurance) {
//		return webClient.put().uri("insurance").syncBody(insurance).retrieve().bodyToMono(Insurance.class);
		return webClient.put().uri("insurance").bodyValue(insurance).retrieve().bodyToMono(Insurance.class);
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<Insurance> deleteInsurance(@PathVariable("id") int id) {
		return webClient.delete().uri("insurance/"+id).retrieve().bodyToMono(Insurance.class);
	}
	

}

//http://localhost:9092/find/1
//http://localhost:9092/all
//http://localhost:9092/add
//http://localhost:9092/delete/1
//http://localhost:9092/update






