package corejava;

public class ProductMain1 {

	public static void main(String[] args) {
		Product product[]=new Product[5]; // array 
		
		product[0]=new Product(); // object of each element 
		product[1]=new Product(7001, "pizza", 300);
		product[2]=new Product(7002, "burger", 200);
		product[3]=new Product(7003, "scooty", 90000);
		product[4]=new Product(7004, "shirt", 1200);
		
//		for (int i = 0; i < product.length; i++) {
//			product[i].productInfo();
//		}
   
		for (Product product2 : product) {
			product2.productInfo();
		}
	}
}
