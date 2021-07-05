
public class CastProgram {

	public static void main(String[] args) {
		int x=1000;
		float f=x;// implicit casting  -- widening 
		
		byte b1=(byte)x;//  explicit casting -- narrowing -- 
		
		System.out.println(x+"   "+b1);
		
	}
}
