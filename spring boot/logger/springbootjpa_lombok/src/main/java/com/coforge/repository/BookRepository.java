package com.coforge.repository;

import com.coforge.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository  extends JpaRepository<Book,Long> {
    Book findByBname(String bname);

    @Query("select b from Book b where b.bname=?1")
    Book searchByBname(String bname);

    Book findByBnameAndCost(String bname, float cost);
    Book findByCost(float cost);
}
/*
  repository/dao layer -- data work
  |
service   -- handling errors
  |
 web(controller) client
 */
