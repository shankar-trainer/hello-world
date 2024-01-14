// super , parent, base class
public class Greeting {
     String name="aman";
     float cost=12000;
     //private 
     String city="noida";
     void info() {
    	 System.out.println("information");
    	 System.out.println("\tname "+name);
    	 System.out.println("\tcost "+cost);
     }
}
// sub class, child class, derived class
class Welcome1 extends  Greeting{
	String country="india";
	public static void main(String[] args) {
		
		Welcome1 welcome=new Welcome1();
		welcome.info();
		System.out.println("\tcountry "+welcome.country);
		System.out.println("\tcountry "+welcome.city);
	}
	
}


