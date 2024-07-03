package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.time.LocalDate;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderMain.class, args);

	}
	@Autowired
	DaoRepository repository;


	@Override
	public void run(String... args) throws Exception {

		Order order[];
		order = new Order[]{
                new Order(10001, "book order", LocalDate.of(2023, 5, 12)),
                new Order(10002, "book order", LocalDate.of(2023, 4, 10)),
                new Order(10003, "book order", LocalDate.of(2023, 3, 11)),
                new Order(10004, "book order", LocalDate.of(2023, 1, 23))
        };

		for(Order o:order)
			repository.save(o);
	}
}
