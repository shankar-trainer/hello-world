package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ClientInterface;

@SpringBootApplication
@RestController
@EnableFeignClients

@EnableDiscoveryClient
public class Main {
	@Autowired
	ClientInterface client;

	@GetMapping("/hello")
	public String hi() {
		return client.getData();
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
