
public class Department {
  private int departmentId;
  private String departmentName;
  private String departmentLocation;
  private static String country;
	
	static {
       country="India";
		System.out.println("static block  called ");
	}
	
	public Department(int departmentId, String departmentName, String departmentLocation) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}

	public Department() {
		departmentId=78876776;
		departmentName="training";
		departmentLocation="noida";
		System.out.println("constructor called ");
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public static String getCountry() {
		return country;
	}
	
}
