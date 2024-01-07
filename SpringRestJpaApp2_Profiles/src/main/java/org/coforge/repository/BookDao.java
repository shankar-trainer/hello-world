package org.coforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.coforge.model.Book;

@Repository
public interface  BookDao  extends JpaRepository<Book, Integer>{

}
