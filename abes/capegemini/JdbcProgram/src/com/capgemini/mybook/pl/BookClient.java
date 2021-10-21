package com.capgemini.mybook.pl;

import java.sql.SQLException;
import java.util.Scanner;

import com.capgemini.mybook.exception.BookException;
import com.capgemini.mybook.service.BookService;
import com.capgemini.mybook.service.BookServiceImpl;

public class BookClient {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String ch = "yes";

		BookService service = null;
		try {
			service = new BookServiceImpl();
		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
		}

		while (ch.equalsIgnoreCase("yes")) {
			System.out.println("Select Operation");
			System.out.println("1.Add Book");
			System.out.println("2.Show All Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Update Book");
			System.out.println("5.Search Book");

			int op = scanner.nextInt();

			switch (op) {
			case 1:
				try {
					service.insertBook();
				} catch (SQLException|BookException e1) {
					System.err.println(e1.getMessage());
				}
				break;
			case 2:
				try {
					service.showAllBook();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
				break;

			default:
				break;
			}
			System.out.println("Continue yes\\not");
			ch = scanner.next();
		}

	}
}
