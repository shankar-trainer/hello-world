package com.cognizant.main;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Book;

public class BookMain {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Book b = factory.getBean(Book.class);

		System.out.println("isbn " + b.getIsbn());
		System.out.println("publication " + b.getPublication());
		System.out.println("java book  list  " + b.getJavaBookList());

		System.out.println("sql book list  ");
		for (String b1 : b.getSqlBookList())
			System.out.println("\t  name  " + b1);

		System.out.println("\n spring book using map  ");
		System.out.println("name\tcost  ");

		Map<String, Float> springbookMap = b.getSpringbookMap();
		for (Entry<String, Float> entry1 : springbookMap.entrySet()) {
			System.out.println(entry1.getKey() + "\t" + entry1.getValue());
		}

	}
}
