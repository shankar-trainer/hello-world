
public class WrapperDemo2 {

	public static void main(String[] args) {
		String s = "1234";

		int r1 = Integer.parseInt(s);
		float parseFloat = Float.parseFloat("54545.67");
		
		Integer p1=77667;
		
		String s1=p1.toString();
		
		Integer valueOf = Integer.valueOf(7676);
		
		Integer r2=7676;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.max(11, 10));
		System.out.println(Integer.min(11, 10));
		
		Integer mynum=111;
		
		System.out.println(mynum.toString());
		System.out.println(Integer.toOctalString(mynum));
		System.out.println(Integer.toHexString(mynum));
		System.out.println(Integer.toBinaryString(mynum));
	}
}
