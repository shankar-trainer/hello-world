package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Leader {
	private Integer id;
	private String name;
	private Integer age;
	private Car car;

	@PostConstruct
	public void leaderInit() {
		this.id = 100001;
		this.name = "ramakant kumar";
		this.age = 67;
	}

	@Autowired
	public Leader(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Leader [id=" + id + ", name=" + name + ", age=" + age + ", \ncar\n" + car + "]";
	}

}
