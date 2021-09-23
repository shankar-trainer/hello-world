
public class DivideByZero2 {

	public static void main(String[] args) {
		System.out.println("program starts ");

		System.out.println(1. / 0);
		System.out.println(1.0 / 0.0);
		int ar[] = { 1, 2, 3, 4, 5 };

		try {
			 System.out.println(1/0); // exception object  ArithmeticException  is created and thrown
			//System.out.println(1 / 2);
		}

		// appropriate handler -- it will be caught
		catch (ArithmeticException e) {
			System.err.println("divided by zero error ");
		} 
		try {
			System.out.println(ar[5]);// exception object  ArrayIndexOutOfBoundsException  is created and thrown
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("array index is not present ");
		}

		// if not caught by above handler catch then here it will be caught
		catch (Exception e) {
			System.err.println("some problem  error is   " + e.getMessage());
			System.err.println("some problem   --- " + e);
			e.printStackTrace();
		}

		System.out.println("\n program terminates ");
	}
}
