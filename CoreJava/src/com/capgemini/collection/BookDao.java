package com.capgemini.collection;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Book;

//public class BookOperation
public class BookDao {
	private List<Book> blist;

	public BookDao() {
		blist = new ArrayList<>();
	}

	public void addBook(Book b) {
		blist.add(b);
	}

	public List<Book> getAllBook() {
		return blist;
	}
	
	public Book searchBook(Book b) {
		 if(blist.contains(b)) {
			   for(Book b1:blist) {
				   if(b1.equals(b))
					   return b1;
				   break;
			   } 
		 }
		 	 return null;
	}

}
