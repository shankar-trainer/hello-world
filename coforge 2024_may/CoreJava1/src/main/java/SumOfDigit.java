public class SumOfDigit {

	static int sum(int d) {
		int s = 0;

		while (d != 0) {
			s = s + d % 10;
			d = d / 10;
		}
		return s;
	}

	public static void main(String[] args) {

		System.out.println("sum of 1234 is "+sum(1234));
		System.out.println("sum of 125678 is "+sum(125678));
	}

}
