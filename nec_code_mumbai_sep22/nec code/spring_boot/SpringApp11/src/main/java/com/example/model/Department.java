package com.example.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component(value ="dept2")
@Data
@ComponentScan(basePackages = {"com.example.model"})

public class Department {

	private int deptId;
	private String deptName;
	private String deptLocation;
	private int deptTotalMember;
	
	@PostConstruct
	public void init() {
		 this.deptId=9009;
		 this.deptName="survey department";
		 this.deptLocation="mumbai";
		 this.deptTotalMember=90;
	}
}
