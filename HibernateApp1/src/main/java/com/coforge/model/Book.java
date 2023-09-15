package com.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	private long isbn;
	private String bname;
	private float cost;
}
