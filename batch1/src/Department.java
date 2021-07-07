import java.util.Date;

public class Department {

	private int deptId;
	private String deptName;
	private String deptLocation;

	public Department(int deptId, String deptName, String deptLocation) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}

	void deptInfo() {
		System.out.println("Department Information");
		System.out.println("\nId is " + deptId);
		System.out.println("\nName is " + deptName);
		System.out.println("\nLocation is " + deptLocation);
	}
}

class DelieveryDepartment extends Department {
	private Date delieveryDate;
	private String deliveryStreet;
	private String deliveryBoy;

	public DelieveryDepartment(int deptId, String deptName, String deptLocation, Date delieveryDate,
			String deliveryStreet, String deliveryBoy) {
		super(deptId, deptName, deptLocation);
		this.delieveryDate = delieveryDate;
		this.deliveryStreet = deliveryStreet;
		this.deliveryBoy = deliveryBoy;
	}

	@Override
	// protected
	public void deptInfo() {
		super.deptInfo();
		System.out.println("\n");
		System.out.println("delieveryDate  " + delieveryDate);
		System.out.println("delieveryStreet  " + deliveryStreet);
		System.out.println("delievery Boy  " + deliveryBoy);
	}

	public static void main(String[] args) {
		DelieveryDepartment department = new DelieveryDepartment(7676776, " delievery dept chennai ", "chennai",
				new Date(), "thoraipakkam", "sharath kumar");
		department.deptInfo();
	}

}