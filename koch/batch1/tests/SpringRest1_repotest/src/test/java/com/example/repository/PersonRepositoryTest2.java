package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Person;
import com.example.web.PersonController1;

//@SpringBootTest
@DataJpaTest
public class PersonRepositoryTest2 {

	@Mock
	PersonRepository repository;

	@InjectMocks
	PersonController1 controller1;
	
	@Test
	public void testSave() {
		Person person = Person.builder().id(677676).name("kamal").salary(45999).dob(LocalDate.now()).build();
		Person person1=person;
		
		Mockito.when
		(repository.save(person)).
		thenReturn(person1);
	}
	
	@Test
	public void testFindById() {
		Person p=Person.builder().id(677671).name("arvind kumar").salary(45991).
				dob(LocalDate.of(2000,11,12)).build();
		
		repository.save(Person.builder().id(677671).name("arvind kumar").salary(45991).
				dob(LocalDate.of(2000,11,12)).build());
		
		when(repository.findById(677671)).thenReturn(Optional.of(p));
	}
	@Test
	public void testFindAll() {
		Assertions.assertEquals(controller1.getAllPerson(), repository.findAll());
	}
	
}
