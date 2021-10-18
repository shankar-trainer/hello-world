package org.com;

import org.com.model.Book;
import org.com.service.BookJpaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookClient2 {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BookClient2.class, args);
        BookJpaService bookService = ctx.getBean("bookJpaService", BookJpaService.class);

        Book b1 = new Book();
        b1.setIsbn(11111);
        b1.setBname("java beginner");
        b1.setCost(456);
        if (bookService.addBook(b1))
            System.out.println("book1 added");
        else
            System.out.println("Book1 cannot be added ");
        b1=null;
        b1 = new Book();
        b1.setIsbn(11112);
        b1.setBname("spring pro");
        b1.setCost(756);
        if (bookService.addBook(b1))
            System.out.println("book2 added");
        else
            System.out.println("Book2 cannot be added ");

        b1=null;
        b1 = new Book();
        b1.setIsbn(11115);
        b1.setBname("perl beginner");
        b1.setCost(1256);
        if (bookService.addBook(b1))
            System.out.println("book3 added");
        else
            System.out.println("Book3 cannot be added ");

        b1=null;
        b1 = new Book();
        b1.setIsbn(11111);
        b1.setBname("perl beginner");
        b1.setCost(1259);
        bookService.addBook(b1);
        if (bookService.addBook(b1))
            System.out.println("book4 added");
        else
            System.out.println("Book4 cannot be added ");

        for (Book book : bookService.getAllBook()) {
            System.out.println(book);
        }
    }
}
