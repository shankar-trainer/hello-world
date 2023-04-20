
public class Test2 {  // super class
  int x=100;
 	
   void show() {
	   System.out.println("This is show method");
   }
}
class Test1 extends Test2 {
  public static void main(String[] args) {
	
	  Test1 test1=new Test1();
	  System.out.println(test1.x);
	  test1.show();
	  
}	
}