package com.coforge.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component(value = "book1")
@Component
public class Book {

	private long isbn;
	private String bname;
	private float cost;

	@PostConstruct
	public void init() {
		System.out.println("init called ");
		this.isbn = 99888998;
		this.bname = "spring in action";
		this.cost = 1200;
	}
}
