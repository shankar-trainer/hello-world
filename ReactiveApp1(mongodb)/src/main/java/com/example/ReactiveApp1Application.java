//package com.example.ReactiveApp1;
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.dao.UserRepository;
import com.example.model.User;

@SpringBootApplication
// (scanBasePackages = {"com.example.web","com.example.dao","com.user.model"})
public class ReactiveApp1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApp1Application.class, args);
	}

	@Autowired
	UserRepository dao;

	@Override
	public void run(String... args) throws Exception {
		dao.save(User.builder().id("10001").name("ram kumar").build());
		dao.save(User.builder().id("10002").name("shyam kumar").build());
		dao.save(User.builder().id("10003").name("suresh kumar").build());
		dao.findAll().forEach(a->System.out.println(a));
		 // use db10-- create database 
		//mongodb  db.dropDatabase()
		// db.user.find()
		//db.user.drop() // drop collection, table
	}
}
//http://localhost:8080/userbyidandname/10001?name=ram kumar
//http://localhost:8080/userbyid/10001