package org.audintel.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Person {
	private int personId;
	private String personName;
	private float personSlaray;
	private LocalDate personDob;

}
