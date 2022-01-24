
public class WrapperDemo {

	public static void main(String[] args) {
		int x = 100;
		// Integer p1=new Integer(x);

		Integer p1 = Integer.valueOf(x);// boxing -- convert primitive to wrapper class
		System.out.println(p1);//100

		int intValue = p1.intValue();// unboxing --wrapper to primitive
		intValue++;

		p1 = Integer.valueOf(intValue);
		System.out.println(p1);

	}
}
