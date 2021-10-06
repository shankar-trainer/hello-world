package com.capegemini.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BookSorting {

	public static void main(String[] args) {
		Book book[]=new Book[5];
		book[0]=new Book(9001,"java 7 beginning",789,"p kumar");
		book[1]=new Book(4002,"python  beginner",1789,"s kumar");
		book[2]=new Book(2009,"ruby professional",478,"ram kumar");
		book[3]=new Book(3001,"spring  in action",519,"mohan kumar");
		book[4]=new Book(1001,"head first java",829,"arvind kumar");
		
		/*Arrays.sort(book);
		
		for (Book book2 : book) {
			System.out.println(book2);
		}*/
		
		ArrayList<Book> arrayList=new ArrayList<Book>();
		for (Book book2 : book) {
			arrayList.add(book2);
		}
		
		Collections.sort(arrayList);
		
		for (Book book2 : arrayList) {
			System.out.println(book2);
		}
		
		
		
		
		
		
	}
}
