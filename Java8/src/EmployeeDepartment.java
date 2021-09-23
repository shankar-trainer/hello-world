
public class EmployeeDepartment  extends Department{

	private String city;
	private String country;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	 public void departmentInfo() {
		super.departmentInfo();
	     System.out.println("\n\tcity is "+getCity());	 
	     System.out.println("\tcountry  is "+getCountry());	 
	 }
	 

}
