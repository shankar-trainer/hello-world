
public class WrapperExample5 {

	public static void main(String[] args) {
		Integer valueOf = Integer.valueOf("67867788");// string to decimal

		Integer x1 = Integer.valueOf("44", 10);// 10 radix for decimal
		System.out.println(x1);

		Integer x2 = Integer.valueOf("44abcd", 16);// arg1 hexadecimal,16 is radix-- covert hexadecimal to decimal
		System.out.println(x2);

		Integer x3 = Integer.valueOf("445667", 8);// arg1 octal, radix is 8 -- covert octal to decimal
		System.out.println(x3);

		Integer x4 = Integer.valueOf("10110", 2);// arg1 binary, radix is 2 -- covert binary to decimal
		System.out.println(x4);

		System.out.println(Integer.toString(4500429, 16));// decimal to hexadecimal String
		System.out.println(Integer.toHexString(12345));// decimal to hexadecimal String

		System.out.println(Integer.toString(4500429, 2));// decimal to binary String
		System.out.println(Integer.toBinaryString(12345));// decimal to binary String

		System.out.println(Integer.toString(4500429, 8));// decimal to octal String
		System.out.println(Integer.toOctalString(12345));// decimal to Octal String

		System.out.println(Integer.toString(4500429));// decimal to String

		int yy = Integer.parseInt(Integer.toOctalString(Integer.valueOf("44abcd", 16)));
		System.out.println(yy);

	}
}
