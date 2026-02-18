package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients // Enable Feign client scanning

public class ProductOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(ProductOrderMain.class,args);
    }
}
