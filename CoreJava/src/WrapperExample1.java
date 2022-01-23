
public class WrapperExample1 {

	public static void main(String[] args) {
		String s1 = "123";
		// s1+900; // error
		int p1 = Integer.parseInt(s1);
		p1 = p1 + 20;
		System.out.println(p1);
		
		float parseFloat = Float.parseFloat("76776.677667");
		
		System.out.println(Integer.toString(544554));
		System.out.println(Integer.toBinaryString(544554));
		
		System.out.println(Integer.toString(54554, 2));
		
		System.out.println(Integer.toHexString(544554));
		System.out.println(Integer.toString(544554,16));
		System.out.println(Integer.toOctalString(544554));
		
		System.out.println("byte max "+Byte.MAX_VALUE);//127
		System.out.println("byte min "+Byte.MIN_VALUE);//-128
         byte b1=127;
         
         //b1=128;// error 
         
		
		
	}
}
