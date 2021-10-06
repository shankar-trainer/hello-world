package corejava;

public class Product {
	private int prd_id;
	private String prd_name;

	public Product(int prd_id, String prd_name) {
		super();
		this.prd_id = prd_id;
		this.prd_name = prd_name;
	}
	@Override
	public String toString() {
		//return super.toString();
	   return "Product Id is "  +prd_id+
			   "\nProduct Name is "+prd_name;
	   
	}
}


