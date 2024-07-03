package org.coforge.repository;

import org.coforge.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  BookDao  extends JpaRepository<Book, Integer>{

}
