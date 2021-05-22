package pack1;

enum Season {

	Monday(1), Tuesday(2), Thursday(3), Friday(4), Saturday(5), Sunday(6);

	final int i;

	Season(int i) {
		this.i = i;
	}
}


enum Countries{

	India("india"),China("china");

	final String s;
	Countries(String s) {
		this.s=s;
	}
}


enum Currency {
	Dollar(40), INR(30), EURO(80), DINAR(90);

	final int i;

	Currency(int i) {
		this.i = i;
	}
}

public class Person {

	enum Coin {
		Penny(3), NIckel(7), Dime(8), Quarter(10);

		private final int val;

		Coin(int val) {
			this.val = val;
		}
	}

	enum Month {
		January, February, March, April, May, June, July, August, September, October, November, December
	}

	public static void main(String[] args) {
		Month month1 = Month.valueOf("January");

		System.out.println(month1);

		Currency currency = Currency.INR;

		switch (currency) {
		case INR:
			System.out.println("indian currency value as " + currency.ordinal());
			break;

		case Dollar:
			System.out.println("USA  currency value as " + currency.ordinal());

			break;
		case DINAR:
			System.out.println("UAE  currency value as " + currency.ordinal());
			break;
		case EURO:
			System.out.println("European   currency value as " + currency.ordinal());
			break;

		default:
			break;
		}

		System.out.println("all months ");
		for (Month m : Month.values())
			System.out.println(m + " " + m.ordinal());

	}

}
