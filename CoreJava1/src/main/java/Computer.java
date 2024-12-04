public class Computer {

	private int regNo;
	private String model;
	private float cost;

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Computer(int regNo, String model, float cost) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.cost = cost;
	}

	public int getRegNo() {
		return regNo;
	}

	public String getModel() {
		return model;
	}

	public float getCost() {
		return cost;
	}

	public void computerData() {
		System.out.println("computer data");
		System.out.println("\tRegistration No "+getRegNo());
		System.out.println("\tModel "+getModel());
		System.out.println("\tCost "+getCost());
	}
}
