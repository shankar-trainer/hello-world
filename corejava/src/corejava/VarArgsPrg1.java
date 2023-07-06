package corejava;

public class VarArgsPrg1 {

	static void display(int a, int b, int... c) {
		System.out.println(a);
		System.out.println(b);
		for (int i : c) {
			System.out.print(i + ",");
		}
	}

	public static void main(String... args) {
		int ar1[] = { 11, 22, 33, 44 };
		display(1, 2, 3);
		display(1, 2, 3, 4, 5);
		display(1, 2, ar1);

	}
}
