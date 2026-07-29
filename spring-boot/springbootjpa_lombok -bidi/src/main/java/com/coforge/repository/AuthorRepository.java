package com.coforge.repository;

import com.coforge.model.Author;
import com.coforge.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends
        JpaRepository<Author,Long> {
}
/*
  repository/dao layer -- data work
  |
service   -- handling errors
  |
 web(controller) client
 */
