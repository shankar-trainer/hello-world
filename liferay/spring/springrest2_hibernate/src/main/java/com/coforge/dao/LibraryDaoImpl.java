package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.model.Library;

@Repository
public class LibraryDaoImpl implements Librarydao {

	@Autowired
	private SessionFactory factory;
	
	private Session session;
	private Transaction transaction;
//     @Autowired
//	public LibraryDaoImpl(SessionFactory factory) {
//		this.factory = factory;
//	}

	@Override
	public boolean addLibrary(Library library) {
		session = factory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.persist(library);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean removeLibraryById(int id) {
		session = factory.openSession();
		Library library = session.find(Library.class, id);

		transaction = session.getTransaction();
		transaction.begin();
		session.remove(library);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public List<Library> showAll() {
		session = factory.openSession();
		return session.createQuery("from Library").list();
	}

}