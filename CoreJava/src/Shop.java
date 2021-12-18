
public class Shop {
	private String shopName;
	private String shopType;
	private static String country;

	private int shopRegNo;
	public int getShopRegNo() {
		return shopRegNo;
	}

	public String getShopName() {
		return shopName;
	}

	public String getShopType() {
		return shopType;
	}

	public static String getCountry() {
		return country;
	}

	
	static {
		country="india";
	}
	
	public Shop(int shopRegNo, String shopName, String shopType) {
		super();
		this.shopRegNo = shopRegNo;
		this.shopName = shopName;
		this.shopType = shopType;
	}
		
	public static void main(String[] args) {
		
		Shop shop1=new Shop(10001,"myshop","groccery");
		Shop shop2=new Shop(10002,"aman general store","general store");
		Shop shop3=new Shop(10003,"suman dairy","dairy");
		Shop shop4=new Shop(10004,"friends medical","pharmaceutical");
		
	}
	
}
