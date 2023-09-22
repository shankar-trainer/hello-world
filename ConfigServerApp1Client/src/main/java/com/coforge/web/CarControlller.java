package com.coforge.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.model.Car;

@RestController
@RequestMapping("/")
public class CarControlller {

	@Autowired
	Car car;
	
	@GetMapping("/car")
	public Car getCar() {
		System.out.println(car+"................");
		return car;
	}
	
}
