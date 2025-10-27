package com.cts.service;

import com.cts.model.Insurance;
import com.cts.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository insuranceRepository;

    public Mono<Insurance> addInsurance(Insurance ins){
        return  insuranceRepository.save(ins);
    }

    public Flux<Insurance> showAll(){
        return insuranceRepository.findAll();
    }

}
