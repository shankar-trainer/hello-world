package com.example.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Doctor;
import reactor.core.publisher.Flux;

@Repository
public interface DoctorRepository extends R2dbcRepository<Doctor, Integer> {
	//public interface DoctorRepository extends ReactiveCrudRepository<Doctor, Integer> {
    //Flux<Doctor> findBydoctorName(String name);
}
