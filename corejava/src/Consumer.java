
public class Consumer {

	private int consumerId;
	private String consumerName;
	private float consumerSalary;

	private  Consumer() { //default constructor 
	     consumerSalary=899898;
	     consumerName="rohit kumar";
	     consumerId=788787;
		System.out.println("constructor called");
	}
	
	public static void main(String[] args) {
		
		Consumer consumer=new Consumer();
		Consumer consumer1=new Consumer();
		Consumer consumer2=new Consumer();
		
		System.out.println("\nconsumer1");
		System.out.println(consumer.consumerId);
		System.out.println(consumer.consumerName);
		System.out.println(consumer.consumerSalary);
		
		System.out.println("\nconsumer2");
		System.out.println(consumer.consumerId);
		System.out.println(consumer.consumerName);
		System.out.println(consumer.consumerSalary);
	}

}
