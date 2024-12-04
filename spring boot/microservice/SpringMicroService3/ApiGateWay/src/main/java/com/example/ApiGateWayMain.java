package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/")
public class ApiGateWayMain {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayMain.class,args);
    }
    @RequestMapping("/")
    public  String hello(){
        return  "hello world";
    }
}
