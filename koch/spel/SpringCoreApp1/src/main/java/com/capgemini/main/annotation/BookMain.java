package com.capgemini.main.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.beans.annotation.Book;
import com.capgemini.beans.annotation.Chapter;

public class BookMain {

	public static void main(String[] args) {
		// ApplicationContext

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");

		Book b = ctx.getBean(Book.class);
		System.out.println("book information");
		System.out.println("id " + b.getIsbn());
		System.out.println("name " + b.getBname());
		System.out.println("cost " + b.getCost());

		System.out.println("\nchapter  information");
		Chapter chapter = b.getChapter();
		System.out.println("\t id " + chapter.getChapterId());
		System.out.println("\t name " + chapter.getChapterName());
		System.out.println("\t page no " + chapter.getChapterPageNo());
		ctx.close();
		
	}
}
