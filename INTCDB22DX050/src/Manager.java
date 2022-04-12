
public class Manager extends Person {
	// is a relationship
	
	//manager is a person
	
	private String location;
	private float pf;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getPf() {
		return pf;
	}


	public void setPf(float pf) {
		this.pf = pf;
	}


	public static void main(String[] args) {
		Manager m=new Manager();
		m.setId(8788789);
		m.setName("muthu swami");
		m.setSalary(89000);
		m.setLocation("chennai");
		m.setPf(0.05f);
		
		
		System.out.println("id is "+m.getId());
		System.out.println("name is "+m.getName());
		System.out.println("salary is "+m.getSalary());
		System.out.println("location is "+m.getLocation());
		System.out.println("pf is "+m.getPf());
		
	}

}
