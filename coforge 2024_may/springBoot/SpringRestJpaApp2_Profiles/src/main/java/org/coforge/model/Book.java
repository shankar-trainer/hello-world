package org.coforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue
	private int isbn;
	private  String bname;
	private  float cost;
}
