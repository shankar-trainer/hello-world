import java.util.Date;

public class GC {

	
	
	public static void main(String[] args) {
		
	Date date[]=new Date[100000];
	
	System.out.println("Total memory "+Runtime.getRuntime().totalMemory());
	System.out.println(" Free Memory "+Runtime.getRuntime().freeMemory());
	
	for (int i = 0; i < date.length; i++) {
		date[i]=new Date();
	}

	System.out.println("Total memory ."+Runtime.getRuntime().totalMemory());
	System.out.println(" Free Memory ."+Runtime.getRuntime().freeMemory());

	for (int i = 0; i < date.length; i++) {
		date[i]=null;
	}

	System.gc();
	
	System.out.println("Total memory .."+Runtime.getRuntime().totalMemory());
	System.out.println(" Free Memory .."+Runtime.getRuntime().freeMemory());

		
	}
}
