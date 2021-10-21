package cts.com;

public class Test1 {

	enum Currency {
		Dollar(40), INR(30), EURO(80), DINAR(90);

		final int i;

		Currency(int i) {
			this.i = i;
		}
		public int getCurrencyValue() {
			return i;
		}
	}

	Currency currency;
	
	public Test1(Currency currency) {
		super();
		this.currency = currency;
	}



	public static void main(String[] args) {

	
		Test1 test1=new Test1(Currency.DINAR);
		
		System.out.println(test1.currency.ordinal());
		
		Currency currency = Currency.INR;

		System.out.println(currency.getCurrencyValue());
//		System.out.println(currency);
//		System.out.println(  currency.ordinal());
//		
//		System.out.println(Currency.valueOf("DINAR"));
//		
		
		for (Currency c: Currency.values()) {
			System.out.println(c.getCurrencyValue()+"  "+c.ordinal());
		}
	
		
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
	}
}
