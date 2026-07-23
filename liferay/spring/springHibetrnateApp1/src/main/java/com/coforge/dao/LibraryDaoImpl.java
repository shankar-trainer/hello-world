package com.coforge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.model.Library;

@Repository
public class LibraryDaoImpl  implements Librarydao{

//	@Autowired 
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public LibraryDaoImpl(SessionFactory factory){
        this.factory=factory;
	}
	

	@Override
	public boolean addLibrary(Library library) {
		session=factory.openSession();
		transaction=session.getTransaction();
		transaction.begin();
		session.persist(library);
		transaction.commit();
		return true;
	}

	@Override
	public boolean removeLibraryById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean showAll() {
		// TODO Auto-generated method stub
		return false;
	}

}
