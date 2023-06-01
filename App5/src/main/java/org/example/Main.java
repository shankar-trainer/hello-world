package org.example;

import org.example.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    Bus bus;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(bus);
        System.out.println("bus id : "+bus.getBusId());
        System.out.println("bus name :"+bus.getBusName());
        System.out.println("bus fare :"+bus.getBusfare());
    }
}