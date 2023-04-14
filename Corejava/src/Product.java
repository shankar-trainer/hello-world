
public class Product {
	int prdId;
	String prdName;
	float prdCost;

	public Product(int prdId, String prdName, float prdCost) {
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	public static void main(String[] args) {
		
		Product product[]=new Product[4];
		
		product[0]=new Product(323232, "mobile", 12000);
		product[1]=new Product(323231, "biscuit", 100);
		product[2]=new Product(323233, "laptop", 90000);
		product[3]=new Product(323234, "book", 900);
  System.out.println("using simple for loop ");

	      for (int i = 0; i < product.length; i++) {
System.out.println(product[i].prdId+"\t"+product[i].prdName+"\t"+product[i].prdCost);
		}	

     System.out.println("\n************using  for  each loop******************* ");

         for (Product product2 : product) {
	       System.out.println(product2.prdId+"\t"+product2.prdName+"\t"+product2.prdCost);
		}	      
	}
	
}
