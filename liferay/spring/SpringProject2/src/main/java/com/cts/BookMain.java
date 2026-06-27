package com.cts;

import com.cts.config.AppConfig;
import com.cts.model.Book;
import com.example.model.Survey;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

public class BookMain {

    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfig.class);

        Book b = context.getBean(Book.class);
        //System.out.println(b);

        Book b1 = context.getBean(Book.class);
        b1.setAuthor("arvind kumar");
        b1.setBname("java with hibernate");
        b1.setIsbn(8787877);
        b1.setPublishDate(LocalDate.of(2025, 11, 25));

        System.out.println(b);
        System.out.println(b1);

        ApplicationContext context1 = new
                AnnotationConfigApplicationContext
                (Survey.class);
        Survey s = context1.getBean(Survey.class);
        System.out.println(s);


    }
}
