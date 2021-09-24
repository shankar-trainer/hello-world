package pack2;
/* 
         public 
		 protected -- inside class, package, outside package using inheritance
		 default  -- inside class, package
		 private  -- inside class
 */

public class AA {
	int x=10;
protected  void info() {
	  System.out.println("info in AA class");
  }
}

class BB  extends AA{
int x=20;

	@Override
//public
	//protected
	//private  
	
	protected
	//public
	
void info() {
		int x=30;
		  System.out.println("info in BB class");
		  System.out.println("local variable x is "+x);
		  System.out.println("current class variable x is "+this.x);
		  System.out.println("super class variable x is "+super.x);
		  super.info();
	  }

	
	public static void main(String[] args) {
		new BB().info();
	}
}
