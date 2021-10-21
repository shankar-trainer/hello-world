
public class MyTest1 {
    int x=1;
	void go(){
    	test(x);
    	System.out.println("inside go "+x);
    }
	
    void test(int p){
    	p=p+1;
    	System.out.println("inside test "+p);
    }
	
    static String s="welcome";
    static int j=11;
    
    static void hello(){
    	 disp(s,j);
    }
 
    static void disp(String k,int l){
    	k=k+"world";
    	l=l+100;
    }
    
	public static void main(String[] args) {
	MyTest1 t1=	new MyTest1();
	t1.go();
	System.out.println(t1.x);
	
	hello();
	
	System.out.println(s);
	}
}
