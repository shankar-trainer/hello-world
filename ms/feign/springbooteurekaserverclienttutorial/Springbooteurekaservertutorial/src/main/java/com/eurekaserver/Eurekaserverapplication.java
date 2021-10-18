package com.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// annotation enables the eureka server for listing the discovery client application on the registry server.
@EnableEurekaServer
public class Eurekaserverapplication {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaserverapplication.class, args);
	}
}