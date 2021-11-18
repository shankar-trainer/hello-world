
public class WrapperDemo1 {

	public static void main(String[] args) {
		String s="123";
		//System.out.println(s/2);
		
		int x=Integer.parseInt(s);
		System.out.println(x);
		System.out.println(x/10);
		
		String s1="1234.45f";
	
		float f1=Float.parseFloat(s1);
	
		System.out.println(f1/101);
		
		String s3="123a";
		
		//int parseInt = Integer.parseInt(s3);
		// NumberFormatException
		
		Integer valueOf = Integer.valueOf(123); // primitive to wrapper
		Integer valueOf1 = Integer.valueOf("123"); // primitive to wrapper
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
	}
}
