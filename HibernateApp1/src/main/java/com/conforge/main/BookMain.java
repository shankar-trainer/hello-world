package com.conforge.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Scanner;

import com.conforge.dao.BookDao;
import com.conforge.model.Book;

public class BookMain {

	public static void main(String[] args) {

		String ch = "y";
		int operation;
		Scanner scanner = new Scanner(System.in);
		BookDao dao = new BookDao();
		Book book;
		List<Book> blist;

		do {
			System.out.println("1.Add Book");
			System.out.println("2.Remove Book");
			System.out.println("3.Show All Book");
			System.out.println("4.Search Book");
			System.out.println("5.Update  Book");

			operation = scanner.nextInt();

			switch (operation) {
			case 1:
				System.out.println("add book name cost and date");
				book = null;
				book = new Book();
				scanner.nextLine();
				book.setBname(scanner.nextLine());
				book.setCost(scanner.nextFloat());
				LocalDate date;
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				System.out.println("Enter date in dd-mm-yyyy format");

				date = LocalDate.parse(scanner.next(), dateTimeFormatter);
				book.setPublishedDate(date);

				if (dao.addBook(book)) {
					System.out.println("book added");
				} else
					System.out.println("book not present");

				// book.setPublishedDate(LocalDate.);

				break;

			case 2:
				break;

			case 3:
				dao.getAllBook().forEach(b -> System.out
						.println(b.getIsbn() + "\t" + b.getBname() + "\t" + b.getCost() + "\t" + b.getPublishedDate()));
				break;

			case 4:
				break;

			case 5:
				break;

			default:
				break;
			}
			System.out.println("Continue y\\n");
			ch=scanner.next();
		} while (ch.equalsIgnoreCase("y"));

		dao.close();
	}
}
