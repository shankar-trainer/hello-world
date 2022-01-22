
public class Consumer {
   private int id;    //instance variable 
   private String name; //instance variable 
   private String location;//instance variable  

   private static String country="india";
   
	static {
	 System.out.println("static block");	
	  country="nepal";
	}
	
	public Consumer() {
	     id=1001;
	     name="dharam kumar";
	     location="delhi";
		System.out.println("constructor called");
	}
	
	public static void main(String[] args) {
		Consumer consumer1=new Consumer();
		Consumer consumer2=new Consumer();
	
		System.out.println(consumer1.id);
		System.out.println(consumer1.name);
		System.out.println(consumer1.location);
	
		System.out.println(Consumer.country);
		System.out.println(consumer1.country);
		System.out.println(country);
	}
	
}
