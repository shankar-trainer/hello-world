package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProductPaymentMain {
    public static void main(String[] args)
    {
        SpringApplication.run(ProductPaymentMain.class,args);
     }
}
/*
localhost:9092/payment/add/1
post method
{
    "paymentAmount":3000,
    "paymentMode":"online"
}

*/