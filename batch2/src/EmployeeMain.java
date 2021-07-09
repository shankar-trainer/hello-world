
public class EmployeeMain {

	public static void main(String[] args) {
	  Address address=new Address(544545,"new delhi","delhi ", 110082);
	  
		Employee employee=new Employee(1001,"amrit kumar", address);
		
		System.out.println("Employee Data");
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
		Address address2=employee.getAddress();
		
		System.out.println("\nEmployee Address");
		System.out.println("addr id "+address2.getAddrId());
		System.out.println("addr  city  "+address2.getAddrCity());
		System.out.println("addr state "+address2.getAddrState());
		System.out.println("addr pin "+address2.getAddrPin());
	}
}
