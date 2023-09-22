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
