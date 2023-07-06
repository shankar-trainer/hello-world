
public class ProductMain {

	public static void main(String[] args) {
		
		
		Order order=new Order(1, "noida", 7677667);
		
		Product product=new Product(10001, "formal pant", 1500, order);
		
		System.out.println("Product detail ");
		System.out.println("\tId :"+product.getPrdId());
		System.out.println("\tName :"+product.getPrdName());
		System.out.println("\tCost :"+product.getPrdCost());
		
		Order order2 = product.getOrder();
		
		System.out.println("\nOrder Detail ");
		System.out.println("\torder id "+product.getOrder().getOrderId());
		System.out.println("\torder id "+order2.getOrderId());
		System.out.println("\torder location "+order2.getOrderLocation());
		System.out.println("\torder pin "+order2.getOrderPinCode());
		
		
	}
}
