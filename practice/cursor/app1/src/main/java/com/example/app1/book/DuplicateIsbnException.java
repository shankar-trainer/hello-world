package com.example.app1.book;

public class DuplicateIsbnException extends RuntimeException {

	public DuplicateIsbnException(String isbn) {
		super("A book with ISBN '" + isbn + "' already exists");
	}
}
