package com.abc.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
//@Data
@ToString
@Lazy(value = false)
@Component
public class Department {

	private long departmentId;
	private String departmentName;
	private String departmentLocation;
	private int departmentTotalMember;

	@PostConstruct
	public void initDepartment() {
		System.out.println(getClass().getSimpleName() + " init called");
		this.departmentId = 98898989;
		this.departmentName = "software development department";
		this.departmentLocation = "Pune";
		this.departmentTotalMember = 560;
	}

}
