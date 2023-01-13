
public class WrapperExample7 {

	public static void main(String[] args) {
		int empId=Integer.parseInt(args[0]);
		String name=args[1];
		float salary=Float.parseFloat(args[2]);
		float pf=Float.parseFloat(args[3]);
		float gross_salary=salary-(pf*salary);
		
		System.out.println("Employee Data ");
		System.out.println("id is "+empId);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		System.out.println("pf is "+pf);
		System.out.println("gross salary is "+gross_salary);
	}
}
