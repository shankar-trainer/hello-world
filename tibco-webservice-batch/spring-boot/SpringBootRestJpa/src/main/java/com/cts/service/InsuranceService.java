package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.InsuranceRepository;
import com.cts.model.Insurance;

import lombok.Data;

@Service
@Data
public class InsuranceService {

	@Autowired
	private InsuranceRepository repository;

	public Insurance addInsurance(Insurance insurance) {
		return repository.save(insurance);
	}

	public Insurance updateInsurance(Insurance insurance) {
		return repository.save(insurance);
	}

	public List<Insurance> getAllInsurance() {
		return repository.findAll();
	}

	public Insurance deleteInsurance(int id) {
		Insurance insurance = null;
		Optional<Insurance> byId = repository.findById(id);
		if (byId.isPresent())
			insurance = byId.get();

		repository.deleteById(id);
		return insurance;
	}

	public Insurance searchInsurance(int id) {
		Insurance insurance = null;
		Optional<Insurance> byId = repository.findById(id);
		if (byId.isPresent())
			insurance = byId.get();

		return insurance;
	}

}
