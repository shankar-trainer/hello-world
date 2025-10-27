package com.cts.controller;

import com.cts.model.Insurance;
import com.cts.repository.InsuranceRepository;
import com.cts.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/")
public class InsuranceController {

    @Autowired
    private InsuranceService  insuranceService;

    @PostMapping("/insurance")
    public Mono<Insurance> addInsurance(@RequestBody  Insurance ins){
        return  insuranceService.addInsurance(ins);
    }

    @GetMapping("/insurance")
    public Flux<Insurance> showAll(){
        return insuranceService.showAll();
    }


}
/*
{
        "insuranceName": "health",
        "insuranceMaturity": "2022-11-11",
        "insuranceAmount": 30000.0
}
 */