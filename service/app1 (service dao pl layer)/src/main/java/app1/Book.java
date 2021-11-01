package app1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;
import javax.annotation.*;
import javax.inject.Inject;

public class Book {

	private int isbn;
	private String book_name;
	/*
	 * @Autowired
	 * 
	 * @Qualifier(value="chapter2")
	 */
	//@Resource(name = "chapter2")
	@Inject
	@Qualifier(value="chapter2")
	private Chapter chapter;
	
	@PostConstruct
	public void init1() {
		System.out.println("init called.. ");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy  called.. ");
	}
	
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", book_name=" + book_name + ", chapter=" + chapter + "]";
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Chapter getChapter() {
		return chapter;
	}
	
	
	/*
	 * @Autowired
	 * 
	 * @Required
	 * 
	 * @Qualifier(value="chapter2")
	 */
	
	
	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}
}
