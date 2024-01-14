
public class Test2 {

	static int x = 10;
	int y = 10;

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {
			System.out.println("static " + x++);
			Test2 test2 = new Test2();
			System.out.println("instance " + test2.y++);
		}
	}

}
