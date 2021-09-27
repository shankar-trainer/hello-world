package pack2;

public class Vehicle {

	private final int regNo;
	private String model;
	private float cost;

	public Vehicle() {
		regNo = 878787;
		model = "car";
		cost = 900000;
	}

	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", model=" + model + ", cost=" + cost + "]";
	}

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();

		System.out.println(vehicle);
		// vehicle.regNo=787887887;
		vehicle.model = "mini car";
		vehicle.cost = 780000;
		System.out.println(vehicle);
		// local variable is only final 
	final	String location="chennai";
		System.out.println();

	}

}
