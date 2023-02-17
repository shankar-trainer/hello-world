package com.tvscredit;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.tvscredit.dao.BookRepository;
import com.tvscredit.model.Book;
import com.tvscredit.service.BookService;

//http://localhost:8080/swagger-ui.html
@SpringBootApplication
@EnableDiscoveryClient
public class BookMain 
//implements CommandLineRunner 
{

	public static void main(String[] args) {
		SpringApplication.run(BookMain.class, args);
	}
/*
	@Autowired
	BookService service;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Book Add operation");
		Book book1 = new Book();
		book1.setIsbn(676767);
		book1.setBname("java in action");
		
		book1.setCost(678);
		book1.setAuthor("a kumar");

		Book book2 = new Book();
		book2.setIsbn(676768);
		book2.setBname("spring  in action");
		
		book2.setCost(200);
		book2.setAuthor("p kumar");

	service.addBook(book1);
 System.out.println("book1 added");	
		service.addBook(book2);
		System.out.println("book2 added");	
		
		System.out.println("Book add operation");

		Scanner sc = new Scanner(System.in);
		Book b3 = new Book();
		System.out.println("Enter isbn name author and cost");

		b3.setIsbn(sc.nextInt());
		b3.setBname(sc.next());
		
		b3.setAuthor(sc.next());
		b3.setCost(sc.nextFloat());
		
		service.addBook(b3);
	
		System.out.println("Book3 added");
		
		System.out.println("list of all books");
		for(Book b: service.getAllBook())
			System.out.println(b.getIsbn()+"\t"+b.getAuthor()+"\t"+b.getCost()+"\t"+b.getBname());
		
	}
*/
}
