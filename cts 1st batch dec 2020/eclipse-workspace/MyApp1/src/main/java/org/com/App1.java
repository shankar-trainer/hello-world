package org.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableZuulProxy


@EnableEurekaClient
@SpringBootApplication
@RestController("/")
public class App1 {

	public static void main(String[] args) {
		SpringApplication.run(App1.class, args);
	}
	/*
	 * @GetMapping("/hello") public String hello() { return "<h1>Hello world</h1>";
	 * }
	 */	
}
