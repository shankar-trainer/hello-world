package com.cts.model;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

public class RegularEmployee extends Employee {
	
	@PostConstruct
	public void init() {
		setEmpId(76767676);
		setEmpName("ram parsad");
		setEmpDob(LocalDate.of(1997, 12, 11));
	}

}
