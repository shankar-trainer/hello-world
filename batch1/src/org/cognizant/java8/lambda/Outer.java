package org.cognizant.java8.lambda;

public class Outer {
	String country = "india";

	void disp() {
		System.out.println("this is  outer method ");
	}

	private class Inner {
         String var="abc";
		void show() {
    	  System.out.println("this is inner method " );
    	  System.out.println("inside inner  class country is  "+country );
      }      
	}
	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.show();
		System.out.println(inner.var);
	}
}
