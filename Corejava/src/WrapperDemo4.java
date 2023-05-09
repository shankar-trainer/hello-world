
public class WrapperDemo4 {

	public static void main(String[] args) {

		Integer p = 778787;
		String string = p.toString();

		String string2 = Integer.toString(67766);// base 10

		String binary = Integer.toBinaryString(p);
		String oct = Integer.toOctalString(p);
		String hex = Integer.toHexString(p);

		System.out.println(p + "   " + binary);
		System.out.println(p + "   " + hex);
		System.out.println(p + "   " + oct);

		String decimal = Integer.toString(p, 10);// base 10
		String hex1 = Integer.toString(p, 16);// base 16
		String binary1 = Integer.toString(p, 2);// base 2
		String oct1 = Integer.toString(p, 8);// base 8
		System.out.println("============");
		System.out.println(binary + "  " + binary1);
		System.out.println(hex + "  " + hex1);
		System.out.println(oct + "  " + oct1);

	}
}
