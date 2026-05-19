import java.util.Date;

public class GarbageProgram {

	public static void main(String[] args) {
		//Runtime r=new Runtime();
		
		Runtime runtime = Runtime.getRuntime();
		Date date[] = new Date[10000];
		System.out.println("free memory " + runtime.freeMemory());
		System.out.println("total  memory " + runtime.totalMemory());

		for (int i = 0; i < date.length; i++) {
			date[i] = new Date();
		}

		System.out.println("free memory " + runtime.freeMemory());
		System.out.println("total  memory " + runtime.totalMemory());

		for (int i = 0; i < date.length; i++) {
			date[i] = null;
		}

		runtime.gc();
		System.out.println();
		System.out.println("free memory " + runtime.freeMemory());
		System.out.println("total  memory " + runtime.totalMemory());

	}
}
