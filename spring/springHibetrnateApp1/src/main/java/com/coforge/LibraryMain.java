package com.coforge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.ApplicationConfig;
import com.coforge.dao.LibraryDaoImpl;
import com.coforge.model.Library;

public class LibraryMain {


	public static void main(String[] args) {
		
		ApplicationContext context=new 
				AnnotationConfigApplicationContext(ApplicationConfig.class);

		LibraryDaoImpl daoImpl=context.getBean(LibraryDaoImpl.class);
		
		Library library=new Library();
		library.setName("kids libratry");
		library.setLocation("alpha gr.noida");
		
		if(daoImpl.addLibrary(library))
			System.out.println("library added");
		
		System.out.println("show all");
		daoImpl.showAll().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getLocation()));
		
		System.out.println("remove by id ");
		daoImpl.removeLibraryById(1);
		
		System.out.println(" after remove show all");
		daoImpl.showAll().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getLocation()));
		
		
	}
}
