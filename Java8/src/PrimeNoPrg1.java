
public class PrimeNoPrg1 {

	public static void main(String[] args) {
		// no divisible by 1 and itself
		// no not divisible by 2 to n-1

		int no1 = 2;
		boolean status = true;

		for (int i = 2; i <= no1 - 1; i++) {
			if (no1 % i == 0) {
				status = false;
				break;
			}
		}

//		if(status==false)
		if (!status)
			System.out.println("no is not prime no ");

		// if(status==true)
		if (status)
			System.out.println("no is  prime no ");

		
		
	}
}
