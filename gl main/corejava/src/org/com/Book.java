package org.com;

public class Book {

	int isbn;

	boolean status=false;
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Book) {
			Book b = (Book) obj;
			if (this.isbn == b.isbn)
				status=true;
		}
		return status;
	}

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();

		book.isbn = 1001;
		book1.isbn = 1001;

		if (book.equals(book1)) {
			System.out.println("true ");
		} else
			System.out.println("false");

	}

}
