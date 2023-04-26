
public class TradeFair extends Fair {
	private int pincode;
	private String state;

	public TradeFair(int fairId, String name, String location, int pincode, String state) {
		super(fairId, name, location);
		this.pincode = pincode;
		this.state = state;
	}

	@Override
	public String toString() {
		return  super.toString() +"\nTradeFair [pincode=" + pincode + ", state=" + state + "]";
	}

	public static void main(String[] args) {
	  TradeFair fair=new TradeFair
(65656, "book fair ", "chandigarh", 7667676, "punjab");	
	System.out.println(fair);
	}
	
}
