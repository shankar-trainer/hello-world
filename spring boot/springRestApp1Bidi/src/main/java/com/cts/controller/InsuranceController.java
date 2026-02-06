package com.cts.controller;

import com.cts.model.Insurance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    @RequestMapping("/first")
    public Insurance getInsurance() {
        Insurance insurance = new Insurance(1, "education", LocalDate.of(2027, 11, 12), 12000);
        return insurance;
    }

    @RequestMapping("/all")
    public Insurance[] getAllInsurance() {
        return insurance;
    }

    static Insurance insurance[];
    static{
        insurance=new Insurance[]{
          new Insurance(1, "education", LocalDate.of(2027, 1, 12), 12000),
          new Insurance(2, "car", LocalDate.of(2025, 11, 1), 34000),
          new Insurance(3, "health", LocalDate.of(2026, 1, 12), 42000),
          new Insurance(4, "home", LocalDate.of(2029, 3, 12), 32000),
          new Insurance(5, "jwellery", LocalDate.of(2027, 4, 12), 16000),
          new Insurance(6, "bike", LocalDate.of(2028, 5, 12), 9000),
        };
    }

}
