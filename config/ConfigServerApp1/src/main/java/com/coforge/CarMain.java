package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.coforge.model.Car;

@SpringBootApplication
@EnableConfigServer
public class CarMain  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarMain.class, args);
	}

	@Autowired
	Car car;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("id "+car.getId());
		System.out.println("name "+car.getName());
		System.out.println("cost "+car.getCost());
	}

}


//http://localhost:8080/car/production
//http://localhost:8080/car/dev
//http://localhost:8080/car/qa
//http://localhost:8080/car/default
