package com.coforge.model.one_to_one_uni;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Kid {

	@Id
	@GeneratedValue
	private int id;
	private int age;
	private String name;

	@OneToOne
	@JoinColumn(name = "kid_toy_id")
	private Toy toy;
}
