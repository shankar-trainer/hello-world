package corejava;

public class Product {

	int pid;
	String prd_name;
	float cost;
	
	{
		pid=888;
		prd_name="mobile";
		System.out.println("init block1");
	}
	
	{
		cost=8787.67f;
		System.out.println("init block2");
	}
	
	
	
	public static void main(String[] args) {
	
		Product product=new Product();
	    System.out.println("Product Information");
	    System.out.println("Id "+product.pid);
	    System.out.println("prd name "+product.prd_name);
	    System.out.println("cost "+product.cost);
	    
	}
	
}
