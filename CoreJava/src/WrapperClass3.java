
public class WrapperClass3 {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x + y;

		System.out.printf("sum of %d and %d is %d", x, y, z);

		int p = 200;

		String s1 = Integer.toString(p);
		System.out.println();
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));

		System.out.println(Integer.toString(1000));
		System.out.println(Integer.toHexString(1000));
		System.out.println(Integer.toBinaryString(10000));
		System.out.println(Integer.toOctalString(10000));

		
		System.out.println();
		
		System.out.println(Integer.toString(1000,10));
		System.out.println(Integer.toString(1000,16));
		System.out.println(Integer.toString(1000,2));
		System.out.println(Integer.toString(1000,16));
		
	}
}
