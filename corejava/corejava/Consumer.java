class Consumer {

	private int consumerId; // instance variable
	private String consumerName; // instance variable
//	private static String country="india";
	private static String country;
	// static or class variable, single copy is shared by all the objects

//	 static int count=0;
	 static int count;

	Consumer() { // constructor used to initialize all instance variable
        this.consumerId=9898898;
        this.consumerName="suresh parsad";
		count++;
		System.out.println("constructor called "+count);
	}

	public Consumer(int consumerId, String consumerName) {
		this.consumerId = consumerId;
		this.consumerName = consumerName;
	}

	static { // it is first executed, it is used to initialize all static variable
		System.out.println("static block called ");
	     count=0;
	     country="india";
	}
	
//	void customerInfo() { // instance method 
		static void customerInfo(Consumer consumer) { // static  method 
		System.out.println("\nconsumer information");
		System.out.println("\t id "+consumer.consumerId);
		System.out.println("\t name "+consumer.consumerName);
		System.out.println("\t Country  "+country);
	}

	public static void main(String[] args) {
        
		Consumer consumer1=new Consumer();
		Consumer consumer2=new Consumer(9878998,"parmod kumar");
		Consumer consumer3=new Consumer(76676,"amit kumar");
		
		System.out.println("country is "+country);
		System.out.println("no of objects created "+count);
		System.out.println("no of objects created "+Consumer.count);
		
		customerInfo(consumer1);
		customerInfo(consumer2);
		customerInfo(consumer3);
	}

}
