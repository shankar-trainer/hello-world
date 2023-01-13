
public class Vehicle1 {

	private String color;
	private int noOfWheels;
	private String model;
   
	public Vehicle1(String color, int noOfWheels, String model) {
		super();
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}

	public void vehicleInfo() {
      System.out.println("Vehicle data");
      System.out.println("\tcolor "+color);
      System.out.println("\tNo Of Wheels "+noOfWheels);
      System.out.println("\tModel "+model);
	}

}
