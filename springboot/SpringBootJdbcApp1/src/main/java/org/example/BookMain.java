package org.example;

import org.aspectj.lang.annotation.Before;
import org.example.dao.BookDao;
import org.example.dao.BookDaoImpl;
import org.example.model.Book;
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
public class BookMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext bean = SpringApplication.run(BookMain.class, args);

        BookDao bean1 = bean.getBean(BookDao.class);
        System.out.println("add operation");
        //bean1.addBook(new Book(565689, "sql advanced", "virendra kumar", 1756));

        System.out.println("All Book Values");

        System.out.println(bean1.getAllBook().size());
        for (Book b : bean1.getAllBook())
            System.out.println(b);

        System.out.println("search book operation ");

        if(bean1.searchBook(565669)==null)
            System.out.println("book not present");
        else{
            System.out.println("book found "+bean1.searchBook(565669));
        }
        System.out.println("Book Remove Operation");
        Book book2 = bean1.removeBook(565689);
        if(book2==null)
            System.out.println("book  not present");
        else{
            System.out.println("Book removed "+book2);
        }
        Book book=new Book(565660,"python beginner","aman sharma",1200);

        System.out.println("Book update operation");
        Book book1 = bean1.updateBook(book);
        if(book1!=null)
            System.out.println("book updated "+book1);
        else
            System.out.println("book not present");

    }

    @Bean
    public BookDaoImpl getBookDao() {
        BookDaoImpl bookDao = new BookDaoImpl();
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDs());
        bookDao.setJdbcTemplate(template);
        return bookDao;
    }

    @Bean
    public DriverManagerDataSource getDs() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        return dataSource;

    }
}
