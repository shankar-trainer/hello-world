
public class Test3 {

	public Test3(int x) {
		super();
		this.x = x;
	}

	private final int x;

	public Test3() {
		this.x = 10;
	}

	public int getX() {
		return x;
	}

//
//public void setX(int x) {
//	this.x = x;
//}

	public static void main(String[] args) {
      
		Test3 t1=new Test3(7777);
		Test3 t2=new Test3(17777);
		//t1.x=77;// error 
		
 //        t1.x=999;
         
	}
}
