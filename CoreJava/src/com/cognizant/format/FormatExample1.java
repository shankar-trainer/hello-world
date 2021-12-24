package com.cognizant.format;

public class FormatExample1 {

	public static void main(String[] args) {
		
		float salary=656557.77757f;
		String name="anand kumar";
		int id=878787;
		
		
		System.out.println("id is "+id+"\nname is "+name+"\nsalary is "+salary);
		
		System.out.printf("\nid is %d\nname is %s\nsalary is %f  ",id,name,salary);
		
		System.out.printf("\n%f",salary);
		System.out.printf("\n%.2f",salary);// .2 for two decimal
		System.out.printf("\n%20.2f",salary);// .2 for two decimal
		
		
		
		
	}
}
