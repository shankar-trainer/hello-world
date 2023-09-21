package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.dao.LibraryDao;
import com.coforge.model.Library;

public class LibraryMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		LibraryDao dao = ctx.getBean(LibraryDao.class);

		System.out.println("add operation");

		Library library1 = new Library();
		library1.setLibraryName("rajeev library");
		library1.setLibraryLocation("noida");

		Library addLibrary = dao.addLibrary(library1);

		if (addLibrary != null)
			System.out.println("Record added " + addLibrary);
		else
			System.out.println("Library already present ");

		System.out.println("saerch operation");
		long id = 1;
		Library searchLibrary = dao.searchLibrary(id);
		if (searchLibrary == null)
			System.out.println("library with id " + id + " not found ");
		else
			System.out.println("library with id " + id + "  found \n" + searchLibrary);

	}
}
