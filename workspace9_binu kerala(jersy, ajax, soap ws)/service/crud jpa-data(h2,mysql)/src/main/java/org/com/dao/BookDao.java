package org.com.dao;

import org.com.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface BookDao extends JpaRepository<Book,Integer> {

}
