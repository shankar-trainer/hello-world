package com.capegemini.java8;

public class ScienceBook {
	float offer;
	String author;

	public ScienceBook(float offer, String author) {
		super();
		this.offer = offer;
		this.author = author;
	}

	public static void main(String[] args) {
		ScienceBook book = new ScienceBook(0.4f, "suresh kumar");
		Book book2 = new Book(233232, "biology", 5678) {
			@Override
			float actualCost() {
				return super.actualCost() - super.actualCost() * book.offer;
			}

			@Override
			void bookInfo() {
				super.bookInfo();
				System.out.println("author is " + book.author);
				System.out.println("offer % is " + book.offer);
			}
		};
		book2.bookInfo();
	}
}
