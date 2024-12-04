package org.technous.batchPrac3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.technous.batchPrac3.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
