class Y{
	 int p=10;
     static String country ="india";
	 void show() {
		 System.out.println("super class Y");
	 }
	 
	static void mydetail() {
		System.out.println("my country is "+country);
	}
	 
}

public class Z  extends Y{
   int p=100;
	void display() {
		int p=1000;
	   System.out.println(p);
	   System.out.println(super.p);
	   System.out.println(this.p);
   }

	@Override
	void show() {
	   System.out.println("subclass Z");	
	  super.show();
	}

	static void mydetail() {//   re writing of static method not overriding , static method is not inherited
		System.out.println("my country is ......"+country);
	}
	
	public static void main(String[] args) {
		Z z=new Z();
		z.display();
		z.show();
		Z.mydetail();
		Y.mydetail();
	}
}
