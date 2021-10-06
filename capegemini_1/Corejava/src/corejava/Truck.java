package corejava;

public class Truck extends Vehicle {
	private float capacity;
	private float fare;
	private int size;
	private long distance;
	
	public Truck(String color, int no_of_wheels, String model, float capacity,
			float fare, int size, long distance) {
		super(color, no_of_wheels, model);
		this.capacity = capacity;
		this.fare = fare;
		this.size = size;
		this.distance = distance;
	}



	float totalCost(){
		return capacity*fare*distance;
	}

}
