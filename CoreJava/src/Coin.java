
public enum Coin {

	TenPaisa(10), TwetyFivepaisa(25), FiftyPaisa(50), OneRupee(100), TwoRupee(200);

	int paisa;

	private Coin(int paisa) {
		this.paisa = paisa;
	}

	public static void main(String[] args) {
		Coin[] values = Coin.values();
		int sum = 0;
		for (Coin coin : values) {
			sum = sum + coin.paisa;
		}
		System.out.println("total coin amount is "+sum);
	}
}
