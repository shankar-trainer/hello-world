package com.cts.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exception.InsuranceException;
import com.cts.model.Insurance;
import com.cts.service.InsuranceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/insurance")
@AllArgsConstructor
public class InsuranceController1 {

	InsuranceService insuranceService;

	@PostMapping
	public ResponseEntity<Insurance> addInsurance(@RequestBody Insurance insurance) {
		try {
			return new ResponseEntity<>(insuranceService.addInsurance(insurance), HttpStatus.CREATED);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping
	public ResponseEntity<Insurance> updateInsurance(@RequestBody Insurance insurance) {
		try {
			return new ResponseEntity<>(insuranceService.updateInsurance(insurance), HttpStatus.OK);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

//	@RequestMapping
	@GetMapping
	public ResponseEntity<List<Insurance>> getAllInsurance() {
		try {
			return new ResponseEntity<>(insuranceService.getAllInsurance(), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Insurance> deleteInsurance(@PathVariable int id) {
		try {
			return new ResponseEntity<>(insuranceService.deleteInsurance(id), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping("/{id}")
	public ResponseEntity<Insurance> searchInsurance(@PathVariable int id) {
		try {
			return new ResponseEntity<>(insuranceService.searchInsurance(id), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping
	public ResponseEntity<Insurance> searchInsurance1(@RequestParam("id") int id) {
		try {
			return new ResponseEntity<>(insuranceService.searchInsurance(id), HttpStatus.FOUND);
		} catch (InsuranceException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
