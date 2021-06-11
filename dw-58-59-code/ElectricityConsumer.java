
public class ElectricityConsumer extends Consumer {

	private int noOfUnit;
	private float costPerUnit;
	private float totalCost;

	int getNoOfUnit() {
		return noOfUnit;
	}

	void setNoOfUnit(int noOfUnit) {
		this.noOfUnit = noOfUnit;
	}

	float getCostPerUnit() {
		return costPerUnit;
	}

	void setCostPerUnit(float costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	float getTotalCost() {
		return totalCost;
	}

	void setTotalCost() {
		this.totalCost = noOfUnit*costPerUnit;
	}

	@Override
//private 
	//public
	protected
void consumerInfo() {
		super.consumerInfo();
		System.out.println("\nno of unit"+getNoOfUnit());
		System.out.println("cost per unit"+getCostPerUnit());
		System.out.println("total cost"+getTotalCost());
	}
	public static void main(String[] args) {
		ElectricityConsumer consumer=new ElectricityConsumer();
		
		consumer.setConsumerId(76766767);
		consumer.setConsumerName("mohan lal");
		consumer.setConsumerLocation("banglore");

		consumer.setNoOfUnit(1000);
		consumer.setCostPerUnit(7.5f);
		
		consumer.consumerInfo();
	}
}
