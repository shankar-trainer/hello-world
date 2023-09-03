public class Computer {
	private int computerId;
	private String computerModel;
	private float computerCost;
	
	//public
	void computerInformation() {
		System.out.println("Computer Information");
		System.out.println("\tId "+getComputerId());
		System.out.println("\tModel "+getComputerModel());
		System.out.println("\tCost "+getComputerCost());
	}

	public int getComputerId() {
		return computerId;
	}

	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}

	public String getComputerModel() {
		return computerModel;
	}

	public void setComputerModel(String computerModel) {
		this.computerModel = computerModel;
	}

	public float getComputerCost() {
		return computerCost;
	}

	public void setComputerCost(float computerCost) {
		this.computerCost = computerCost;
	}

}
