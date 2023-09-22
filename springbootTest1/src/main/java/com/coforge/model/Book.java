package com.coforge.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Book {

	private long isbn;
	private String bname;
	private float cost;
	
	
}
