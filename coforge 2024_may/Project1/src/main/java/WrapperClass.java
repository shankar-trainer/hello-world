
public class WrapperClass {

	public static void main(String[] args) {

		Integer x = new Integer(100);

		x++;

		String age = "23";

		int age1 = Integer.parseInt(age);
		// Float.parseFloat("")

		System.out.println(age1);
		age1 = age1 + 20;

		String valueOf = String.valueOf(1234);
		Integer p = Integer.valueOf("1234");

		Integer p1 = 67;
		String s2 = p1.toString();

		System.out.println(p1 + "  " + Integer.toBinaryString(p1));
		System.out.println(p1 + "  " + Integer.toHexString(p1));
		System.out.println(p1 + "  " + Integer.toOctalString(p1));

		// decimal 0 9
		// hexadecimal 0 -9 , a-f
		// octal 0 -7
		// binary 0,1

	}
}
