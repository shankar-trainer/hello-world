import java.util.Date;

public class GcProgram {

	public static void main(String[] args) {
		
		
		Date date[]=new Date[10000];
		
		Runtime runtime=Runtime.getRuntime();
		
		System.out.println("Free Memory "+runtime.freeMemory());
		
		for (int i = 0; i < date.length; i++) {
			date[i]=new Date();
		}
		System.out.println("after memory allocation \n");
		System.out.println("Free Memory "+runtime.freeMemory());
		
		for (int i = 0; i < date.length; i++) {
			date[i]=null;
		}
		
		runtime.gc();
		
		
		System.out.println("after gc called \nmemory allocation \n");
		System.out.println("Free Memory "+runtime.freeMemory());
		
	}
}
