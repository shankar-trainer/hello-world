package cts.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication		
@EnableDiscoveryClient		
@EnableFeignClients
@EnableCircuitBreaker		

public class FeignClientApp1 {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApp1.class, args);
	}
}
