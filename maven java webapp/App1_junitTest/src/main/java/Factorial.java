public class Factorial {
	static long getFactorial(int p) {

		 long fact=1;
		 for (int i = 1; i <=p; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
}
