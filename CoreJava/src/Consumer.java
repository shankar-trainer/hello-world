enum Day{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}


public class Consumer {


	private int consumerId;
	private String  consumerName;
	private String consumerLocation;
	private Day day;
	
	public Consumer(int consumerId, String consumerName, String consumerLocation, Day day) {
		super();
		this.consumerId = consumerId;
		this.consumerName = consumerName;
		this.consumerLocation = consumerLocation;
		this.day = day;
	}

	public int getConsumerId() {
		return consumerId;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public String getConsumerLocation() {
		return consumerLocation;
	}

	public Day getDay() {
		return day;
	}

	
	
	
}
