package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmployeeServerMain {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServerMain.class, args);
	}
}


//http://localhost:8888/employee-service/dev
//http://localhost:8888/employee-service/default
//http://localhost:8888/employee-service/prod