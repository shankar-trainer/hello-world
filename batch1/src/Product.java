
public class Product {

	private int productId;
	private String productName;
	private float productCost;
	
	public Product(int productId, String productName, float productCost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
	
	@Override
	public String toString() {
		
		return "Product Information \n"+
		"Product Id "+productId+"\n"+
		"Product Name "+productName+"\n"+
		"Product Cost "+productCost;
	}
		
}
