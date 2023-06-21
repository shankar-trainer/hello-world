package com.example.SpringFeignApp1;

import com.example.SpringFeignApp1.client.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class SpringFeignApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignApp1Application.class, args);
	}

	@Autowired
	ClientInterface clientInterface;
	@GetMapping("/")
	public String hello(){
		return  clientInterface.getMyData();
	}

}
