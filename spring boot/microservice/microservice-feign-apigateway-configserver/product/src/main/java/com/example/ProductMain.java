package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//
//        (exclude = {DataSourceAutoConfiguration.class},scanBasePackages = {"com.example.service", "com.example.repository"})
//@EnableJpaRepositories(basePackages = "com.example.repository")
//@EntityScan("com.example.model")
public class ProductMain {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class,args);
    }
}
