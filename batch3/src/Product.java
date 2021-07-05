
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

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public float getProductCost() {
		return productCost;
	}

}
