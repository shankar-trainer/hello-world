
public class PrimeNoPrg1 {

	static boolean checkPrime(int n) {
		// prime no -- not divisible by 2 and no-1
		// prime no -- divisible by 1 and itself
		boolean status = true;
		for (int i = 2; i <= n - 1; i++) {
			if (n % 2 == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}
