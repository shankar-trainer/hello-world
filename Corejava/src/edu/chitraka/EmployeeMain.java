package edu.chitraka;

public class EmployeeMain {

	public static void main(String[] args) {
		//Employee employee=new Employee();// cannot make instance of abstract class
		Employee employee=new Manager(45665,"sumit ranjan", 34000, "rajpura","punjab");
		employee.empInfo();
		
	}
}
