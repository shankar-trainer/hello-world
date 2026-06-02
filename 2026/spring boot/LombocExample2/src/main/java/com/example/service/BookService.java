package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.model.Book;

import lombok.Data;

@Service
@Data
@ComponentScan("com.example.model")
public class BookService {

	@Autowired
	private Book book;
	
	public void setBookdata() {
//		book.setIsbn(767676);
//		book.setBname("java for beginner");
//		book.setAuthor("suresh babu");
		
		book=Book.builder().isbn(1989898).author("jagapati kumar").bname("java for dummies").build();
	
	}
	
	
	
}
