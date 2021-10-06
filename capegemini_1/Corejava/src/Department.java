public class Department {
	private int dept_id;
	private String dept_name;
	private static String country;

	static {
		country = "India";
		System.out.println("static block called ");
	}

	public Department() {
		dept_id = 878787;
		dept_name = "training";
		System.out.println("constructor called");
	}

	void deptInfo() {
		System.out.println("department1 information");
		System.out.println("\tid is " + dept_id);
		System.out.println("\tname is " + dept_name);
		System.out.println("\tcountry  is " + Department.country);
	}

	static void deptInfo1(Department d) {
		System.out.println("department1 information");
		System.out.println("\tid is " + d.dept_id);
		System.out.println("\tname is " + d.dept_name);
		System.out.println("\tcountry  is " + Department.country);
	}

	public static void main(String[] args) {
		Department department1 = new Department();
        department1.deptInfo();
        deptInfo1(department1);
	}
}
