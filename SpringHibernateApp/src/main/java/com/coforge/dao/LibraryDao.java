package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.coforge.model.Library;

public class LibraryDao {

	SessionFactory factory;

	public LibraryDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	public List<Library> getAll() {
		Session session = factory.openSession();
		return session.createQuery("from Library").list();
	}

	public Library addLibrary(Library library) {
		Session session = factory.openSession();
		Library library2 = session.get(Library.class, library.getLibraryId());
		if (library2 == null) {
			session.getTransaction().begin();
			session.save(library);
			session.getTransaction().commit();
			return library;
		}
		return null;
	}

	public Library searchLibrary(long id) {
		Session session = factory.openSession();
		Library library2 = session.get(Library.class, id);
		if (library2 == null)
			return null;
		else
			return library2;
	}

}
