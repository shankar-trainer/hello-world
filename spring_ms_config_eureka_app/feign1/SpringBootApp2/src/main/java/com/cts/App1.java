package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class App1 {

	public static void main(String[] args) {
		SpringApplication.run(App1.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "hello  world";
	}
}
