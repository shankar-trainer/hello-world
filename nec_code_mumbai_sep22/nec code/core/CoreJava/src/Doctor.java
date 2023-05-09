
public class Doctor extends Person {
	private String location;
	private String specialisation;
	private String state;

	public String getLocation() {
		return location;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public Doctor(int id, String name, int age,String location,String specialisation) {
	//	super(id,name,age); 
		this(id,name,age,"maharastra");
		this.location=location;
		this.specialisation=specialisation;
	}
	
	public Doctor(int id, String name, int age,String state) {
		super(id,name,age); 
		this.state=state;	
	}

	public static void main(String[] args) {
		Doctor person=new Doctor(1001,"hemant kumar",55,"mumbai","cardiologist");
		
		System.out.println("doctor data");
		
		System.out.println("\n\tid is "+person.getId());
		System.out.println("\tname is "+person.getName());
		System.out.println("\tage is "+person.getAge());
		System.out.println("\tlocation is "+person.getLocation());
		System.out.println("\t specialisation is "+person.getSpecialisation());
		System.out.println("\t state is "+person.state);
		
	}
	
}
