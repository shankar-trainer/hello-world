
public class StringPrg2 {

	public static void main(String[] args) {
		String var="hello";
		char car[]= {'w','e','l','c','o','m','e'};
		
		String var2=new String(car);
		
		System.out.println(var2.charAt(0));
		System.out.println(var2.charAt(1));
		System.out.println(var2.charAt(2));
		System.out.println(var2.charAt(3));
		
		String email="lpu_e001_arvind@gmail.com";
		System.out.println(email.startsWith("lpu_e001"));
		
		if(email.endsWith(".com"))
			System.out.println("valid email");
		else 
			System.out.println("invlid email");
		
		int pos=email.indexOf("@");
		if(pos>=0)
			System.out.println("valid email contains @  ");
		
	}
}
