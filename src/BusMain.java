
public class BusMain {

	public static void main(String[] args) {
		Bus bus1=new Bus(44334, "delhi noida", 70);
		Bus bus2=new Bus(44334, "delhi noida", 70);
		
		System.out.println(bus1);
		System.out.println(bus1.hashCode());
		System.out.println(bus2.hashCode());
		
		if(bus1.equals(bus2))
			System.out.println("equal");
		else
			System.out.println("not equal");
			
	}
}
