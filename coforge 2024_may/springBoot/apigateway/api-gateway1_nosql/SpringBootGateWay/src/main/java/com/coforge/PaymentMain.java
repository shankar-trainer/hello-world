package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.time.LocalDate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
