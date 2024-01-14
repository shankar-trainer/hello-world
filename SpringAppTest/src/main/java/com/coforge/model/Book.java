package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public class Book {

	private long isbn;
	private String bname;
	private String author;

}
