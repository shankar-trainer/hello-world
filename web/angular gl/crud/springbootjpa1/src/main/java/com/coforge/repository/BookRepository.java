package com.coforge.repository;

import com.coforge.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository  extends JpaRepository<Book,Long> {

}
/*
  repository/dao layer -- data work
  |
service   -- handling errors
  |
 web(controller) client
 */
