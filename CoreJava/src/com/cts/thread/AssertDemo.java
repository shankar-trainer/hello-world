package com.cts.thread;

public class AssertDemo {
public static void main(String[] args) {
	int x=10;
	
	//assert x>100:"not ok";
	System.out.println(x);
	
	int p=200;
	
	assert p>100:"..  not ok";
	System.out.println(p);
	
	
}
}
