
public class DepartmentMain {

	public static void main(String[] args) {
		Department department1=new Department();
		Department department2=new Department(6776767,"transport","delhi");
		Department department3=new Department(67788,"salary","chennai");
		
				
		Department department[]=new Department[3];
		department[0]=department1;
		department[1]=department2;
		department[2]=department3;
		
		for (Department department4 : department) {

			System.out.println("\ndepartment information");
			System.out.println("department id  "+department4.getDepartmentId());
			System.out.println("department name  "+department4.getDepartmentName());
			System.out.println("department location  "+department4.getDepartmentLocation());
			
			System.out.println("country  is "+Department.getCountry());
			
		}
		
	}
}
