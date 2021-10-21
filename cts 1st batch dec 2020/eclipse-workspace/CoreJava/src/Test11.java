
public class Test11 {

	int x;
	
	void go(){
		x=10;
		int y=11;
	//System.out.println("go   "+x);
	}
	void go1(){
		this.x=11;
		//System.out.println("go1   "+x);
	//System.out.println("go1   "+y);
	}
	
	
	public static void main(String[] args) {
		Test11 test11=new Test11();
		test11.go();
		
		System.out.println(test11.x);
		
	}
}
