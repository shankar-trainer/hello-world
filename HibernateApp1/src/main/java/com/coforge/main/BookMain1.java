package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Book;

public class BookMain1 {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
	    session.createNamedQuery("allbook").list().forEach(a->System.out.println(a));
	  List<Book> booklist=  session.createNamedQuery("allbook").list();
	
	  System.out.println("\n");
	    booklist.forEach(a->System.out.println(a.getIsbn()+"\t"+a.getBname()+"\t"+a.getCost()));
	}
}
