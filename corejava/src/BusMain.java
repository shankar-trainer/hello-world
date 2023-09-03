
public class BusMain {

	
	
	public static void main(String[] args) {
		Bus bus1=new Bus(455454, "delhi transport", "laxminagar to noida", 40.56f);
		Bus bus2=new Bus(455455, "haryana transport", "kashmirigate to gurgaon",70.56f);
	
		
		System.out.println("bus1 information");
		bus1.busInfo();
		System.out.println("bus2 information");
		bus2.busInfo();
	 
		Bus bus3=bus2;
		
		System.out.println("bus3 information");
		bus3.busInfo();
		
		
		bus3.setBusId(1);
		bus3.setBusName("punjab transport");
		bus3.setBusRoute("delhi to amritsar");
		bus3.setBusFare(500);
		
		System.out.println("bus2 information");
		bus2.busInfo();
	 
		
		
	}
}
