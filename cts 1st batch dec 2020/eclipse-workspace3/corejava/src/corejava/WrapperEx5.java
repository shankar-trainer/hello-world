package corejava;

public class WrapperEx5 {

	public static void main(String[] args) {

		String s11 = Integer.toString(56656);

		String s1 = Integer.toHexString(123);// 16 radix
		String s2 = Integer.toOctalString(123);// 8 radix
		String s3 = Integer.toBinaryString(123);// 2 radix


		System.out.println(s11);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(Integer.toString(123, 16));
		System.out.println(Integer.toString(123, 8));
		System.out.println(Integer.toString(123, 2));
		
		
		System.out.println(Integer.SIZE);
		
		
	}
}
