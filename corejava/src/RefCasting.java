
public class RefCasting {

	public static void main(String[] args) {
		
		Number n=90;
		
		Integer i=100;
		//n=i;
		i=(Integer) n;
		
		Integer k=999;
		Float f1=8778.67f;
		//f1=k; // error cannot be casted
		//k=f1;
	}
}
