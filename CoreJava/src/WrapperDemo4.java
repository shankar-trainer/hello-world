

public class WrapperDemo4 {

	public static void main(String[] args) {
	
		String string = Integer.toString(1000);
		String string1 = Float.toString(1000.676776f);
		
		System.out.println(Integer.toString(1000));
		System.out.println(Integer.toString(1000,2));
		System.out.println(Integer.toBinaryString(1000));
		System.out.println(Integer.toString(1000,16));
		System.out.println(Integer.toHexString(1000));
		
	}
}
