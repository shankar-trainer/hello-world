package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coforge.entity.Person;
import com.coforge.exception.PersonException;
import com.coforge.service.PersonService;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);

	}

	@Autowired
	PersonService service;

	@Override
	public void run(String... args) throws Exception {

		Person person1 = new Person(1001, "ram kumar", 12000);
		Person person2 = new Person(1003, "shyam kumar", 16000);
		Person person3 = new Person(1002, "virendra kumar", 19000);

		try {
			service.addPerson(person1);
			service.addPerson(person2);
			service.addPerson(person3);
			System.out.println("3 person added");
			service.getAllPerson().forEach(System.out::println);
		} catch (PersonException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
