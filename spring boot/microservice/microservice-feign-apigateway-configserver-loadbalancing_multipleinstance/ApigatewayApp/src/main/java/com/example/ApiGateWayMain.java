package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateWayMain {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayMain.class,args);
    }
}

//http://localhost:8082/productorder
//http://localhost:8082/product

