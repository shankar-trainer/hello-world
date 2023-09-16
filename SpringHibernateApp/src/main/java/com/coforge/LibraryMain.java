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

		Library library1 = new Library();
		library1.setLibraryName("gandhi library");
		library1.setLibraryName("faridabad");
		Library addLibrary = dao.addLibrary(library1);
		if(addLibrary!=null)
			System.out.println("Record added "+addLibrary);
		else 
			System.out.println("Library already present ");
			
		
	}
}
