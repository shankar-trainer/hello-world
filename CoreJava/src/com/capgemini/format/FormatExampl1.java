package com.capgemini.format;

public class FormatExampl1 {

	public static void main(String[] args) {
		float salary=766776767.65600f;
		
		System.out.println(salary);
		
		System.out.printf("\n  salary is  %f",salary);
		System.out.printf("\n  salary is %.2f",salary);
		System.out.printf("\n  salary is  %20.3f",salary);
		
		salary=56000.56777f;
		
		System.out.printf("\n%.2f",salary);
		System.out.printf("\n%6.2f",salary);
		System.out.printf("\n%20.3f",salary);
		
		
		System.out.printf("\n"+String.format("%20.3f",salary));
		String s1=String.format("%20.3f",salary);
		System.out.printf("\n"+s1);
     
		
		
	}
}
