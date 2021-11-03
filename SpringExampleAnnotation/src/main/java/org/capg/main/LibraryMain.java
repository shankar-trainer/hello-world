package org.capg.main;

import org.capg.config.LibraryConfig;
import org.capg.model.Book;
import org.capg.model.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(LibraryConfig.class);

		Library library = ctx.getBean(Library.class);
		Library library1 = ctx.getBean(Library.class);

		library1.setLibraryId(666);
		library1.setLibraryName("gandhi library");
		library1.setLibraryLocation("rameswaram");
		library1.setLibraryCapacity(100);

		System.out.println(library);

		System.out.println("\n" + library1);

		Book b1 = library.getBook();
		System.out.println("Book data ");
		System.out.println(b1.getBookIsbn());
		System.out.println(b1.getBookName());
		System.out.println(b1.getBookCost());

	}
}
