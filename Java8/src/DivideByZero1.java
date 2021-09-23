
public class DivideByZero1 {

	public static void main(String[] args) {
		System.out.println("program starts ");

		System.out.println(1. / 0);
		System.out.println(1.0 / 0.0);
		int ar[] = { 1, 2, 3, 4, 5 };

		try {
			// System.out.println(1/0); // exception object  ArithmeticException  is created and thrown
			System.out.println(ar[5]);// exception object  ArrayIndexOutOfBoundsException  is created and thrown
		}

//		catch (ArithmeticException e) {
//			System.err.println("divided by zero error ");
//		} 
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("array index is not present ");
//		}
	catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {  // combine multiple error messages in catch block 
		 System.out.println(e.getMessage());
	}	

		catch (Exception e) {
			System.err.println("some problem  error is   " + e.getMessage());
			System.err.println("some problem   --- " + e);
			e.printStackTrace();
		}

		System.out.println("\n program terminates ");
	}
}
