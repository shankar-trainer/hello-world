package org.com;

  public class Employee {

public	int id;
public	String name;
protected	static float salary;
	
	public float grossSalary(){
		return salary-salary*0.1f;
	}
	
}
