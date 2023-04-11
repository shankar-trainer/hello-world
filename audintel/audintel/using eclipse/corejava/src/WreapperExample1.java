
public class WreapperExample1 {

	
	public static void main(String[] args) {
		
		int x=100;
		
		Integer x1=new Integer(x);// boxing primitive to object
		
		x1.floatValue();
		
		Integer user=new Integer(10);
		System.out.println(user);
		int p=user.intValue();// unboxing  object to primitive
		p++;
		
		user=new Integer(p);
		System.out.println(user);
		
		//Integer user=new Integer(10);//deprecated 
		
		Integer user3=Integer.valueOf(9);
		
		
		
	}
}
