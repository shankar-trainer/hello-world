package com.nec;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.nec.model.Person;

public class SpringTest {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Person person1 = restTemplate.getForObject("http://localhost:8080/search/10001", Person.class);
		//List<Person> personList = (List<Person>) restTemplate.getForObject("http://localhost:8080/getAll",Person.class);

		if (person1 != null) {
			System.out.println("found " + person1);
		} else
			System.out.println("not found ");
		try {
			ResponseEntity<Person> forEntity = restTemplate.getForEntity("http://localhost:8080/search/101",
					Person.class);
			Person p = forEntity.getBody();
			HttpStatus statusCode = forEntity.getStatusCode();

			if (forEntity != null) {
				System.out.println("entity " + p);
				System.out.println("status code " + statusCode);
			}
		} catch (HttpClientErrorException e) {
			System.out.println("not present ");
		}
		
		System.out.println("all persons list ");
		//for(Person p:personList)
			//System.out.println(p);
	}
}
