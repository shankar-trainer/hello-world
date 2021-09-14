public class Product {
  private int prdId;  // attributes  
  private String  prdName;
  private float prdCost;
  
  public void purchaseProduct(String p) {
	  System.out.println("\nproduct purchased "+p);
  }
  public void saleProduct() {
	  System.out.println("product sold");
  }
  
   public  void productInfo() {
	   System.out.println("\nProduct Information ");
		 System.out.println("product id  "+prdId);
		 System.out.println("product name "+prdName);
		 System.out.println("product cost "+prdCost);
    }
  
  
  public static void main(String[] args) {
	 Product product1=new Product();
	 Product product2=new Product();
	 
	 product1.prdId=989898;
	 product1.prdName="java beginner book";
	 product1.prdCost=789.00f;
	 
	 product1.purchaseProduct("product1");
	 product1.productInfo();
	 
	 
	 product2.purchaseProduct("product2");
	 product2.prdId=889891;
	 product2.prdName="java expert book";
	 product2.prdCost=1889.00f;
	 
	 product2.productInfo();
	 
	 
  }
  
}
