package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class,args);

    }

}
