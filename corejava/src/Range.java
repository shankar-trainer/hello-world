public class Range {

	public static void main(String[] args) {

		byte b1 = 12;
		byte b2 = 127;

		// byte b3=128;
		byte x = -128;

		// x=-130;

		System.out.println(Byte.MAX_VALUE);// 127
		System.out.println(Byte.MIN_VALUE);// -128

		System.out.println(Short.MAX_VALUE);// 32767
		System.out.println(Short.MIN_VALUE);// -32768

		System.out.println(Integer.MAX_VALUE);// 2147483647
		System.out.println(Integer.MIN_VALUE);// -2147483648

		short s1 = 32767;
		// s1=32768;

		int p1 = 2147483647;
		// p1=2147483648;

		System.out.println(Long.MAX_VALUE);// 9223372036854775807
		System.out.println(Long.MIN_VALUE);// -9223372036854775808

//		int mb=6767675678;
		long mb = 6767675678L;

	}
}
