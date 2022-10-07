
public class Test2 {

	static String country;
	int x = 9000;

	static String disp() {
		return "welcome to india";
	}

	String show() {
		return "welcome to java";
	}

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.asin(Math.PI / 2));

		System.out.println(Test2.country);
		Test2 t2 = new Test2();
		System.out.println(t2.x);

		System.out.println(Test2.disp());

		System.out.println(t2.show());
	}
}
