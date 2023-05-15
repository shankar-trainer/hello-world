package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
	List<Book> blist;

	public LibraryManagement() {
		blist = new ArrayList<Book>();
	}

	public void addBook(Book b) {
		blist.add(b);
	}

	public Book searchBook(Book b) {
		if (blist.contains(b))
			return b;
		return null;
	}
	
	public boolean removeBook(Book b) {
		if (blist.contains(b)) {
			blist.remove(b);
		 return true;
		}
		return false;
	}
	
	public List<Book> getAllBook(){
		return blist;
	}

}
