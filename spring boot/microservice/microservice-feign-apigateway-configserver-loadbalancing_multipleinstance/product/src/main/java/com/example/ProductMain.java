package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication

public class ProductMain {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class,args);
    }
}

/*
http://localhost:9090/product
post
{
   "productName":"biscuit",
   "productCost":120
}

mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=9091"
in command line it will run another instance on port 9091
 */


