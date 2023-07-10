package com.coforge.collection;

public class Outer {
    int x=100;
    
	 private class Inner{
	    int y=10;
	    void show() {
	    	System.out.println("Outer class x "+x);
	    }
	 }
	 
	 public static void main(String[] args) {
		Outer outer=new Outer();
		
		Inner inner=outer.new Inner();
		System.out.println(inner.y);
		inner.show();
		
		System.out.println(outer.x);
	}
}
