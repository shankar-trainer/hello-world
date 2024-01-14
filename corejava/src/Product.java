
public class Product {

	int productId;   //  instance variable , default 0 and null
	String productName;
	float cost;

	
	public static void main(String[] args) {

		Product p1=new Product();
		
		Product p2=new Product();
		
		p1.productId=10001;
		p1.productName="java book";
		p1.cost=1200;
				
		System.out.println("product1 information ");
		System.out.println("\t id "+p1.productId);
		System.out.println("\t name "+p1.productName);
		System.out.println("\t cost "+p1.cost);
				
		System.out.println("product2 information ");
		System.out.println("\t id "+p2.productId);
		System.out.println("\t name "+p2.productName);
		System.out.println("\t cost "+p2.cost);
		
		
	}
	
	
}
