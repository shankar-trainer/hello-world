package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.ApplicationConfig;
import com.coforge.dao.LibraryDaoImpl;
import com.coforge.model.Library;

public class LibraryMain {

//	@Autowired
//	static LibraryDaoImpl daoImpl;
	
	public static void main(String[] args) {
		
		ApplicationContext context=new 
				AnnotationConfigApplicationContext(ApplicationConfig.class);

		LibraryDaoImpl daoImpl=context.getBean(LibraryDaoImpl.class);
		
		Library library=new Library();
		library.setName("computer science libratry");
		library.setLocation("beta gr noida");
		
		if(daoImpl.addLibrary(library))
			System.out.println("library added");
		
	}
}
