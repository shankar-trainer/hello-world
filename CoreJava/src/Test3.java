
public class Test3 {

	public static void main(String[] args) {
		System.out.println(1.0 / 0);// Infinity
		System.out.println(-1.0 / 0);// -Infinity
		System.out.println(0.0 / 0);// NaN
		System.out.println(0.0 / 0.0);// NaN

		//System.out.println(0 / 0);// / by zero error
	//	System.out.println(1 / 0);// / by zero error
	}
}
