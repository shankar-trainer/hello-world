package corejava;

import java.util.Scanner;

public class Book {
	int isbn;
	String bname, author;
	float cost;
	String location, country;

	Book() {
		isbn = 9009887;
		bname = "java beginner";
		author = "a swamy";
		cost = 896.67f;
		location = "new delhi";
		country = "India";
		System.out.println("constructor called");
	}

	/*Book(String location, String country) {
		this.country = country;
		this.location = location;
	}*/
	
	Book(String location) {
		
		this.location = location;
	}
	
	Book(String country, int isbn) {
		this("chennai");
		this.country = country;
		this.isbn=isbn;
	}

	Book(int isbn, String bname, String author, float cost) {
		//this("chennai", "India");
		this("India",isbn);
		//this.isbn = isbn;
		this.bname = bname;
		this.author = author;
		this.cost = cost;

	}

	void bookInfo() {
		System.out.println("\nisbn is " + isbn);
		System.out.println("name is " + bname);
		System.out.println("author is " + author);
		System.out.println("cost is " + cost);
		System.out.println("location is " + location);
		System.out.println("country is " + country);
	}

	public static void main(String[] args) {
		/*
		 * Book book = new Book(); book.bookInfo(); Book book1 = new
		 * Book(64655,"java expert","n kumar", 890.67f); book1.bookInfo(); Book
		 * book2 = new Book(64654,"php expert","s kumar", 690.67f);
		 * book2.bookInfo();
		 */

		Book book[] = new Book[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < book.length; i++) {
			System.out.println("Enter isbn name author and cost");
			book[i] = new Book(sc.nextInt(), sc.next(), sc.next(), sc.nextFloat());
		}

		/*for (int i = 0; i < book.length; i++) {
			book[i].bookInfo();
		}*/
		
		for (Book book2 : book) {
			book2.bookInfo();
		}
	}
}
