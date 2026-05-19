
public class Example1 {

	public static void main(String[] args) {
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);// 127
		System.out.println(Byte.MIN_VALUE);// -128

		byte b1 = 126;
		b1 = 127;
		// b1=128;

		byte b2 = -127;
		b2 = -128;
		// b2=-129;

		System.out.println(Short.MAX_VALUE);// 32767
		System.out.println(Short.MIN_VALUE);// -32768

		short s1 = 32767;
		// s1=32768;

		System.out.println(Integer.MAX_VALUE);// 2147483647

		System.out.println(Integer.MIN_VALUE);// -2147483648

		int i = 2147483647;

		// i=2147483648;

		long l1 = 2147483648l;
		long mb = 9835098350l;

	}
}
