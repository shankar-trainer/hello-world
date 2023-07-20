package com.example.model;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
//@Component
@Component(value = "software1")
public class Software {

	private int id;
	private  String name;
	private  float cost;
	
	@Autowired
	private Defects defects;
	
	@PostConstruct
	public void init() {
		this.id=6766767;
		this.name="ledger software";
		this.cost=12000;
		System.out.println("init called");
	} 

	@PreDestroy
	public void clean() {
		System.out.println("clean called");
	} 
}
