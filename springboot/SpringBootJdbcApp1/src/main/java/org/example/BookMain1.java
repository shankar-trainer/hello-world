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
           ConfigurableApplicationContext ctx = SpringApplication.run(BookMain1.class, args);
     BookController controller=   ctx.getBean(BookController.class);
        BookDao bean1 = ctx.getBean(BookDao.class);
      controller.setBookDao(getBookDao());

    }


    @Bean
    public static  BookDaoImpl getBookDao() {
        BookDaoImpl bookDao = new BookDaoImpl();
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDs());
        bookDao.setJdbcTemplate(template);
        return bookDao;
    }

    @Bean
    public static  DriverManagerDataSource getDs() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        return dataSource;

    }

}
