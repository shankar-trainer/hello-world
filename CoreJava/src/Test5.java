
public class Test5 {

	public static void main(String[] args) {

		System.out.println("Byte max " + Byte.MAX_VALUE);// 127
		System.out.println("Byte min " + Byte.MIN_VALUE);// -128

		// -128 to 127;
		byte b1 = 126;
		b1 = 127;
		b1 = 0;
		b1 = -128;
		b1 = -127;
		// b1=-129; error
		// b1=128; //error

		System.out.println("Short max " + Short.MAX_VALUE);// 32767
		System.out.println("Short  min " + Short.MIN_VALUE);// -32768

		short s1 = 32767;
		// s1=32768;// error
		
		
	}

}
