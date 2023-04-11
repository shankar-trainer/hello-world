package com.nec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.exception.PersonException;
import com.nec.model.Person;
import com.nec.service.PersonService;
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
//@EnableSwagger2
//@EnableSwagger2WebMvc
//@RestController
public class PersonMain {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext bean = SpringApplication.run(PersonMain.class, args);
		
		PersonService service = bean.getBean(PersonService.class);
		System.out.println("all records ");
		
		try {
			System.out.println(service.addPerson(new Person(1001,"amit kumar",56000))+"   Added");
			System.out.println(service.addPerson(new Person(1002,"sumit kumar",76000))+"   Added");
			System.out.println(service.addPerson(new Person(1003,"parvin kumar",66000))+"   Added");
		
			for(Person p:  service.getAllPerson())
				System.out.println(p);
		} catch (PersonException e) {
			System.err.println(e.getMessage());
		}
		
	}
	/*
	 * @RequestMapping("/hi") public String hello() { return "hello..."; }
	 */
}
