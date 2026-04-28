package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.InsuranceRepository;
import com.cts.exception.InsuranceException;
import com.cts.model.Insurance;

import lombok.Data;

@Service
@Data
public class InsuranceService {

	@Autowired
	private InsuranceRepository repository;

	public Insurance addInsurance(Insurance insurance) {
		Optional<Insurance> byId = repository.findById(insurance.getId());
		if (byId.isPresent())
			throw new InsuranceException("id already  present");

		return repository.save(insurance);
	}

	public Insurance updateInsurance(Insurance insurance) {

		Optional<Insurance> byId = repository.findById(insurance.getId());
		if (byId.isEmpty())
			throw new InsuranceException("id not  present");

		return repository.save(insurance);
	}

	public List<Insurance> getAllInsurance() {
		if (repository.findAll().isEmpty())
			throw new InsuranceException("insurance list is empty");
		return repository.findAll();
	}

	public Insurance deleteInsurance(int id) {

		Optional<Insurance> byId = repository.findById(id);
		if (byId.isEmpty())
			throw new InsuranceException("id not  present");

		Insurance insurance = null;
		insurance = byId.get();

		repository.deleteById(id);
		return insurance;
	}

	public Insurance searchInsurance(int id) {

		Insurance insurance = null;
		Optional<Insurance> byId = repository.findById(id);
		if (byId.isEmpty())
			throw new InsuranceException("id nou found ");
		insurance = byId.get();

		return insurance;
	}

}
