
public class WrapperDemo2 {

	public static void main(String[] args) {

		String s = "1234";

		int x = Integer.parseInt(s);
		float f1 = Float.parseFloat("676776.666f");
		double d1 = Double.parseDouble("67767676.676776");

		Integer p1 = 767;
		String s2 = p1.toString();

		String bin = Integer.toBinaryString(123);
		String hex = Integer.toHexString(123);
		String oct = Integer.toOctalString(123);
		String ss = Integer.toString(123);

		String q1 = Integer.toString(123, 10);
		String q2 = Integer.toString(123, 2);
		String q3 = Integer.toString(123, 8);
		String q4 = Integer.toString(123, 16);

		System.out.println(ss+"  "+q1);
		System.out.println(bin+"  "+q2);
		System.out.println(oct+"  "+q3);
		System.out.println(hex+"  "+q4);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		
	}
}
