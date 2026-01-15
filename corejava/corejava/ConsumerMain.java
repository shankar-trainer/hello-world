
public class ConsumerMain {

	public static void main(String[] args) {
        
		Consumer consumer1=new Consumer();
		Consumer consumer2=new Consumer(9878998,"parmod kumar");
		Consumer consumer3=new Consumer(76676,"amit kumar");
		
//		System.out.println("country is "+Consumer.country);
		System.out.println("no of objects created "+Consumer.count);
		System.out.println("no of objects created "+Consumer.count);
		
		Consumer.customerInfo(consumer1);
		Consumer.customerInfo(consumer2);
		Consumer.customerInfo(consumer3);
		
		System.out.println(Math.PI);
		System.out.println(Math.sin(Math.PI/2));
	}

}
