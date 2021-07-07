
public class WrapperExample {

	public static void main(String[] args) {
		
		Integer x=new Integer(999);//  boxing  -- primitive to wrapper
		
		int p=x.intValue(); // unboxing  -- wrapper to primitive
		
		p++;
		x=new Integer(p);
	
		
		Integer k=99;// autoboxing 
		k++;       // autoboxing
		
		
		String no="454554";
		int y=Integer.parseInt(no);
		System.out.println(y/10);
		
		String cost="767687.666";
		
		float cost1=Float.parseFloat(cost);
		System.out.println(cost1*10);
		
		
		int p1=788;
		
		String s1=Integer.toString(p1);
		
	}
}
