public class Department {

	// deptId, deptName, deptLocation -- instance variable
	private int deptId;
	private String deptName;
	private  String deptLocation;
	
	// deptState, deptCountry  static/class  variable  
	private static String deptState;
	private static String deptCountry;
	
	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public static String getDeptState() {
		return deptState;
	}

	public static void setDeptState(String deptState) {
		Department.deptState = deptState;
	}



	public static String getDeptCountry() {
		return deptCountry;
	}



	public static void setDeptCountry(String deptCountry) {
		Department.deptCountry = deptCountry;
	}



	static {
		// static block initializes static/class variable
	deptCountry="India";
	deptState="tamil nadu";
		System.out.println("static block1");
	}
	
	static {
		System.out.println("static block2");
	}
	
	public Department() {
		// constructor initializes instance variable 
	   System.out.println("constructor called ");
	   deptId=77898787;
	   deptLocation="chennai";
	   deptName="Loan department";
	}
	
	
	
	public static void main(String[] args) {
		Department department1=new Department();
		//Department department2=new Department();
		//Department department3=new Department();
		
		//System.out.println("id is "+deptId); // error 
		System.out.println("id is "+department1.deptId); // error 
		System.out.println("name is "+department1.deptName); // error 
		System.out.println("location is "+department1.deptLocation); // error 
		
		System.out.println("state is "+deptState);
		System.out.println("country is "+deptCountry);
	}
}
