package com.example.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Insurance {

    @Id
    private Long insuranceId;
    private  String  insuranceName;
    private LocalDate insuranceMaturityDate;

}
