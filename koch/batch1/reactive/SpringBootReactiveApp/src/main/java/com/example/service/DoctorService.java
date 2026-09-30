package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Doctor;
import com.example.repository.DoctorRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DoctorService {

	@Autowired
	DoctorRepository repository;

	public Mono<Doctor> findById(int id) {
		return repository.findById(id);
	}

	public Mono<Doctor> deleteById(int id) {
		Mono<Doctor> byId = repository.findById(id);
		repository.deleteById(id);
		return byId;
	}

	public Mono<Doctor> update(Doctor doctor) {
		Mono<Doctor> byId = repository.findById(doctor.getDoctorId());
		if (byId != null)
			return repository.save(doctor);
		else
			return null;

//		return Mono.just(doctor);
	}

	public Mono<Doctor> addDoctor(Doctor doctor) {
		System.out.println(doctor);
		Mono<Doctor> byId = repository.findById(doctor.getDoctorId());
		//if (byId == null)
			return repository.save(doctor);
		//else
			//return null;

//		return Mono.just(doctor);
	}

	public Flux<Doctor> findAll() {
		return repository.findAll();
	}

}
