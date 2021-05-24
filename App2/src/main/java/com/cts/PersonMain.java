package com.cts;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.dao.PersonRepo;
import com.cts.model.Person;

@SpringBootApplication
public class PersonMain  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PersonMain.class, args);
	}

	/*
	 *     {
        "personId": 767899,
        "personName": "amrendra kumar",
        "dateTime": "2012-05-24T12:40:26.586"
    }

	 * 
	 */
	
	@Autowired
	PersonRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
	
	
		Person person=new Person();
		person.setDateTime(LocalDateTime.now());
		person.setPersonId(7676);
		person.setPersonName("ram kumar");
	
		Person person1=new Person();
		
		person1.setDateTime(LocalDateTime.now());
		person1.setPersonId(7678);
		person1.setPersonName("suresh kumar");
		
		repo.save(person);
		repo.save(person1);
		
	}
	
}
