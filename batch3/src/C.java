class B{
	int x=1000;
  void disp() {
	  System.out.println("super class disp method");
  }	
}

public class C extends B {
 int x=100;
 @Override
 void disp() {
	 System.out.println("current class disp method");
	 super.disp();
	 int x=10;
	 System.out.println(x);
	 System.out.println(this.x);
	 System.out.println(super.x);
 }
 public static void main(String[] args) {
	new C().disp();
}
 
}
