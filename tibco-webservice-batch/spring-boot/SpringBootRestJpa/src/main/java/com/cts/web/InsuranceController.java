package com.cts.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.Insurance;
import com.cts.service.InsuranceService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/insurace")
@AllArgsConstructor
public class InsuranceController {

	InsuranceService insuranceService;
     
	@PostMapping
	public Insurance addInsurance(@RequestBody Insurance insurance) {
		return insuranceService.addInsurance(insurance);
	}

	@PutMapping
	public Insurance updateInsurance(@RequestBody Insurance insurance) {
		return insuranceService.updateInsurance(insurance);
	}

//	@RequestMapping
	@GetMapping
	public List<Insurance> getAllInsurance() {
		return insuranceService.getAllInsurance();
	}

	@DeleteMapping("/{id}")
	public Insurance deleteInsurance(@PathVariable int id) {

		return insuranceService.deleteInsurance(id);
	}

	@RequestMapping("/{id}")
	public Insurance searchInsurance(@PathVariable int id  ) {
		return insuranceService.searchInsurance(id);
	}

}
