
public class DepartmentMain {

	public static void main(String[] args) {

		Department dept=new Department();
		
		System.out.println("id is "+dept.getDeptId());
		System.out.println("name is "+dept.getDeptName());
		System.out.println("location is "+dept.getDeptLocation());
		
		System.out.println("state is " + Department.getDeptState());
		System.out.println("country is " + Department.getDeptCountry());
	}
}
