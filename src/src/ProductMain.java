
public class ProductMain {

	public static void main(String[] args) {
	Order order=	new Order(50001,"chennai", 0);
	
	Product product=new Product(5, "car", 700000, 6,order );
	
	order.setOrderTotalCost(product.getPrdCount()*product.getPrdCost());
	
	
	product.productDetail();
		
	}
}
