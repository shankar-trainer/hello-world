package com.example.SpringConfigSever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigSeverApplication.class, args);
	}
}
//http://localhost:9090/user-service/default
//http://localhost:9090/user-service/dev
//http://localhost:9090/user-service/prod
