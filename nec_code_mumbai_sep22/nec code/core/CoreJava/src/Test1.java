
public class Test1 {
	int x;

	public Test1() {
		x = 10;

		System.out.println("constructor");
	}

	{
		x = 1;

		System.out.println("init block1");
	}
	{
		x = 2;

		System.out.println("init block2");
	}
	{
		x = 3;

		System.out.println("init block3");
	}

	static {
		System.out.println("static block ");
	}

	public static void main(String[] args) {
		// new Test1();
		// new Test1();
		// new Test1();
		System.out.println(new Test1().x);
	}

}
