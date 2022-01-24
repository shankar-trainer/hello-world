
public class BankManager extends BankEmployee {
	private String location;
	private String state;
	private String country;
	
	//  BankManager is a BankEmployee()

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		BankManager bankManager = new BankManager();
		bankManager.setId(788787);
		bankManager.setName("amardeep pushkar");
		bankManager.setSalary(90000.00f);
		bankManager.setLocation("new delhi");
		bankManager.setState("delhi");
		bankManager.setCountry("India");
		

		System.out.println("Bank Employee Data ");
		System.out.println(bankManager.getId());
		System.out.println(bankManager.getSalary());
		System.out.println(bankManager.getName());
		System.out.println(bankManager.getLocation());
		System.out.println(bankManager.getState());
		System.out.println(bankManager.getCountry());

		BankEmployee.bankEmployeeInfo();
	}
}
