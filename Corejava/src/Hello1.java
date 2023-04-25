
class Welcome1{
  public Welcome1() {
	  super();
   System.out.println("welcome1 constructor  ");
  }	
}

public class Hello1  extends Welcome1 {
 public Hello1() {
	  super();
     System.out.println("Hello1 constructor ");  
 }
 public static void main(String[] args) {
	 new Hello1();
}
}
