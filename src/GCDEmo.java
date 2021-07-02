import java.util.Date;

public class GCDEmo {

	public static void main(String[] args) {
		Date date[]=new Date[10000];
		
		Runtime runtime=Runtime.getRuntime();
		System.out.println(" free memory "+runtime.freeMemory());
		
		for (int i = 0; i < date.length; i++) {
			date[i]=new Date();
		}
		
		System.out.println("now  free memory "+runtime.freeMemory());
	
		
		for (int i = 0; i < date.length; i++) {
			date[i]=null;
		}
		
		runtime.gc();
		
		System.out.println("after memory release total   free memory "+runtime.freeMemory());
		
	}
}
