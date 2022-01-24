class Test3{  //super class
	int x=10;
	int y=20;
   void show() {
	   System.out.println("show in Test3");
   }
}
public class Test5  extends Test3 {
  // sub class
	public static void main(String[] args) {
		Test5 t5=new Test5();
		System.out.println(t5.x);
		System.out.println(t5.y);
		t5.show();
	}
}
