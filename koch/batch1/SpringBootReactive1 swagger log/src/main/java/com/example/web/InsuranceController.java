package com.example.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.InsuranceException;
import com.example.model.Insurance;
import com.example.service.InsuranceService;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/insurance")
@Slf4j

public class InsuranceController {

	@Autowired
	InsuranceService service;
	
	@GetMapping("/insurance1")
	public Flux<Insurance> getAllInsurance1() {
	 return	Flux.just(
				Insurance.builder().insuranceName("health insurance").startDate(LocalDate.now()).years(10).build(),
				Insurance.builder().insuranceName("bike insurance").startDate(LocalDate.of(2022, 12, 12)).years(1)
						.build(),
				Insurance.builder().insuranceName("home insurance").startDate(LocalDate.of(2021, 12, 12)).years(5)
						.build(),
				Insurance.builder().insuranceName("mobile insurance").startDate(LocalDate.of(2020, 12, 12)).years(10)
						.build() 
			 );
	}
	
	@GetMapping("/insurance2")
	public Mono<Insurance> getInsurance1() {
		return	Mono.just(
				Insurance.builder().insuranceName("health insurance").startDate(LocalDate.now()).years(10).build()
				);
	}

	@PostMapping("/insurance")
	public ResponseEntity<Insurance> addInsurance(@RequestBody Insurance insurance) {
		log.info("addInsurance");
		try {
			log.info("insurance saved ");
			return new ResponseEntity<>(service.addInsurance(insurance), HttpStatus.CREATED);
		} catch (InsuranceException e) {
			log.error("add insurance error "+e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/insurance/{id}")
	public ResponseEntity<Insurance> findInsuranceById(@PathVariable int id) {
		log.info("findInsuranceById");
		try {
			log.info("found "+service.findInsuranceById(id));
			return new ResponseEntity<>(service.findInsuranceById(id), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			log.error("error "+e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/insurance")
	public ResponseEntity<List<Insurance>> getAllInsurance() {
		log.info("getAllInsurance");
		try {
			log.info("found "+service.getAllInsurance());
			return new ResponseEntity<>(service.getAllInsurance(), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			log.error("error "+e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/insurance")
	public ResponseEntity<Insurance> updateInsurance(@RequestBody Insurance insurance) {
		log.info("updateInsurance");
		try {
			Insurance updateInsurance = service.updateInsurance(insurance);
			log.info("updated "+updateInsurance+"status "+HttpStatus.CREATED);
			return new ResponseEntity<>(updateInsurance, HttpStatus.CREATED);
		} catch (InsuranceException e) {
			log.error(e.getMessage()+" status "+HttpStatus.NOT_FOUND);
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/insurance/{id}")
	public  ResponseEntity<Insurance> deleteInsurance(@PathVariable("id") int id) {
		log.info("deleteInsurance");
		try {
			Insurance deleteInsurance = service.deleteInsurance(id);
			log.info("deleted with id "+id+" value "+deleteInsurance+" status "+HttpStatus.OK);
			return new ResponseEntity<>(deleteInsurance, HttpStatus.OK);
		} catch (InsuranceException e) {
			log.error(e.getMessage());
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}
