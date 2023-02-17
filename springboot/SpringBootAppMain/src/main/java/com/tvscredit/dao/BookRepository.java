package com.tvscredit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvscredit.model.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer>{

}
