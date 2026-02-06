package com.cts.dao;

import com.cts.model.Author;
import com.cts.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository
        <Author,Integer> {

}
