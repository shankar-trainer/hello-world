package com.coforge.web;

import com.coforge.dto.Person;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class PersonController {

    RestTemplate restTemplate=new RestTemplate();

    @GetMapping("/person")
    public List<Person> getAllPersonList(){

        Person[] forObject = restTemplate.getForObject("http://localhost:9090/person", Person[].class);
        return Arrays.asList(forObject);
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody  Person person){
                return  restTemplate.postForObject("http://localhost:9090/person",person,Person.class);
    }
}
