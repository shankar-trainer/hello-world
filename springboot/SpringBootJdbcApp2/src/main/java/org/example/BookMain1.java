package org.example;

import org.example.controller.BookController;
import org.example.dao.BookDao;
import org.example.dao.BookDaoImpl;
import org.example.model.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by shankar on 4/19/2023.
 */
@SpringBootApplication
public class BookMain1
{
    public static void main(String[] args)  {
                   SpringApplication.run(BookMain1.class, args);
    }
}
