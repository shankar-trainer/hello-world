package com.example.app1.book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

	boolean existsByIsbnAndIdNot(String isbn, Long id);

	boolean existsByIsbn(String isbn);
}
