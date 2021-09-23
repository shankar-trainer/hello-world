
public class Department {
	private int departmentId;
	private String departmentName;
	private String departmentLocation;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

  public void departmentInfo() {
	    System.out.println("\n\nDepartment Information  ");
	    System.out.println("\tid is "+getDepartmentId());
	    System.out.println("\tname is "+getDepartmentName());
	    System.out.println("\tlocation is "+getDepartmentLocation());
  }	
	
}
