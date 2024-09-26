
public class OuterClass {
	int x = 100;

	void disp() {
		int p = 900;
		System.out.println("disp method ");

		class HelloLocal {
			void show() {
				System.out.println("x is " + x);
				System.out.println("p is " + p);
			}
		}
		HelloLocal helloLocal = new HelloLocal();
		helloLocal.show();
	}

	public static void main(String[] args) {
		OuterClass class1 = new OuterClass();
		class1.disp();
	}
}
