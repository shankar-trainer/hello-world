package com.capegemini.java8;

public class Outer {
	private float salary;
	private float pf;

	public Outer(float salary, float pf) {
		super();
		this.salary = salary;
		this.pf = pf;
	}

	private class Inner {
		String city;
		//static String country;
		
		float netSalary() {
			return salary - (salary * pf / 100);
		}
	}
	public static void main(String[] args) {
		Outer outer = new Outer(20000, 5);
		Outer.Inner inner = outer.new Inner();

		System.out.println("salary is " + outer.salary);
		System.out.println("PF is " + outer.pf);
		System.out.println("Net salary " + inner.netSalary());
	}
}
