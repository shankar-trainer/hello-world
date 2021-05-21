
public class Person {

	private int perId;
	private String  perName;
	private String perLocation;
	
	private static String country;
	
	static {
		System.out.println("static block called");	
	}
	
	public Person() {
		System.out.println("constructor called ");
	}
	
	
	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getPerLocation() {
		return perLocation;
	}

	public void setPerLocation(String perLocation) {
		this.perLocation = perLocation;
	}

	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Person.country = country;
	}

	
	
}
