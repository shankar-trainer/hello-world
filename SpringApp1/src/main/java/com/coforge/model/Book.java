package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Book {

	private long isbn;
	private String bname;
	private String author;

}
