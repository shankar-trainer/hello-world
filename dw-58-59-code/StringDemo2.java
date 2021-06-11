
public class StringDemo2 {

	public static void main(String[] args) {
		String s1="we are learning java";
		//String s2="hello world";
		char s2[]= {'h','e','l','l','o'};
		
		s1.getChars(3, 5, s2, 0);
		
		System.out.println(s2);

		
		System.out.println("hello".equals("hello"));
		String empCode="cts-emp01";
		
		System.out.println(empCode.startsWith("cts"));
		
		String email="ramkumar@gmail.com";
		
		if(email.endsWith(".com"))
			System.out.println("valid  email");
		else
			System.out.println("invalid  email");
		
		int pos=s1.indexOf('l');
		if(pos>=0)
			System.out.println("found at "+pos);
		
		
		 pos=s1.indexOf("are");
		if(pos>=0)
			System.out.println("found at "+pos);
		
		
			
	}
}
