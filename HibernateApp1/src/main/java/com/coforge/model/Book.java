package com.coforge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="book1")
public class Book {

	@Id
	@Column(length = 20, name = "book_isbn")
	private long isbn;
	@Column(length = 50, name = "book_bname", nullable = false)
	private String bname;
	@Column(length = 10, name = "book_cost", nullable = false, precision = 2)
	private float cost;
}
