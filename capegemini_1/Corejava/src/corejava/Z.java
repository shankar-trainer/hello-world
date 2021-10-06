package corejava;

class Y{
	int p=10;
}
public class Z extends Y {
    int p=100;
	void show(){
    	int p=1000;
    	System.out.println(p);
    	System.out.println(this.p);
    	System.out.println(super.p);
    }
	
	public static void main(String[] args) {
		new Z().show();
	}
}
