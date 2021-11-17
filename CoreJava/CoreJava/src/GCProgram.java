import java.util.Date;

public class GCProgram {

	public static void main(String[] args) {

		Date ar[] = new Date[100000];
		Runtime runtime = Runtime.getRuntime();

		System.out.println("  free memory   " + runtime.freeMemory());

		for (int i = 0; i < 100000; i++) 
			ar[i] = new Date();
		

		System.out.println("  free memory   " + runtime.freeMemory());

		for (int i = 0; i < 100000; i++) 
			ar[i] = null;
		
		System.gc();
		System.out.println("  free memory   " + runtime.freeMemory());
	}
}
