
public class Consumer {
	private  int consumerId;
	private  String consumerName;
	private  String  consumerLocation;
	
	int getConsumerId() {
		return consumerId;
	}
	void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	String getConsumerName() {
		return consumerName;
	}
	void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	String getConsumerLocation() {
		return consumerLocation;
	}
	void setConsumerLocation(String consumerLocation) {
		this.consumerLocation = consumerLocation;
	}

	void consumerInfo() {
		System.out.println("consumer info ");
		System.out.println("\n\tId is "+getConsumerId());
		System.out.println("\tName is "+getConsumerName());
		System.out.println("\tLocation is "+getConsumerLocation());
	}
}
