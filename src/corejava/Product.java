package corejava;

public class Product {
	int productId;
	String productName;
	float productCost;

	public Product() {
		super();
		System.out.println("default constructor ");
		productId = 80001;
		productName = "java beginner book";
		productCost = 899;
	}

	public Product(int productId, String productName, float productCost) {
		super();
		System.out.println("overloaded constructor ");
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	public void productInfo() {
		System.out.println("\nproduct information ");
		System.out.println("\tId :" + productId);
		System.out.println("\tName :" + productName);
		System.out.println("\tCost :" + productCost);
	}
}
