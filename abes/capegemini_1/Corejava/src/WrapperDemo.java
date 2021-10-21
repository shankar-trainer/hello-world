
public class WrapperDemo {

	public static void main(String[] args) {
		int x=1000;
	Integer p=new Integer(x); // boxing ptimitive to wrapper class	
	
	int k=p.intValue();
		k=k+100;
		p=new Integer(k);
		System.out.println(p);
		
Integer s=1000;    // boxing+unboxing=autoboxing
s=s+100;

String s2="16666";
/*s2=s2+98;
System.out.println(s2);*/

int k6=Integer.parseInt(s2);
k6=k6+100;
System.out.println(k6);



		
	}
}
