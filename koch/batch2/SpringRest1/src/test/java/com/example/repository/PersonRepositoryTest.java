package com.example.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import com.example.web.PersonController1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;

//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class PersonRepositoryTest {

	@Mock
	PersonRepository personRepository;
	
	@InjectMocks
	PersonController1 controller1;
	
	Person person;
	@BeforeEach
	public void setup() {
		person=new Person();
		person.setId(10001);
		person.setName("amit kumar");
		person.setSalary(20000);
		personRepository.save(person);
	}
	
	 @Test
	    void findAll() {
		 Mockito.when(personRepository.findAll()).thenReturn(Collections.singletonList(person));
		List<Person> allPerson = controller1.getAllPerson();
		verify(personRepository).findAll();
		assertEquals(allPerson, Collections.singletonList(person));
	 }
	 @Test
	 void findByid() {
		 Mockito.when(personRepository.findById(10001)).thenReturn(Optional.of(person));
		 
	 }
	
}
