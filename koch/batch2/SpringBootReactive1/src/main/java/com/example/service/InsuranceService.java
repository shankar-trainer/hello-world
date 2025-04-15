package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.InsuranceException;
import com.example.model.Insurance;
import com.example.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository repository;

	public Insurance addInsurance(Insurance insurance) {
		if (repository.findById(insurance.getInsuranceId()).isPresent())
			throw new InsuranceException("insurance with id already present");
		else
			return repository.save(insurance);
	}

	public Insurance findInsuranceById(int id) {
		if (repository.findById(id).isEmpty())
			throw new InsuranceException("insurance with id not found");
		else
			return repository.findById(id).get();
	}

	public List<Insurance> getAllInsurance() {
		if (repository.findAll().isEmpty())
			throw new InsuranceException("insurance list is empty");
		else
			return repository.findAll();
	}

	public Insurance updateInsurance(Insurance insurance) {
		if (repository.findById(insurance.getInsuranceId()).isEmpty())
			throw new InsuranceException("insurance with id not found");
		else
			return repository.save(insurance);
	}

	public Insurance deleteInsurance(int id) {
		if (repository.findById(id).isEmpty())
			throw new InsuranceException("insurance with id not found");
		else {
			Insurance insurance = repository.findById(id).get();
			repository.deleteById(id);
			return insurance;
		}
	}

}
