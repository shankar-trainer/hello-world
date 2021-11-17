
public class ProductService {

	public static void main(String[] args) {
		Product product = new Product();
		product.setProductId(86788787);
		product.setProductCost(400);
		product.setProductQuantity(20);

		Order order = new Order();

		order.setOrderId(1111);
		order.setOrderLocation("chennai");
		order.setOrderNumber(101);

		product.setOrder(order);

		System.out.println("Product Details ");
		System.out.println("id " + product.getProductId());
		System.out.println("quantity " + product.getProductQuantity());
		System.out.println("cost " + product.getProductCost());
		System.out.println("total cost " + product.getTotalCost());

		System.out.println("\nOrder  Details ");

		Order o = product.getOrder();

		System.out.println("id " + o.getOrderId());
		System.out.println("location " + o.getOrderLocation());
		System.out.println("number " + o.getOrderNumber());

	}

}
