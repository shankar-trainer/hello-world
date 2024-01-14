package com.coforge.model;

public class Hello {
    int c;
	void start() {
		c=1;
		System.out.println("init called for Hello1 ");
	}
	
	public void display() {
		System.out.println("display  method ");
		System.out.println("no is  "+c);
	}
	
	void destroy() {
		System.out.println("destroy called ");
	}
	
}
