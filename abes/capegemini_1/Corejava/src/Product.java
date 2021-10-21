public class Product {
	  int id = 1001;
	  String name = "biscuit";
	  float cost = 67; 
	// all 3 are instance variable or non static variable

	  static String country = "India";
	  static String company_name = "abc"; 
	// all 2 are class variable or static variable

	public static void main(String[] args) {
         Product prd=new Product();
         
		System.out.println("Id is "+prd.id);
		System.out.println("name  is "+prd.name);
		System.out.println("Cost is "+prd.cost);
		
		System.out.println("country is "+country);
		System.out.println("company_name is "+company_name);
		
	}

}
