package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayMain {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayMain.class, args);
    }
}

//http://localhost:9090/product
//http://localhost:8082/product -- using api-gateway

//http://localhost:8082/order
//http://localhost:7070/order