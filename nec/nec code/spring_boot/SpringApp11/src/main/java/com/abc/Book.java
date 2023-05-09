package com.abc;

import lombok.Data;

@Data
public class Book {

	private int isbn;
	private String bname;;
	private float cost;
	private String author;
	
	private PublicationAddress address;
	
}
