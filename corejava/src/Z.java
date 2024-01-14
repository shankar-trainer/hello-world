 class X {
	 
	 public X() {
		 super();
		 System.out.println("X class constructor ");
	 }
 }
 class Y extends X {
	 	 
	public Y() {
		super();
		System.out.println("Y class constructor ");
	}
} 

public class Z  extends Y{
    String s;
	public Z() {
	super();
	 System.out.println("Z class constructor ");
	}
	
	public Z( String s) {
		  this();
		  this.s=s;
		 System.out.println("Another Z class constructor ");
	}
	public static void main(String[] args) {
		new Z("hello");
	}
}
