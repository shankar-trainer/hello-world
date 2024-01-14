package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductMain {

	public static void main(String[] args) {
		SpringApplication.run(ProductMain.class, args);
	}
}

/*
  { 
   
    "prdName": "book",
    "prdCost": 450,
    "prdMfd":"2022-08-12",
    "orderSet1":[
        {
            "totalCount":20,
            "totalCost":1200
        },
        {
            "totalCount":30,
            "totalCost":1900
        },
        {
            "totalCount":10,
            "totalCost":900
        }
    ]
 }
 */
