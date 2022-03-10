
public class ElectronicProduct  extends Product {

	private  float rebate;
	private  int noOfProduct;
	private  String location;
	
	public float getRebate() {
		return rebate;
	}
	public void setRebate(float rebate) {
		this.rebate = rebate;
	}
	public int getNoOfProduct() {
		return noOfProduct;
	}
	public void setNoOfProduct(int noOfProduct) {
		this.noOfProduct = noOfProduct;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public void productInfo() {
		super.productInfo();
		
		System.out.println("\n\tno of products  are  "+getNoOfProduct());
		System.out.println("\ttotal cost  is "+(getPrdCost()*getNoOfProduct()));
		System.out.println("\tlocation is "+getLocation());
		System.out.println("\trebate is "+getRebate());
		System.out.println("\tafter rebate total cost  is "+((getPrdCost()*getNoOfProduct())-(getPrdCost()*getNoOfProduct()*getRebate())));
	}
	
	public static void main(String[] args) {
		ElectronicProduct product=new ElectronicProduct();
		product.setPrdId(9898);
		product.setPrdName("mobile");;
		product.setPrdCost(12000);
		
		product.setNoOfProduct(12);
		product.setLocation("new delhi");;
		product.setRebate(0.05f);
	
		product.productInfo();
	}
	
	
	
	
}
