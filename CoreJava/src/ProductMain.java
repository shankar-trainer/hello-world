
public class ProductMain {

	public static void main(String[] args) {
		Product product1=new Product(1001, "paracetamol tablet", 100.44f);
		Product product2=new Product(1001, "paracetamol tablet", 100.44f);
	
		System.out.println(product1);
		System.out.println(product2);

		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		
		
		
		if(product1.equals(product2)) {
			System.out.println("both are equal");
		}
		else
			System.out.println("not equal ");
	}
}
