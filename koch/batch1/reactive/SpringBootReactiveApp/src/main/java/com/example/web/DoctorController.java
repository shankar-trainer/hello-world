package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Doctor;
import com.example.service.DoctorService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService service;

    @GetMapping("/find/{id}")
    @ResponseStatus(value = HttpStatus.FOUND)
    public Mono<Doctor> findById(@PathVariable("id") int id) {
        return service.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public Mono<Doctor> deleteById(@PathVariable("id") int id) {
        return service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Mono<Doctor> update(@RequestBody Doctor doctor) {
        return service.update(doctor);
    }

    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<Doctor> addDoctor(@RequestBody Doctor doctor) {
    	return service.addDoctor(doctor);
    }
    
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/all")
    public Flux<Doctor> findAll() {
        return service.findAll();
    }
}
