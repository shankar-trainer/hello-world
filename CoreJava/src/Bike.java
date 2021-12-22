
public class Bike {

	private int bikeRegNo;
	private String bikeName;

	public Bike(int bikeRegNo, String bikeName) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeName = bikeName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bike) {
			Bike bk=(Bike) obj;
			if(bk.bikeRegNo==this.bikeRegNo && bk.bikeName.equals(this.bikeName))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		 Bike bike1=new Bike(677676, "suzuki bike");
		 Bike bike2=new Bike(677676, "suzuki bike");
		 
		 System.out.println(bike1.equals(bike2));
		 
		// new Integer(11).equals(66);
		// "".equals("");
	}

}
