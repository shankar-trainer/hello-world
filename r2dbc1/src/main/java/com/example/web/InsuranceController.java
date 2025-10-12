package com.example.web;

import com.example.model.Insurance;
import com.example.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/")
public class InsuranceController {
@Autowired
private InsuranceService insuranceService;


@PostMapping("/insurance")
    public Mono<Insurance> addInsurance(@RequestBody  Insurance insurance) {
   return insuranceService.addInsurance(insurance);
    }

    @GetMapping("/insurance/{id}")
    public Mono<Insurance> findInsuranceById(long id) {
     return insuranceService.findInsuranceById(id);
    }

    @GetMapping("/insurance")
    public Flux<Insurance> findAllInsurances() {
     return  insuranceService.findAllInsurances();
    }

}
