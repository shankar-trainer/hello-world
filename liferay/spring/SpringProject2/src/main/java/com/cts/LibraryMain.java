package com.cts;

import com.cts.config.AppConfig;
import com.cts.model.Book;
import com.cts.model.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryMain {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(Library.class);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Library.class);

        Library l = context.getBean(Library.class);
        System.out.println(l);

        Library l1 = context.getBean(Library.class);
        l1.setLibId(9009);
        l1.setLibName("history library");
        System.out.println(l);
        System.out.println(l1);
        context.close();
    }
}

