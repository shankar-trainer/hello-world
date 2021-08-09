package com.montran.reflect;

import java.lang.annotation.Target;


@interface MyAnno2{
	
}


public class A {
	/**
	 *  use empId instead id
	 */
	
	
	@Deprecated
	public int id;
	
	/**
	 *  use empName instead name
	 */
	
	@Deprecated
	public String name;

	/**
	 * dispInfo method is created by author s kumar
	 * it gives information about all the fields id, name 
	 */
	public void dispInfo() {
		System.out.println("id is " + id);
		System.out.println("name is " + name);
	}
	public A() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("deprecation")
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
