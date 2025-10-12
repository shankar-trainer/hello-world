package com.example.service;

import com.example.model.Insurance;
import com.example.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository insuranceRepository;

    public Mono<Insurance> addInsurance(Insurance insurance) {
       return  insuranceRepository.save(insurance);
    }

    public Mono<Insurance> findInsuranceById(long id) {
       return  insuranceRepository.findById(id);
    }
    public Flux<Insurance> findAllInsurances() {
        return insuranceRepository.findAll();
    }

}
