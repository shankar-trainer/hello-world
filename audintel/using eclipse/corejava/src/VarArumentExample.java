
public class VarArumentExample {

	static void printAll(int a, int b, int... c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(".....");

		for (int i : c) {
			System.out.print(i + ",");
		}

	}

	public static void main(String ...args) {
		printAll(1, 2, 3, 4, 5, 6, 7, 8);
		int ar1[]= {11,22,33,44,55,66};
		
		System.out.println("\n-----------------------");
		printAll(1, 2, ar1);
		
	}

}
