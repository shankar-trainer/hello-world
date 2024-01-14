class A{
	int p=10; // super class variable 
	void display() {
		System.out.println("display method");
	}
}
public class B  extends A{
 int p=100; // instance variable 
	
  void show() {
	  int p=1000;  // local variable 
	  System.out.println("show method");
	  System.out.println(" local p is  "+p);
	  System.out.println(" current class  p is  "+this.p);
	  System.out.println(" super class  p is  "+super.p);
   
	  super.display();
  }
  
  public static void main(String[] args) {
	B b=new B();
	b.show();
	//b.display();
}
  
}
