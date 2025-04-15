package com.coforge.model.one_to_one_uni;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Toy {

	@Id
	@GeneratedValue
	private int toyId;
	private String toyName;
	private String toyColor;
	private Float toyCost;
	
	// bidirectional
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "toy")
	private Kid kid;
}
