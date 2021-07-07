package corejava;

public class Bike {

	private int bikeRegNo;
	private String bikeModel;
	private float bikeCost;

	public Bike(int bikeRegNo, String bikeModel, float bikeCost) {
		super();
		this.bikeRegNo = bikeRegNo;
		this.bikeModel = bikeModel;
		this.bikeCost = bikeCost;
	}

	@Override
	public String toString() {
		return "Bike Information " + "\nReg no " + bikeRegNo + "\nBike cost" + bikeCost + "\nBike model" + bikeModel;
	}

	public static void main(String[] args) {
		Bike bike = new Bike(655656, "Honda shine", 70000.00f);
		System.out.println(bike);

	}

}
