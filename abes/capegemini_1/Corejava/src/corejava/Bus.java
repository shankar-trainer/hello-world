package corejava;

public class Bus extends Vehicle{

	private int  no_of_passenger;
	private float cost;
	private String type;
	private String seat_type;
	private float distance;
	
	
	public Bus(String color, int no_of_wheels, String model,
			int no_of_passenger, float cost, String type, 
			String seat_type, float distance) {
		super(color, no_of_wheels, model);
		this.no_of_passenger = no_of_passenger;
		this.cost = cost;
		this.type = type;
		this.seat_type = seat_type;
		this.distance=distance;
	}
	
	float tarvelCost(){
		return distance*cost;
	}
	
	
}
