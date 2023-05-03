
public class WrapperDEmo1 {

	public static void main(String[] args) {
		int x = 90; // x is primitive data type

		Integer y = new Integer(100);
		// boxing -- primitive to wrapper class
		// y wrapper class object

		int p = y.intValue();
		// unboxing -- wrapper to primitive

		p = p + 20;
		y = new Integer(p);

		System.out.println(p);

	}
}
