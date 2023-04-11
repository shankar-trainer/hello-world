import java.util.Date;

public class GrabageCollection {

	public static void main(String[] args) {
		Date date[] = new Date[100000]; // array
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("available processor " + runtime.availableProcessors());
		System.out.println("free memory " + runtime.freeMemory());
		System.out.println("total memory " + runtime.totalMemory());

		for (int i = 0; i < date.length; i++) {
			date[i] = new Date();
		}

		System.out.println("1.total memory " + runtime.totalMemory());
		System.out.println("1.free memory " + runtime.freeMemory());

		for (int i = 0; i < date.length; i++) {
			date[i] = null;
		}

//		Runtime.getRuntime().gc();
	//	System.gc();
		runtime.gc();
		
		System.out.println("after garbage collection execution \n");
		System.out.println("2.total memory " + runtime.totalMemory());
		System.out.println("2.free memory " + runtime.freeMemory());

	}
}
