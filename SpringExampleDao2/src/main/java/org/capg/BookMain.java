package org.capg;

import java.util.List;

import org.capg.model.Book;
import org.capg.service.BookService;
import org.capg.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//BookServiceImpl service = ctx.getBean(BookServiceImpl.class);
		BookService service = ctx.getBean(BookServiceImpl.class);
		
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		
		book1.setIsbn(767776);
		book1.setBname("spring in action");
		book1.setCost(1233);
		
		book2.setIsbn(767779);
		book2.setBname("spring for dummies");
		book2.setCost(600);
		
		book3.setIsbn(767771);
		book3.setBname("spring for user");
		book3.setCost(1100);
		
		service.saveBook(book1);
		service.saveBook(book2);
		service.saveBook(book3);
		
		List<Book> showAllBook = service.showAllBook();
		for (Book book : showAllBook) {
			System.out.println(book.getIsbn()+"  "+book.getBname()+"  "+book.getCost());
		}
		
		
	}
}
