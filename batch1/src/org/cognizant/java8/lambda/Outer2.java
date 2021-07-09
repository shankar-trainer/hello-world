package org.cognizant.java8.lambda;


public class Outer2 {
	String country = "india";

	void disp() {
		System.out.println("this is  outer method ");
	}

	private static class Inner {
        static String city="chennai";
        
		String var="abc";
		void show(Outer2 o) {
    	  System.out.println("this is inner method " );
    	  System.out.println("inside inner  class country is  "+o.country );
      }      
	}
	public static void main(String[] args) {
		Outer2 outer=new Outer2();
		//Outer.Inner inner=outer.new Inner();
		Outer2.Inner inner=new Outer2.Inner();	
		//	inner.show();
		inner.show(outer); 
		
		System.out.println(Outer2.Inner.city);
		
	}
}
