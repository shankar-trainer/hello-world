
public class WrapperExample4 {

	public static void main(String[] args) {

		String s1 = Integer.toString(100);
		System.out.println(s1 + 999);

		// Float.toString();
		// Double.toString();

		System.out.println(Integer.toBinaryString(123));
		System.out.println(Integer.toOctalString(123));
		System.out.println(Integer.toHexString(123));

		Integer k = Integer.valueOf(123);
		Integer l = Integer.valueOf("123");
		int i = Integer.parseInt("123");
		// parseInt -- only accepts string and return primitive
		// valueOf accepts primitive and string and return Wrapper class
		
		Integer j=new Integer(77);
		
		
	}
}
