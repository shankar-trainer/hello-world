package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.exception.InsuranceException;
import com.cts.model.Insurance;
import com.cts.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository repository;

	public Insurance addInsurance(Insurance insurance) {
		return repository.save(insurance);
	}

	public List<Insurance> getAllInsurance() throws InsuranceException {
		if (repository.findAll().size() == 0)
			throw new InsuranceException("insurance list is empty");
		return repository.findAll();
	}

	public Insurance searchById(int id) throws InsuranceException {
		Optional<Insurance> byId = repository.findById(id);
		if (byId.isPresent())
			return byId.get();
		else
//			return null;
			throw new InsuranceException("id not found ");
	}

	public Insurance deleteById(int id) throws InsuranceException {
		Optional<Insurance> byId = repository.findById(id);

		if (byId.isPresent()) {
			var insurance2 = byId.get();
			repository.deleteById(id);
			return insurance2;
		} else
//			return null;
			throw new InsuranceException("id not found ");
	}

	public Insurance updateRecord(Insurance insurance2) throws InsuranceException {
		Optional<Insurance> byId = repository.findById(insurance2.getId());

		if (byId.isPresent()) {
			repository.save(insurance2);
			return insurance2;
		} else
//			return null;
			 throw new InsuranceException("id not found ");


	}
}
