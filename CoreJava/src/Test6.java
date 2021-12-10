
public class Test6 {

	public static void main(String[] args) {
		System.out.println("Integer max " + Integer.MAX_VALUE);// 2147483647
		System.out.println("Integer min " + Integer.MIN_VALUE);// -2147483648

		int x = 2147483647;
		x = 2147483646;
		// x=2147483648;

		System.out.println("Long max " + Long.MAX_VALUE);// 9223372036854775807

		System.out.println("Long min " + Long.MIN_VALUE);// -9223372036854775808

		long l1 = 123;
		l1 = 2147483646;
//l1=2147483648;//error  //by default any integer literal is int data type
		l1 = 2147483648L;
		l1 = 2147483648l;

	}
}
