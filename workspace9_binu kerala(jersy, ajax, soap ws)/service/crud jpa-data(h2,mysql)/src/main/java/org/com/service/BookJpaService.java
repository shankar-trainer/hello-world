package org.com.service;

import org.com.model.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BookJpaService {

    @PersistenceContext
    EntityManager em;

    public boolean addBook(Book book) {
        if (em.find(Book.class, book.getIsbn()) == null) {
            em.persist(book);
            return true;
        }
        return false;
    }
    public List<Book> getAllBook() {
    return  em.createQuery("from Book").getResultList();
    }

}
