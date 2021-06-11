package cts.com.file;

import java.io.Serializable;

public class Employee  implements Serializable{
	private int id;
	private String name;
	private float salary;
	private static String state="karnataka";

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	float getSalary() {
		return salary;
	}

	void setSalary(float salary) {
		this.salary = salary;
	}

	static String getState() {
		return state;
	}

	static void setState(String state) {
		Employee.state = state;
	}

}
