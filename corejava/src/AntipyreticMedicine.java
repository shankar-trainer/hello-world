
public class AntipyreticMedicine  extends Medicine{
	
	private String location;

	public String getLocation() {
		return location;
	}


	public AntipyreticMedicine(int id, String name, float cost, String location) {
		super(id, name, cost);
		this.location = location;
	}
	 
	 
	public static void main(String[] args) {
		AntipyreticMedicine antipyreticMedicine=new AntipyreticMedicine(565676776,"aspirin", 34, "ahmadabad");
	 
		System.out.println("medicine data ");
	  System.out.println("\tid "+antipyreticMedicine.getId());
	  System.out.println("\tname "+antipyreticMedicine.getName());
	  System.out.println("\tcost "+antipyreticMedicine.getCost());
	  System.out.println("\tlocation "+antipyreticMedicine.getLocation());
	}
	 
	 
}
