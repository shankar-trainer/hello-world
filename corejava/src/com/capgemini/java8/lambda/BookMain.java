package com.capgemini.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class BookMain {

	public static void bookInfo(Book b[]) {
		System.out.println("book information\n");
		System.out.println("\tisbn\tname\tauthor\tcost");
		for (Book bk : b)
			System.out
					.println("\t" + bk.getIsbn() + "\t" + bk.getBname() + "\t" + bk.getAuthor() + "\t" + bk.getCost());
	}

	public static void main(String[] args) {
		int isbn[] = { 7677668, 7677676, 565665, 355435 };
		String bname[] = { "java in action", "java8 professional", "java recipee", "java for dummies" };

		float cost[] = { 2434.0f, 1200.0f, 670.0f, 1345.0f };
		String author[] = { "a k verma", "p kumar", "amita sharma", "s sinha" };

		Book b[] = new Book[4];// array

		for (int x = 0; x < b.length; x++) {
			b[x] = new Book();// creating objecrt of each element of array
			b[x].setIsbn(isbn[x]);
			b[x].setAuthor(author[x]);
			b[x].setBname(bname[x]);
			b[x].setCost(cost[x]);
		}
		bookInfo(b);
		
		Comparator<Book> comparator_bname=new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getBname().compareTo(o2.getBname());
			}
		};
 
		Arrays.sort(b,comparator_bname);
		System.out.println("sorted by book name");
		bookInfo(b);
		
		Comparator<Book> comparator_author=(o1,o2)-> o1.getAuthor().compareTo(o2.getAuthor());
		Arrays.sort(b,comparator_author);
		System.out.println("sorted by author ");
		bookInfo(b);
		
		
		Comparator<Book> comparator_isbn=(o1,o2)-> Integer.valueOf(o1.getIsbn()).compareTo(Integer.valueOf(o2.getIsbn()));
		Arrays.sort(b,comparator_isbn);
		System.out.println("sorted by isbn ");
		bookInfo(b);
		
		
	}
}
