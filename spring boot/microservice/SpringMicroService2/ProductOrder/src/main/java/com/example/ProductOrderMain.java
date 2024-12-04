package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(ProductOrderMain.class,args);
    }
}
/*
localhost:9090/order/1
post
{
    "orderName":"book order",
    "orderLocation":"gr noida",
    "orderDate":"2024-10-15"
}
{
    "orderName":"sweets order",
    "orderLocation":"new delhi",
    "orderDate":"2024-10-16"
}
 */