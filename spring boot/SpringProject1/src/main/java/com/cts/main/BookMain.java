package com.cts.main;

import com.cts.bean.Author;
import com.cts.bean.Book;
import com.cts.bean.Chapter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext
                ("application.xml");
//        Book b=context.getBean(Book.class);
//        Book b=context.getBean("book",Book.class);
        Book b = context.getBean("book1", Book.class);
        //System.out.println(b);

        System.out.println("book data ");
        System.out.println("\t isbn " + b.getIsbn());
        System.out.println("\t name " + b.getBname());

        System.out.println("\n book chapter ");
//        System.out.println("\t page no "+b.getChapter().getPageNo());
        Chapter chapter = b.getChapter();
        System.out.println("\t page no " + chapter.getPageNo());
        System.out.println("\t name " + chapter.getChapterName());

        System.out.println("\n book authors  ");

        for (Author author : b.getAuthorSet()) {
            System.out.println("\t name " + author.getAuthorName());
            System.out.println("\t age " + author.getAuthorAge());
        }

    }
}
