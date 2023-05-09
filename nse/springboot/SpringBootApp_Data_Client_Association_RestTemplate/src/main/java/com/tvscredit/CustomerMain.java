package com.tvscredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//mvn exec:java -Dexec.mainClass="com.example.Main" [-Dexec.args="argument1"] ...

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerMain {

	public static void main(String[] args) {
		SpringApplication.run(CustomerMain.class, args);
	}
}
