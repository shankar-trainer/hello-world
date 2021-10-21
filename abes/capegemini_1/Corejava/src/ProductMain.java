
public class ProductMain {

	public static void main(String[] args) {
        Product prd=new Product();
        
		System.out.println("Id is "+prd.id);
		System.out.println("name  is "+prd.name);
		System.out.println("Cost is "+prd.cost);
		
		System.out.println("country is "+Product.country);
		System.out.println("company_name is "+Product.company_name);
		
	}
}
