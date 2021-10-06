
public class ComsumerMain {

	public static void main(String[] args) {
		
		Consumer consumer1=new Consumer(1001, "a kumar");
		Consumer consumer2=new Consumer(1002, "b kumar");
		
//		Consumer consumer3=consumer1;
		Consumer consumer3=null;
				
		System.out.println("consumer1 information ");
		System.out.println(consumer1.getId()+" "+consumer1.getName());
		
		System.out.println("consumer2 information ");
		System.out.println(consumer2.getId()+" "+consumer2.getName());

		System.out.println("consumer3 information ");
		System.out.println(consumer3.getId()+" "+consumer3.getName());

		
	}
}
