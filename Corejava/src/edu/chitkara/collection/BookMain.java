package edu.chitkara.collection;

import java.util.List;

public class BookMain {
	public static void main(String[] args) {

		Book book[] = new Book[4];
		book[0] = new Book(44343, "java beginner", "anil kumar", 1200);
		book[1] = new Book(44341, "java advanced", "sunil sharma", 1800);
		book[2] = new Book(44342, "java for dummies", "aman kumar", 900);
		book[3] = new Book(44349, "java professional", "mahendra kumar", 1600);

		System.out.println(" book add operation ");
		LibraryManagement libraryManagement = new LibraryManagement();
		libraryManagement.addBook(book[0]);
		libraryManagement.addBook(book[1]);
		libraryManagement.addBook(book[2]);
		libraryManagement.addBook(book[3]);

		System.out.println("all book information");
		System.out.println("isbn\t\tname\tauthor\\ttcost");
		
		System.out.println(" book get all operation ");
		List<Book> allBook = libraryManagement.getAllBook();
		for (Book book2 : allBook) {
			System.out.println(
					book2.getIsbn() + "\t" + book2.getBname() + "\t" + book2.getAuthor() + "\t" + book2.getCost());
		}
		System.out.println(" book search  operation ");
//             Book searchBook = libraryManagement.searchBook(book[0]);
               Book searchBook = libraryManagement.searchBook(new Book(111,"java","s kumar",3000));
	
	           if(searchBook!=null) {
	        	System.out.println("Book found ");
	        	System.out.println();
	        	System.out.println(
						searchBook.getIsbn() + "\t" + searchBook.getBname() + "\t" + searchBook.getAuthor() + "\t" + searchBook.getCost());
			
	           }
	           else
	        	   System.out.println("Book not found ");
	        	   
	}
}
