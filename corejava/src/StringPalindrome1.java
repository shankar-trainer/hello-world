
public class StringPalindrome1 {
	static boolean  checkPalindrome(String s1) {
		 char c[]=new char[s1.length()]; 
		
		 int index=s1.length()-1;
		 
		for(char c1:s1.toCharArray()) 
			c[index--]=c1;

		String s2=new String(c);
		return s2.equals(s1);
	}
	
	static boolean  checkPalindrome1(String s1) {
		 char c[]=new char[s1.length()];
		     int index=0;
			for (int i = s1.length()-1; i >=0; i--) {
				c[i]=s1.charAt(index++);
			} 
		return s1.equals(new String(c));	
	}
	
	
	public static void main(String[] args) {
		
		String s1="abcba";
		
		System.out.println(checkPalindrome(s1));
		System.out.println(checkPalindrome("hello"));
		System.out.println(checkPalindrome1("malayalam"));
		
	}
	
}
