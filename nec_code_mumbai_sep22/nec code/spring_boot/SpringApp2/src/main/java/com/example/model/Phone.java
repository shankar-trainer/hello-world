package com.example.model;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

	private int phoneId;
	private String phoneModel;
	private float phoneCost;
	
	@PostConstruct
	public void init() {
		System.out.println("phone init called ");
		this.phoneId=89898;
		this.phoneModel="samsung";
		this.phoneCost=78000;
	}
}
