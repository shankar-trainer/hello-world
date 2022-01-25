package edu.lpu;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.id=1001;
		employee.name="ram shankar";
		employee.location="lpu phagwara ";
		
		employee.empData();
		System.out.println("location "+employee.location);
	}
}
