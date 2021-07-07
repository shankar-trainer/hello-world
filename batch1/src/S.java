class R{
	int x=1000;
	
}

public class S  extends R{
  int x=100;
  void disp() {
	  int x=10;
	  System.out.println("local x inside method "+x);
	  System.out.println("x of the class "+this.x);
	  System.out.println("x of the super class "+super.x);
  }
  public static void main(String[] args) {
	new S().disp();
  }
}
