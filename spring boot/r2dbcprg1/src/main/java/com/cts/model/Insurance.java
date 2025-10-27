package com.cts.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
public class Insurance {

    @Id
    private int insuranceId;
    private  String  insuranceName;
    private LocalDate insuranceMaturity;
    private float insuranceAmount;


}
// create table insurance(insurance_id int primary key auto_increment,insurance_name varchar(20), insurance_maturity date, insurance_amount float);