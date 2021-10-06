package org.com.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {

	@PersistenceContext
	EntityManager em;
	
	public  void addBook(Book book){
		em.persist(book);
	}
}
