package org.example;

import jakarta.annotation.PostConstruct;
import org.example.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
@RestController
@RequestMapping("/personclient")
public class Main {

    WebClient webclient;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    PostConstruct

    public void init() {
        webclient = WebClient.builder().baseUrl("http://localhost:9090/person").build();
    }

    @GetMapping("/allperson")
    public Flux<Person> getAllPerson() {
        return webclient.get().uri("/all").retrieve().bodyToFlux(Person.class);
    }

}