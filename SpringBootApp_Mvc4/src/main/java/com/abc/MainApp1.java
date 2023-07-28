package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainApp1 {

	public static void main(String[] args) {
	SpringApplication.run(MainApp1.class, args);	
	}
}



//http://localhost:9090/employee/form

