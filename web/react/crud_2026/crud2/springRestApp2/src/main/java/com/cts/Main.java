package com.cts;

import com.cts.dao.BookRepository;
import com.cts.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

/*
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
*/

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Book.builder().name("java in action").cost(2200.0f).publishDate(LocalDate.of(2024,11,25)).build();
        Book book[]=new Book[]{
                Book.builder().name("java in action").cost(2200.0f).publishDate(LocalDate.of(2024,11,25)).build(),
                Book.builder().name("java for beginner").cost(1200.0f).publishDate(LocalDate.of(2024,11,25)).build(),
                Book.builder().name("java for professional").cost(1500.0f).publishDate(LocalDate.of(2024,11,25)).build(),
                Book.builder().name("java for dummies").cost(500.0f).publishDate(LocalDate.of(2024,11,25)).build(),
        };

    bookRepository.saveAll(Arrays.asList(book));
    }
}
