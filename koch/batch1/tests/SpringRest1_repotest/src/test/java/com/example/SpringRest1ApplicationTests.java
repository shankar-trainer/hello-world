package com.example;


import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.entity.Person;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringRest1ApplicationTests {

	Person person;
	Person person1;
	
	@BeforeEach
	public void setUp() {
		person=new Person();
		person.setId(87877);
		person.setName("suresh kumar");
		person.setSalary(25000);
		person.setDob(LocalDate.of(2001, 12, 27));
		person1=Person.builder().id(87877).dob(LocalDate.of(2001, 12, 27)).salary(25000).name("suresh kumar").build();
	}
	
	
	@Test
	void contextLoads() {
	 assertNotNull(person);
	 assertEquals(person, person1);
	 
	}

}
