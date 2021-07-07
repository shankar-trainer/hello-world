package org.cognizant.collection;

import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		Book book[] = new Book[3];
		int isbn[] = { 900112, 900113, 900114, 900115 };
		String bname[] = { "java beginner", "java in action", "java for dummies", "java for ninza" };
		float cost[] = { 500, 600, 700, 800 };

		BookOperation bookOperation = new BookOperation();
		for (int i = 0; i < book.length; i++) {
			book[i] = new Book();
			book[i].setBookIsbn(isbn[i]);
			book[i].setBname(bname[i]);
			book[i].setBookCost(cost[i]);
			bookOperation.addBook(book[i]);
		}

		System.out.println("All book values \n");
		List<Book> allBook = bookOperation.getAllBook();

		for (Book book2 : allBook) {
			System.out.println(book2.getBookIsbn() + " " + book2.getBname() + "  " + book2.getBookCost());
		}

		System.out.println("book is present " + bookOperation.bookCheck(book[1]));

		Book b1 = new Book();
		b1.setBookIsbn(1);

		System.out.println("Book search ");
		// Book bk=bookOperation.searchBook(book[0]);
		Book bk = bookOperation.searchBook(b1);

		if (bk != null) {
			System.out.println("book is present ");
			System.out.println(bk.getBookIsbn() + " " + bk.getBname() + "  " + bk.getBookCost());
		} else
			System.out.println("Book not present");
	}
}
