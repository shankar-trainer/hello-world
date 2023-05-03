package pack2;
import pack1.Employee;

public class EmpMain2  extends Employee {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.id=89989;
		employee.name="suraj kumar";
		employee.info();
System.out.println("country "+new EmpMain2().country);
	}
	
}
