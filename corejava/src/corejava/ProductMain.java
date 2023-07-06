package corejava;

public class ProductMain {
	public static void main(String[] args) {
		Product product1 = new Product();
		Product product2 = new Product(70001, "mobile", 12000);
		Product product3 = new Product(70002, "bike", 180000);
		Product product4 = new Product(70003, "school bag", 1500);
		Product product5 = new Product(70004, "kids book", 200);
		
		product1.productInfo();
		product2.productInfo();
		product3.productInfo();
		product4.productInfo();
		product5.productInfo();
	}
}
