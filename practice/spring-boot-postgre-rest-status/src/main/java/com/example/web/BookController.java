package com.example.web;

import com.example.model.Book;
import com.example.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookRepository bookRepository;

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book b) {
//        if (bookRepository.findById(b.getBookid()).isPresent())
//            return new ResponseEntity("id already present", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookRepository.save(b));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> searchBook(@PathVariable UUID id) {

        if (bookRepository.findById(id).isEmpty())
            return new ResponseEntity("id not  present", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.FOUND).body(bookRepository.findById(id).get());
    }
}
