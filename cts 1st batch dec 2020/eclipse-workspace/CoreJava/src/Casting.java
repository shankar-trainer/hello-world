
public class Casting {

	
	
	public static void main(String[] args) {
		
		
		// implicit casting -- widening 
		
		byte b1=112;
		
		short s1=b1;
		
		
		int x=87787;
	       double d1=x;
	       System.out.println(d1);
	       float d2=x;
	       long l1=x;
	    
	    s1=(short) x;// explicit casting// narrowing 
	    System.out.println(s1);
	

	    int y1=(int) 67776.667f;
	    
	    
	    
	    byte b2=10;
	    
	    b2=+10;
	    
	    b2=(byte) (b2+10);
	    
	    byte b8=10;
	    byte b9=20;
	    
	    byte b10=(byte) (b8+b9);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
}
