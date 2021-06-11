
public class Employee {

	private int empId;//camelCase 
	private String empName;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void empInfo() {
		System.out.println("\nid "+getEmpId());
		System.out.println("name "+getEmpName());
		System.out.println("salary "+getSalary());
	}
	
	public float totSalary(Employee emp[]) {
		float total=0;
		
		for (int i = 0; i < emp.length; i++) {
		  total=total+emp[i].getSalary();	
		}
		return total;
	}
	public float avgSalary(Employee emp[]) {
		float total=0;
		
		for (int i = 0; i < emp.length; i++) {
			total=total+emp[i].getSalary();	
		}
		return total/emp.length;
	}
	
}
