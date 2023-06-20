package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class,args);
    }
    @RequestMapping("/")
    public String hello(){
    return "hello world";
    }
}
