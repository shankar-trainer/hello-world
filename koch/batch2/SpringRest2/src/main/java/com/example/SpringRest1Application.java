package com.example;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Person;
import com.example.repository.PersonRepository;

@SpringBootApplication
public class SpringRest1Application  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRest1Application.class, args);
	}
	
	@Autowired
	PersonRepository personRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
//	
//		Person person1=new Person();
//		person1.setAddress(new String[] {});
//

//		Person.builder().id(10001).name("amit").salary(12000).dob(LocalDate.now()).
//				address(new String[] {"city1","city2","city3"}).build();

		Person person[]=new Person[] {
				Person.builder().id(10003).name("amit").salary(12000).dob(LocalDate.now()).
				address(new String[] {"city1","city2","city3"}).
				build(),
				Person.builder().id(10001).name("amit").salary(12000).dob(LocalDate.now()).address(new String[] {"city1","city2","city3"}).build(),
				Person.builder().id(10002).name("amit").salary(12000).dob(LocalDate.now()).address(new String[] {"city1","city2","city3"}).build()
		};

		//Person.builder().build();
//		Person person[]=new Person[] {
//				Person.builder().id(10001).name("amit").salary(12000).dob(LocalDate.now()).build(),
//				Person.builder().id(10001).name("amit").salary(12000).dob(LocalDate.now()).build(),
//				Person.builder().id(10001).name("amit").salary(12000).dob(LocalDate.now()).build(),
//
//		};

		personRepository.saveAll(Arrays.asList(person));
	}
}

/*
{
    "id":77681,
    "name":"hari sharma",
    "salary":56000,
    "dob": "1997-11-20"
}
*/