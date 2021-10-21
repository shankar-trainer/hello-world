
public class GcDemo {

	
	public static void main(String[] args) {
	
		Integer x=new Integer(12);// reference data type
	      x.toString();
		
		int p=90;// primitive data type
		
		String s[]=new String[100000];
		
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new String("hello world");
		}
		
		System.out.println("after object creation ");
		
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		
		
		for (int i = 0; i < s.length; i++) {
			s[i]=null;
		}
		
		Runtime.getRuntime().gc();
		System.out.println("after gc called \n");
		
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
	}
}
