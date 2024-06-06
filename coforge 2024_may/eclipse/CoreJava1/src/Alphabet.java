
public class Alphabet {

	static void capitalAlphabet() {
		int x = 65;
		System.out.println("capital  alphabet");

		while (x <= 90) {
			System.out.print(x + " --- " + ((char) x) + ",   ");
			x++;
			if(x%5==0)
				System.out.println();
		}
	}

	static void smallAlphabet() {
		int x = 97;
		System.out.println("\nsmall alphabet");
		while (x <= 122) {
			System.out.print(x + " --- " + ((char) x) + ",   ");
			x++;
			if(x%5==0)
				System.out.println();
		}
	}
	
	static void number0_9() {
		int x = 48;
		System.out.println("\nnumber 0 -9");
		while (x <= 57) {
			System.out.print(x + " --- " + ((char) x) + ",   ");
			x++;
			if(x%5==0)
				System.out.println();
		}
	}
	
	

	public static void main(String[] args) {

		capitalAlphabet();
		smallAlphabet();
		number0_9();
	}
}
