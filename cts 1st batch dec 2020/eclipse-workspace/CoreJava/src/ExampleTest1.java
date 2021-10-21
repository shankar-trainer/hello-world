
public class ExampleTest1 {

	int x = 10;
	int y = 10;
	String var1 = "hello";
	String var2 = "hello";

	void go() {
		x = x + 100;
		go1(y);
		var1 = var1 + " world";
		disp(var2);
	}

	void disp(String s) {
		s = s + " java";
	}

	void go1(int p) {
		p = p + 100;
		// y=y+100;
	}

	public static void main(String[] args) {
		ExampleTest1 test1 = new ExampleTest1();
		test1.go();

		System.out.println(test1.x);
		System.out.println(test1.y);

		System.out.println(test1.var1);
		System.out.println(test1.var2);

	}
}
