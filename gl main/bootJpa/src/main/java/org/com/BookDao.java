package org.com;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class BookDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public void addBook(Book  book){
		entityManager.persist(book);
	}
}
