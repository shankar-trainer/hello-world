package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Person;

//@SpringBootTest
@DataJpaTest
public class PersonRepositoryTest {

	@Autowired
	PersonRepository repository;

	Person person[];

	@BeforeEach
	public void initialise() {

		person = new Person[] {
				Person.builder().id(87887).dob(LocalDate.of(1978, 12, 30)).name("suresh kumar").salary(44000).build(),
				Person.builder().id(87881).dob(LocalDate.of(1999, 12, 30)).name("mohan kumar").salary(42000).build(),
				Person.builder().id(87889).dob(LocalDate.of(1998, 12, 30)).name("devansh kumar").salary(41000)
						.build(), };

		List<Person> asList = Arrays.asList(person);
		repository.saveAll(asList);
	}

	@Test
	public void findAllTest() {
		assertNotNull(person);
		assertEquals(person.length, 3);
	}

	@Test
	public void findById() {
		Assertions.assertEquals(person[0], repository.findById(87887).get());
		Assertions.assertNotEquals(person[0], repository.findById(87889).get());
	}

	@Test
	public void deleteById() {
		repository.deleteById(87889);
		assertTrue(repository.findById(87889).isEmpty());
	}

}
