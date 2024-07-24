package com.abc.spring.auth.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class UserServiceApplication {


	@GetMapping("/")
	public String login(){
		return "authenticated successfully" ;
	}

	@GetMapping("/allEmployees")
	public List<Employee> allEmployee(){
		return Arrays.asList(
				new Employee[]{
						new Employee(10001,"ram",20000),
						new Employee(10002,"shyam",90000),
						new Employee(10003,"mohan",45000),
						new Employee(10004,"amit",78000),
						new Employee(10005,"sumit",67000)
				}
		);
	}

	@Data
	@AllArgsConstructor
	class Employee{
		private int id;
		private String name;
		private float salary;
	}


	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return Stream.of(new User(35444,"raman kumar","raman@gmail.com","455545454"),
				new User(655653,"Hemant","hemant@gmail.com","8656555665")).
				collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
