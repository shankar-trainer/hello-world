package com.capgemini.io;

import java.io.Serializable;

public class Customer   implements Serializable {

	transient int id;
	String name;
	String location;
	static String state="delhi";
	
	
}
