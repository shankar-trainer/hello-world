
public class PrimeNoPrg2 {

	public static void main(String[] args) {

		int no1 = 2;
		boolean status = true;

		int i =2 ;
		
		do {
			if(no1==2) {
				status=true;
				break;
			}
			if (no1 % i == 0) {
				status = false;
				break;
			}
			i++;
		} while (i <= no1-1 );
		
		if (!status)
			System.out.println("no is not prime no ");

		if (status)
			System.out.println("no is  prime no ");

	}
}
