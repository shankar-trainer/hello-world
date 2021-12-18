public enum Gender {
  Male,Female;
}

enum Color{
	red,green,blue;
}

enum Coin{
	tenpaisa(10),twentyfivepaisa(25),fiftypaisa(50),onerupee(100);
	int value;
	
	private Coin(int value) {
	  this.value=value;
	}
   
	int getCoinValue() {
		return value;
	}
}

class Rupees{
	
	int rs;
	Coin coin;
	
	public Rupees(int rs, Coin coin) {
		super();
		this.rs = rs;
		this.coin = coin;
	}

	public static void main(String[] args) {
     Rupees rupees=new Rupees(1200, Coin.fiftypaisa);
     System.out.println(rupees.rs);
     System.out.println(rupees.coin);
     System.out.println(rupees.coin.value);
     System.out.println(rupees.coin.getCoinValue());
	}
	
	
}