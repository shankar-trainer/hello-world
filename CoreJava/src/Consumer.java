
public class Consumer {

	private int consumertId;
	private String consumerName;
	private String consumerLocation;
	
	public Consumer(int consumertId, String consumerName, String consumerLocation) {
		super();
		this.consumertId = consumertId;
		this.consumerName = consumerName;
		this.consumerLocation = consumerLocation;
	}

	public String getConsumerInfo() {
		return "Consumer Info"+
	           "\nId"+consumertId+
	           "\nName"+consumerName+
	           "\nLocation"+consumerLocation;
	}
	
}
