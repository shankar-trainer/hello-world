package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode
@Entity
public class Book {

	@Id
    @GeneratedValue
	private int isbn;
	private String bname;
	private float cost;
}
