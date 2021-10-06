
public class CmdArgs {

	public static void main(String[] args) {

		String name = args[0];
		String country = args[1];
		String city = args[2];

		/*
		 * System.out.println("name is " + name);
		 * System.out.println("country is " + country);
		 * System.out.println("city is " + city);
		 * 
		 * for (String string : args) { System.out.print(string + "  "); }
		 */

		String s = "123";
		int p = Integer.parseInt(s);
		System.out.println(p);
		// p=p+10;

		s = "123.45";
		float p1 = Float.parseFloat(s);
		System.out.println(p1);
		

		/*
		 * int x=Integer.parseInt(args[0]); int y=Integer.parseInt(args[1]);
		 * 
		 * System.out.println("sum is "+(x+y));
		 */

	}
}
