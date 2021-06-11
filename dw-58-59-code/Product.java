
public class Product {
	int prdId;
	String prdName;

	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product product = (Product) obj;
			if (product.prdId == this.prdId && product.prdName == this.prdName)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Product Information\n" + "\tId is " + prdId + "\n\tName is " + prdName;
	}

	public static void main(String[] args) {

		Product product1 = new Product(123, "trouser");
		Product product2 = new Product(123, "trouser");

		if (product1.equals(product2))
			System.out.println("product1 eq product2");
		else
			System.out.println("product1 not eq product2");

		System.out.println(product1);
		System.out.println(product1.hashCode());

		// getClass().getName() + '@' + Integer.toHexString(hashCode()) --- object

	}
}
