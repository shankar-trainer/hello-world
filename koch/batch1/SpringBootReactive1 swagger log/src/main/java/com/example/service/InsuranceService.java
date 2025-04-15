package com.example.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.InsuranceException;
import com.example.model.Insurance;
import com.example.repository.InsuranceRepository;

@Service
public class InsuranceService {

	static Logger logger=LoggerFactory.getLogger(InsuranceService.class);
	@Autowired
	private InsuranceRepository repository;

	public Insurance addInsurance(Insurance insurance) {
		logger.debug("addInsurance method  called ");

		if (repository.findById(insurance.getInsuranceId()).isPresent()) {
			logger.error("insurance with id already present");
			throw new InsuranceException("insurance with id already present");
		}
		else {
			logger.info("insurance object saved"+insurance);
			return repository.save(insurance);
		}
	}

	public Insurance findInsuranceById(int id) {
		logger.debug("findInsuranceById method ");
		if (repository.findById(id).isEmpty()) {
			logger.error("insurance with id not found");
			throw new InsuranceException("insurance with id not found");
		}
		else {
			logger.info("found by id  "+id+"  value "+repository.findById(id).get());
			return repository.findById(id).get();
		}
	}

	public List<Insurance> getAllInsurance() {
		logger.info("getAllInsurance ");
		if (repository.findAll().isEmpty()) {
		   logger.error("is empty");
			throw new InsuranceException("insurance list is empty");
		}
		else {
			logger.info("found all "+repository.findAll());
			return repository.findAll();
		}
	}

	public Insurance updateInsurance(Insurance insurance) {
		logger.info("updateInsurance called ");
		if (repository.findById(insurance.getInsuranceId()).isEmpty()) {
		    logger.error("insurance with id not found");
			throw new InsuranceException("insurance with id not found");
		}
		else {
			logger.info("insurance updated "+insurance);
			return repository.save(insurance);
		}
	}

	public Insurance deleteInsurance(int id) {
		logger.info("delete insurance called ");
		if (repository.findById(id).isEmpty()) {
			logger.error("insurance with id not found");
			throw new InsuranceException("insurance with id not found");
		}
		else {
			Insurance insurance = repository.findById(id).get();
			logger.info("deleted by id "+id+" value "+insurance);
			repository.deleteById(id);
			return insurance;
		}
	}

}
