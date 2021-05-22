package corejava;

public class Consumer {
	int consumerId;
	String consumerName;

	static String state;
	static String country;

	{
		consumerName = "ram kumar";
		consumerId = 65665;
		System.out.println("init block1 called");
	}

	{
		consumerName = "amrendra kumar";
		consumerId = 65668;

		System.out.println("init block2 called");
	}
static
	{
		state = "tamil nadu";
		country = "india";
		System.out.println("static block ");
	}

	public Consumer() {
		consumerName = "umesh kumar";
		consumerId = 65669;

		System.out.println("constrcutor called");
	}

	static void ConsumerInfo(Consumer consumer) {
		System.out.println("country name is " + country);
		System.out.println("state name is " + state);
		System.out.println("consume id is " + consumer.consumerId);
		System.out.println("consume id is " + consumer.consumerName);
	}

	public static void main(String[] args) {

		Consumer c1 = new Consumer();
		ConsumerInfo(c1);

//		System.out.println(c1.consumerId);
//		System.out.println(c1.consumerName);
//		
//		System.out.println(Consumer.state);
//		System.out.println(country);
	}
}
