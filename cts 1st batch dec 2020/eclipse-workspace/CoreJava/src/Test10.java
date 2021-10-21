class YY{
	int x=999;//
}

public class Test10  extends YY {
   int x;//instance variable  // default value
   
   public Test10() {
    int p=super.x;
    }
   
   
   static{
	//   int p1=super.x;
   }
  static int z;
   void disp(){
	   z=super.x;
	   System.out.println("super x"+super.x);
	   System.out.println("this x"+this.x);
   }
   
	public static void main(String[] args) {
		int x;// local variable  // no default value
		
		//System.out.println(this.x);
		//System.out.println(super.x);
		
		System.out.println(new Test10().x);
		
		new Test10().disp();
		
		System.out.println("z is "+z);
	}
}
