package corejava;

public class ProductMain3 {
	public static void main(String[] args) {

		Product product1 = new Product(7001, "pizza", 300);
		Product product2 = new Product(7002, "burger", 200);
		
		Product product3=product1;
		
		product1.productInfo();
		product3.productInfo();
		
		product3.productId=9009;
		product3.productName="dosa";
		product3.productCost=190;
		
		
		product1.productInfo();
		product3.productInfo();
		
		
		
	}
}
