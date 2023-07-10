package com.coforge.database;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.coforge.database.model.Book;

public class DatabaseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			DatabaseOperation databaseOperation = new DatabaseOperation();

			System.out.println("All  Record");
			List<Book> bookList = databaseOperation.getBookList();

			for (Book book : bookList) {
				System.out.println(
						book.getIsbn() + "\t" + book.getBname() + "\t" + book.getCost() + "\t" + book.getAuthor());
			}

			System.out.println("\n stream for each");

			bookList.forEach(book -> System.out.println(
					book.getIsbn() + "\t" + book.getBname() + "\t" + book.getCost() + "\t" + book.getAuthor()));

			System.out.println("search operation ");
			System.out.println("enter isbn to search");
			int isbn = sc.nextInt();

			Book searchBook = databaseOperation.searchBook(isbn);
			if (searchBook != null) {
				System.out.println("book found with isbn " + isbn);
				System.out.println();
				System.out.println(searchBook.getIsbn() + "\t" + searchBook.getBname() + "\t" + searchBook.getCost()
						+ "\t" + searchBook.getAuthor());
			} else
				System.out.println("book not  found with isbn " + isbn);
			
			System.out.println("===========================================");
			System.out.println("add book  operation ");
			System.out.println("enter isbn, name, cost ,author ");
			Book book=new Book();
			book.setIsbn(sc.nextInt());
			sc.nextLine();
			book.setBname(sc.nextLine());
			book.setCost(sc.nextFloat());
			sc.nextLine();
			book.setAuthor(sc.nextLine());
        
			if(databaseOperation.addBook(book))
				System.out.println("Record added");
			else
				System.out.println("Record already present");
        
		

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e);
			e.printStackTrace();
		}

	}
}
