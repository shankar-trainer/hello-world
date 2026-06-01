package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Insurance;
import com.cts.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository repository;
	
	public Insurance addInsurance(Insurance insurance) {
		return repository.save(insurance);
	}
	
	public List<Insurance> getAllInsurance() {
		return repository.findAll();
	}
	
	public Insurance searchById(int id) {
		Optional<Insurance> byId = repository.findById(id);
if(byId.isPresent())
	return byId.get();
else 
	return null;

}
	public Insurance deleteById(int id) {
		Optional<Insurance> byId = repository.findById(id);
		
		if(byId.isPresent()) {
			var insurance2=byId.get();
			repository.deleteById(id);
		  return insurance2;
		}
		else 
			return null;
		
	}
	
	public Insurance updateRecord(Insurance insurance2) {
		Optional<Insurance> byId = repository.findById(insurance2.getId());
		
		if(byId.isPresent()) {
		 repository.save(insurance2);
			return insurance2;
		}
		else 
			return null;
		
	}
}
