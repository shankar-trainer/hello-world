package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coforge.model.Car;

@SpringBootApplication
public class CarMain  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarMain.class, args);
	}

	@Autowired
	Car car;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println(car.getId());
		System.out.println(car.getName());
		System.out.println(car.getCost());
	}

}
