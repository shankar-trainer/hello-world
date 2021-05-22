package corejava;

public class WrapperEx3 {

	public static void main(String[] args) {

		int p = 87878;

		Integer t1 = new Integer(p);// boxing -- primitive -- wrapper

		//t1++;
		//t1++;
		//t1++;

		p = t1.intValue();// unboxing   -- wrapper -- primitive
		p++;
		p++;
		p++;
		
		t1=new Integer(p);
		
				
		System.out.println(p);

		
		Integer s1=new Integer(8989);
		
		Integer s2=new Integer("8989");
		
		
	}
}
