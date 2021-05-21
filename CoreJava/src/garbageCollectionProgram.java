
public class garbageCollectionProgram {

	public static void main(String[] args) {
		
		String s[]=new String[1000000];
		
		Runtime rt=Runtime.getRuntime();
		
		System.out.println("before array initialisation");
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new String("hello world");
		}
		
		System.out.println("after array initialisation");
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		

		for (int i = 0; i < s.length; i++) {
			s[i]=null;
		}
		
		rt.gc();
		
		System.out.println("\nafter garbage collection called ");
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		

		
		
	}
}
