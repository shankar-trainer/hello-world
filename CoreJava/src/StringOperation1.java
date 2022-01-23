
public class StringOperation1 {

	public static void main(String[] args) {

		String var = "hello world";
		var.toUpperCase();
		System.out.println(var);
		System.out.println(var.toUpperCase());
		System.out.println(var.length());

		String var1 = "WELCOME";
		System.out.println(var1.toLowerCase());

		System.out.println(var1.charAt(0));
		System.out.println(var1.charAt(1));
		System.out.println(var1.charAt(2));

		for (int i = 0; i < var.length(); i++) {
			System.out.print(var.charAt(i) + ", ");
		}

		System.out.println();
		char ar1[] = var.toCharArray();
		char ar2[]=new char[ar1.length];
		
		for (int i = ar1.length-1,j=0; i >= 0; i--) {
			System.out.print(ar1[i]);
			ar2[j++]=ar1[i];
		}
       String reverse=new String(ar2);
       System.out.println("\nreverse of "+var+" is \n");
       System.out.println(reverse);
	}

}
