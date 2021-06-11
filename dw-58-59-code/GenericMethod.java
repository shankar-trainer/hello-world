
public class GenericMethod {

	public static <A> void disp(A[] a) {
		for (A a2 : a) {
			System.out.print(a2 + " , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer ar1[] = { 11, 22, 333, 44, 55 };
		Float ar2[] = { 222.22f, 3333.33f, 444.44f, 5555.55f };
		String city[] = { "delhi", "noida", "chennai", "madurai", "karnool" };
		disp(ar1);
		disp(ar2);
		disp(city);
	}
}
