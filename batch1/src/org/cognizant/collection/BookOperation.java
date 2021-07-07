package org.cognizant.collection;

import java.util.ArrayList;
import java.util.List;

public class BookOperation {
	
	private List<Book> blist;
	
	public BookOperation() {
	 blist=new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		blist.add(book);
	} 
	public List<Book> getAllBook(){
		return blist; 
	}
	
	public boolean bookCheck(Book b) {
	return 	blist.contains(b);
	}
	
	public Book searchBook(Book b) {
		for (Book book : blist) {
			if(book.equals(b))
				return b;
		}
		return null;
	}
	
	

}
