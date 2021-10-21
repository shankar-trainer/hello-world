import java.util.Date;

public class GarbageCollectionDemo {

	public static void main(String[] args) {

		Date date[] = new Date[10000];
		Runtime runtime = Runtime.getRuntime();

		System.out.println("Free Memory " + runtime.freeMemory());

		for (int i = 0; i < date.length; i++) 
			date[i] = new Date();
		
		System.out.println("\nFree Memory " + runtime.freeMemory());

		for (int i = 0; i < date.length; i++) 
			date[i] = null;
		System.gc();
		System.out.println("\nFree Memory " + runtime.freeMemory());

	}
}
