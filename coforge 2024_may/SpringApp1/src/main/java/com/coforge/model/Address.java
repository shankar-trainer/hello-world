package com.coforge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Address {
	
	private int addressId;
	private  String  location;
	private  String city;

}
