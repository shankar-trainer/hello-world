public class Factorial {

	//5 -- 5*4*3*2*1 
	static long getFactorial(int p) {

		long fact = 1;

		do {
			fact = fact * p;
			p--;
		} while (p >= 1);
		return fact;
	}
	
	//5 --1*2*3*4*5 
	static long getFactorial1(int p) {
		
		long fact = 1;
		int c=1;
		do {
			fact = fact * c;
			c++;
		} while (c<=p);
		return fact;
	}
	
	
	public static void main(String[] args) {
		int s1=5;
		System.out.printf("factorial of %d is %d  ",s1,getFactorial(s1));
		s1=7;
		System.out.printf("\nfactorial of %d is %d  ",s1,getFactorial1(s1));
	}

}
