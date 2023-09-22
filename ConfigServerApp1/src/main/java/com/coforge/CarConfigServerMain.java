package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.coforge.model.Car;

@SpringBootApplication
@EnableConfigServer
public class CarConfigServerMain  //implements CommandLineRunner 
{

	public static void main(String[] args) {
		SpringApplication.run(CarConfigServerMain.class, args);
	}
//
//	@Autowired
//	Car car;
//	
//	@Override
//	public void run(String... args) throws Exception {
//
//		System.out.println("id "+car.getId());
//		System.out.println("name "+car.getName());
//		System.out.println("cost "+car.getCost());
//	}

}
