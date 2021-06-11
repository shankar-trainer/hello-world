import java.util.Date;

public class GarbageCollectionPrg {

	public static void main(String[] args) {
		
		Date date[]=new Date[10000];
		
		Runtime runtime=Runtime.getRuntime();
		
		System.out.println("Free Memory "+runtime.freeMemory());
		System.out.println("Total Memory "+runtime.totalMemory());
	
		for (int i = 0; i < date.length; i++) {
			date[i]=new Date();
		}
		System.out.println(" Now Free Memory "+runtime.freeMemory());
		
		for (int i = 0; i < date.length; i++) {
			date[i]=null;
		}
		System.gc();
		
		System.out.println(" Now Free Memory "+runtime.freeMemory());
		
		
	}
}
