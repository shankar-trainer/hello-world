package org.com;

public class FormatDemo {

	public static void main(String[] args) {
		float salary=456788.6788f;
		String name="ram kumar";
		
		System.out.printf("salary is %f and name is %s", salary,name);
		
		System.out.printf("\n%6.2f ", salary);
		System.out.printf("\n%15.2f salary", salary);
		System.out.printf("\n%-15.2f salary", salary);

		System.out.printf("\n%.2f ", salary);
		
	}
}
