package com.example;

import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class SpringRest1Application //implements CommandLineRunner
{
    public static void main(String[] args) {
        SpringApplication.run(SpringRest1Application.class, args);

    }
/*
    @Autowired
    PersonRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Person person[] = new Person[]{
                Person.builder().name("amit kumar").dob(LocalDate.of(1998, 11, 23)).salary(20000f).build(),
                Person.builder().name("sumit kumar").dob(LocalDate.of(1991, 2, 24)).salary(20000f).build(),
                Person.builder().name("mahesh kumar").dob(LocalDate.of(1996, 12, 2)).salary(20000f).build(),
                Person.builder().name("suresh kumar").dob(LocalDate.of(1995, 10, 3)).salary(20000f).build(),
                Person.builder().name("veeresh kumar").dob(LocalDate.of(1977, 1, 13)).salary(20000f).build(),
        };

        //Stream.of(person).forEach(System.out::println);
        repository.saveAll(Arrays.asList(person));
        System.out.println("added all data in database");
        System.out.println("retrieving all data from database");
        repository.findAll().forEach(System.out::println);

        //Person person1=new Person();
        //repository.save(person1);

    }
    */
}

/*
 http://localhost:8080/person/add
 post
{

    "salary":56000,
    "dob": "1997-11-20"
}

output 
{
    "message": "Validation failed",
    "errors": [
        "name: name is blank"
    ]
}
*/
