package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
//@EnableZuulProxy
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
/*

http://localhost:8765/order/all
http://localhost:8765/order/search/10001

http://localhost:8765/payment/search/10001
http://localhost:8765/payment/all

*/
