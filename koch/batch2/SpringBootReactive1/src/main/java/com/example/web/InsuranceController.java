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

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/insurance")
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
		try {
			return new ResponseEntity<>(service.addInsurance(insurance), HttpStatus.CREATED);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/insurance/{id}")
	public ResponseEntity<Insurance> findInsuranceById(@PathVariable int id) {
		try {
			return new ResponseEntity<>(service.findInsuranceById(id), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/insurance")
	public ResponseEntity<List<Insurance>> getAllInsurance() {
		try {
			return new ResponseEntity<>(service.getAllInsurance(), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/insurance")
	public ResponseEntity<Insurance> updateInsurance(@RequestBody Insurance insurance) {
		try {
			return new ResponseEntity<>(service.updateInsurance(insurance), HttpStatus.CREATED);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/insurance")
	public  ResponseEntity<Insurance> deleteInsurance(int id) {
		try {
			return new ResponseEntity<>(service.deleteInsurance(id), HttpStatus.OK);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

}
