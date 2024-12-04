public class Product {
	int prdId;
	String prdName;
	float prdCost;

	public  Product() {
		prdId = 10001;
		prdName = "shirt";
		prdCost = 700;
		System.out.println("default constructor called");
	}

	public Product(int prdId, String prdName, float prdCost) {
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
		System.out.println("overloaded constructor 1");
	}
	public Product(int prdId, float prdCost) {
		//this();// default constructor
		this(prdId,"television",prdCost);
		this.prdId = prdId;
		this.prdCost = prdCost;
		System.out.println("overloaded constructor 2");
	}


	void productInfo() {
		System.out.println("\nproduct data ");
		System.out.println("\tid  :" + prdId);
		System.out.println("\tname  :" + prdName);
		System.out.println("\tcost  :" + prdCost);
	}

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		// 3 references, 3 objects
		p1.productInfo();
		p2.productInfo();
		p3.productInfo();

	}
}
