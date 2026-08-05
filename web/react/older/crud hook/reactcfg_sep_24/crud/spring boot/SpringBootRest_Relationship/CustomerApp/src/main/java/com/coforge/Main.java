package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
//http://localhost:6060/customer
//Post
/*
{
    "customerName":"anand kumar",
    "customerDob":"2000-10-04"
}
*/
