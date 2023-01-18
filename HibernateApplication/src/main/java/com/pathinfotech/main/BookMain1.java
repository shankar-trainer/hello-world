package com.pathinfotech.main;

import java.util.Scanner;

import com.pathinfotech.dao.BookDao;
import com.pathinfotech.dao.BookDaoImpl;
import com.pathinfotech.model.Book;

public class BookMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookDao dao = new BookDaoImpl();
		Book book;

		String ch = "y";
		while (ch.equals("y")) {
			System.out.println("1.Add Book");
			System.out.println("2.Search Book");
			System.out.println("3.Remove Book");
			System.out.println("4.Show All Book");
			System.out.println("5.Update Book");

			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				book = null;
				book = new Book();
				System.out.println("Enter book isbn name author and cost");
				book.setIsbn(sc.nextLong());
				sc.nextLine();
				book.setBname(sc.nextLine());
				book.setAuthor(sc.nextLine());

				book.setCost(sc.nextDouble());

				if (dao.addBook(book))
					System.out.println("book added");
				else
					System.out.println("book isbn already present ");

				break;
			}

			case 2: {
				System.out.println("Enter isbn to search book");
				book = null;
				book = dao.searchBook(sc.nextLong());
				if (book == null)
					System.out.println("boom not present");
				else
					System.out.println("book found " + book.getIsbn() + "\t" + book.getBname() + "\t" + book.getCost()
							+ "\t" + book.getAuthor());
				break;
			}
			case 4: {
				System.out.println("show all books ");
				if(dao.showAllBook().size()==0)
					System.out.println("book list is empty");
				else {
					for(Book b:dao.showAllBook())
						System.out.println(b.getIsbn()+"\t"+b.getBname()+"\t"+b.getAuthor()+"\t"+b.getCost());
				}
			break;
			}
			default:
				System.out.println("invalid operation");
			}
			System.out.println("continue y\\n");
			ch=sc.next();
		}
		
	}
}
