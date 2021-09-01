package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerMain {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMain.class, args);
	}
}
/*
 
 
    {
        "customerId": 10014,
        "customerName": "anand kumar",
        "customerSalary": 85000,
        "address":{
            "addrId":7008,
            "addrCity":"chennai",
            "addrState":"tamil nadu"
        },
        "carSet":
        [
        {
        "carId":11 ,
        "carModel":"ferrari",
        "carCost":667000           
        },
        {
        "carId":22 ,
        "carModel":"balano",
        "carCost":1667000           
        },
        {
        "carId":32 ,
        "carModel":"tata jaguar",
        "carCost":107000           
        }

        ]
    }
     */
    