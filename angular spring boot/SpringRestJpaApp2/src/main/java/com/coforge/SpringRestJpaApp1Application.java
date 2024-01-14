package com.coforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class SpringRestJpaApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpaApp1Application.class, args);
	}

}
/*
http://localhost:8080/customer/add 
 {
 
"customerName":"lalan kumar",
"customerSalary":20000
}

*/