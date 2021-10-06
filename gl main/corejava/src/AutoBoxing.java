
public class AutoBoxing {

	public static void main(String[] args) {
		

		Integer x=new Integer(100);
        int p=x.intValue();
        p++;
        x=new Integer(p);
                
	
        Integer y=100;
        y++;
        
        System.out.println(y);
        System.out.println(y.toString());
        System.out.println(Integer.toHexString(y));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toOctalString(y));
        
       System.out.println(Integer.max(11, 3));
       
       System.out.println(".."+Integer.reverse(1234));
       
        
	}
}
