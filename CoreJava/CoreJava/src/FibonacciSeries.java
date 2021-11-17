
public class FibonacciSeries {

	public static void main(String[] args) {
	long l=System.currentTimeMillis();
	
		int n = 1;
		int n1 = 0, n2 = 1;
		int res = 0;
		// while (n <= 10)
		do {
			System.out.print(res + " ,");
			res = n1 + n2;
			n1 = n2;
			n2 = res;
			n++;
		} while (n <= 40);
		long l1=System.currentTimeMillis();
		System.out.println("\ntime taken in milli second");
		System.out.println(l1-l);
	}
}
