package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue
	private long isbn;
	private String bname;
	private float cost;
}
