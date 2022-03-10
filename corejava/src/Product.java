
public class Product {

	private int prdId;
	private  String  prdName;
	private float  prdCost;
	
	public void productInfo() {
		System.out.println("product information");
		System.out.println("\tid is "+prdId);
		System.out.println("\tcost is "+prdCost);
		System.out.println("\tname is "+prdName);
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}
	
}
