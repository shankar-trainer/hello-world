package org.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class PaymentServiceMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceMain.class,args);
    }
}
