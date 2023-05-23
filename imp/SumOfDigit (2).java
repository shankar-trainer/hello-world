
public class SumOfDigit {

	public static void main(String[] args) {
		int x = 1234;

		int p =0;
		int sum = 0;

		while (x != 0) {
            p=x%10;
            sum = sum + p;
            x = x / 10;    
		}
		System.out.println(sum );
	}
}
