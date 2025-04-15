package com.cts.model;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;

public class SpecialEmployee extends Employee {
	
	@PostConstruct
	public void init() {
		setEmpId(8788787);
		setEmpName("mohan parsad");
		setEmpDob(LocalDate.of(1991, 10, 28));
	}

}
